package Steps;

import Pages.SpinnerPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class SpinnerSteps {

    SpinnerPage spinnerPage;

    public SpinnerSteps(WebDriver driver) {
        spinnerPage = new SpinnerPage(driver);
    }

    @Step("Switch to spinner frame and input value in 'Select a value' field")
    public SpinnerSteps inputValueInFieldOnSpinnerPage(String text) {
        spinnerPage
                .switchToFrame()
                .fillInput(text);
        return this;
    }

    @Step("Click button 'Get Value' on Spinner page")
    public SpinnerSteps clickButtonGetValueOnSpinnerPage() {
        spinnerPage
                .clickButton();
        return this;
    }

    @Step("Verify value between expected and actual on Spinner page")
    public SpinnerSteps verifyThatExpectedValueTheSameAsActual() {
        spinnerPage
                .verifyValueOnSpinnerPage();
        return this;
    }
}
