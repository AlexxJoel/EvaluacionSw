package TestCases;

import InicioSesion.CommonMethods;
import driverSetup.SetupDriver;
import examn.Excersice1;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import variablesGlobales.VariablesGlobales;

public class TC_EXAM_2 {


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
        excersice1.login(VariablesGlobales.USER_ADMINMINE, VariablesGlobales.USER_PASSWORDMINE);
        Thread.sleep(2000);
        excersice1.selection2();
        Thread.sleep(3000);
        CommonMethods.takeScreenshot(driver, "TC_Examn02");
        Thread.sleep(3000);
        excersice1.articuloadminCategory();
        Thread.sleep(3000);
        CommonMethods.takeScreenshot(driver, "TC_Examn02_Category");
        Thread.sleep(3000);
        excersice1.articulo();

        Thread.sleep(4000);
        CommonMethods.takeScreenshot(driver, "TC_Examn02_Articulo");
        Thread.sleep(3000);

    }
    @AfterTest
    public void closeWebDriver() throws InterruptedException{
        Thread.sleep(2000);
        excersice1.cerrarsesionAlexx();
        driver.close();
    }
}
