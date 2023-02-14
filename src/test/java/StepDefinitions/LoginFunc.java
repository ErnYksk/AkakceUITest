package StepDefinitions;

import Pages.FormContent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunc {

    FormContent fc=new FormContent();
    @When("Click on Login button and enter valid email and password")
    public void clickOnLoginButtonAndEnterValidEmailAndPassword() {
    fc.findAndClick("loginButton");
    fc.findAndSend("email","randomMail@gmail.com");
    fc.findAndSend("password","randomPassword12");
    fc.findAndClick("login");


    }

    @Then("User should be able to login with valid data")
    public void userShouldBeAbleToLoginWithValidData() {
        fc.findAndContainsText("assertHesap","Eren");
    }
}
