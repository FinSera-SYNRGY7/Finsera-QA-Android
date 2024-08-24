package appium.pages;

import appium.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreatepinPage extends BaseTest {
    AndroidDriver driver;
    WebDriverWait wait;

    public CreatepinPage(AndroidDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //Locator
    By pinbaruField = AppiumBy.xpath("//*[contains(@text, 'PIN Baru')]");
    By konfpinField = AppiumBy.xpath("//*[contains(@text, 'Konfirmasi PIN Baru')]");
    By buatpinButton = AppiumBy.id("com.finsera:id/btn_buat_pin");
    By missmatchpinAlert = AppiumBy.xpath("//*[contains(@text, 'PIN Baru dengan Konfirmasi PIN tidak sama! Silahkan masukkan ulang!')]");

    //Method
    public void inputpinBaru(String pinBaru) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(pinbaruField)).sendKeys(pinBaru);
    }

    public void inputKonfpin(String konfPin) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(konfpinField)).sendKeys(konfPin);
    }
    public void tapbuatpinButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(buatpinButton)).click();
    }
    public void errormessageIsDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(missmatchpinAlert)).isDisplayed();
    }
}
