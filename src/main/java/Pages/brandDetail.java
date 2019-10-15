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

public class brandDetail {

    private WebDriver driver;
    private WebDriverWait wait;

    assertHome assert = new assertHome(driver);

    @FindBy(xpath = "//img[@src='//static.femaledaily.com/dyn/460/images/prod-pics/1448005795-Ultima_II-Creamy_Powder_Blush.jpg']")
    @CacheLookup
    private WebElement image;
}
