package Pages;

import Pages.BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class AutocompletePage extends BasePage {

    public static final By INPT_TAGS = By.cssSelector("input#tags");
    public static final By FRAME_AUTOCOMPLETE = By.cssSelector(".demo-frame");
    public static final By DDL_TAGS = By.cssSelector("ul#ui-id-1");

    public AutocompletePage(WebDriver driver) {
        super(driver);
    }

    public AutocompletePage switchToAutoCompleteFrame(){
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FRAME_AUTOCOMPLETE));
        return this;
    }

    public AutocompletePage fillInput(String text){
        driver.findElement(INPT_TAGS).sendKeys(text);
        return this;
    }

    public AutocompletePage chooseOptionFromDropDown(int options){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(DDL_TAGS));
        WebElement element = driver.findElement(INPT_TAGS);
        for (int i = options; i > 0; i--)
        {
            element.sendKeys(Keys.ARROW_DOWN);
        }
        element.sendKeys(Keys.ENTER);
        return this;
    }

    public AutocompletePage verifyValueInTagsField(String expectedValue){
        String actualValue = driver.findElement(INPT_TAGS).getAttribute("value");
        Assert.assertEquals(actualValue,expectedValue);
        return this;
    }
}

