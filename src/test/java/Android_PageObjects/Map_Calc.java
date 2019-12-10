package Android_PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.annotations.findby.By;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;

import java.util.List;


public class Map_Calc extends MobileElement {

    //AppiumDriver<MobileElement> driver;
    /*@AndroidFindBy(id = "digit_6")
    AndroidElement  nun6;*/
    String res_o = "";

    public void setear_nums(AndroidDriver a_driver){

         //nun6.click();
         try {
            a_driver.findElement(By.id("com.android.calculator2:id/digit_6")).click();
            a_driver.findElementById("com.android.calculator2:id/digit_5").click();
            a_driver.findElementById("com.android.calculator2:id/digit_8").click();
            a_driver.findElementById("com.android.calculator2:id/digit_7").click();
            a_driver.findElementById("com.android.calculator2:id/op_mul").click();
            a_driver.findElementById("com.android.calculator2:id/digit_1").click();
            a_driver.findElementById("com.android.calculator2:id/digit_5").click();
            a_driver.findElementById("com.android.calculator2:id/digit_9").click();
            a_driver.findElementById("com.android.calculator2:id/eq").click();

            /* List<MobileElement> calcButtons = a_driver.findElements(By.xpath("//android.widget.Button"));
             calcButtons.get(6).click();
             calcButtons.get(8).click();
             calcButtons.get(10).click();
             a_driver.findElementById("com.android.calculator2:id/op_mul").click();
             calcButtons.get(4).click();
             a_driver.findElementById("com.android.calculator2:id/eq").click();*/

         } catch (Exception e) {
             e.printStackTrace();
         }



    }

    public String _res_validacion( AndroidDriver a_driver ){
        return  res_o = a_driver.findElementById("com.android.calculator2:id/result").getText().trim();
    }
}
