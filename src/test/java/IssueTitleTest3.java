import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class IssueTitleTest3 {

    String REPOSITORY = "RubyQA/qa_quru_HW_18_11";

    String ISSUE_TITLE = "testIssues";

    @Test
    @DisplayName("Verify issue title")
    void shouldVerifyIssueTitle() {
        openRepository();
        verifyIssueTitle();
    }

    @Step("Open repository")
    private void openRepository() {
        open("https://github.com/" + REPOSITORY);
        $("#issues-tab").click();
    }
    @Step("Verify issue title")
    private void verifyIssueTitle() {
        $(byText(ISSUE_TITLE)).shouldBe(visible);
    }
}
