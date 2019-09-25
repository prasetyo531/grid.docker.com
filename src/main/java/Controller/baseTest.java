package Controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

public class baseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setupDriver(ITestContext ctx) throws MalformedURLException {
        // BROWSER => chrome / firefox
        // HUB_HOST => localhost / 10.0.1.3 / hostname

        String host = "localhost";
        DesiredCapabilities dc= DesiredCapabilities.chrome();

        if (System.getProperty("browser") != null &&
                System.getProperty("browser").equalsIgnoreCase("chrome")) {
            dc = DesiredCapabilities.chrome();
        } else {
            dc = DesiredCapabilities.firefox();
        }

        if (System.getProperty("hub_host") != null) {
            host = System.getProperty("hub_host");
        }

        String testName = ctx.getCurrentXmlTest().getName();

        String completeUrl = "http://" + host + ":4444/wd/hub";
        dc.setCapability("name", testName);
        this.driver = new RemoteWebDriver(new URL(completeUrl), dc);

    }

    @AfterClass
    public void terminate () {
        //Remove the ThreadLocalMap element
       this.driver.quit();
    }
}
