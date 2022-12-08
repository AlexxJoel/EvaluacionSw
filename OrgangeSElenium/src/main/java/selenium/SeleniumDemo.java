package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {
        String exePath="src/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();//maximizar una pantalla
        WebElement buscar= driver.findElement(By.name("q"));
        buscar.sendKeys("Bad Bunny");
        Thread.sleep(500);//envia valores con milisegundos
        WebElement enter = driver.findElement(By.name("btnK"));
        enter.click();
        Thread.sleep(500);
        //obtener el titulo de la pagina
        String titulo, url;
        titulo=driver.getTitle();
        System.out.println("el titulo es " + titulo);
        url=driver.getCurrentUrl();
        System.out.println("la url es" + url);

        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().refresh();


    }

}

