package appium.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import appium.BaseTest;

import java.time.Duration;


public class LoginPage extends BaseTest{
    AndroidDriver driver;
    WebDriverWait wait;

    // Constructor
    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //Locator
    By usernameField = AppiumBy.accessibilityId("Kolom Username");
    By passwordField = AppiumBy.accessibilityId("Kolom Password");
    By loginButton = By.xpath("//*[contains(@resource-id, 'com.finsera:id/btn_login')]");
    By lupapasswordText = By.xpath("//*[contains(@text, 'Lupa Password ?')]");
    By errorMessage = AppiumBy.id("com.finsera:id/snackbar_text");


    //Method
    public void inputUsername(String username){
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys(username);
    }
    public void inputPassword(String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(password);
    }
    public void clickloginButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton)).click();
    }
    public void validateOnPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(usernameField));
        wait.until(ExpectedConditions.presenceOfElementLocated(passwordField));
        wait.until(ExpectedConditions.presenceOfElementLocated(loginButton));
    }
    public void errormessageIsdisplaye(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage)).isDisplayed();
    }
}