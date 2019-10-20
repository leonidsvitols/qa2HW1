import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelfiArticleTest {
    private final By HOME_PAGE_TITLE = By.xpath(".//h1[contains(@class, 'text-size-22')]");
    private final By HOME_PAGE_COMMENTS = By.xpath(".//a[@class = 'comment-count text-red-ribbon']");
    private final By ARTICLE_PAGE_TITLE = By.xpath(".//h1[contains(@class,'text-size-md-30')]");
    private final By ARTICLE_PAGE_COMMENTS = By.xpath(".//a[contains(@class,'text-size-md-28')] ");
    private final By COMMENT_PAGE_TITLE = By.xpath(".//h1[@class = 'article-title']/a");
    private final By ARTICLE = By.xpath(".//span[@class  = 'text-size-22 d-block']");
    private final By COMMENT_PAGE_COMCOUNT = By.xpath(".//span[@class='type-cnt']");


    @Test
    public void titleAndComentsTest() {
        //Open browser
        System.setProperty("webdriver.chrome.driver", "c:/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Open Delfi homepage
        driver.get("http://rus.delfi.lv");

        //Find 1st article
        WebElement article = driver.findElements(ARTICLE).get(0);

        //Find first article title
        WebElement homePageTitle = article.findElement(HOME_PAGE_TITLE);
        //Save to string
        String titleToCompare = homePageTitle.getText();
        //Find comments count
        Integer commentsToCompare = 0;

        if (!article.findElements(HOME_PAGE_COMMENTS).isEmpty()) {
            WebElement homePageComments = driver.findElement(HOME_PAGE_COMMENTS);
            //Save to Integer
            String commentsToParse = homePageComments.getText(); //(1)
            commentsToParse = commentsToParse.substring(1, commentsToParse.length() - 1);
            commentsToCompare = Integer.valueOf(commentsToParse);
        }
        //Open article page
        homePageTitle.click();
        //Find title
        String apTitle = driver.findElement(ARTICLE_PAGE_TITLE).getText();
        //Check title
        Assertions.assertEquals(titleToCompare, apTitle, "Wrong title on Article page!");
        //Find comment count
        Integer apComments  = 0;
        if (!driver.findElements(ARTICLE_PAGE_COMMENTS).isEmpty()) {
            WebElement articlePageComments = driver.findElement(ARTICLE_PAGE_COMMENTS);

        apComments = Integer.valueOf(driver.findElement(ARTICLE_PAGE_COMMENTS).getText().substring(1, driver.findElement(ARTICLE_PAGE_COMMENTS).getText().length() - 1));
        }

        //Check comment count
        Assertions.assertEquals(commentsToCompare, apComments, "Comments count is not the same as on the Home Page!");
        //Open comments page
        driver.findElement(ARTICLE_PAGE_COMMENTS).click();
        //Find title
        String cpTitle = driver.findElement(COMMENT_PAGE_TITLE).getText();
        cpTitle = cpTitle + " ";
        //Check title
        Assertions.assertEquals(titleToCompare, cpTitle, "Bad try");
        //Get comment count
        Integer commentsToCompare1 = 0;
        //Find comment count
        String cpAnonCount = driver.findElements(COMMENT_PAGE_COMCOUNT).get(0).getText();
        String cpRegCount = driver.findElements(COMMENT_PAGE_COMCOUNT).get(1).getText();
        Integer cpComments1 = Integer.valueOf(cpAnonCount.substring(1, cpAnonCount.length() - 1));
        Integer cpComments2 = Integer.valueOf(cpRegCount.substring(1, cpRegCount.length() - 1));
        Integer cpComments = cpComments1 + cpComments2;

        //Check comment count
        Assertions.assertEquals(cpComments, apComments, "No, baby!");

        //Close browser
        driver.close();

    }


}
