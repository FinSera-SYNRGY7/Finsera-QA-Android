package appium.stepDefinitions;

import appium.BaseTest;
import appium.pages.CreatepinPage;
import appium.pages.HomePage;

import appium.pages.InputpinPage;
import appium.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps extends BaseTest {
    HomePage homePage = new HomePage(driver);

    @Then("User is on Home page")
    public void user_is_on_homepage(){
        homePage.namanasabahIsdisplaye();
        BaseTest.removeApp();
    }
    @Given("User already on Home page")
    public void user_already_on_homepage(){
        LoginPage loginPage = new LoginPage(driver);
        InputpinPage inputpinPage = new InputpinPage(driver);

        loginPage.inputUsername("johndoe");
        loginPage.inputPassword("password123");
        loginPage.clickloginButton();

        CreatepinPage createpinPage = new CreatepinPage(driver);
        createpinPage.inputpinBaru("123456");
        createpinPage.inputKonfpin("123456");
        createpinPage.tapbuatpinButton();

        inputpinPage.tapsatuButton();
        inputpinPage.tapduaButton();
        inputpinPage.taptigaButton();
        inputpinPage.tapempatButton();
        inputpinPage.taplimaButton();
        inputpinPage.tapenamButton();

        homePage.namanasabahIsdisplaye();


    }
    @When("User tap the info saldo button")
    public void user_tap_info_saldo_button(){
        homePage.tapinfosaldoButton();
    }
    @And("User tap the transfer sesama button")
    public void user_tap_transfer_sesama_button(){
        homePage.taptransfersesamaButton();
    }
    @And("User tap the transfer antar button")
    public void user_tap_the_transfer_antar_button(){
        homePage.taptransferantarButton();
    }
    @And("User tap virtual account button")
    public void user_tap_virtual_account_button(){
        homePage.tapVaButton();
    }
    @And("User tap ewallet button")
    public void user_tap_ewallet_button(){
        homePage.tapEwallet();
    }
}
