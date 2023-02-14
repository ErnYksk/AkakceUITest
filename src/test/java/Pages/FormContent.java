package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent {

    public FormContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(xpath = "//div/a[text()='Hesap Aç']")
    private WebElement hesapAc;
    @FindBy(id = "rnufn")
    private WebElement ad;
    @FindBy(id = "rnufs")
    private WebElement soyad;
    @FindBy(id = "rnufe1")
    private WebElement ePosta;
    @FindBy(id = "rnufe2")
    private WebElement ePostaConf;
    @FindBy(id = "rnufp1")
    private WebElement sifre;
    @FindBy(id = "rnufp2")
    private WebElement sifreTekrar;
    @FindBy(id = "rngm")
    private WebElement gender;

    @FindBy(id = "locpr")
    private WebElement il;

    @FindBy(id = "locds")
    private WebElement ilce;

    @FindBy(id = "bd")
    private WebElement gun;

    @FindBy(id = "bm")
    private WebElement ay;

    @FindBy(id = "by")
    private WebElement yil;

    @FindBy(id = "rnufpca")
    private WebElement checkBox;

    @FindBy(id = "rnufnee")
    private WebElement checkBox2;

    @FindBy(id = "rfb")
    private WebElement submit;

    @FindBy(xpath = "//a[text()='Eren']")
    private WebElement assertHesap;

    @FindBy(xpath = "//a[text()='Giriş Yap']")
    private WebElement loginButton;

    @FindBy(id = "life")
    private WebElement email;

    @FindBy(id = "lifp")
    private WebElement password;

    @FindBy(id = "lfb")
    private WebElement login;

    @FindBy(xpath = "//a[text()='Hesabımı Sil']")
    private WebElement hesapSilButton;

    @FindBy(id = "p")
    private WebElement hesapSifre;

    @FindBy(id = "u")
    private WebElement hesapSilSubmit;



    WebElement myElement;

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "hesapAc":
                myElement = hesapAc;
                break;
            case "gender":
                myElement = gender;
                break;

            case "checkBox":
                myElement = checkBox;
                break;

            case "checkBox2":
                myElement = checkBox2;
                break;

            case "submit":
                myElement = submit;
                break;

            case "loginButton":
                myElement = loginButton;
                break;

            case "login":
                myElement = login;
                break;

            case "hesapSilButton":
                myElement = hesapSilButton;
                break;

            case "hesapSilSubmit":
                myElement = hesapSilSubmit;
                break;

            case "assertHesap":
                myElement = assertHesap;
                break;
        }
        clickFunction(myElement);
    }

    public void findAndSend(String strElement, String value) {
        switch (strElement) {
            case "ad":
                myElement = ad;
                break;
            case "soyad":
                myElement = soyad;
                break;
            case "ePosta":
                myElement = ePosta;
                break;
            case "ePostaConf":
                myElement = ePostaConf;
                break;
            case "sifre":
                myElement = sifre;
                break;
            case "sifreTekrar":
                myElement = sifreTekrar;
                break;
            case "email":
                myElement = email;
                break;
            case "password":
                myElement = password;
                break;
            case "hesapSifre":
                myElement = hesapSifre;
                break;

        }
        sendKeysFunction(myElement, value);
    }

    public void selectFromDropDown(String strElement, String value) {
        switch (strElement) {
            case "il":
                myElement = il;
                break;

            case "ilce":
                myElement = ilce;
                break;

            case "gun":
                myElement = gun;
                break;

            case "ay":
                myElement = ay;
                break;

            case "yil":
                myElement = yil;
                break;


        }


        dropDownMenus(myElement, value);

    }

    public void findAndContainsText(String strlement, String text) {
        switch (strlement) {
            case "assertHesap":
                myElement = assertHesap;
                break;

            case "hesapAc":
                myElement = hesapAc;
                break;
        }

        verifyContainsTextFunction(myElement, text);
    }


}
