package productDetail;

import AssertObject.assertHome;
import Controller.baseTest;
import Pages.addProduct;
import Pages.homepage;
import Pages.login;
import Pages.reviews;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

public class detailProduct extends baseTest {

    // VIEW PRODUCT DETAIL PAGE BY CLICK PRODUCT FROM HOME - EDITOR'S CHOICE

    public static WebElement main = null;
    public static Properties prop = null;
    public String UrlLogin;

    assertHome asser = new assertHome(driver);

    @Test
    public void viewDetailPage() {

        login logpro = new login(driver);
        homepage home = new homepage(driver);
        //detailProduct viewProduct = new detailProduct(driver);

        driver.get("https://femaledaily.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        home.clickProductInHome();

    }

}
