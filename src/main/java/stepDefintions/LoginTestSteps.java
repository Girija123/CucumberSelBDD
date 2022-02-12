package stepDefintions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginTestSteps extends CommonFunctions {

    HomePage homePage = new HomePage(browser);
    LoginPage loginPag = new LoginPage(browser);

    @When("I click sign in link in the header")
    public void i_click_sign_in_link_in_the_header() {
        homePage.clickSignInLnk();
    }

    @When("I enter username  {string} and password  {string}")
    public void i_enter_username_and_password(String username, String password) {
        loginPag.enterUsername(username);
        loginPag.enterPassword(password);
    }

    @When("I click login button")
    public void i_click_login_button() {
        loginPag.clickLoginBtn();
    }

    @Then("I should login successfully")
    public void i_should_login_successfully() {

    }
}
