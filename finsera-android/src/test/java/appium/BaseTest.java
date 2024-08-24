package appium;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class BaseTest {
    public static AndroidDriver driver;
    public static WebDriverWait wait;


    public static void setup() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:platformVersion", "14.0");
        capabilities.setCapability("appium:deviceName", "RRCW40292QF");
        capabilities.setCapability("appium:app", "D:/mine/SNRGY/app-debug.apk");
        capabilities.setCapability("appium:automationName", "UIAutomator2");
        capabilities.setCapability("appium:appPackage", "com.finsera");
        capabilities.setCapability("appium:appActivity", "com.finsera.presentation.MainActivity");

        driver = new AndroidDriver(capabilities);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));


    }
    public static void closeSession(){
        driver.quit();
    }
    public static void resetApp(){
        driver.terminateApp("com.finsera");
        driver.activateApp("com.finsera");
    }
    public static void removeApp(){
        driver.removeApp("com.finsera");
        driver.installApp("D:/mine/SNRGY/app-debug.apk");
    }
}