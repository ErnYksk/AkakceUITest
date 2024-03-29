package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class Parent {
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));

    public void sendKeysFunction(WebElement element, String value)
    {
        waitUntilVisible(element);
       // scrollToelement(element);
        element.clear();
        element.sendKeys(value);
    }

    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element);
       // scrollToelement(element);
        element.click();
    }

    public void waitUntilVisible(WebElement element)
    {
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    public void scrollToelement(WebElement element)
    {
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waitUntilClickable(WebElement element)
    {

        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void verifyContainsTextFunction(WebElement element, String value)
    {
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));

        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()),"The text you searched couldn't be find");
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform();
    }

    public void dropDownMenus(WebElement element,String value){
        Select select=new Select(element);
        waitUntilClickable(element);
        select.selectByValue(value);

    }

}
