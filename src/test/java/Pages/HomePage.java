package Pages;

import Pages.BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    String leftMenuSections = "//*[contains(text(),'%s')]/ancestor::aside";
    String leftMenuOptions = "//*[contains(text(),'%s')]/ancestor::aside//a[contains(text(),'%s')]";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage openPage(String url) {
        driver.get(url);
        return this;
    }

    public HomePage isLeftMenuSectionDisplayed(String nameOfSection){
        driver.findElement(By.xpath(String.format(leftMenuSections, nameOfSection))).isDisplayed();
        return this;
    }

    public void chooseOptionFromLeftMenu(String sections, String options) {
        driver.findElement(By.xpath(String.format(leftMenuOptions,sections, options))).click();
    }

}
