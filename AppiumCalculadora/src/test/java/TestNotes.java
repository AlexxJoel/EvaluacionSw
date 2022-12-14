import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.URL;

public class TestNotes {

        static AndroidDriver<MobileElement> driver;

        @Test
        public static void testNotes () throws Exception {

            DesiredCapabilities cap = new DesiredCapabilities();

            cap.setCapability("deviceName", "SNE LX3"); //change to name of smartphone

            cap.setCapability("udid", "DVR0218921016131"); //console  sdk/tools-platforms  adb devices

            cap.setCapability("platformName", "Android");

            cap.setCapability("platformVersion", "11");

            cap.setCapability("appPackage", "com.example.android.notepad");
            //apk info to see this

            cap.setCapability("appActivity", "com.example.android.notepad.NotePadActivity");

            URL url = new URL("http://127.0.0.1:4723/wd/hub");

            driver = new AndroidDriver<MobileElement>(url, cap);

            System.out.println("La aplicacion ha sido lanzada correctamente!");


            MobileElement add = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.ImageButton");


            add.click();





            MobileElement title = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.EditText");


            title.setValue("Mi examen U3");

            MobileElement content = driver.findElementByXPath("\t\n" +
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.EditText");

            content.setValue("Hola a todos, mi examen esta muy facil, pasare con AU");

            MobileElement ready = driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"Aceptar\"]");

            ready.click();


            MobileElement back = driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Volver\"]");

            back.click();
            //appium to see the id

         /*   MobileElement bienbenida = driver.findElementById("com.google.android.keep:id/skip_welcome");
            bienbenida.click();

            MobileElement addNote = driver.findElementById("com.google.android.keep:id/new_note_button");

            addNote.click();

            MobileElement realize = driver.findElementById("com.google.android.keep:id/edit_note_text");


            realize.setValue("ddfffddffdfdfdfdf");
*/

            //Mi examen U3

            //Hola a tofod, mi examen esta muy faciul, pasare con AIU

        }

}
