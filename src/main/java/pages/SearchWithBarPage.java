package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchWithBarPage extends DefaultPage{

    @FindBy(xpath = "//a[contains(@title, 'toyo observe gsi6 205/55 r16 94h')]")
    public WebElement itemToyoButton;

    public SearchWithBarPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getItemToyoButton(){ return itemToyoButton; }

    public void clickItemToyoButton() { itemToyoButton.click(); }
}
