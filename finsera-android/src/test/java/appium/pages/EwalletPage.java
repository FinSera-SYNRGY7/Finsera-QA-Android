package appium.pages;

import appium.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EwalletPage extends BaseTest {
    AndroidDriver driver;
    WebDriverWait wait;

    public EwalletPage (AndroidDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //locator
    By toastText = AppiumBy.id("com.finsera:id/snackbar_text");
    By inputBaru = AppiumBy.accessibilityId("Input Baru");
    By shopeeButton = AppiumBy.id("com.finsera:id/tv_shopeepay");
    By nomorField = AppiumBy.accessibilityId("Input Nomor Handphone atau Nama");
    By nomorText = AppiumBy.accessibilityId("Masukkan nomor handphone atau nama di bawah");
    By nominalField = AppiumBy.xpath("//android.widget.EditText[@text='Nominal']");
    By pinField = AppiumBy.xpath("//android.widget.EditText[@text='PIN']");
    By konfText = AppiumBy.accessibilityId("Nomor E-Wallet");
    By lanjutButton = AppiumBy.accessibilityId("Lanjut");
    By successText = AppiumBy.accessibilityId("Transaksi Berhasil");

    //method
    public void tapinputBaru(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputBaru)).click();
    }
    public void tapShopee(){
        wait.until(ExpectedConditions.presenceOfElementLocated(shopeeButton));
        WebElement bripilihButton = wait.until(ExpectedConditions.elementToBeClickable(shopeeButton));
        bripilihButton.click();
    }
    public void inputNomor(String nomor){
        wait.until(ExpectedConditions.presenceOfElementLocated(nomorText));
        wait.until(ExpectedConditions.visibilityOfElementLocated(nomorField)).sendKeys(nomor);
    }
    public void tapLanjut(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lanjutButton)).click();
    }
    public void inputNominal(String nominal){
        wait.until(ExpectedConditions.presenceOfElementLocated(konfText));
        wait.until(ExpectedConditions.visibilityOfElementLocated(nominalField)).sendKeys(nominal);
    }
    public void inputPIN(String pin){
        wait.until(ExpectedConditions.visibilityOfElementLocated(pinField)).sendKeys(pin);
    }
    public void getsuccessText(){
        wait.until(ExpectedConditions.presenceOfElementLocated(successText));
        wait.until(ExpectedConditions.visibilityOfElementLocated(successText)).isDisplayed();
    }
    public void toastisdDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(toastText)).isDisplayed();
    }

}
