package Tests;

import Tests.Base.BaseTest;
import Tests.Base.Retry;
import Tests.Base.TestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class AutoCompleteTest extends BaseTest {

    @Test(retryAnalyzer = Retry.class, description = "Select option and verify that option is the same as expected")
    public void autocompleteTask3(){
       homePageSteps
               .openJQueryPage(URL)
               .selectOptionFromLeftMenu("Widgets","Autocomplete");
        autoCompleteSteps
                .fillTagsFieldWithSymbolsOnAutocompletePage("a")
                .selectOptionFromDropDown(3)
                .verifyThatActualValueInTagsDropDownTheSameAsExpected("Asp");
    }

}
