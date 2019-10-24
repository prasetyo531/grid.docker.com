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

public class homepage {

	private WebDriver driver;
	private WebDriverWait wait;

	assertHome asser = new assertHome(driver);

	//	@FindBy(how = How.CSS, using = "span[id='id_menuburger_home']")
	//	@CacheLookup
	//	private WebElement hamburger;

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

	@FindBy(id = "id_desc_review_home_59918")
	@CacheLookup
	private WebElement snippetReview;

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

	@FindBy(linkText = "Reviews")
	@CacheLookup
	private WebElement reviews;

	@FindBy(css = "div[class='gbheader-add-area']")
	@CacheLookup
	private WebElement hoverAddProduct;

	@FindBy(linkText = "Add Product")
	@CacheLookup
	private WebElement addProduct;

	@FindBy(linkText = "Add Review")
	@CacheLookup
	private WebElement addReview;

	@FindBy(id = "Review Card")
	@CacheLookup
	private WebElement reviewCard;

	public homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);

	}

	public void WaitHamburger() {

		this.wait.until(ExpectedConditions.elementToBeClickable(this.hamburger));
		this.hamburger.click();

	}

	public void ClickMenuReview() {

		this.wait.until(ExpectedConditions.elementToBeClickable(this.reviews));
		this.reviews.click();
	}

	public void HoverClickMenuAddProduct() {

		Actions act = new Actions(driver);
		act.moveToElement(this.hoverAddProduct).perform();
		act.click(addProduct).perform();

		//asser.addproducttodisplay();
		try {
			this.wait.until(ExpectedConditions.elementToBeClickable(hoverAddProduct)).isEnabled();
			act.moveToElement(hoverAddProduct).perform();
			act.click(addProduct).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void HoverClickMenuAddReview(){

		Actions act = new Actions(driver);
		act.moveToElement(this.hoverAddProduct).perform();
		act.click(addReview).perform();
	}


}
