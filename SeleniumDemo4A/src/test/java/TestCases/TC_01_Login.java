package TestCases;

import InicioSesion.CommonMethods;
import InicioSesion.LoginPage;
import blazeDemo.BlazeDemo;
import driverSetup.SetupDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.testng.annotations.*;

import variablesGlobales.VariablesGlobales;



public class TC_01_Login {
    WebDriver driver = SetupDriver.SetupChromeDriver();
    LoginPage login = new LoginPage(driver);

    @BeforeTest
    public void startWebDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.get(VariablesGlobales.HOME_PAGE);
    }
    @Test
    public void TC_01() throws InterruptedException {
        Thread.sleep(3000);
        login.login(VariablesGlobales.USER_ADMIN, VariablesGlobales.USER_PASSWORD);

    }
    @AfterTest
    public void closeWebDriver() throws InterruptedException{
        Thread.sleep(3000);
        CommonMethods.takeScreenshot(driver, "TC_02_blazeDemo");
        Thread.sleep(2000);
        driver.close();
    }
}
