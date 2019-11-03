import pages.BaseFunc;
import org.junit.jupiter.api.Test;

public class PageObjectTest {

    private BaseFunc baseFunc = new BaseFunc();


    @Test
    public void poTest () {
        baseFunc.goToUrl("rus.delfi.lv");
    }
}
