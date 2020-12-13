package StepDefination;


import Library.Base;
import UIPages.GmailLogin;
import UIPages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs{


    @Then("^application should show relevent data in the dopdown$")
    public void applicationShouldShowReleventDataInTheDopdown() {
        LoginPage.releventdata();
    }

    @And("^application should allow the user to select the option$")
    public void applicationShouldAllowTheUserToSelectTheOption() {
        LoginPage.allowUser();
    }

    @Given("^open the browser \"([^\"]*)\" and launch the application$")
    public void open_the_browser_and_launch_the_application(String browser) throws Exception {
        LoginPage.launchApplication(browser);

    }

    @When("^user enter select contry name \"([^\"]*)\"$")
    public void user_enter_select_contry_name(String arg1) throws Exception {

        LoginPage.SelectCountry(arg1);


    }


    @Given("^open the browser \"([^\"]*)\" and launch the gmail application$")
    public void openTheBrowserAndLaunchTheGmailApplication(String brow) throws Throwable {
        GmailLogin.launchGmailApplication(brow);
    }

    @When("^user enter the username\"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void userEnterTheUsernameAndPassword(String uname, String pass) throws Throwable {
        GmailLogin.enterUserNameandPassword(uname,pass);
    }

    @And("^click on login button$")
    public void clickOnLoginButton() {
        GmailLogin.click();
    }

    @Then("^User should navigate to Gmail home screen$")
    public void userShouldNavigateToGmailHomeScreen() {
        GmailLogin.gmailHomeScrenn();
    }
}
