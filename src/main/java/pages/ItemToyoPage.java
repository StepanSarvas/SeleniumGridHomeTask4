package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemToyoPage extends DefaultPage{

    @FindBy(xpath = "//button[contains(@name, 'add-to-cart')]")
    public WebElement buyButton;

    @FindBy(xpath = "//a[contains(@class, 'modal-btn modal-btn_continue')]")
    public WebElement continueButton;

    @FindBy(xpath = "//div[contains(@class,'header__cart__count')]")
    public WebElement quantityOfItemsInBucket;

    public ItemToyoPage(WebDriver driver) {
        super(driver);
    }

    public void clickBuyButton(){ buyButton.click(); }

    public WebElement getContinueButton(){ return continueButton; }

    public void clickContinueButton(){ continueButton.click(); }

    public String quantityOfItemsImBucketCheck() {return quantityOfItemsInBucket.getText(); }
}
