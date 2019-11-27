package productDetail;

import AssertObject.assertHome;
import Controller.baseTest;
import Pages.*;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
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

public class viewByClickBrandOnReviewerForm extends baseTest {

    // VIEW PRODUCT DETAIL PAGE BY CLICK PRODUCT FROM FDBR ON REVIEWER FORM

    public static WebElement main = null;
    public static Properties prop = null;
    public String UrlLogin;

    assertHome asser = new assertHome (driver);

    @Test
    public void viewlistProduct() throws InterruptedException {

        homepage home = new homepage (driver);
        newestReviews reviews = new newestReviews (driver);


        driver.get ("https://femaledaily.com/");
        driver.manage ().window ().maximize ();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        home.WaitHamburger();
        home.ClickMenuReview();

        reviews.clickBrandName ();

        System.out.println(driver.getCurrentUrl ());
        if (!driver.getCurrentUrl().equals("https://reviews.femaledaily.com/brands/snp?tab=products&parent=&current=&order=popular&page=1")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
            fail("Test Failed");
        }

    }

}
