package appium.stepDefinitions;

import appium.BaseTest;
import appium.pages.VaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VaSteps extends BaseTest {
    VaPage vaPage = new VaPage(driver);

   @And("User input virtual account numbers with {string}")
   public void user_input_virtual_account_numbers_with(String va){
       vaPage.tapinputBaru();
       vaPage.inputVA(va);
       vaPage.tapLanjut();
   }
   @When("user input payment pin wtih {string}")
    public void user_input_paymnet_pin_with(String pin){
       vaPage.inputPIN(pin);
       vaPage.tapLanjut();
   }
    @Then("User successfully pay the VA")
    public void user_successfully_pay_the_va(){
       vaPage.successtestIsdidplayed();
       BaseTest.removeApp();
    }
    @Then("user gets error message")
    public void user_gets_error_message(){
       vaPage.errortextisDisplayed();
       BaseTest.removeApp();
    }

}
