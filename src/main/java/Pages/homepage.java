package Pages;

import AssertObject.assertHome;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static org.testng.Assert.assertNotNull;

public class homepage {

	private WebDriver driver;
	private WebDriverWait wait;

	assertHome asser = new assertHome(driver);

	//	@FindBy(how = How.CSS, using = "span[id='id_menuburger_home']")
	//	@CacheLookup
	//	private WebElement hamburger;

// HEADER HOMEPAGE
	@FindBy(id = "id_logo_home")
	@CacheLookup
	private WebElement logoHomepage;

	@FindBy(css = "span[id='id_menuburger_home']")
	@CacheLookup
	private WebElement hamburger;

	@FindBy(id = "id_search_input_field_home")
	@CacheLookup
	private WebElement searchField;

	@FindBy(id = "login_home")
	@CacheLookup
	private WebElement loginHeader;

	@FindBy(css = "div[class='gbheader-userprofile']")
	@CacheLookup
	private WebElement loggedHeader;

	@FindBy(id = "id_big_ads_home")
	@CacheLookup
	private WebElement bigAds;

// MENU BURGER
//    @FindBy(css = "div[class='jsx-3569249403 new-menu-title-2']")
//    @CacheLookup
//	private WebElement reviews;

	@FindBy(linkText = "Reviews")
	@CacheLookup
	private WebElement reviews;

	@FindBy(linkText = "Editorial")
	@CacheLookup
	private WebElement editorial;

	@FindBy(linkText = "Talk")
	@CacheLookup
	private WebElement talk;

	@FindBy(css = "div[class='gbheader-add-area']")
	@CacheLookup
	private WebElement hoverAddProduct;

	@FindBy(linkText = "Add Product")
	@CacheLookup
	private WebElement addProduct;

	@FindBy(linkText = "Add Review")
	@CacheLookup
	private WebElement addReview;

// HOMEPAGE
	@FindBy(id = "id_image_55237")
	@CacheLookup
	private WebElement editorChoices;

	@FindBy(id = "btn_seemymatches")
	@CacheLookup
	private WebElement buttonSeeMyMatch;

	@FindBy(xpath = "//img[@src='https://tpc.googlesyndication.com/simgad/11141872208308839502']")
	@CacheLookup
	private WebElement miniAds;

	@FindBy(id = "id_see_more_articles")
	@CacheLookup
	private WebElement buttonSeeMoreArticles;

	@FindBy(id = "id_article_image_2")
	@CacheLookup
	private WebElement listArticles;

	@FindBy(id = "id_see_more_roundup")
	@CacheLookup
	private WebElement buttonSeeMoreBeautyRoundup;

	@FindBy(id = "id_roundup_1")
	@CacheLookup
	private WebElement beautyRoundUp;

	@FindBy(id = "id_see_more_reviews")
	@CacheLookup
	private WebElement buttonSeeMoreLatestReviews;

	@FindBy(id = "id_desc_review_home_55568")
	@CacheLookup
	private WebElement reviewCard;

	@FindBy(id = "id_see_more_popular_talk")
	@CacheLookup
	private WebElement buttonSeeMorePopularTalk;

	@FindBy(id = "id_popular_talk_home_1")
	@CacheLookup
	private WebElement groupTalk;

	@FindBy(id = "id_see_more_videos")
	@CacheLookup
	private WebElement buttonSeeMoreVideos;

	@FindBy(id = "id_product_image_699")
	@CacheLookup
	private WebElement trendingThisWeek;

	@FindBy(id = "id_see_more_topbrand")
	@CacheLookup
	private WebElement buttonSeeMoreTopbrands;

	@FindBy(id = "id_brand_image_148")
	@CacheLookup
	private WebElement topBrands;

// FOOTER HOMEPAGE
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

	public homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);


	}

	public void WaitHamburger() {

//		wait.until(ExpectedConditions.elementToBeClickable(hamburger));
//		hamburger.click();

		Actions act = new Actions(driver);
		try {
			Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).pollingEvery(Duration.ofSeconds(50)).withTimeout(Duration.ofSeconds(100)).ignoring(NoSuchElementException.class);
			((FluentWait) fluentWait).until(ExpectedConditions.visibilityOf(hamburger));
			act.moveToElement(hamburger).perform();
			//act.click(hamburger).perform();
			hamburger.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ClickMenuReview() {

//		wait.until(ExpectedConditions.elementToBeClickable(reviews));
//		reviews.click();
		Actions act = new Actions(driver);
		try {
			Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).pollingEvery(Duration.ofSeconds(50)).withTimeout(Duration.ofSeconds(100)).ignoring(NoSuchElementException.class);
			((FluentWait) fluentWait).until(ExpectedConditions.visibilityOf(reviews));
			reviews.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void HoverClickMenuAddProduct() {

		Actions act = new Actions(driver);
		try {
			this.wait.until(ExpectedConditions.elementToBeClickable(hoverAddProduct)).isEnabled();
			act.moveToElement(hoverAddProduct).perform();
			act.click(addProduct).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void HoverClickMenuAddReview() {

		Actions act = new Actions(driver);
		try {
			this.wait.until(ExpectedConditions.elementToBeClickable(hoverAddProduct)).isEnabled();
			act.moveToElement(hoverAddProduct).perform();
			act.click(addReview).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void setLoginHeader() {
		this.loggedHeader.click();
	}
}
