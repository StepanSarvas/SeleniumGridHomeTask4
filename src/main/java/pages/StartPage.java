package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends DefaultPage{

    @FindBy(xpath = "//div[contains(@class,'header__top')]")
        private WebElement header;

    @FindBy(xpath = "//input[contains(@id,'search-input')]")
    private WebElement searchBar;

    @FindBy(xpath = "//span[contains(text(),'UA')]")
    private WebElement languageButton;

    @FindBy(xpath = "//a[contains(@class,'header__account__login')]")
    private WebElement accountLoginButton;

    @FindBy(xpath = "//form[contains(@class,'js-ajax-form modal-auth__form modal-auth__form_register-or-login')]")
    private WebElement loginFormPopUp;

    @FindBy(xpath = "//input[contains(@name,'number')]")
    private WebElement insertNumberBar;

    @FindBy (xpath = "//div[contains(@class, 'modal-auth__close js-modal-auth__close')]")
    private WebElement closeLoginFormButton;

    @FindBy(xpath = "//div[contains(@class,'header__item header__cart')]")
    private WebElement bucketButton;

    @FindBy(xpath = "//span[contains(@id,'select2-filter-wshiny')]")
    private WebElement chooseWidthButton;

    @FindBy(xpath = "//span[contains(@id,'select2-filter-hshiny')]")
    private WebElement chooseHeightButton;

    @FindBy(xpath = "//span[contains(@id,'select2-filter-rshiny')]")
    private WebElement chooseDiameterButton;

    @FindBy(xpath = "//button[contains(text(),'ПОДОБРАТЬ ШИНЫ')]")
    private WebElement pickUpTiresButton;

    @FindBy(xpath = "//a[contains(@href,'#tabs-2-2-3')]")
    private WebElement chooserSearchByCarButton;

    @FindBy(xpath = "//div[contains(text(), 'На какой автомобиль подбираем?')]")
    private WebElement titleSearchByCarBlock;

    @FindBy(xpath = "//a[contains(@href,'#tabs-1-1-3')]")
    private WebElement chooserSearchBySizeButton;

    @FindBy(xpath = "//div[contains(text(), 'Подобрать шины') or contains(text(), 'Підібрати шини')]")
    private WebElement titleSearchTiresBlock;

    @FindBy(xpath = "//input[contains(@class, 'select2-search__field')]")
    public WebElement tireParameterBar;

    public StartPage(WebDriver driver) { super(driver); }

    public void isHeaderDisplayed() { header.isDisplayed(); }

    public void isSearchBarDisplayed() { searchBar.isDisplayed(); }

    public void enterTextToSearchBar(final String searchText) {
        searchBar.click();
        searchBar.sendKeys(searchText, Keys.ENTER);
    }

    public void clickLanguageButton() { languageButton.click(); }

    public void clickAccountLoginButton () { accountLoginButton.click(); }

    public boolean isInsertNumberBarDisplayed() { return insertNumberBar.isDisplayed(); }

    public void clickCloseLoginFormButton() { closeLoginFormButton.click(); }

    public boolean isBucketButtonDisplayed() { return bucketButton.isDisplayed(); }

    public boolean isChooseWidthButtonDisplayed() { return chooseWidthButton.isDisplayed(); }

    public boolean isChooseHeightButtonDisplayed() { return chooseHeightButton.isDisplayed(); }

    public boolean isChooseDiameterButtonDisplayed() { return chooseDiameterButton.isDisplayed(); }

    public boolean isPickUpTiresButtonDisplayed() { return pickUpTiresButton.isDisplayed(); }

    public void clickPickUpTiresButton() { pickUpTiresButton.click(); }

    public WebElement getTitleSearchByCarBlockDisplayed(){return titleSearchByCarBlock; }

    public void clickChooserSearchByCarButton() { chooserSearchByCarButton.click(); }

    public String titleSearchByCarBlockGetText() { return titleSearchByCarBlock.getText(); }

    public void clickChooserSearchBySizeButton() { chooserSearchBySizeButton.click(); }

    public WebElement getTitleSearchTiresBlockDisplayed(){return titleSearchTiresBlock; }

    public String titleSearchTiresBlockGetText() { return titleSearchTiresBlock.getText(); }

    public void clickChooseWidthButton() { chooseWidthButton.click(); }

    public void clickChooseHeightButton() { chooseHeightButton.click(); }

    public void clickChooseDiameterButton() {chooseDiameterButton.click(); }

    public void enterTireParameter(final String parameterText) {
        tireParameterBar.click();
        tireParameterBar.sendKeys(parameterText, Keys.ENTER);
    }

}
