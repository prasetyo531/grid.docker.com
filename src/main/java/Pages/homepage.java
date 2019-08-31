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

	@FindBy(css = "span[id='id_menuburger_home']")
	@CacheLookup
	private WebElement hamburger;

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

	public homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver=driver;
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);

	}

	public void WaitHamburger(){

		this.wait.until(ExpectedConditions.elementToBeClickable(this.hamburger));
		this.hamburger.click();

	}

	public void ClickMenuReview(){

		this.wait.until(ExpectedConditions.elementToBeClickable(this.reviews));
		this.reviews.click();
	}

	public void HoverClickMenuAddProduct(){

		Actions act = new Actions(driver);
		act.moveToElement(this.hoverAddProduct).perform();
		act.click(addProduct).perform();

		//asser.addproducttodisplay();
	}

	public void HoverClickMenuAddReview(){

		Actions act = new Actions(driver);
		act.moveToElement(this.hoverAddProduct).perform();
		act.click(addReview).perform();
	}


}
