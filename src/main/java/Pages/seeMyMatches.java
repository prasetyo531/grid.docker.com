package Pages;

import AssertObject.assertHome;
import Controller.baseTest;
import Pages.homepage;
import Pages.login;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;
public class seeMyMatches {
    private WebDriver driver;
    private WebDriverWait wait;

    assertHome asser = new assertHome(driver);

    @FindBy(css = "div[class='user-profile']")
    @CacheLookup
    private WebElement profileUser;

    @FindBy(css = "div[class='product-matches']")
    @CacheLookup
    private WebElement productMatches;

    @FindBy(linkText = "Load More")
    @CacheLookup
    private WebElement buttonLoadMore;

}
