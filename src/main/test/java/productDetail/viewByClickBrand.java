package productDetail;

import AssertObject.assertHome;
import Controller.baseTest;
import Pages.*;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class viewByClickBrand extends baseTest {

    // VIEW LIST PRODUCT BY CLICK BRAND NAME

    public static WebElement main = null;
    public static Properties prop = null;
    public String UrlLogin;

    assertHome asser = new assertHome (driver);

    @Test
    public void viewDetailPage() throws InterruptedException {

        // VIEW LIST PRODUCT BY CLICK BRAND NAME

        homepage home = new homepage (driver);
        categoryList catList = new categoryList (driver);
        productDetail product = new productDetail (driver);

        driver.get ("https://femaledaily.com/");
        driver.manage ().window ().maximize ();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        home.clickMenuSkincare ();

        catList.clickListMoisturizer ();
        catList.HoverClickProduct ();

        product.clickBrandName ();

        System.out.println(driver.getCurrentUrl ());
        if (!driver.getCurrentUrl().equals("https://reviews.femaledaily.com/brands/wardah?tab=products&paren=&current=&order=popular&page=1")) {
            System.out.println("Test Passed - View List Product By Click Brand");
        } else {
            System.out.println("Test Failed");
            fail("Test Failed");
        }
    }

}

