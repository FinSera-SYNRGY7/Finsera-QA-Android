package appium.stepDefinitions;

import appium.BaseTest;
import appium.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps extends BaseTest {
    LoginPage loginPage = new LoginPage(driver);
    @Given("User is on Login page")
    public void user_is_on_login_page(){
        loginPage.validateOnPage();
    }

    @And("User input username with {string}")
    public void user_input_username(String username){
        loginPage.inputUsername(username);
    }

    @And("User input password with {string}")
    public void user_input_password(String password){
        loginPage.inputPassword(password);
    }

    @And("User click login button")
    public void user_click_login_button(){
        loginPage.clickloginButton();
    }

    @Then("User got error message")
    public void user_got_error_message(){
        loginPage.errormessageIsdisplaye();
        BaseTest.removeApp();
    }
}
