package StepDefinitions;

import Pages.FormContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import javax.xml.crypto.Data;
import java.util.List;

public class DeleteUser {
    FormContent fc=new FormContent();
    @And("Enter valid password")
    public void enterValidPassword(DataTable elemanlar) {

        List<List<String>> listElemanlar=elemanlar.asLists(String.class);
        for (int i = 0; i <listElemanlar.size() ; i++) {
            fc.findAndSend(listElemanlar.get(i).get(0),listElemanlar.get(i).get(1));

        }
    }

    @Then("User should be able to delete the account successfully")
    public void userShouldBeAbleToDeleteTheAccountSuccessfully() {
        fc.findAndContainsText("hesapAc","Hesap Aç");
    }


    @Given("Click on elements")
    public void clickOnElements(DataTable elemanlar) {
        List<String> listElemanlar= elemanlar.asList(String.class);

        for(String strButtonName : listElemanlar) {
            fc.findAndClick(strButtonName);
        }
    }
}
