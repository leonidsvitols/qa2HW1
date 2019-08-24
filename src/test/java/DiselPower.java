import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiselPower {
    public Integer FuelCount(Integer v, Integer s) {

        return v / s * 100;
    }

    @Test
    private void FuelCounter () {

        float l;
        l = (float) 80 / 128 * 100;

        System.out.println(" Your fuel consumption is " + l + " per 100 km");
        Assertions.assertEquals(62.5, l);
    }
}
