package Android_Steps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


import Android_PageObjects.Map_Calc;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;

public class NativeAndroid_Calc_Step extends AndroidElement {
//  Map_Calc map_calc;

    Map_Calc m = new Map_Calc();
    AndroidDriver a_driver = null;
    public final static Logger LOG_VALIDA = Logger.getLogger("Validar");
    public final static Logger LOG_TEST_EXITOSO = Logger.getLogger("Exito");
    public final static Logger LOG_EJECUCION = Logger.getLogger("Ejecucion");

    @Step

    public void abrir_calculadora() {

        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            /* DesiredCapabilities caps = DesiredCapabilities.android();
            caps.setCapability("deviceName", "Pixel 2");
            caps.setCapability("udid", "emulator-5554");
            caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion", "9");
            caps.setCapability("appPackage", "com.android.calculator2");
            caps.setCapability("appActivity", "com.android.calculator2.Calculator");*/

                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2");
                caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
                caps.setCapability(MobileCapabilityType.NO_RESET, false);
                caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
                caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");


            //AndroidDriver  a_driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
            a_driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            a_driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
            LOG_EJECUCION.log(Level.INFO, " ******* INGRESO APP CALCULADORA EJECUTADO CON EXITO ******* ");


        } catch (MalformedURLException e) {
            e.printStackTrace();
            LOG_EJECUCION.log(Level.INFO, " ******* ERROR AL ABRIR APP CALCULADORA ******* ");
        }
    }

    @Step
    public void ingresa_datos() {
        m.setear_nums(a_driver);

    }


    public void valida (String res_e){

        String res_o = m._res_validacion(a_driver);

        try {
            if (res_o.trim().equals(res_e)) {
                Assert.assertTrue("",res_e.equalsIgnoreCase(res_o.trim()));
                LOG_VALIDA.log(Level.INFO, " ******* VALIDACION CORRECTA  ******* ");

            } else {
            //  assert (!res_e.equals(res_o.trim())):"VALIDACION ERRONEA";
            //  Assert.assertNotEquals(res_e, res_o.trim());
                LOG_VALIDA.log(Level.INFO, " ****** VALIDACION ERRONEA ****** ");
                LOG_VALIDA.log(Level.INFO, " **** El valor esperado es distinto al valor obtenido en el resultado **** ");
                Assert.assertTrue("",res_e.equalsIgnoreCase(res_o.trim()));
            //    SoftAssertions soft = new SoftAssertions();
            //    soft.assertAll();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cerrar_app() {
        try {
            a_driver.closeApp();
            LOG_TEST_EXITOSO.log(Level.INFO," ********** TEST EXITOSO ********** ");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

