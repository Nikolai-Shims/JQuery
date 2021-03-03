package Pages;

import Pages.BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class SpinnerPage extends BasePage {

    private static String expectedValue;
    public static final By SELECT_VALUE_INPUT = By.cssSelector("input#spinner");
    public static final By FRAME_SPINNER_PAGE = By.cssSelector(".demo-frame");
    public static final By GET_VALUE_BUTTON = By.id("getvalue");


    public SpinnerPage(WebDriver driver) {
        super(driver);
    }

    public SpinnerPage switchToFrame(){
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FRAME_SPINNER_PAGE));
    return this;
    }

    public SpinnerPage fillInput(String text){
        expectedValue = text;
        wait.until(ExpectedConditions.visibilityOfElementLocated(SELECT_VALUE_INPUT));
        driver.findElement(SELECT_VALUE_INPUT).sendKeys(text);
        return this;
    }

    public SpinnerPage clickButton(){
        driver.findElement(GET_VALUE_BUTTON).click();
        return this;
    }

    public SpinnerPage verifyValueOnSpinnerPage(){
        String actualValue =  driver.switchTo().alert().getText();
        Assert.assertEquals(actualValue, expectedValue);
        return this;
    }

}
