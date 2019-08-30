package Register;

import AssertObject.assertHome;
import Controller.BaseTest;
import Pages.homepage;
import Pages.login;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class SecondTest extends BaseTest {

    public static WebElement main = null;
    public static Properties prop = null;

    public String UrlLogin = null;

    @Test
    public void GOOGLE4() throws InterruptedException {

        homepage home = new homepage(driver);
        login logpro = new login(driver);
        assertHome asser = new assertHome(driver);

        driver.get("https://femaledaily.com/");
        driver.manage().window().setSize(new Dimension(1650, 1200));

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        asser.hamburgerMenu();

        home.WaitHamburger();

        home.ClickMenuReview();

        home.HoverHeaderMenu();
        home.ClickMenuAddProduct();

        Thread.sleep(3000);

        UrlLogin = driver.getCurrentUrl();
        System.out.println(UrlLogin);
        assertTrue(UrlLogin.contains("account.femaledaily"));

        logpro.fillusername().sendKeys("dasdasdasdasd");
        logpro.fillpassword().sendKeys("sdasdasd");
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
}
