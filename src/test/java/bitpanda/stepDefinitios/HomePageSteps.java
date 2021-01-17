package bitpanda.stepDefinitios;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import util.TestContext;

public class HomePageSteps {

    TestContext testContext;
    HomePage homePage;

    public HomePageSteps(TestContext testContext) {
        this.testContext = testContext;
        this.homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("User enters the site home page")
    public void userOpensHomePage() {
        homePage.goToHomePage();
    }

    @When("User clicks on login button")
    public void userGetsTheFinancialOverviewInformation() {
        homePage.clickOnLoginButton();
    }
}
