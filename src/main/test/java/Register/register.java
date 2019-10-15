package Register;

import AssertObject.assertHome;
import Controller.baseTest;
import Pages.homepage;
import Pages.login;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class register extends baseTest {

    /*
    fill all concern - photo - follow first user
     */

    public static WebElement main = null;
    public static Properties prop = null;
    public String UrlLogin;


    @Test(dataProvider = "getDataRegister")
    public void register(String email, String username, String password) throws InterruptedException {

        homepage home = new homepage(driver);
        login logpro = new login(driver);
        assertHome asser = new assertHome(driver);

        driver.get("https://femaledaily.com/");
        driver.manage().window().setSize(new Dimension(1650, 1200));

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        asser.hamburgerMenu();

        home.WaitHamburger();

        home.ClickMenuReview();

        home.HoverClickMenuAddProduct();

        Thread.sleep(3000);

        UrlLogin = driver.getCurrentUrl();
        System.out.println(UrlLogin);
        assertTrue(UrlLogin.contains("account.femaledaily"));

        logpro.fillusername().sendKeys(email);
        logpro.fillusername().sendKeys(username);
        logpro.fillpassword().sendKeys(password);
        logpro.clickbuttonlogin().click();

    }

    @AfterMethod
    public void afterMethod(ITestResult result)
    {
        try
        {
            if(result.getStatus() == ITestResult.SUCCESS)
            {

                //Do something here
                Cookie cookie = new Cookie("zaleniumTestPassed", "true");
                driver.manage().addCookie(cookie);
                System.out.println("passed **********");
            }

            else if(result.getStatus() == ITestResult.FAILURE)
            {
                //Do something here
                Cookie cookie = new Cookie("zaleniumTestPassed", "false");
                driver.manage().addCookie(cookie);
                System.out.println("Failed ***********");

            }

            else if(result.getStatus() == ITestResult.SKIP ){

                System.out.println("Skiped***********");

            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    @DataProvider
    public static Object[][] getDataRegister(){
        Object[][] data = null;

        //kiri for numbers of times testcase must execute
        //kanan for no parameter you send
        data = new Object[1][3];

        data[0][0]= "webselenium@test.com";
        data[0][1]= "webselenium";
        data[0][2]= "test123";

        return data;
    }
}
