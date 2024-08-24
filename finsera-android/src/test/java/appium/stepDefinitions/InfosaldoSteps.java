package appium.stepDefinitions;

import appium.BaseTest;
import appium.pages.InfosaldoPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InfosaldoSteps extends BaseTest {
    InfosaldoPage infosaldoPage = new InfosaldoPage(driver);

    @Then("User's balance appears on screen")
    public void user_balance_appears_on_screen(){
        infosaldoPage.informasitextIsdisplayed();
        BaseTest.removeApp();
    }
    @When("User tap copy account numbers button")
    public void user_tap_copy_account_numbers_button(){
        infosaldoPage.tapcopynorekButton();
    }
    @Then("User's account numbers copied")
    public void user_account_numbers_copied(){
        infosaldoPage.toastisDisplayed();
        BaseTest.removeApp();
    }
}
