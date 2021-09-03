import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class MyTest {

    @Test
    public void test() {

        open("https://www.google.com/");
        Selenide.sleep(1000);
    }
}
