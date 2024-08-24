package appium.stepDefinitions;

import appium.BaseTest;
import appium.pages.TransferantarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TransferantarSteps extends BaseTest {
    TransferantarPage transferantarPage = new TransferantarPage(driver);
    @And("User tap the input baru button")
    public void user_tap_the_input_baru_button(){
        transferantarPage.tapinputbaruButton();
    }
    @And("User select BRI bank")
    public void user_select_bri_bank(){
        transferantarPage.tappilihBank();
        transferantarPage.proceedtotapBRI();
    }
    @And("user input nomor rekening tujuan with {string}")
    public void user_input_nomor_rekening_tujuan(String norek){
        transferantarPage.inputnomorRekening(norek);
    }
    @And("User input nominal field with {string}")
    public void user_input_nominal_field_with(String nominal){
        transferantarPage.inputNominal(nominal);
    }
    @And("User input catatan field with {string}")
    public void user_input_catatan_field(String catatan){
        transferantarPage.inputCatatan(catatan);
    }
    @When("User input the valid Payment PIN")
    public void user_input_the_valid_payment_pin(){
        transferantarPage.inputPinPembayaranField("123456");
        transferantarPage.taplanjutkonfirmasiButton();
    }
    @Then("User successfully cross transfer bank")
    public void user_successfully_cross_transfer_bank(){
        transferantarPage.sukseskonfirmasitextIsdisplayed();
        BaseTest.removeApp();
    }
    @And("User tap the lanjut button")
    public void user_click_the_lanjut_button(){
        transferantarPage.taplanjutkonfirmasiButton();
    }
    @When("User input the invalid Payment PIN")
    public void user_input_the_invalid_payment_pin(){
        transferantarPage.inputPinPembayaranField("321432");
        transferantarPage.taplanjutkonfirmasiButton();
    }
    @Then("the transaction failed")
    public void the_transaction_failed(){
        transferantarPage.toastisDisplayed();
        BaseTest.removeApp();
    }
    @Then("user gets alert account number not found")
    public void user_gets_alert_account_numbers(){
        transferantarPage.toastisDisplayed();
        BaseTest.removeApp();
    }
}
