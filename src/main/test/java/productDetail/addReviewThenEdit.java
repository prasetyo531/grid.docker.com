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

// OVERALL RATING
        reviews.overallRatingPage ();
        System.out.println(driver.getTitle ());
        if (!driver.getTitle ().equals("I don’t like this product")) {
            System.out.println("Test Passed - Star 1 selected");
        } else {
            System.out.println("Test Failed");
            fail("Test Failed");
        }

        reviews.overallRatingPage1 ();
        System.out.println(driver.getTitle ());
        if (!driver.getTitle ().equals("It doesn’t work on me")) {
            System.out.println("Test Passed - Star 2 selected");
        } else {
            System.out.println("Test Failed");
            fail("Test Failed");
        }

        reviews.overallRatingPage2 ();
        System.out.println(driver.getTitle ());
        if (!driver.getTitle ().equals("Could be better")) {
            System.out.println("Test Passed - Star 3 selected");
        } else {
            System.out.println("Test Failed");
            fail("Test Failed");
        }

        reviews.overallRatingPage3 ();
        System.out.println(driver.getTitle ());
        if (!driver.getTitle ().equals("It’s a good product")) {
            System.out.println("Test Passed - Star 4 selected");
        } else {
            System.out.println("Test Failed");
            fail("Test Failed");
        }

        reviews.overallRatingPage4 ();
        System.out.println(driver.getTitle ());
        if (!driver.getTitle ().equals("A must-have product!")) {
            System.out.println("Test Passed - Star 5 selected");
        } else {
            System.out.println("Test Failed");
            fail("Test Failed");
        }

        reviews.clickBtnNext1 ();

// USAGE PERIODE
        reviews.usagePeriodePage1 ();
        System.out.println(driver.getTitle ());
        if (!driver.getTitle ().equals("Less than 1 week")) {
            System.out.println("Test Passed - Less than 1 week selected");
        } else {
            System.out.println("Test Failed");
            fail("Test Failed");
        }

        reviews.usagePeriodePage2 ();
        System.out.println(driver.getTitle ());
        if (!driver.getTitle ().equals("1 Week - 1 Month")) {
            System.out.println("Test Passed - 1 Week until 1 Month selected");
        } else {
            System.out.println("Test Failed");
            fail("Test Failed");
        }

        reviews.usagePeriodePage3 ();
        System.out.println(driver.getTitle ());
        if (!driver.getTitle ().equals("1 Month - 3 Months")) {
            System.out.println("Test Passed - 1 Month until 3 Months selected");
        } else {
            System.out.println("Test Failed");
            fail("Test Failed");
        }

        reviews.usagePeriodePage4 ();
        System.out.println(driver.getTitle ());
        if (!driver.getTitle ().equals("3 Months - 6 Months")) {
            System.out.println("Test Passed - 3 Months until 6 Months selected");
        } else {
            System.out.println("Test Failed");
            fail("Test Failed");
        }

        reviews.usagePeriodePage5 ();
        System.out.println(driver.getTitle ());
        if (!driver.getTitle ().equals("6 Months - 1 year")) {
            System.out.println("Test Passed - 6 Months until 1 year selected");
        } else {
            System.out.println("Test Failed");
            fail("Test Failed");
        }

        reviews.usagePeriodePage6 ();
        System.out.println(driver.getTitle ());
        if (!driver.getTitle ().equals("More than 1 year")) {
            System.out.println("Test Passed - More than 1 year selected");
        } else {
            System.out.println("Test Failed");
            fail("Test Failed");
        }

        reviews.setCheckBox ();

        reviews.clickBtnBack ();
        System.out.println(driver.getTitle ());
        if (!driver.getTitle ().equals("How many stars will you give to this product ?")) {
            System.out.println("Test Passed - Back to page How many stars will you give to this product ?");
        } else {
            System.out.println("Test Failed");
            fail("Test Failed");
        }


        Thread.sleep (30);

        reviews.clickBtnNext1 ();
        System.out.println(driver.getTitle ());
        if (!driver.getTitle ().equals("How long have you used it?")) {
            System.out.println("Test Passed - Back to page How long have you used it?");
        } else {
            System.out.println("Test Failed");
            fail("Test Failed");
        }

        reviews.clickBtnNext2 ();
        System.out.println(driver.getTitle ());
        if (!driver.getTitle ().equals("Where did you get the product?")) {
            System.out.println("Test Passed - Show page Where did you get the product?");
        } else {
            System.out.println("Test Failed");
            fail("Test Failed");
        }


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


