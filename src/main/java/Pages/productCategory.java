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

public class productCategory {

    private WebDriver driver;
    private WebDriverWait wait;

    assertHome assert = new assertHome(driver);

    @FindBy(linkText = "Night Cream")
    @CacheLookup
    private WebElement productMoisturizer;

    @FindBy(linkText = "Eye Treatment")
    @CacheLookup
    private WebElement productTreatment;

    @FindBy(linkText = "Sleeping Mask")
    @CacheLookup
    private WebElement productMask;

    @FindBy(linkText = "Facial Wash")
    @CacheLookup
    private WebElement productCleanser;

}
