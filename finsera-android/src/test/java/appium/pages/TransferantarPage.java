package appium.pages;

import appium.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TransferantarPage extends BaseTest {
    AndroidDriver driver;
    WebDriverWait wait;

    public TransferantarPage(AndroidDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    //locator
    By inputbaruButton= AppiumBy.accessibilityId("input baru klik untuk transfer");
    By pilihbankEt = AppiumBy.id("com.finsera:id/etPilihBank");
    By pilihbankText = AppiumBy.xpath("//*[contains(@text, 'Pilih Bank')]");
    By briButton = AppiumBy.xpath("//*[contains(@text, 'BRI')]");
    By nomorrekeningEt = AppiumBy.id("com.finsera:id/etNomorRekening");
    By nomorrekeningText = AppiumBy.accessibilityId("Masukkan nomor rekening tujuan di bawah");
    By nominalText = AppiumBy.accessibilityId("Masukkan Nominal Transfer di bawah");
    By nominalField = AppiumBy.id("com.finsera:id/etNominal");
    By catatanField = AppiumBy.id("com.finsera:id/etCatatan");
    By pinpembayaranField = AppiumBy.id("com.finsera:id/et_pin");
    By lanjutkonfirmasiButton = AppiumBy.id("com.finsera:id/btn_next");
    By sukseskonfirmasiText = AppiumBy.id("com.finsera:id/tv_bank_label");
    By toastText = AppiumBy.id("com.finsera:id/snackbar_text");
    //method
    public void tapinputbaruButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputbaruButton)).click();
    }
    public void tappilihBank(){
        wait.until(ExpectedConditions.presenceOfElementLocated(pilihbankText));
        wait.until(ExpectedConditions.visibilityOfElementLocated(pilihbankEt)).click();
    }
    public void proceedtotapBRI(){
        wait.until(ExpectedConditions.presenceOfElementLocated(briButton));
        WebElement bripilihButton = wait.until(ExpectedConditions.elementToBeClickable(briButton));
        bripilihButton.click();
    }
    public void inputnomorRekening(String norek){
        wait.until(ExpectedConditions.presenceOfElementLocated(nomorrekeningText));
        wait.until(ExpectedConditions.visibilityOfElementLocated(nomorrekeningEt)).sendKeys(norek);
    }
    public void toastisDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(toastText)).isDisplayed();
    }
    public void inputNominal(String nominal){
        wait.until(ExpectedConditions.presenceOfElementLocated(nominalText));
        wait.until(ExpectedConditions.visibilityOfElementLocated(nominalField)).sendKeys(nominal);
    }
    public void inputCatatan(String catatan){
        wait.until(ExpectedConditions.visibilityOfElementLocated(catatanField)).sendKeys(catatan);
    }
    public void taplanjutkonfirmasiButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lanjutkonfirmasiButton)).click();
    }
    public void inputPinPembayaranField(String pin){
        wait.until(ExpectedConditions.visibilityOfElementLocated(pinpembayaranField)).sendKeys(pin);
    }
    public void sukseskonfirmasitextIsdisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(sukseskonfirmasiText)).isDisplayed();
    }
}
