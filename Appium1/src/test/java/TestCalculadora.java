import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.URL;

public class TestCalculadora {

    static AndroidDriver<MobileElement> driver;

    @Test
    public static void testCalculadora() throws Exception {

        DesiredCapabilities cap = new
                DesiredCapabilities();

        cap.setCapability("deviceName", "moto g_8_power"); //change to name of smartphone

        cap.setCapability("udid", "ZY227DVC42"); //console   adb devices

        cap.setCapability("platformName", "Android");

        cap.setCapability("platformVersion", "11");

        cap.setCapability("appPackage", "com.google.android.calculator");
        //apk info to see this

        cap.setCapability("appActivity", "com.android.calculator2.Calculator");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new  AndroidDriver<MobileElement>(url, cap);

        System.out.println("La aplicacion ha sido lanzada correctamente!");

        //appium to see the id

        MobileElement cinco = driver.findElementById("com.google.android.calculator:id/digit_5");

        cinco.click();

        MobileElement mul = driver.findElementById("com.google.android.calculator:id/op_mul");

        mul.click();

        MobileElement dos = driver.findElementById("com.google.android.calculator:id/digit_2");

        dos.click();

        MobileElement igual = driver.findElementById("com.google.android.calculator:id/eq");

        igual.click();


        ///////////////////////////////

        System.out.println("DIvision");

        cinco.click();
        MobileElement div = driver.findElementById("com.google.android.calculator:id/op_div");
        div.click();
        dos.click();
        igual.click();

        System.out.println("op_sub");

        cinco.click();
        MobileElement op_sub = driver.findElementById("com.google.android.calculator:id/op_sub");
        op_sub.click();
        dos.click();
        igual.click();

        System.out.println("add");

        cinco.click();
        MobileElement add = driver.findElementById("com.google.android.calculator:id/op_add");
        add.click();
        dos.click();
        igual.click();


    }

}
