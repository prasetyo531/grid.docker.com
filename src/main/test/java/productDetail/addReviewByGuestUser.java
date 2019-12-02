package productDetail;

import AssertObject.assertHome;
import Controller.baseTest;
import Pages.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class addReviewByGuestUser extends baseTest {

    // VIEW PRODUCT DETAIL PAGE BY CLICK PRODUCT FROM FDBR ON REVIEWER FORM

    public static WebElement main = null;
    public static Properties prop = null;
    public String UrlLogin;

    assertHome asser = new assertHome (driver);

    @Test
    public void addReviewGuestUser() throws InterruptedException {

        homepage home = new homepage (driver);
        categoryList catList = new categoryList (driver);
        productDetail product = new productDetail (driver);

        driver.get ("https://femaledaily.com/");
        driver.manage ().window ().maximize ();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        home.clickMenuSkincare();

        catList.clickListMoisturizer();
        catList.HoverClickProduct ();

        product.clickAddReview ();

        System.out.println(driver.getTitle ());
        if (!driver.getTitle ().equals("Login")) {
            System.out.println("Test Passed - User direct to login page");
        } else {
            System.out.println("Test Failed");
        }
    }

}


