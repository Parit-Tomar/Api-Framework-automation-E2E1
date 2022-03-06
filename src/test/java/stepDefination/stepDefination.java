package stepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        //code to navigate to login page
    	System.out.println("navigated to login url");
    }

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_and(String par1, String par2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(par1);
        System.out.println(par2);
    }


    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        // code for home page validation
    	System.out.println("home page validation ");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        //code for card displaying
    	System.out.println("card display ");
    }

}