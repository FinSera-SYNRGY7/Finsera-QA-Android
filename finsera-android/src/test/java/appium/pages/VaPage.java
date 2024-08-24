package appium.pages;

import appium.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VaPage extends BaseTest {
    AndroidDriver driver;
    WebDriverWait wait;


    public VaPage(AndroidDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    // locator
    By inputBaru = AppiumBy.accessibilityId("input baru klik untuk transfer");
    By vaField = AppiumBy.id("com.finsera:id/banktujuanEditText");
    By vaText = AppiumBy.accessibilityId("input nomor virtual account di bawah");
    By pinField = AppiumBy.id("com.finsera:id/tie_pin");
    By pinText = AppiumBy.accessibilityId("Masukkan pin anda di bawah");
    By lanjutButton = AppiumBy.accessibilityId("Lanjut");
    By toasText =AppiumBy.id("com.finsera:id/snackbar_text");
    By successText = AppiumBy.id("com.finsera:id/tv_nama_penerima");

    //method
    public void tapinputBaru(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputBaru)).click();
    }
    public void inputVA(String va){
        wait.until(ExpectedConditions.presenceOfElementLocated(vaText));
        wait.until(ExpectedConditions.visibilityOfElementLocated(vaField)).sendKeys(va);
    }
    public void tapLanjut(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lanjutButton)).click();
    }
    public void inputPIN(String pin){
        wait.until(ExpectedConditions.presenceOfElementLocated(pinText));
        wait.until(ExpectedConditions.visibilityOfElementLocated(pinField)).sendKeys(pin);
    }
    public void successtestIsdidplayed(){
        wait.until(ExpectedConditions.presenceOfElementLocated(successText));
        wait.until(ExpectedConditions.visibilityOfElementLocated(successText)).isDisplayed();
    }
    public void errortextisDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(toasText)).isDisplayed();
    }

}
