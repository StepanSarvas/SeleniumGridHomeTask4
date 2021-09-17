package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DefaultPage {

    WebDriver driver;

    public DefaultPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loadPageWaiter (long timeToWait){
        new WebDriverWait(driver, timeToWait).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public void loadAjaxWaiter(long timeToWait){
        new WebDriverWait(driver, timeToWait).until(
                webDriver -> ((JavascriptExecutor)webDriver).executeScript("return window.jQuery != undefined && jQuery.active == 0;"));
    }

    public void loadElementWaiter(long timeToWait, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, timeToWait);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
