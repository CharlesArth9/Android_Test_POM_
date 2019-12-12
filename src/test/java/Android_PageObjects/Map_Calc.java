package Android_PageObjects;

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
    public final static Logger LOG_EJECUCION = Logger.getLogger("Ejecución");

    @AndroidFindBy(id = "AppIddigit_6")
    AndroidElement num6;
    //  MobileElement  num6;

    @AndroidFindBy(id = "AppIddigit_9")
    AndroidElement num9;
    //  MobileElement  num9;

    @AndroidFindBy(id = "AppIdop_mul")
    AndroidElement mult;
    //   MobileElement  mult;

    @AndroidFindBy(id = "AppIddigit_4")
    AndroidElement num4;
    //   MobileElement  num4;

    @AndroidFindBy(id = "AppIdeq")
    AndroidElement equal;
    //   MobileElement equal;
    String AppId = "com.android.calculator2:id/";

    public void setear_nums(AndroidDriver a_driver) {
        
        String AppClass = "";

        try {

            MobileElement seis = (MobileElement) a_driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'digit_6')]"));
            MobileElement cinco = (MobileElement) a_driver.findElement(By.xpath("//android.widget.Button[@text='5' and @index='4']"));
            AndroidElement nueve = (AndroidElement) a_driver.findElement(By.xpath("//android.widget.Button[@text='9' and @index='2']"));
            MobileElement multiplicar = (MobileElement) a_driver.findElement(By.id(AppId+"op_mul"));
            AndroidElement ocho = (AndroidElement) a_driver.findElement(By.xpath("//android.widget.Button[@text='8' and @index='1']"));
            MobileElement siete = (MobileElement) a_driver.findElement(By.id(AppId+"digit_7"));
            AndroidElement tres = (AndroidElement) a_driver.findElement(By.xpath(
                    "//android.widget.LinearLayout[@index='0']/android.view.ViewGroup[@index='0']/android.widget.Button[@index='8']"));
            MobileElement igual = (MobileElement) a_driver.findElement(By.id(AppId+"eq"));

            seis.click();
            cinco.click();
            nueve.click();
            multiplicar.click();
            ocho.click();
            siete.click();
            tres.click();
            igual.click();

           /* num6.click();
              num9.click();
              mult.click();
              num4.click();
              equal.click(); */ // Usando @AndroidFindBy :fixme No me esta agarrando los @AndroidFindBy

           /* a_driver.findElement(By.id(AppId+"digit_6")).click();
            a_driver.findElementById(AppId+"digit_5").click();
            a_driver.findElementById(AppId+"digit_8").click();
            a_driver.findElementById(AppId+"digit_7").click();
            a_driver.findElementById(AppId+"op_mul").click();
            a_driver.findElementById(AppId+"digit_1").click();
            a_driver.findElementById(AppId+"digit_5").click();
            a_driver.findElementById(AppId+"digit_9").click();
            a_driver.findElementById(AppId+"eq").click();*/

            /* List<MobileElement> calcButtons = a_driver.findElements(By.xpath("//android.widget.Button"));
             calcButtons.get(6).click();
             calcButtons.get(8).click();
             calcButtons.get(10).click();
             a_driver.findElementById(AppId+"op_mul").click();
             calcButtons.get(4).click();
             a_driver.findElementById(AppId+"eq").click();*/

            LOG_EJECUCION.log(Level.INFO, " ******* INGRESO DE NUMEROS EJECUTADO CON EXITO ******* ");


        } catch (Exception e) {
            e.printStackTrace();
            LOG_EJECUCION.log(Level.INFO, " ******* ERROR EN EL INGRESO DE NUMEROS  ******* ");
            a_driver.closeApp();
        }
    }

    public String _res_validacion(AndroidDriver a_driver) {
        return res_o = a_driver.findElementById(AppId+"result").getText().trim();
    }
}
