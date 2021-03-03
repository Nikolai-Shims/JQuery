package Steps;

import Pages.AutocompletePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class AutoCompleteSteps {

    AutocompletePage autocompletePage;

    public AutoCompleteSteps(WebDriver driver) {
        autocompletePage = new AutocompletePage(driver);
    }

    @Step("Switch to Autocomplete frame and fill 'Tags' field with symbols")
    public AutoCompleteSteps fillTagsFieldWithSymbolsOnAutocompletePage(String text) {
        autocompletePage
                .switchToAutoCompleteFrame()
                .fillInput(text);
        return this;
    }

    @Step("Select option from 'Tags' Drop Down")
    public AutoCompleteSteps selectOptionFromDropDown(int option) {
        autocompletePage
                .chooseOptionFromDropDown(option);
        return this;
    }

    @Step("Verify actual value in 'Tags' Drop Down with expected text")
    public AutoCompleteSteps verifyThatActualValueInTagsDropDownTheSameAsExpected(String expectedText) {
        autocompletePage
                .verifyValueInTagsField(expectedText);
        return this;
    }
}
