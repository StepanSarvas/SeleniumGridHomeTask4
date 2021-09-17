import org.testng.annotations.Test;


import static org.testng.Assert.assertTrue;

public class MyTests extends DefaultTest {

    private static final long DEFAULT_WAITING_TIME = 300;

    @Test
    public void checkStartPageComponents(){
        getStartPage().loadPageWaiter(DEFAULT_WAITING_TIME);
        getStartPage().loadAjaxWaiter(DEFAULT_WAITING_TIME);
        getStartPage().isHeaderDisplayed();
        getStartPage().isSearchBarDisplayed();
        getStartPage().clickAccountLoginButton();
        getStartPage().loadAjaxWaiter(DEFAULT_WAITING_TIME);
        assertTrue(getStartPage().isInsertNumberBarDisplayed());
        getStartPage().clickCloseLoginFormButton();
        assertTrue(getStartPage().isBucketButtonDisplayed());
        assertTrue(getStartPage().isChooseWidthButtonDisplayed());
        assertTrue(getStartPage().isChooseHeightButtonDisplayed());
        assertTrue(getStartPage().isChooseDiameterButtonDisplayed());
        assertTrue(getStartPage().isPickUpTiresButtonDisplayed());
        getStartPage().clickChooserSearchByCarButton();
        getStartPage().loadAjaxWaiter(DEFAULT_WAITING_TIME);
        getStartPage().loadElementWaiter(DEFAULT_WAITING_TIME, getStartPage().getTitleSearchByCarBlockDisplayed());
        assertTrue(getStartPage().titleSearchByCarBlockGetText().contains("НА КАКОЙ АВТОМОБИЛЬ ПОДБИРАЕМ?"));
        getStartPage().clickChooserSearchBySizeButton();
        getStartPage().loadAjaxWaiter(DEFAULT_WAITING_TIME);
        getStartPage().loadElementWaiter(DEFAULT_WAITING_TIME, getStartPage().getTitleSearchTiresBlockDisplayed());
        assertTrue(getStartPage().titleSearchTiresBlockGetText().contains("ПОДОБРАТЬ ШИНЫ"));
        getStartPage().clickLanguageButton();
        assertTrue(getDriver().getCurrentUrl().contains("uk"));
    }

    @Test
    public void addItemToWishList(){
        getStartPage().loadPageWaiter(DEFAULT_WAITING_TIME);
        getStartPage().loadAjaxWaiter(DEFAULT_WAITING_TIME);
        getStartPage().clickChooseWidthButton();
        getStartPage().loadPageWaiter(DEFAULT_WAITING_TIME);
        getStartPage().enterTireParameter("205");
        getStartPage().clickChooseHeightButton();
        getStartPage().loadPageWaiter(DEFAULT_WAITING_TIME);
        getStartPage().enterTireParameter("55");
        getStartPage().clickChooseDiameterButton();
        getStartPage().loadPageWaiter(DEFAULT_WAITING_TIME);
        getStartPage().enterTireParameter("R16");
        getStartPage().clickPickUpTiresButton();
        getSearchBySizePage().loadPageWaiter(DEFAULT_WAITING_TIME);
        getSearchBySizePage().loadAjaxWaiter(DEFAULT_WAITING_TIME);
        getSearchBySizePage().clickItemContinental();
        getItemContinentalPage().loadPageWaiter(DEFAULT_WAITING_TIME);
        getItemContinentalPage().loadAjaxWaiter(DEFAULT_WAITING_TIME);
        getItemContinentalPage().clickAddToWishesButton();
        getItemContinentalPage().clickGoToWishes();
        getItemContinentalPage().loadPageWaiter(DEFAULT_WAITING_TIME);
        getItemContinentalPage().loadAjaxWaiter(DEFAULT_WAITING_TIME);
        assertTrue(getWishesPage().textItemContinentalWish().contains("Continental ContiPremiumContact 6 205/55 R16 91V"));
    }

    @Test
    public void addItemToBucket(){
        getStartPage().loadPageWaiter(DEFAULT_WAITING_TIME);
        getStartPage().loadAjaxWaiter(DEFAULT_WAITING_TIME);
        getStartPage().enterTextToSearchBar("TOYO GSi6 205/55 R16");
        getSearchWithBarPage().loadPageWaiter(DEFAULT_WAITING_TIME);
        getSearchWithBarPage().loadAjaxWaiter(DEFAULT_WAITING_TIME);
        getSearchWithBarPage().loadElementWaiter(DEFAULT_WAITING_TIME, getSearchWithBarPage().getItemToyoButton());
        getSearchWithBarPage().clickItemToyoButton();
        getItemToyoPage().loadPageWaiter(DEFAULT_WAITING_TIME);
        getItemToyoPage().loadAjaxWaiter(DEFAULT_WAITING_TIME);
        getItemToyoPage().clickBuyButton();
        getItemToyoPage().loadAjaxWaiter(DEFAULT_WAITING_TIME);
        getItemToyoPage().loadElementWaiter(DEFAULT_WAITING_TIME, getItemToyoPage().getContinueButton());
        getItemToyoPage().clickContinueButton();
        getItemToyoPage().loadAjaxWaiter(DEFAULT_WAITING_TIME);
        assertTrue(getItemToyoPage().quantityOfItemsImBucketCheck().equals("4"));
    }

}
