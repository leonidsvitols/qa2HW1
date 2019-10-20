import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DelfiFirstTest {

    @Test
    public void delfiFirstTitleTest() {
        /**
         * We started to write comments just to know it.
         * This one is multi-line.
         */
//        This one is single-line comment.

        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://delfi.lv");


    }

}

