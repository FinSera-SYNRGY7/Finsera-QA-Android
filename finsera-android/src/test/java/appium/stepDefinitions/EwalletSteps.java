package appium.stepDefinitions;

import appium.BaseTest;
import appium.pages.EwalletPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EwalletSteps extends BaseTest {
    EwalletPage ewalletPage = new EwalletPage(driver);

    @And("user user selects ewallet option")
    public void user_select_ewallet_option(){
        ewalletPage.tapinputBaru();
        ewalletPage.tapShopee();
    }
    @And("User input nomor field with {string}")
    public void user_input_nomor_filed_with(String nomor){
        ewalletPage.inputNomor(nomor);
        ewalletPage.tapLanjut();
    }
    @And("user input nominal transfer with {string}")
    public void user_input_nominal_transfer_with(String nominal){
        ewalletPage.inputNominal(nominal);
    }
    @When("User input payment pin wtih {string}")
    public void user_input_payment_pin_with(String pin){
        ewalletPage.inputPIN(pin);
        ewalletPage.tapLanjut();
    }
    @Then("User successfully transfer via ewallet")
    public void user_succeessfully_transfer_via_ewallet(){
        ewalletPage.getsuccessText();
        BaseTest.removeApp();
    }
    @Then("user gets the error text")
    public void user_gets_error_text(){
        ewalletPage.toastisdDisplayed();
        BaseTest.removeApp();
    }
}
