import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().browserVersion("116.0.5845.111").setup();
        WebDriver driver = new ChromeDriver();




        open("https://demoqa.com/text-box");

            $("#userName").setValue("Anton Barabanov");
            $("#userEmail").setValue("anton.barabanov@gmail.com");
            $("#currentAddress").setValue("Saransk");
            $("#permanentAddress").setValue("Saransk-2");
            $("#submit").click();

            $("#output").shouldHave(text("Anton Barabanov"),text("anton.barabanov@gmail.com"),
                    text("Saransk"),text("Saransk-2"));


        driver.quit();
    }



}
