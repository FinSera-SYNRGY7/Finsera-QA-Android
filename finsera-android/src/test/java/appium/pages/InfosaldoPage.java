package appium.pages;

import appium.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InfosaldoPage extends BaseTest {
    AndroidDriver driver;
    WebDriverWait wait;
    public InfosaldoPage(AndroidDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    //lOCATOR
    By informasisaldoText = AppiumBy.accessibilityId("Informasi Saldo");
    By copynorekButton = AppiumBy.accessibilityId("Salin nomor rekening");
    By succefullyToast = AppiumBy.id("com.finsera:id/snackbar_text");


    //Method
    public void informasitextIsdisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(informasisaldoText)).isDisplayed();
    }
    public void tapcopynorekButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(copynorekButton)).click();
    }
    public void toastisDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(succefullyToast)).isDisplayed();
    }

}
