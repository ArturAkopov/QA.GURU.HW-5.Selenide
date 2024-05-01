import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.DragAndDropOptions.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDropTest {

    @BeforeAll
    static void beforeAll() {
        baseUrl = "https://the-internet.herokuapp.com";
        pageLoadStrategy = "eager";
    }

    @AfterEach
    void closeWebDriver() {
        Selenide.closeWebDriver();
    }

    @Test
    public void actionsTest() {
        open("/drag_and_drop");
        actions().moveToElement($("#column-a"))
                .clickAndHold()
                .moveByOffset(220, 0)
                .release()
                .perform();
        $("#column-b").shouldHave(text("A"));
    }

    @Test
    public void dragAndDropTest() {
        open("/drag_and_drop");
        $("#column-a").dragAndDrop(to("#column-b"));
        $("#column-b").shouldHave(text("A"));
    }
}
