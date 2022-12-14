package TestCases;

import InicioSesion.CommonMethods;
    import driverSetup.SetupDriver;
import examn.Excersice1;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import variablesGlobales.VariablesGlobales;

public class TC_Exam_1 {

    WebDriver driver = SetupDriver.SetupChromeDriver();
    Excersice1 excersice1 = new Excersice1(driver);

    @BeforeTest
    public void startWebDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.get(VariablesGlobales.HOME_PAGE_1);
    }
    @Test
    public void TC_01() throws InterruptedException {
        Thread.sleep(3000);
        excersice1.login(VariablesGlobales.USER_ADMIN1, VariablesGlobales.USER_PASSWORD1);
        Thread.sleep(2000);
        excersice1.selection();

    }
    @AfterTest
    public void closeWebDriver() throws InterruptedException{
        Thread.sleep(3000);
        CommonMethods.takeScreenshot(driver, "TC_Examn01");
        Thread.sleep(2000);
        excersice1.cerrarsesion();
        driver.close();
    }
}
