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

public class productList {

    private WebDriver driver;
    private WebDriverWait wait;

    assertHome asser = new assertHome(driver);

    @FindBy(id = "id_sort_by")
    @CacheLookup
    private WebElement sortByProduct;

    @FindBy(id = "id_product_image_14598")
    @CacheLookup
    private WebElement imageProduct;

    @FindBy(id = "id-filter-category")
    @CacheLookup
    private WebElement filterByCategory;

    @FindBy(linkText = "Moisturizer")
    @CacheLookup
    private WebElement filterByMoisturizer;

    @FindBy(linkText = "Treatment")
    @CacheLookup
    private WebElement filterByTreatment;

    @FindBy(linkText = "Mask")
    @CacheLookup
    private WebElement filterByMask;

    @FindBy(linkText = "Cleansing")
    @CacheLookup
    private WebElement filterByCleansing;

    @FindBy(id = "id-filter-brand-search")
    @CacheLookup
    private WebElement searchBrand;

    @FindBy(id = "id-filter-brand-item-2564")
    @CacheLookup
    private WebElement selectBrand;

    @FindBy(id = "id_prevpage")
    @CacheLookup
    private WebElement buttonPrev;

    @FindBy(id = "id_nextpage")
    @CacheLookup
    private WebElement buttonNext;

    @FindBy(id = "id-button-page-1")
    @CacheLookup
    private WebElement buttonPage;

    @FindBy(id = "id_backtotop")
    @CacheLookup
    private WebElement buttonBacktop;

}
