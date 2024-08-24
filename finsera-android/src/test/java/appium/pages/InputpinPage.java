package appium.pages;


import appium.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InputpinPage extends BaseTest {
    AndroidDriver driver;
    WebDriverWait  wait;

    public InputpinPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //Locator
    By invalidPinError = AppiumBy.id("com.finsera:id/snackbar_text");
    By satuButton = AppiumBy.accessibilityId("1");
    By duaButton = AppiumBy.xpath("//*[contains(@resource-id, 'com.finsera:id/btn_pin_2')]");
    By tigaButton = AppiumBy.xpath("//*[contains(@resource-id, 'com.finsera:id/btn_pin_3')]");
    By empatButton = AppiumBy.xpath("//*[contains(@resource-id, 'com.finsera:id/btn_pin_4')]");
    By limaButton = AppiumBy.xpath("//*[contains(@resource-id, 'com.finsera:id/btn_pin_5')]");
    By enamButton = AppiumBy.xpath("//*[contains(@resource-id, 'com.finsera:id/btn_pin_6')]");
    By gantiakunButton = AppiumBy.xpath("//*[contains(@resource-id, 'com.finsera:id/btn_ganti_akun')]");


    //Method
    public void tapsatuButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(satuButton)).click();
    }
    public void tapduaButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(duaButton)).click();
    }
    public void taptigaButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(tigaButton)).click();
    }
    public void tapempatButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(empatButton)).click();
    }
    public void taplimaButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(limaButton)).click();
    }
    public void tapenamButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(enamButton)).click();
    }
    public void invalidPinIsdisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(invalidPinError)).isDisplayed();
    }


}

