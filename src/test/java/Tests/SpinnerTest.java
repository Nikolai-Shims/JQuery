package Tests;

import Tests.Base.BaseTest;
import Tests.Base.Retry;
import Tests.Base.TestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class SpinnerTest extends BaseTest {

    @Test(retryAnalyzer = Retry.class, description = "Verify that value the same as expected")
    public void spinnerTask2() {
        homePageSteps
                .openJQueryPage(URL)
                .selectOptionFromLeftMenu("Widgets", "Spinner");
        spinnerSteps
                .inputValueInFieldOnSpinnerPage("55")
                .clickButtonGetValueOnSpinnerPage()
                .verifyThatExpectedValueTheSameAsActual();
    }
}
