package Tests;

import Tests.Base.BaseTest;
import Tests.Base.Retry;
import Tests.Base.TestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class HomePageTest extends BaseTest {


    @Test(retryAnalyzer = Retry.class, description = "Verify that all section is displayed")
    public void homePageTask1() {
        homePageSteps
                .openJQueryPage(URL)
                .VerifyThatSectionIsDisplayed("Interactions", "Widgets", "Effects", "Utilities");
    }
}
