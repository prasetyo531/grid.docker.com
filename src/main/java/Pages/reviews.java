package Pages;

import AssertObject.assertHome;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class reviews {
    private WebDriver driver;
    private WebDriverWait wait;

    assertHome asser = new assertHome(driver);

// OVERALL RATING
    @FindBy(id = "id_star1")
    @CacheLookup
    private WebElement star1;

    @FindBy(id = "id_star2")
    @CacheLookup
    private WebElement star2;

    @FindBy(id = "id_star3")
    @CacheLookup
    private WebElement star3;

    @FindBy(id = "id_star4")
    @CacheLookup
    private WebElement star4;

    @FindBy(id = "id_star5")
    @CacheLookup
    private WebElement star5;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[2]/button")
    @CacheLookup
    private WebElement btnNext1;

    @FindBy(linkText = "NEXT")
    @CacheLookup
    private WebElement btnCancel1;

// USAGE PERIODE

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[1]/p")
    @CacheLookup
    private WebElement btnlessThan1Week;

    


    public reviews(WebDriver driver) {
        // TODO Auto-generated constructor stub

        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);

    }

    public void clickBrandName() {

        WebElement snp = driver.findElement (By.linkText("SNP"));
        wait.until(ExpectedConditions.elementToBeClickable(snp));
        snp.click();
    }

    public void overallRatingPage() {

        wait.until (ExpectedConditions.elementToBeClickable (star1));
        star1.click ();
    }

    public void clickBtnNext1() {

        wait.until (ExpectedConditions.elementToBeClickable (btnNext1));
        btnNext1.click ();
    }

    public void usagePeriodePage() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnlessThan1Week);

        wait.until (ExpectedConditions.elementToBeClickable (btnlessThan1Week));
        btnlessThan1Week.click ();
    }



}
