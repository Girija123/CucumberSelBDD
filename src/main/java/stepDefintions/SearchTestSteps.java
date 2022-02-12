package stepDefintions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CookieBanner;
import pageObjects.HomePage;

public class SearchTestSteps extends CommonFunctions {

    CookieBanner cookieBanner = new CookieBanner(browser);
    HomePage homePage = new HomePage(browser);

    @Given("I'm on HomePage {string}")
    public void i_m_on_home_page(String url, String expectedHeading) {
        browser.get(url);
        waitForTime(2);
        cookieBanner.verifyCookieHeading(expectedHeading);
        cookieBanner.clickAcceptCookiesBtn();
    }
    @When("I enter searchTerm {string}")
    public void i_enter_search_term(String searchTerm) {
        homePage.enterSearchTerm(searchTerm);
    }
    @When("I click search icon")
    public void i_click_search_icon() {
        homePage.clickSearchIcon();
    }
    @Then("I should get relevant products listed")
    public void i_should_get_relevant_products_listed() {

    }

}
