package com.envision.actitime.stepdefination;

import com.envision.actitime.pageobjects.LoginPage;
import com.envision.actitime.pageobjects.TimeTrackPage;
import com.envision.actitime.utility.BrowserFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPageStepDefination {
    WebDriver driver;

    LoginPage lp = new LoginPage(BrowserFactory.getBrowser());

    @Given("User enters {string} as user id")
    public void user_enters_admin_as_user_id(String usernameInput) {
      lp.enterUserName(usernameInput);
    }



    @Given("user enters {string} as password")
    public void user_enters_as_password(String passwordInput) {
        lp.enterPassword(passwordInput);

    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        lp.clickLoginButton();

    }

    @Then("user should see the  error message as {string}")
    public void user_should_see_the_error_message_as(String string) {
        lp.getInvalidLoginErrorMessage();
    }


}
