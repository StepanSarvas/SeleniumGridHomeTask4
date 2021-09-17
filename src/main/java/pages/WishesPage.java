package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishesPage extends DefaultPage{

    @FindBy(xpath = "//a[contains(@title, 'continental contipremiumcontact 6 205/55 r16 91v')]")
    public WebElement itemContinentalWish;

    public String textItemContinentalWish(){return itemContinentalWish.getText();}

    public WishesPage(WebDriver driver) {
        super(driver);
    }
}
