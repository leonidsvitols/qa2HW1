import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CharCount {

    @Test
    public void someTestMethod() {
        String someString = "Have you ever thought about sex?";
        char someChar = 'e';
        int count = 0;

        for (int i = 0; i < someString.length(); i++) {
            if (someString.charAt(i) == someChar) {
                count++;
            }

            System.out.println("You had it  " + count + " times, boy.");
            Assertions.assertEquals(4, count);

        }
    }
}


