package appium.stepDefinitions;

import appium.BaseTest;
import appium.pages.HomePage;
import appium.pages.MutasiPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MutasiSteps extends BaseTest {
    MutasiPage mutasiPage = new MutasiPage(driver);

    @When("Tap the mothly timeframe button")
    public void tap_mothly_timeframe_button(){
        mutasiPage.tapmothlyButton();
    }
    @Then("The mothly mutasi appears on screen")
    public void mothly_mutasi_appears(){
        mutasiPage.monthlyDateisDisplayed();
        BaseTest.removeApp();
    }
    @And("User tap the mutasi button")
    public void user_the_tap_mutasi_button(){
        HomePage homePage = new HomePage(driver);
        homePage.tapmutasiButton();
    }
    @When("User tap the download mutasi button")
    public void user_tap_the_download_mutasi_button(){
        mutasiPage.tapdwonloadButton();
    }
    @Then("The mutasi successfully downloaded")
    public void the_mutasi_successfully_downloaded(){
        mutasiPage.proceedToAksesfile();
        BaseTest.removeApp();
    }
}
