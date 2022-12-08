package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ticketBuy {
    public static void main(String[] args)  throws InterruptedException {
        String exePath="src/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com");
        driver.manage().window().maximize();//maximizar una pantalla

        Thread.sleep(1000);

     /*   Select from = new Select(driver.findElement(By.name("fromPort")));
        from.selectByVisibleText("Boston");
        from.selectByIndex(2);*/


        WebElement first = driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));
        first.sendKeys("Boston");
        Thread.sleep(1000);

        WebElement second = driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"));
        second.sendKeys("Berlin");
        Thread.sleep(1000);

        WebElement btnFligth = driver.findElement(By.xpath("/html/body/div[3]/form/div/input"));
        btnFligth.click();
        Thread.sleep(1000);

        WebElement btnFligthAer = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/input"));
        btnFligthAer.click();
        Thread.sleep(2000);

        //-------------------------------------
        WebElement name = driver.findElement(By.name("inputName"));
        name.sendKeys("Alexx Joel");
        Thread.sleep(1000);

        WebElement adress = driver.findElement(By.name("address"));
        adress.sendKeys("Cuernavaca");
        Thread.sleep(2000);

        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("cdmx");
        Thread.sleep(1000);

        WebElement state = driver.findElement(By.name("state"));
        state.sendKeys("Morelos");
        Thread.sleep(1000);

        WebElement zipCode = driver.findElement(By.name("zipCode"));
        zipCode.sendKeys("62398");
        Thread.sleep(1000);

        WebElement creditCard = driver.findElement(By.name("creditCardNumber"));
        creditCard.sendKeys("6848155285525885");
        Thread.sleep(1000);

        WebElement nameCard = driver.findElement(By.name("nameOnCard"));
        nameCard.sendKeys("PapuchoMaste");
        Thread.sleep(1000);

        WebElement finish = driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input"));
        finish.click();
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
