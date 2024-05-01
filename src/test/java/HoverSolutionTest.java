import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.withTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class HoverSolutionTest {

    @BeforeAll
    static void beforeAll() {
        baseUrl = "https://github.com";
        pageLoadStrategy = "eager";
    }

    @AfterEach
    void closeWebDriver() {
        Selenide.closeWebDriver();
    }

    @Test
    public void hoverSolutionTest() {
        open("");
        $(withTagAndText("button", "Solutions")).hover();
        $(withTagAndText("a", "Enterprise")).click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform"));
    }
}
