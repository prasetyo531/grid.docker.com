package productDetail;

import AssertObject.assertHome;
import Controller.baseTest;
import Pages.categoryList;
import Pages.homepage;
import Pages.productDetail;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class wishlistByGuestUser extends baseTest {

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

        product.clickBtnWishlist ();

        System.out.println(driver.getCurrentUrl());
        if (!driver.getCurrentUrl().equals("https://account.femaledaily.com/")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }

}


