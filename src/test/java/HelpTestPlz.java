import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HelpTestPlz {

    @BeforeAll
    public static void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        Configuration.browser = "firefox";
    }

    @Test
    void fillFormTest() {
        open("https://demoqa.com/text-box");

        $("#userName").setValue("Anton Barabanov");
        $("#userEmail").setValue("test@gmail.com");
        $("#currentAddress").setValue("Saransk");
        $("#permanentAddress").setValue("Saransk-2");
        $("#submit").click();

        $("#output").shouldHave(text("Anton Barabanov"), text("anton.barabanov@gmail.com"),
                 text("Saransk"), text("Saransk-2"));
    }
}
