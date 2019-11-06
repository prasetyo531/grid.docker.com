package AddReviews;

import AssertObject.assertHome;
import Controller.baseTest;
import Pages.homepage;
import Pages.login;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class addreview extends baseTest {
    WebDriver driver;

    @Test
    public void openPageReviews() throws InterruptedException, TimeoutException {

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

    }

}
