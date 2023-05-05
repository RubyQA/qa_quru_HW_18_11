import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class IssueTitleStepTest {

    String REPOSITORY = "/RubyQA/qa_quru_HW_18_11";
    String ISSUE_TITLE = "testIssues";

    @Test
    void shouldVerifyIssueTitle() {
        step("Open repository", () -> {
            open("https://github.com/" + REPOSITORY);
            $("#issues-tab").click();
        });
        step("Verify issue title", () -> {
            $(byText(ISSUE_TITLE)).shouldBe(visible);
        });
    }
}
