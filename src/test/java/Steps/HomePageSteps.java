package Steps;

import Pages.HomePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {

    HomePage homePage;

    public HomePageSteps(WebDriver driver) {
        homePage = new HomePage(driver);
    }

    @Step("Open JQuery Home page and verify that page is opened")
    public HomePageSteps openJQueryPage(String url) {
        homePage
                .openPage(url);
        return this;
    }

    @Step("Select option from left menu ")
    public HomePageSteps selectOptionFromLeftMenu(String sections, String options) {
        homePage
                .chooseOptionFromLeftMenu(sections, options);
        return this;
    }

    @Step("Verify That all section is displayed  ")
    public HomePageSteps VerifyThatSectionIsDisplayed(String sectionInteractions, String sectionWidgets, String sectionEffects, String sectionUtilities) {
        homePage
                .isLeftMenuSectionDisplayed(sectionInteractions)
                .isLeftMenuSectionDisplayed(sectionWidgets)
                .isLeftMenuSectionDisplayed(sectionEffects)
                .isLeftMenuSectionDisplayed(sectionUtilities);
        return this;
    }
}
