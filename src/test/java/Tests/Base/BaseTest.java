package Tests.Base;

import Steps.AutoCompleteSteps;
import Steps.HomePageSteps;
import Steps.SpinnerSteps;
import Utils.CapabilitiesGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static final String URL = "https://jqueryui.com/demos/";
    WebDriver driver;
    public AutoCompleteSteps autoCompleteSteps;
    public HomePageSteps homePageSteps;
    public SpinnerSteps spinnerSteps;

    @BeforeMethod
    public void before(ITestContext context) {
        driver = new ChromeDriver(CapabilitiesGenerator.getChromeOptions());
        autoCompleteSteps = new AutoCompleteSteps(driver);
        homePageSteps = new HomePageSteps(driver);
        spinnerSteps = new SpinnerSteps(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        context.setAttribute("driver",driver);
    }

    @AfterMethod(alwaysRun = true)
    public void after() {
        driver.quit();
    }
}
