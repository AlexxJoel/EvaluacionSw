package TestCases;

import InicioSesion.CommonMethods;
import blazeDemo.BlazeDemo;
import driverSetup.SetupDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import variablesGlobales.VariablesGlobales;

public class TC_02_Blaze {
    WebDriver driver = SetupDriver.SetupChromeDriver();
    BlazeDemo blaze = new BlazeDemo(driver);

    @BeforeTest
    public void startWebDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.get(VariablesGlobales.HOME_PAGE);
    }
    @Test
    public void TC_01() throws InterruptedException {
        Thread.sleep(3000);
        blaze.selection();

    }
    @AfterTest
    public void closeWebDriver() throws InterruptedException{
        Thread.sleep(3000);
        CommonMethods.takeScreenshot(driver, "TC_02_blazeDemo");
        Thread.sleep(2000);
        driver.close();
    }
}
