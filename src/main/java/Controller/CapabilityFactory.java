package Controller;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;

public class CapabilityFactory {

    public Capabilities capabilities;

    public Capabilities getCapabilities (String browser, ITestContext ctx) {
        if (browser.equals("firefox")) {
            capabilities = OptionsManager.getFirefoxOptions();

            DesiredCapabilities capabilitiesFirefox = new DesiredCapabilities();
            String tcname = ctx.getCurrentXmlTest().getName();
            capabilitiesFirefox.setCapability("name", tcname);

            return capabilities;

        } else if (browser.equals("chrome")) {
            capabilities = OptionsManager.getChromeOptions();

            DesiredCapabilities capabilitiesChrome = new DesiredCapabilities();
            String tcname = ctx.getCurrentXmlTest().getName();
            capabilitiesChrome.setCapability("name", tcname);

            return capabilities;
        }
        return capabilities;
    }
}
