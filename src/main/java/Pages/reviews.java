package Pages;

import AssertObject.assertHome;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.NodeList;

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

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[2]/div")
    @CacheLookup
    private WebElement ecommerce;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[3]/p")
    @CacheLookup
    private WebElement brandWeb;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[4]/div")
    @CacheLookup
    private WebElement sosmed;

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

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[3]/div/p")
    @CacheLookup
    private WebElement multiStore;

//    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[4]/div")
//    @CacheLookup
//    private WebElement drugstore;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[5]/div")
    @CacheLookup
    private WebElement superMarket;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[6]/p")
    @CacheLookup
    private WebElement tradMarket;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[7]/div")
    @CacheLookup
    private WebElement directSelling;

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

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[4]/div/input")
    @CacheLookup
    private WebElement NoneOfAbove;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[2]/button[2]")
    @CacheLookup
    private WebElement btnNext3;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[2]/button[1]")
    @CacheLookup
    private WebElement btnBack1;

// RECOMMENDATION

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/i[1]")
    @CacheLookup
    private WebElement btnYes;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/i[2]")
    @CacheLookup
    private WebElement btnNo;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[2]/div[4]")
    @CacheLookup
    private WebElement fieldReview;



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

    public void tapMenuOnline() {
        wait.until (ExpectedConditions.elementToBeClickable (menuOnline));
        menuOnline.click ();
    }

    public void selectFlashSale() {
        wait.until (ExpectedConditions.elementToBeClickable (fdFlashsale));
        fdFlashsale.click ();
    }

    public void selecteCommerce() {

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", ecommerce);

        Actions actions = new Actions(driver);
        actions.moveToElement(ecommerce);
        actions.click();
        actions.sendKeys("Tokopedia", Keys.ENTER);
        actions.build().perform();

        if (!ecommerce.isSelected ()) {
            System.out.println ("Tokopedia Selected");
        }
        else {
            System.out.println ("Tokopedia Unselected");
        }
    }

    public void selectBrandWeb() {
        wait.until (ExpectedConditions.elementToBeClickable (brandWeb));
        brandWeb.click ();
    }

    public void selectSosmed() {

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", sosmed);

        Actions actions = new Actions(driver);
        actions.moveToElement(sosmed);
        actions.click();
        actions.sendKeys("Instagram", Keys.ENTER);
        actions.build().perform();

        if (!sosmed.isSelected ()) {
            System.out.println ("Instagram Selected");
        }
        else {
            System.out.println ("Instagram Unselected");
        }
    }

    public void selectFDTryNReview() {
        wait.until (ExpectedConditions.elementToBeClickable (FDTryNReview));
        FDTryNReview.click ();
    }

    public void tapMenuOffline() {
        wait.until (ExpectedConditions.elementToBeClickable (menuOffline));
        menuOffline.click ();
    }

    public void selectXBeautyFD() {
        wait.until (ExpectedConditions.elementToBeClickable (XbeautyFD));
        XbeautyFD.click ();
    }

    public void selectBrandStore() {
        wait.until (ExpectedConditions.elementToBeClickable (brandStore));
        brandStore.click ();
    }

    public void selectMultiBrand() {

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", multiStore);

        Actions actions = new Actions(driver);
        actions.moveToElement(multiStore);
        actions.click();
        actions.sendKeys("Test", Keys.ENTER);
        actions.build().perform();

        if (!multiStore.isSelected ()) {
            System.out.println ("Matahari Selected");
        }
        else {
            System.out.println ("Matahari Unselected");
        }
    }

    public void selectDrugstore() {

        WebElement drugstore = driver.findElement (By.xpath ("//*[@id=\"dropdown3\"]"));

        Select selectDrugstore = new Select(drugstore);
        selectDrugstore.selectByValue ("Watson");

//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].click();", drugstore);
//
//        Actions actions = new Actions(driver);
//        actions.moveToElement(drugstore);
//        actions.click();
//        actions.sendKeys("Watson", Keys.ENTER);
//        actions.build().perform();
//
//        if (!drugstore.isSelected ()) {
//            System.out.println ("Watson Selected");
//        }
//        else {
//            System.out.println ("Watson Unselected");
//        }
    }

    public void selectSupermarket() {

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", superMarket);

        Actions actions = new Actions(driver);
        actions.moveToElement(superMarket);
        actions.click();
        actions.sendKeys("Alfamart", Keys.ENTER);
        actions.build().perform();

        if (!superMarket.isSelected ()) {
            System.out.println ("Alfamart Selected");
        }
        else {
            System.out.println ("Alfamart Unselected");
        }
    }

    public void selectTraditionalMarket() {
        wait.until (ExpectedConditions.elementToBeClickable (tradMarket));
        tradMarket.click ();
    }

    public void selectDirectSelling() {

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", directSelling);

        Actions actions = new Actions(driver);
        actions.moveToElement(directSelling);
        actions.click();
        actions.sendKeys("Oriflame", Keys.ENTER);
        actions.build().perform();

        if (!directSelling.isSelected ()) {
            System.out.println ("Oriflame Selected");
        }
        else {
            System.out.println ("Oriflame Unselected");
        }
    }

    public void tapMenuOthers() {
        wait.until (ExpectedConditions.elementToBeClickable (menuOthers));
        menuOthers.click ();
    }

    public void selectGift() {
        wait.until (ExpectedConditions.elementToBeClickable (gift));
        gift.click ();
    }

    public void selectSampel() {
        wait.until (ExpectedConditions.elementToBeClickable (sample));
        sample.click ();
    }

    public void selectPRPackage() {
        wait.until (ExpectedConditions.elementToBeClickable (PRPackage));
        PRPackage.click ();
    }

    public void selectNoneOfAbove() {

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", NoneOfAbove );

        Actions actions = new Actions(driver);
        actions.moveToElement(NoneOfAbove);
        actions.click();
        actions.sendKeys("Test", Keys.ENTER);
        actions.build().perform();

        if (!NoneOfAbove.isSelected ()) {
            System.out.println ("None of above Selected");
        }
        else {
            System.out.println ("None of above Unselected");
        }
    }

    public void clickBtnNext3() {
        wait.until (ExpectedConditions.elementToBeClickable (btnNext3));
       btnNext3.click ();
    }

    public void clickBtnYes() {

        wait.until (ExpectedConditions.elementToBeClickable (btnYes));
        btnYes.click ();

        if (!btnYes.isSelected ()) {
            System.out.println ("User Recommend The Product ");
        }
        else {
            System.out.println ("No");
        }
    }

    public void clickBtnNo() {

        wait.until (ExpectedConditions.elementToBeClickable (btnNo));
        btnNo.click ();

        if (!btnYes.isSelected ()) {
            System.out.println ("User Not Recommend The Product ");
        }
        else {
            System.out.println ("Yes");
        }
    }

    public void inputReview() {
       fieldReview.sendKeys("Cushion pertama aku! suka sih, shade caramelnya cocok di kulitku yang mendium, untuk coveragenya lumayan oke sih. Biasanya masih aku timpa bedak, biar agak mate. Trus makenya agak di tepuk pelan pelan kalau enggak nanti kaya ketebalan gitu. Overall aku suka produknya. Apalagi harganya yang masih super terjangkau di bandingkan cushion yang lain.");
    }

}
