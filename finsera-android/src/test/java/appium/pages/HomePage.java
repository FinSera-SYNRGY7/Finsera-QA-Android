package appium.pages;

import appium.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BaseTest {
    AndroidDriver driver;
    WebDriverWait wait;

    // Constructor
    public HomePage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    // Locator
    By nasabahText = AppiumBy.xpath("//*[contains(@resource-id, 'com.finsera:id/tv_nama_nasabah')]");
    By mutasiButton = AppiumBy.accessibilityId("Mutasi");
    By infosaldoButton = AppiumBy.accessibilityId("Info Saldo Anda");
    By transfersesamaButton = AppiumBy.id("com.finsera:id/ic_transfer_sesama");
    By transferantarButton = AppiumBy.id("com.finsera:id/ic_transfer_antarbank");
    By vaButton = AppiumBy.id("com.finsera:id/ic_virtual_account");
    By ewalletButton = AppiumBy.id("com.finsera:id/ic_ewallet");

    //Method
    public void namanasabahIsdisplaye(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(nasabahText)).isDisplayed();
    }
    public void tapmutasiButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(mutasiButton)).click();
    }
    public void taptransfersesamaButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(transfersesamaButton)).click();
    }
    public void tapinfosaldoButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(infosaldoButton)).click();
    }
    public void taptransferantarButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(transferantarButton)).click();
    }
    public void tapVaButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(vaButton)).click();
    }
    public void tapEwallet(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(ewalletButton)).click();
    }
}


