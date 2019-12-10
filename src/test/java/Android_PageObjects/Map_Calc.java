package Android_PageObjects;

import Android_Steps.NativeAndroid_Calc_Step;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.annotations.findby.By;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Map_Calc extends AndroidElement {

    //AppiumDriver<MobileElement> driver;

    String res_o = "";
  //  public final static Logger LOG_EJECUCION = Logger.getLogger("Ejecución");

    @AndroidFindBy(id = "com.android.calculator2:id/digit_6")
    AndroidElement  num6;
  //  MobileElement  num6;

    @AndroidFindBy(id = "com.android.calculator2:id/digit_9")
    AndroidElement  num9;
  //  MobileElement  num9;

    @AndroidFindBy(id = "com.android.calculator2:id/op_mul")
   AndroidElement  mult;
 //   MobileElement  mult;

    @AndroidFindBy(id = "com.android.calculator2:id/digit_4")
   AndroidElement  num4;
 //   MobileElement  num4;

    @AndroidFindBy(id = "com.android.calculator2:id/eq")
    AndroidElement  equal;
 //   MobileElement equal;

    public void setear_nums(AndroidDriver a_driver){
        NativeAndroid_Calc_Step logg = new NativeAndroid_Calc_Step();

         try {

           /*num6.click();
             num9.click();
             mult.click();
             num4.click();
             equal.click();*/

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
             logg.LOG_EJECUCION.log(Level.INFO, " ******* INGRESO DE NUMEROS EJECUTADO CON EXITO ******* ");


         } catch (Exception e) {
             e.printStackTrace();
             logg.LOG_EJECUCION.log(Level.INFO, " ******* ERROR EN EL INGRESO DE NUMEROS  ******* ");
             a_driver.closeApp();
         }
    }

    public String _res_validacion( AndroidDriver a_driver ){
        return  res_o = a_driver.findElementById("com.android.calculator2:id/result").getText().trim();
    }
}
