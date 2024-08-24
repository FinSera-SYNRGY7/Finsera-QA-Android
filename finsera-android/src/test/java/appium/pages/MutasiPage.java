package appium.pages;

import appium.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;


import java.time.Duration;

public class MutasiPage extends BaseTest {
    AndroidDriver driver;
    WebDriverWait wait;

    public MutasiPage(AndroidDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    //Locator
    By mothlyButton = AppiumBy.id("com.finsera:id/btn_month");
    By mothlyDate = AppiumBy.xpath("//*[contains(@text,'24 Agustus 2024')]");
    By downloadButton = AppiumBy.accessibilityId("Unduh Mutasi Transaksi");
    By succefullyToast = AppiumBy.id("com.finsera:id/snackbar_text");
    By aksesfileButton = AppiumBy.id("android:id/button1");
    By aksesfileText = AppiumBy.id("com.finsera:id/alertTitle");

    //method
    public void tapmothlyButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(mothlyButton)).click();
    }
    public void monthlyDateisDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(mothlyDate)).isDisplayed();
    }
    public void tapdwonloadButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(downloadButton)).click();
    }
    public void proceedToAksesfile() {
        // Assertion to check if the user is on perizinan file
        wait.until(ExpectedConditions.presenceOfElementLocated(aksesfileText));
        WebElement aksesfileBtn = wait.until(ExpectedConditions.elementToBeClickable(aksesfileButton));
        aksesfileBtn.click();
    }
}
