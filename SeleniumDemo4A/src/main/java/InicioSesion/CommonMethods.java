package InicioSesion;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;


public class CommonMethods {
    public static void takeScreenshot(WebDriver webDriver, String testCaseName){
        //Tomar el screenshot de la pagina sin formato
        File srcfile=((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
        //Establecer ruta donde se va a guardar nuestro screenshot
        String screenshotPath="./test-output/ExecutionResults";
        try{
            FileHandler.createDir(new File(screenshotPath));
            FileHandler.copy(srcfile, new File(screenshotPath + File.separator + testCaseName + ".PNG"));
        } catch (IOException e) {
            //Todo
            e.printStackTrace();
        }

    }
}
