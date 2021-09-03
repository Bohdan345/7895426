import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class MyTest {

    @Test
    public void test() {

        open("https://www.google.com/");
        Selenide.sleep(1000);
        getWebDriver().close();
        getWebDriver().quit();
    }
}
