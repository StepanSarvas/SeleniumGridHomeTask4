package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBySizePage extends DefaultPage{

    @FindBy(xpath = "//a[contains(@title, 'continental contipremiumcontact 6 205/55 r16 91v')]")
    public WebElement itemContinental;

    public void clickItemContinental(){ itemContinental.click(); }

    public SearchBySizePage(WebDriver driver) {
        super(driver);
    }
}
