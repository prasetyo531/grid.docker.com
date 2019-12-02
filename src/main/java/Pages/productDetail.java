package Pages;

import AssertObject.assertHome;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class productDetail {

    private WebDriver driver;
    private WebDriverWait wait;

    assertHome asser = new assertHome(driver);

    @FindBy(xpath = "//img[@src='//static.femaledaily.com/dyn/460/images/prod-pics/1448005795-Ultima_II-Creamy_Powder_Blush.jpg']")
    @CacheLookup
    private WebElement image;

    @FindBy(id = "name-brand")
    @CacheLookup
    private WebElement brandName;

    @FindBy(id = "id_button_review")
    @CacheLookup
    private WebElement btnAddReview;

    @FindBy(id = "button-review")
    @CacheLookup
    private WebElement btnWishlist;

    @FindBy(id = "id_tab_reviews")
    @CacheLookup
    private WebElement tabReviews;

    @FindBy(id = "id_tab_info")
    @CacheLookup
    private WebElement tabInfo;

    @FindBy(id = "id_tab_articles")
    @CacheLookup
    private WebElement tabArticles;

    @FindBy(id = "id_filter_age")
    @CacheLookup
    private WebElement filterByAge;

    @FindBy(id = "id_sort_by")
    @CacheLookup
    private WebElement sortBy;

    @FindBy(id = "id_0")
    @CacheLookup
    private WebElement snippetReview;

    @FindBy(id = "id_userId_436805")
    @CacheLookup
    private WebElement profileImage;

    @FindBy(id = "id_similar_product")
    @CacheLookup
    private WebElement similarProductGroup;

    @FindBy(id = "id_product_image_9912")
    @CacheLookup
    private WebElement listSimilarProduct;


    public productDetail(WebDriver driver) {
        // TODO Auto-generated constructor stub

        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);

    }
    public void clickBrandName() {

        WebElement brandName = driver.findElement(By.xpath ("//*[@id=\"id-product-details\"]/div[2]/div[2]/div[1]/div[1]/a/h2"));

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", brandName);

        wait.until(ExpectedConditions.elementToBeClickable(brandName));
        brandName.click();

    }

    public void clickAddReview() {

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", btnAddReview);

        wait.until (ExpectedConditions.elementToBeClickable (btnAddReview));
        btnAddReview.click ();
    }

    public void clickBtnWishlist() {
        wait.until (ExpectedConditions.elementToBeClickable (btnWishlist));
        btnWishlist.click ();
    }

}


