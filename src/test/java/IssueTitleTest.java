import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class IssueTitleTest {

    String REPOSITORY = "/RubyQA/qa_quru_HW_18_11/issues/1";
    String ISSUE_TITLE = "testIssues";

    @Test
    void shouldVerifyIssueTitle() {
        Configuration.baseUrl = "https://github.com";

        open(REPOSITORY);
        $(byText(ISSUE_TITLE)).shouldBe(visible);
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void removeListener() {
        SelenideLogger.removeListener("allure");
    }
}
