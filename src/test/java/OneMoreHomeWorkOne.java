import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OneMoreHomeWorkOne {
    public final Logger LOGGER = LogManager.getLogger(OneMoreHomeWorkOne.class);

    public Integer Percent(Integer a, Integer b) {

        return a / b * 100;

    }

    @Test
    public void Percentage() {
        LOGGER.info("We are starting our test");

        Integer p;

        p = 150 * 24 / 100;

        System.out.println(" E is " + p);
        Assertions.assertEquals(36, p);
    }
}


