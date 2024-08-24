package appium.pages;

import appium.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TransfersesamaPage extends BaseTest {
    AndroidDriver driver;
    WebDriverWait wait;

    public TransfersesamaPage(AndroidDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    //locator
    By inputbaruButton= AppiumBy.accessibilityId("input baru klik untuk transfer");
    By norektujuanText = AppiumBy.accessibilityId("Masukkan nomor rekening tujuan di bawah");
    By lanjutButton = AppiumBy.accessibilityId("Lanjut");
    By norekField = AppiumBy.id("com.finsera:id/nomorEditText");
    By nominalField = AppiumBy.id("com.finsera:id/etNominal");
    By catatanField = AppiumBy.id("com.finsera:id/etCatatan");
    By lanjutnomcatButton = AppiumBy.id("com.finsera:id/btn_next");
    By pinField = AppiumBy.xpath("//*[contains(@resource-id,'com.finsera:id/et_pin')]");
    By successText = AppiumBy.accessibilityId("Transaksi Berhasil");
    By wrongpinerrorText = AppiumBy.id("com.finsera:id/snackbar_text");
    By issufficientbalanceText = AppiumBy.id("com.finsera:id/snackbar_text");
    By savedcontactChecklist = AppiumBy.id("com.finsera:id/checkbox_daftar_tersimpan_sesama");

    //method
    public void tapinputBaruButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputbaruButton)).click();
    }

    public void inputNorek(String norekTujuan){
        // Assertion to check if the user is on the norektujuanpage
        wait.until(ExpectedConditions.presenceOfElementLocated(norektujuanText));
        wait.until(ExpectedConditions.visibilityOfElementLocated(norekField)).sendKeys(norekTujuan);
    }
    public void tapLanjutButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lanjutButton)).click();
    }
    public void swipeToElementWithText(String text) {
        driver.findElement(
                new AppiumBy.ByAndroidUIAutomator(
                        String.format(
                                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"%s\"))",
                                text)));
    }
    public void inputNominal(String nomTransfer){
        wait.until(ExpectedConditions.visibilityOfElementLocated(nominalField)).sendKeys(nomTransfer);
    }
    public void inputCatatan(String catatan){
        wait.until(ExpectedConditions.visibilityOfElementLocated(catatanField)).sendKeys(catatan);
    }
    public void tapLanjutNomCatButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lanjutnomcatButton)).click();
    }
    public void inputPinPembayaran(String pinPemb){
        wait.until(ExpectedConditions.visibilityOfElementLocated(pinField)).sendKeys(pinPemb);
    }
    public void successTestIsDisplayed(){
        wait.until(ExpectedConditions.presenceOfElementLocated(successText));
        wait.until(ExpectedConditions.visibilityOfElementLocated(successText)).isDisplayed();
    }
    public void wrongpinerrorTextIsDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(wrongpinerrorText)).isDisplayed();
    }
    public void issufficientbalanceTextIsDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(issufficientbalanceText)).isDisplayed();
    }
}
