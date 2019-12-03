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

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/p")
    @CacheLookup
    private WebElement btnCancel1;

// USAGE PERIODE

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[1]/p")
    @CacheLookup
    private WebElement btnlessThan1Week;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[2]")
    @CacheLookup
    private WebElement btnMoreThan1Week;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[3]")
    @CacheLookup
    private WebElement btnMoreThan1Mnth;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[4]")
    @CacheLookup
    private WebElement btnMoreThan3Mnth;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[5]")
    @CacheLookup
    private WebElement btnMoreThan6Mnth;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[6]")
    @CacheLookup
    private WebElement btnMoreThan1Year;

    @FindBy(id= "scales")
    @CacheLookup
    private WebElement checkBox;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[3]/button[2]")
    @CacheLookup
    private WebElement btnNext2;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[3]/button[1]")
    @CacheLookup
    private WebElement btnBack;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/p")
    @CacheLookup
    private WebElement btnCancel2;

// PURCHASE POINTS

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/span[1]")
    @CacheLookup
    private WebElement menuOnline;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[1]/p")
    @CacheLookup
    private WebElement fdFlashsale;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[3]/p")
    @CacheLookup
    private WebElement brandWeb;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[5]/p")
    @CacheLookup
    private WebElement FDTryNReview;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/span[2]")
    @CacheLookup
    private WebElement menuOffline;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[1]/p")
    @CacheLookup
    private WebElement XbeautyFD;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[2]/p")
    @CacheLookup
    private WebElement brandStore;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[6]/p")
    @CacheLookup
    private WebElement market;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/span[3]")
    @CacheLookup
    private WebElement menuOthers;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[1]/p")
    @CacheLookup
    private WebElement gift;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[2]/p")
    @CacheLookup
    private WebElement sample;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[3]/p")
    @CacheLookup
    private WebElement PRPackage;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[2]/button[2]")
    @CacheLookup
    private WebElement btnNext3;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[2]/button[1]")
    @CacheLookup
    private WebElement btnBack1;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/p")
    @CacheLookup
    private WebElement btnCancel3;



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

    public void overallRatingPage1() {
        wait.until (ExpectedConditions.elementToBeClickable (star2));
        star2.click ();
    }

    public void overallRatingPage2() {
        wait.until (ExpectedConditions.elementToBeClickable (star3));
        star3.click ();
    }

    public void overallRatingPage3() {
        wait.until (ExpectedConditions.elementToBeClickable (star4));
        star4.click ();
    }

    public void overallRatingPage4() {
        wait.until (ExpectedConditions.elementToBeClickable (star5));
        star5.click ();
    }

    public void clickBtnNext1() {
        wait.until (ExpectedConditions.elementToBeClickable (btnNext1));
        btnNext1.click ();
    }

    public void clickBtnCancel1() {
        wait.until (ExpectedConditions.elementToBeClickable (btnCancel1));
        btnCancel1.click ();
    }

    public void usagePeriodePage1() {
        wait.until (ExpectedConditions.elementToBeClickable (btnlessThan1Week));
        btnlessThan1Week.click ();
    }

    public void usagePeriodePage2() {
        wait.until (ExpectedConditions.elementToBeClickable (btnMoreThan1Week));
        btnMoreThan1Week.click ();
    }

    public void usagePeriodePage3() {
        wait.until (ExpectedConditions.elementToBeClickable (btnMoreThan1Mnth));
        btnMoreThan1Mnth.click ();
    }

    public void usagePeriodePage4() {
        wait.until (ExpectedConditions.elementToBeClickable ( btnMoreThan3Mnth));
        btnMoreThan3Mnth.click ();
    }

    public void usagePeriodePage5() {
        wait.until (ExpectedConditions.elementToBeClickable (btnMoreThan6Mnth));
        btnMoreThan6Mnth.click ();
    }

    public void usagePeriodePage6() {
        wait.until (ExpectedConditions.elementToBeClickable (btnMoreThan1Year));
        btnMoreThan1Year.click ();
    }

    public void setCheckBox() {
        wait.until (ExpectedConditions.elementToBeClickable (checkBox));
        checkBox.click ();

        if (!checkBox.isSelected ()) {
            System.out.println ("Checkbox is Toggled On");
        }
        else {
            System.out.println ("Checkbox is Toggled Off");
        }
    }

    public void clickBtnNext2() {
        wait.until (ExpectedConditions.elementToBeClickable (btnNext2));
        btnNext2.click ();
    }

    public void clickBtnBack() {
        wait.until (ExpectedConditions.elementToBeClickable (btnBack));
        btnBack.click ();
    }

    public void clickBtnCancel2() {

        wait.until (ExpectedConditions.elementToBeClickable (btnCancel2));
        btnCancel2.click ();
    }

    public void tapMenuOffline() {
        wait.until (ExpectedConditions.elementToBeClickable (menuOffline));
        menuOffline.click ();
    }

    public void tapFlashSale() {
        wait.until (ExpectedConditions.elementToBeClickable (fdFlashsale));
        fdFlashsale.click ();
    }

    public void clickBtnNext3() {
        wait.until (ExpectedConditions.elementToBeClickable (btnNext3));
       btnNext3.click ();
    }

}
