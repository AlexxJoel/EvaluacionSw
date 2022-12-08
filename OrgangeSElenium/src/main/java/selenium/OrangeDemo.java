package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeDemo {
    public static void main(String[] args)  throws InterruptedException {
        String exePath="src/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
        driver.manage().window().maximize();//maximizar una pantalla

        Thread.sleep(2000);

        WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
        username.sendKeys("Admin");
        Thread.sleep(2000);

        WebElement userPassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
        userPassword.sendKeys("admin123");
        Thread.sleep(2000);

        WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        btnLogin.click();
        Thread.sleep(2000);

        WebElement slout = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li"));
        slout.click();
        Thread.sleep(4000);

        WebElement out = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a"));
        out.click();
        Thread.sleep(1000);

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
