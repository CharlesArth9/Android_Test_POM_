package Android_PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.annotations.findby.By;
import org.openqa.selenium.WebElement;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Map_Calc extends AndroidElement {

    //AppiumDriver<MobileElement> driver;

    String res_o = "";
    public final static Logger LOG_EJECUCION = Logger.getLogger("Ejecución");

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'digit_6')]")
    WebElement seis;
    //  MobileElement  num6;

    @AndroidFindBy(id = "digit_9")
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
    //   MobileElement equal; :ERROR
    String AppId = "com.android.calculator2:id/";

    public void setear_nums(AndroidDriver driver) {
        
        String AppClass = "";

        try {
            //:OPTIMIZE

            MobileElement num6 = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'digit_6')]"));
            MobileElement num5 = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='5' and @index='4']"));
            AndroidElement num9 = (AndroidElement) driver.findElement(By.xpath("//android.widget.Button[@text='9' and @index='2']"));
            MobileElement mult = (MobileElement) driver.findElement(By.id(AppId +"op_mul"));
            AndroidElement num8 = (AndroidElement) driver.findElement(By.xpath("//android.widget.Button[@text='8' and @index='1']"));
            MobileElement num7 = (MobileElement) driver.findElement(By.id(AppId +"digit_7"));
            AndroidElement num3 = (AndroidElement) driver.findElement(By.xpath("//android.widget.LinearLayout[@index='0']/android.view.ViewGroup[@index='0']/android.widget.Button[@index='8']"));
            MobileElement igual = (MobileElement) driver.findElement(By.id(AppId +"eq"));

            num6.click();
            num5.click();
            num9.click();
            mult.click();
            num8.click();
            num7.click();
            num3.click();
            igual.click();

           /* num6.click();
              num9.click();
              mult.click();
              num4.click();
              equal.click(); */ // Usando @AndroidFindBy :FIXME -No me esta agarrando los @AndroidFindBy-


           /* driver.findElement(By.id(AppId+"digit_6")).click();
            driver.findElementById(AppId+"digit_5").click();
            driver.findElementById(AppId+"digit_8").click();
            driver.findElementById(AppId+"digit_7").click();
            driver.findElementById(AppId+"op_mul").click();
            driver.findElementById(AppId+"digit_1").click();
            driver.findElementById(AppId+"digit_5").click();
            driver.findElementById(AppId+"digit_9").click();
            driver.findElementById(AppId+"eq").click();*/

            /* List<MobileElement> calcButtons = driver.findElements(By.xpath("//android.widget.Button"));
             calcButtons.get(6).click();
             calcButtons.get(8).click();
             calcButtons.get(10).click();
             driver.findElementById(AppId+"op_mul").click();
             calcButtons.get(4).click();
             driver.findElementById(AppId+"eq").click();*/

            LOG_EJECUCION.log(Level.INFO, " ******* INGRESO DE NUMEROS EJECUTADO CON EXITO ******* ");


        } catch (Exception e) {
            e.printStackTrace();
            LOG_EJECUCION.log(Level.INFO, " ******* ERROR EN EL INGRESO DE NUMEROS  ******* ");
            driver.closeApp();
        }
    }

    public String _res_validacion(AndroidDriver driver) {
        return res_o = driver.findElementById(AppId +"result").getText().trim();
    }
}
