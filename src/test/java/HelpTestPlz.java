import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class HelpTestPlz {

    static {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        Configuration.browserCapabilities = capabilities;
    }

    @Test
    void fillFormTest() {
        Selenide.open("https://demoqa.com/text-box");

        $("#userName").setValue("Anton Barabanov");
        $("#userEmail").setValue("anton.barabanov@gmail.com");
        $("#currentAddress").setValue("Saransk");
        $("#permanentAddress").setValue("Saransk-2");
        $("#submit").click();

        $("#output").shouldHave(text("Anton Barabanov"), text("anton.barabanov@gmail.com"),
                text("Saransk"), text("Saransk-2"));
    }
}
