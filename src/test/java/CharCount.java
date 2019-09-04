import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CharCount {

    @Test
    public void someTestMethod() {
        String someString;
        someString = "Have you ever thought about sex, baby?";
        char someChar = 'e';
        int count = 0;


        for (int i = 0; i < someString.length(); i++) {
            if (someString.charAt(i) == someChar) {
                count++;
            }
        }

            System.out.println("I have it  " + count + " times a day at work.");
            Assertions.assertEquals(4, count);


    }
}


