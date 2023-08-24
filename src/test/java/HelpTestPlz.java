import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HelpTestPlz {

    @BeforeAll
    public static void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl="https://testpages.herokuapp.com";
    }

    @Test
    void fillFormTest() {

        open("/styled/validation/input-validation.html");

        /*
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        */

        $("#firstname").setValue("Anton");
        $("#surname").setValue("Barabanovqwqwq");
        $("#age").setValue("63");
        $("#notes").setValue("Oh, i'm sorry!");
        $("#country").selectOptionByValue("Denmark");

        //С помощью by обращаемся к атрибуту и ищем значение
        $(by("type", "submit")).click();

        //$("#output").shouldHave(text("Anton Barabanov"), text("anton.barabanov@gmail.com"),
                // text("Saransk"), text("Saransk-2"));
    }
}
