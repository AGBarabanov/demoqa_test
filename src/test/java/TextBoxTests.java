import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @Test
    void fillFormTest(){
        open("https://demoqa.com/text-box");

        $("#userName").setValue("Anton Barabanov");
        $("#userEmail").setValue("anton.barabanov@gmail.com");
        $("#currentAddress").setValue("Saransk");
        $("#permanentAddress").setValue("Saransk-2");
        $("#submit").click();

        $("#output").shouldHave(text("Anton Barabanov"),text("anton.barabanov@gmail.com"),
                text("Saransk"),text("Saransk-2"));
    }
}
