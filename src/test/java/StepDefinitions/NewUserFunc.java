package StepDefinitions;

import Pages.FormContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewUserFunc {

    FormContent fc=new FormContent();

    @Given("Navigate to Akakce")
    public void navigateToAkakce() {

        GWD.getDriver().get("https://www.akakce.com/");
        GWD.getDriver().manage().window().maximize();

    }

    @When("Click on Hesap ac button and fill the content")
    public void clickOnHesapAcButtonAndFillTheContent() throws InterruptedException {
        fc.findAndClick("hesapAc");
        fc.findAndSend("ad","eren");
        fc.findAndSend("soyad","yuksek");
        fc.findAndSend("ePosta","randomMail@gmail.com");
        fc.findAndSend("ePostaConf","randomMail@gmail.com");
        fc.findAndSend("sifre","randomPassword12");
        fc.findAndSend("sifreTekrar","randomPassword12");
        fc.findAndClick("gender");
        fc.selectFromDropDown("il","6");
        Thread.sleep(1000);
        fc.selectFromDropDown("ilce","59");
        fc.selectFromDropDown("gun","11");
        fc.selectFromDropDown("ay","2");
        fc.selectFromDropDown("yil","1980");
        fc.findAndClick("checkBox");
        fc.findAndClick("checkBox2");
        fc.findAndClick("submit");



    }

    @Then("New user should be created")
    public void newUserShouldBeCreated() {

        fc.findAndContainsText("assertHesap","Eren");
    }
}
