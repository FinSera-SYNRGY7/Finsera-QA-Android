package appium.stepDefinitions;

import appium.BaseTest;
import appium.pages.CreatepinPage;
import appium.pages.InputpinPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InputpinSteps extends BaseTest {
    InputpinPage inputpinPage = new InputpinPage(driver);

    @When("User input valid PIN")
    public void user_input_valid_pin(){
        inputpinPage.tapsatuButton();
        inputpinPage.tapduaButton();
        inputpinPage.taptigaButton();
        inputpinPage.tapempatButton();
        inputpinPage.taplimaButton();
        inputpinPage.tapenamButton();
    }
    @When("User input invalid PIN")
    public void user_input_invalid_pin(){
        inputpinPage.tapenamButton();
        inputpinPage.tapenamButton();
        inputpinPage.tapenamButton();
        inputpinPage.tapenamButton();
        inputpinPage.tapsatuButton();
        inputpinPage.tapsatuButton();
    }
    @Then("User got invalid PIN error")
    public void user_got_invalid_pin(){
        inputpinPage.invalidPinIsdisplayed();
        BaseTest.removeApp();
    }
    @And("User create new PIN")
    public void user_create_new_pin(){
        CreatepinPage createpinPage = new CreatepinPage(driver);
        createpinPage.inputpinBaru("123456");
        createpinPage.inputKonfpin("123456");
        createpinPage.tapbuatpinButton();
    }
    @When("User create missmatch PIN")
    public void user_create_missmatch_pin(){
        CreatepinPage createpinPage = new CreatepinPage(driver);
        createpinPage.inputpinBaru("123456");
        createpinPage.inputKonfpin("321654");
        createpinPage.tapbuatpinButton();
    }
    @Then("User got error missmatch PIN message")
    public void user_got_error_missmatch_pin_message(){
        CreatepinPage createpinPage = new CreatepinPage(driver);
        createpinPage.errormessageIsDisplayed();
        BaseTest.removeApp();
    }
}
