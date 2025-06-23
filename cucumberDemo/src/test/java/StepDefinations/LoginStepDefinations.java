package StepDefinations;

import io.cucumber.java.en.*;

public class LoginStepDefinations {

    @Given("User is on NetBanking landing page")
    public void user_is_on_net_banking_landing_page() {
        System.out.println("User navigated to NetBanking landing page");
    }

    @When("User login into application with username and password")
    public void user_login_with_username_and_password() {
        System.out.println("Logging in with default credentials");
    }

    @Then("Home page is populated")
    public void home_page_is_populated() {
        System.out.println("Home page displayed successfully");
    }

    @And("Cards are displayed")
    public void cards_are_displayed() {
        System.out.println("Cards are visible");
    }

    @When("User login into application with {string} and password {string}")
    public void user_login_with_username_and_password_param(String username, String password) {
        System.out.println("Logging in with user: " + username + ", password: " + password);
    }

    @And("Cards displayed are {string}")
    public void cards_displayed_are(String status) {
        System.out.println("Cards displayed status: " + status);
    }

    @When("^User login in to application with (.+) and password (.+)$")
    public void user_login_in_to_application_with_and_password(String username, String password) {
        System.out.println("Scenario Outline - Username: " + username + ", Password: " + password);
    }


}