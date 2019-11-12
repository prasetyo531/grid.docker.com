package Pages;

import AssertObject.assertHome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class reviews {
    private WebDriver driver;
    private WebDriverWait wait;

    assertHome asser = new assertHome(driver);

    @FindBy(id = "id_logo_home")
    @CacheLookup
    private WebElement logoHomepage;

    @FindBy(css = "span[id='id_menuburger_home']")
    @CacheLookup
    private WebElement hamburger;

    @FindBy(id = "id_search_input_field_reviews")
    @CacheLookup
    private WebElement searchField;

    @FindBy(id = "login_home")
    @CacheLookup
    private WebElement loginHeader;

    @FindBy(css = "div[class='gbheader-userprofile']")
    @CacheLookup
    private WebElement loggedHeader;

    @FindBy(id = "id_big_adds_reviews")
    @CacheLookup
    private WebElement bigAds;

    @FindBy(css = "div[class='jsx-416833890 main-header-categories']")
    @CacheLookup
    private WebElement mainHeaderCategory;

    @FindBy(id = "id_group_8")
    @CacheLookup
    private WebElement skincare;

    @FindBy(id = "id_group_91")
    @CacheLookup
    private WebElement makeup;

    @FindBy(id = "id_group_1")
    @CacheLookup
    private WebElement body;

    @FindBy(id = "id_group_5")
    @CacheLookup
    private WebElement hair;

    @FindBy(id = "id_group_2")
    @CacheLookup
    private WebElement fragrance;

    @FindBy(id = "id_group_7")
    @CacheLookup
    private WebElement nails;

    @FindBy(id = "id_group_9")
    @CacheLookup
    private WebElement tools;

    @FindBy(css = "div[class='jsx-416833890 main-header-categories-item']")
    @CacheLookup
    private WebElement Brands;

    @FindBy(id = "id_prevpage")
    @CacheLookup
    private WebElement buttonPrev;

    @FindBy(id = "id_nextpage")
    @CacheLookup
    private WebElement buttonNext;

    @FindBy(id = "id-button-page-1")
    @CacheLookup
    private WebElement buttonPage;

    @FindBy(css = "div[class='jsx-1925477530 hb-btn']")
    @CacheLookup
    private WebElement buttonLearnMore;

//Add product add review
    @FindBy(css = "div[class='button-add']")
    @CacheLookup
    private WebElement AddBtn;

    @FindBy(linkText = "Add Product")
    @CacheLookup
    private WebElement buttonAddProduct;

    @FindBy(linkText = "Add Review")
    @CacheLookup
    private WebElement buttonAddReview;

//footer page
    @FindBy(id = "id_aboutus")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(id = "id_feedback")
    @CacheLookup
    private WebElement feedback;

    @FindBy(id = "id_contact")
    @CacheLookup
    private WebElement contact;

    @FindBy(id = "id_tc")
    @CacheLookup
    private WebElement TC;

    @FindBy(id = "id_privacy_policy")
    @CacheLookup
    private WebElement privacyPolicy;

    @FindBy(id = "id_help")
    @CacheLookup
    private WebElement help;

    @FindBy(id = "id_awards")
    @CacheLookup
    private WebElement awards;

    @FindBy(id = "id_newsletter")
    @CacheLookup
    private WebElement newsLetter;

    public reviews(WebDriver driver) {
        // TODO Auto-generated constructor stub

        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);

    }

    public void clickDropdownAdd() {
        AddBtn.click();
    }

}
