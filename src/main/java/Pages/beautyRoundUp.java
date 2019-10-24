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

public class beautyRoundUp {
    private WebDriver driver;
    private WebDriverWait wait;

    assertHome asser = new assertHome(driver);


//beauty round up
    @FindBy(id = "id-beauty-roundup")
    @CacheLookup
    private WebElement beautyRoundUp;

    @FindBy(id = "liquid-blush-for-natural-look")
    @CacheLookup
    private WebElement liquidBlush;

    @FindBy(id = "recommended-local-skincare")
    @CacheLookup
    private WebElement localSkincare;

    @FindBy(id = "try-these-luxury-perfume")
    @CacheLookup
    private WebElement luxuryPerfume;

    @FindBy(id = "rekomendasi-eyeshadow-palette-lux")
    @CacheLookup
    private WebElement eyeshadowPalette;

    @FindBy(id = "exfoliating-toner")
    @CacheLookup
    private WebElement exfoliating;

    @FindBy(id = "mineral-sunscreen")
    @CacheLookup
    private WebElement mineralSunscreen;

    @FindBy(id = "serum-high-end")
    @CacheLookup
    private WebElement serum;

    @FindBy(id = "moisturizer-terbaik")
    @CacheLookup
    private WebElement moisturizer;

    @FindBy(id = "foundation-high-end")
    @CacheLookup
    private WebElement foundation;

    @FindBy(id = "rekomendasi-sheet-mask")
    @CacheLookup
    private WebElement sheetmask;

    @FindBy(id = "eye-cream-terbaik")
    @CacheLookup
    private WebElement eyecream;

    @FindBy(id = "chemical-sunscreen")
    @CacheLookup
    private WebElement chemicalSunscreen;

    @FindBy(id = "loose-powder-terbaik")
    @CacheLookup
    private WebElement loosePowder;

    @FindBy(id = "rekomendasi-cushion-compact")
    @CacheLookup
    private WebElement cushion;

    @FindBy(id = "liquid-lip-color-terbaik")
    @CacheLookup
    private WebElement liquidLisptick;

    @FindBy(id = "makeup-sponge-terbaik")
    @CacheLookup
    private WebElement sponge;

    @FindBy(id = "lipstik-dari-brand-lokal")
    @CacheLookup
    private WebElement lipstickLocal;

 //detail beauty round up
    @FindBy(linkText = "Beauty Roundup")
    @CacheLookup
    private WebElement breadcrumb;

    @FindBy(id = "id_product_image_23130")
    @CacheLookup
    private WebElement product;

    @FindBy(id = "id_morecollection")
    @CacheLookup
    private WebElement buttonSeeMore;
}
