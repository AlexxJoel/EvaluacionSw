package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sisaUtez {
    public static void main(String[] args)  throws InterruptedException {
        String exePath="src/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://sisava2.utez.edu.mx:8443/SISAVA/");
        driver.manage().window().maximize();//maximizar una pantalla

        Thread.sleep(1000);



        WebElement name = driver.findElement(By.name("usuario.nick"));
        name.sendKeys("20213TN019");
        Thread.sleep(1000);

        WebElement pass = driver.findElement(By.name("usuario.contrasexa"));
        pass.sendKeys("la7");
        Thread.sleep(1000);

        WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/body/div[2]/div/div/div[2]/div[2]/form/fieldset/button"));
        btnLogin.click();
        Thread.sleep(1000);

        WebElement history = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a"));
        history.click();
        WebElement bottom = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr[8]/td[13] "));
        bottom.click();
        Thread.sleep(3000);

        WebElement logout = driver.findElement(By.xpath("//*[@id=\"cerrarSesion\"]"));
        logout.click();
        Thread.sleep(2000);






        //obtener el titulo de la pagina
        String titulo, url;
        titulo=driver.getTitle();
        System.out.println("el titulo es " + titulo);
        url=driver.getCurrentUrl();
        System.out.println("la url es" + url);

       /* driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().refresh();*/
    }

}
