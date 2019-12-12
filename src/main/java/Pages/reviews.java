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

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

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

    @FindBy(id = "dropdown1")
    @CacheLookup
    private WebElement ecommerce;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[3]/p")
    @CacheLookup
    private WebElement brandWeb;

    @FindBy(id = "dropdown3")
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

    @FindBy(id = "dropdown2")
    @CacheLookup
    private WebElement multiStore;

    @FindBy(id = "dropdown3")
    @CacheLookup
    private WebElement drugstore;

    @FindBy(id= "dropdown4")
    @CacheLookup
    private WebElement superMarket;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[6]/p")
    @CacheLookup
    private WebElement tradMarket;

    @FindBy(id = "dropdown6")
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

    @FindBy(id = "dropdown3")
    @CacheLookup
    private WebElement noneOfAbove;

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

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[2]/div[4]/textarea")
    @CacheLookup
    private WebElement fieldReview;

    @FindBy(xpath = "//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[3]/button[2]")
    @CacheLookup
    private WebElement btnSubmit;

    @FindBy(xpath = "/html/body/div[6]/div/div/button")
    @CacheLookup
    private WebElement btnViewReview;



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
        wait.until (ExpectedConditions.elementToBeClickable (btnMoreThan3Mnth));
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

        wait.until (ExpectedConditions.elementToBeClickable (ecommerce));
        ecommerce.click ();

        WebElement tokopedia = driver.findElement (By.xpath ("//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[2]/div/div/div/p[1]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(tokopedia);
        actions.click();
        actions.sendKeys(Keys.chord (Keys.ENTER));
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

        wait.until (ExpectedConditions.elementToBeClickable (sosmed));
        sosmed.click ();

        WebElement instagram = driver.findElement (By.xpath ("//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[4]/div/div/div/p[1]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(instagram);
        actions.click();
        actions.sendKeys(Keys.chord (Keys.ENTER));
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

        wait.until (ExpectedConditions.elementToBeClickable (multiStore));
        multiStore.click ();

        WebElement sogo = driver.findElement (By.xpath ("//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[3]/div/div/div/p[1]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(sogo);
        actions.click();
        actions.sendKeys(Keys.chord (Keys.ENTER));
        actions.build().perform();

        if (!multiStore.isSelected ()) {
            System.out.println ("SOGO Selected");
        }
        else {
            System.out.println ("SOGO Unselected");
        }
    }

    public void selectDrugstore() {

        wait.until (ExpectedConditions.elementToBeClickable (drugstore));
        drugstore.click ();

//        WebElement avecca = driver.findElement (By.xpath ("//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[4]/div/div/div/p[5]"));
        WebElement guardian = driver.findElement (By.xpath ("//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[4]/div/div/div/p[1]"));

//        Actions actions = new Actions(driver);
        Actions actions = new Actions(driver);
        actions.moveToElement(guardian);
        actions.click();
        actions.sendKeys(Keys.chord (Keys.ENTER));
        actions.build().perform();

        if (!drugstore.isSelected ()) {
            System.out.println ("Avecca Selected");
        }
        else {
            System.out.println ("Avecca Unselected");
        }
    }

    public void selectSupermarket() {

        wait.until (ExpectedConditions.elementToBeClickable (superMarket));
        superMarket.click ();

        WebElement lottemart = driver.findElement (By.xpath ("//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[5]/div/div/div/p[5]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(lottemart);
        actions.click();
        actions.sendKeys(Keys.chord (Keys.ENTER));
        actions.build().perform();

        if (!drugstore.isSelected ()) {
            System.out.println ("Lottemart Selected");
        }
        else {
            System.out.println ("Lottemart Unselected");
        }
    }

    public void selectTraditionalMarket() {
        wait.until (ExpectedConditions.elementToBeClickable (tradMarket));
        tradMarket.click ();
    }

    public void selectDirectSelling() {

        wait.until (ExpectedConditions.elementToBeClickable (directSelling));
        directSelling.click ();

        WebElement oriflame = driver.findElement (By.xpath ("//*[@id=\"top-page\"]/div[2]/div/div[1]/div[2]/div[1]/div[7]/div/div/div/p[1]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(oriflame);
        actions.click();
        actions.sendKeys(Keys.chord (Keys.ENTER));
        actions.build().perform();

        if (!drugstore.isSelected ()) {
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

        wait.until (ExpectedConditions.elementToBeClickable (noneOfAbove));
        PRPackage.click ();

        Actions actions = new Actions(driver);
        actions.moveToElement(noneOfAbove);
        actions.click();
        actions.sendKeys("BeautyTest", Keys.ENTER);
        actions.build().perform();

        if (!noneOfAbove.isSelected ()) {
            System.out.println ("BeautyTest Selected");
        }
        else {
            System.out.println ("BeautyTest Unselected");
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
        fieldReview.sendKeys("Awal beli ini karena iseng pingin nyoba pelembab lain, walaupun harganya terjangkau, productnya Emina ini kualitasnya tetap bagus. Pertama kali pemakaian, aku agak kaget ya karena teksturnya yang cair baget. Tapi pas dipakai jadinya cepet ngeresap ke kulit. Cukup ngelembabin kulit aku yang cenderung kering. Pelembab ini termaksud tipe yang gada whitecasnya, jadi gak ngebuat muka terlihat lebih cerah. Overall aku suka sama productnya, tapi kalo untuk repurchase sepertinya ingin coba product yang lain juga :)");
    }

    public void submitReview() {
        wait.until (ExpectedConditions.elementToBeClickable (btnSubmit));
        btnSubmit.click ();
    }

    public void clickbtnViewReview() {
        wait.until (ExpectedConditions.elementToBeClickable (btnViewReview));
        btnViewReview.click ();
    }



}
