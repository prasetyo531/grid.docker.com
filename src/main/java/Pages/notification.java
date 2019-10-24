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

public class notification {

    private WebDriver driver;
    private WebDriverWait wait;

    assertHome asser = new assertHome(driver);

    @FindBy(id = "id_tab_reviews")
    @CacheLookup
    private WebElement tabReviews;

    @FindBy(id = "id_tab_talks")
    @CacheLookup
    private WebElement tabTalks;

    @FindBy(css = "div[class='jsx-3708272525 notifications-btn-follow']")
    @CacheLookup
    private WebElement buttonFollow;

    @FindBy(css = "div[class='jsx-3708272525 notifications-image-cover']")
    @CacheLookup
    private WebElement userProfile;

    @FindBy(css = "span[class='jsx-3708272525 notifications-link']")
    @CacheLookup
    private WebElement userProfile1;
}
