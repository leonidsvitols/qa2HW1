import org.junit.jupiter.api.Test;

public class CharCount {
    String someString = "Have you ever thought about sex?";
    char someChar = 'e';
    int count = 0;

for (int i = 0; i < someString.length(); i++) {
        if (someString.charAt(i) == someChar) {
            count++;
        }
    }

}
@Test


