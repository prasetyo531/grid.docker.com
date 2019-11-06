package addProduct;

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

public class addproduct extends baseTest {

    /*
    fill all concern - photo - follow first user
     */
        public static WebElement main = null;
        public static Properties prop = null;
        public String UrlLogin;

        assertHome asser = new assertHome(driver);


        @Test(dataProvider = "getDataRegister")
        public void addProduct(String username, String password) throws InterruptedException, AWTException {

            login logpro = new login(driver);
            homepage home = new homepage(driver);
            //reviews reviewsPage = new reviews(driver);
            addProduct addNewProd = new addProduct(driver);

            driver.get("https://femaledaily.com/");
            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            logpro.clickBtnLoginUser();
            logpro.fillusername().sendKeys(username);
            logpro.fillpassword().sendKeys(password);
            logpro.clickbuttonlogin();

            System.out.println(driver.getTitle());
            if (!driver.getTitle().equals("Female Daily - Info, Artikel, Video dan Review Seputar Kecantikan")) {
                System.out.println("Test Passed");
            } else {
                System.out.println("Test Failed");
                fail("Test Failed");
            }

            //@Test(description = "add product", dependsOnMethods = "login")
            //public void addproduct () throws InterruptedException, AWTException, TimeoutException {

                home.WaitHamburger();

                home.ClickMenuReview();

                home.HoverClickMenuAddProduct();

                Thread.sleep(5000);

                addNewProd.popUpAddProduct();

                Thread.sleep(3000);

                addNewProd.imagebyUpload();
                //addNewProd.imagebyURL();
                addNewProd.clickbuttonNext();

                addNewProd.selectBrand();
                addNewProd.selectProductCategory();
                addNewProd.selectSubProductCategory();
                addNewProd.selectSubCategory();
                addNewProd.inputProductName();
                addNewProd.inputProductShade();
                addNewProd.clickbuttonNext1();

                addNewProd.inputRating();
                addNewProd.setProductPrice();
                addNewProd.setPackageQuality();
                addNewProd.setRepurchase();
                addNewProd.inputReview();
                addNewProd.clickbuttonNext2();

                //addNewProd.selectCurrecy();
                addNewProd.inputNominal();
                addNewProd.productDescription();
                addNewProd.tagsProduct();
                addNewProd.clickbuttonSubmit();
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
