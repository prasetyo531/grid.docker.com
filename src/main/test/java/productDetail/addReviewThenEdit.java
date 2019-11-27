package productDetail;

import AssertObject.assertHome;
import Controller.baseTest;
import Pages.*;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class addReviewThenEdit extends baseTest {

    // VIEW PRODUCT DETAIL PAGE BY CLICK PRODUCT FROM FDBR ON REVIEWER FORM

    public static WebElement main = null;
    public static Properties prop = null;
    public String UrlLogin;

    assertHome asser = new assertHome (driver);

    @Test(dataProvider = "getDataRegister")
    public void addReviewOnProductPage(String username, String password) throws InterruptedException {

        login logpro = new login(driver);
        homepage home = new homepage (driver);
        categoryList catList = new categoryList (driver);
        productDetail product = new productDetail (driver);
        reviews reviews = new reviews (driver);

        driver.get ("https://femaledaily.com/");
        driver.manage ().window ().maximize ();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        logpro.clickBtnLoginUser();
        logpro.fillusername().sendKeys(username);
        logpro.fillpassword().sendKeys(password);
        logpro.clickbuttonlogin();

        Thread.sleep (30);

        home.clickMenuSkincare();

        catList.clickListLotion();
        catList.HoverCLickProduct1();

        Thread.sleep (60);

        product.clickAddReview ();

        reviews.overallRatingPage ();
        reviews.clickBtnNext1 ();
        reviews.usagePeriodePage ();


    }
    @DataProvider
    public static Object[][] getDataRegister () {
        Object[][] data = null;

        //kiri for numbers of times testcase must execute
        //kanan for no parameter you send
        data = new Object[1][2];

        data[0][0] = "maciahauna";
        data[0][1] = "hanamasa";

        return data;
    }

}


