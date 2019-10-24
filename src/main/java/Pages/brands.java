package Pages;

import AssertObject.assertHome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class brands {

    private WebDriver driver;
    private WebDriverWait wait;

    assertHome asser = new assertHome(driver);

    @FindBy(css = "div[class='jsx-1348742016 breadcrumb-section-text']")
    @CacheLookup
    private WebElement breadcrumb;

    @FindBy(css = "div[class='jsx-3061749031 brand-top-item]")
    @CacheLookup
    private WebElement brand;

    @FindBy(id = "id_tab_All Brands")
    @CacheLookup
    private WebElement tabAllBrands;

    @FindBy(id = "id_tab_France")
    @CacheLookup
    private WebElement tabFrance;

    @FindBy(id = "id_tab_Indonesia")
    @CacheLookup
    private WebElement tabIndonesia;

    @FindBy(id = "id_tab_Japan")
    @CacheLookup
    private WebElement tabJapan;

    @FindBy(id = "id_tab_South Korea")
    @CacheLookup
    private WebElement tabKorea;

    @FindBy(id = "id_tab_United States")
    @CacheLookup
    private WebElement tabUS;

    @FindBy(id = "id_sort_by")
    @CacheLookup
    private WebElement fieldAlphabet;

}
