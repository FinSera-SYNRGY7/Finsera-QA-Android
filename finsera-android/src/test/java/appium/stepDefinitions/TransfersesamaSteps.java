package appium.stepDefinitions;

import appium.BaseTest;
import appium.pages.TransfersesamaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TransfersesamaSteps extends BaseTest {
    TransfersesamaPage transfersesamaPage = new TransfersesamaPage(driver);

    @And("User tap input baru button")
    public void user_tap_input_button(){
        transfersesamaPage.tapinputBaruButton();
    }
    @And("user input nomor rekening with {string}")
    public void user_input_norek_with(String norek){
        transfersesamaPage.inputNorek(norek);
    }
    @And("User tap lanjut button")
    public void user_tap_lanjut_button(){
        transfersesamaPage.tapLanjutButton();
    }
    @And("User input nominal transfer with {string}")
    public void user_input_nominal_transfer(String nom){
        transfersesamaPage.inputNominal(nom);
    }
    @Then("User successfully transfer the money")
    public void user_succesfully_transfer_the_money(){
        transfersesamaPage.successTestIsDisplayed();
        BaseTest.removeApp();
    }
    @When("User input valid Payment PIN")
    public void user_input_valid_payment_pin(){
        transfersesamaPage.inputPinPembayaran("123456");
        transfersesamaPage.tapLanjutNomCatButton();
    }
    @And("User input catatan transfer with {string}")
    public void user_input_catatan_transfer(String catatan){
        transfersesamaPage.inputCatatan(catatan);
    }
    @When("User input invalid Payment PIN")
    public void user_input_ibalid_payment_pin(){
        transfersesamaPage.inputPinPembayaran("321432");
        transfersesamaPage.tapLanjutNomCatButton();
    }
    @Then("User got wrong pin error message")
    public void user_got_wrong_pin_error_message(){
        transfersesamaPage.wrongpinerrorTextIsDisplayed();
        BaseTest.removeApp();
    }
    @When("User tap the Lanjut button")
    public void user_tap_the_lanjut_button(){
        transfersesamaPage.tapLanjutNomCatButton();
    }
    @Then("User got issuficient balance alert")
    public void user_got_error_issuficient_balance_alert(){
        transfersesamaPage.issufficientbalanceTextIsDisplayed();
        BaseTest.removeApp();
    }
    @Then("User got account numbers not found alert")
    public void  user_got_account_numbers_not_found_alert(){
        transfersesamaPage.issufficientbalanceTextIsDisplayed();
        BaseTest.removeApp();
    }


}
