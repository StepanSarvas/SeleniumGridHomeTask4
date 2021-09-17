package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemContinentalPage extends DefaultPage{

    @FindBy(xpath = "//div[contains(@class, 'product__action-icon product__action-icon--wishes js-product__action-icon')]")
    public WebElement addToWishesButton;

    @FindBy(xpath = "//div[contains(@class, 'product__action-caption product__action-caption--wishes js-product__action-caption')]")
    public WebElement goToWishes;

    public void clickAddToWishesButton(){ addToWishesButton.click(); }

    public void clickGoToWishes(){ goToWishes.click(); }

    public ItemContinentalPage(WebDriver driver) {
        super(driver);
    }
}
