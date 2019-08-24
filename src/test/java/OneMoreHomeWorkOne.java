import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OneMoreHomeWorkOne {
    public Integer Percent(Integer a, Integer b) {

        return a / b * 100;
    }

    @Test
    private void Percentage() {

        Integer p;

        p = 150 * 24 / 100;

        System.out.println(" E is " + p);
        Assertions.assertEquals(36, p);
    }
}


