import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import pages.*;
import utils.CapabilityFactory;

import java.net.MalformedURLException;
import java.net.URL;

public class DefaultTest {

    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    private CapabilityFactory capabilityFactory = new CapabilityFactory();

    private static final String SHINY_DISKI_URL = "https://shiny-diski.com.ua/";

    @BeforeMethod
    @Parameters(value = {"browser"})
    public void setUp(@Optional("firefox") String browser) throws MalformedURLException{
        driver.set(new RemoteWebDriver(new URL("http://192.168.0.100:4444/wd/hub"), capabilityFactory.getCapabilities(browser)));
        getDriver().manage().window().maximize();
        getDriver().get(SHINY_DISKI_URL);
    }

    @AfterMethod
    public void tearDown(){ getDriver().close(); }

    @AfterClass
    void terminate() {driver.remove();}

    public WebDriver getDriver(){
        return driver.get();
    }

    public StartPage getStartPage(){ return new StartPage(getDriver()); }

    public ItemContinentalPage getItemContinentalPage(){ return new ItemContinentalPage(getDriver());}

    public SearchBySizePage getSearchBySizePage(){ return new SearchBySizePage(getDriver());}

    public SearchWithBarPage getSearchWithBarPage(){ return new SearchWithBarPage(getDriver());}

    public WishesPage getWishesPage() { return new WishesPage(getDriver()); }

    public ItemToyoPage getItemToyoPage() {return new ItemToyoPage(getDriver());}
}
