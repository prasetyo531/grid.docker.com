package Pages;

import AssertObject.assertHome;
import Controller.baseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import static java.lang.Thread.sleep;

public class categoryList {

    private WebDriver driver;
    private WebDriverWait wait;

    assertHome asser = new assertHome(driver);

// SKINCARE

    // MOISTURIZER
    @FindBy(id = "id_group_138")
    @CacheLookup
    private WebElement NightCream;

    @FindBy(id = "id_group_140")
    @CacheLookup
    private WebElement FaceMist;

    @FindBy(id = "id_group_70")
    @CacheLookup
    private WebElement DayCream;

    @FindBy(id = "id_group_74")
    @CacheLookup
    private WebElement sunProtection;

    @FindBy(id = "id_group_76")
    @CacheLookup
    private WebElement LotionEmultion;

    @FindBy(id = "id_group_79")
    @CacheLookup
    private WebElement FaceOil;

    //TREATMENT
    @FindBy(id = "id_group_142")
    @CacheLookup
    private WebElement EyeTreatment;

    @FindBy(id = "id_group_188")
    @CacheLookup
    private WebElement BrowLash;

    @FindBy(id = "id_group_201")
    @CacheLookup
    private WebElement SkinSoothing;

    @FindBy(id = "id_group_73")
    @CacheLookup
    private WebElement AcneTreatment;

    @FindBy(id = "id_group_75")
    @CacheLookup
    private WebElement SerumEssence;

    @FindBy(id = "id_group_96")
    @CacheLookup
    private WebElement peeling;

    // MASK
    @FindBy(id = "id_group_144")
    @CacheLookup
    private WebElement SleepingMask;

    @FindBy(id = "id_group_145")
    @CacheLookup
    private WebElement MaskSheet;

    @FindBy(id = "id_group_146")
    @CacheLookup
    private WebElement NosePack;

    @FindBy(id = "id_group_69")
    @CacheLookup
    private WebElement WashOff;

    // CLEANSER
    @FindBy(id = "id_group_134")
    @CacheLookup
    private WebElement FacialWash;

    @FindBy(id = "id_group_135")
    @CacheLookup
    private WebElement CreamLotion;

    @FindBy(id = "id_group_136")
    @CacheLookup
    private WebElement oil;

    @FindBy(id = "id_group_159")
    @CacheLookup
    private WebElement MakeupRemover;

    @FindBy(id = "id_group_71")
    @CacheLookup
    private WebElement ScrubExfo;

    @FindBy(id = "id_group_72")
    @CacheLookup
    private WebElement toner;

// MAKE UP

    // CHEEK
    @FindBy(id = "id_group_113")
    @CacheLookup
    private WebElement contour;

    @FindBy(id = "id_group_163")
    @CacheLookup
    private WebElement blush;

    @FindBy(id = "id_group_43")
    @CacheLookup
    private WebElement highlighter;

    @FindBy(id = "id_group_32")
    @CacheLookup
    private WebElement bronzer;

    @FindBy(id = "id_group_114")
    @CacheLookup
    private WebElement lipPalette;

    @FindBy(id = "id_group_53")
    @CacheLookup
    private WebElement lipGloss;

    @FindBy(id = "id_group_54")
    @CacheLookup
    private WebElement lipLiner;

    @FindBy(id = "id_group_55")
    @CacheLookup
    private WebElement lipstick;

    @FindBy(id = "id_group_56")
    @CacheLookup
    private WebElement lipbalm;

    @FindBy(id = "id_group_97")
    @CacheLookup
    private WebElement lipstain;

    // FACE
    @FindBy(id = "id_group_189")
    @CacheLookup
    private WebElement setSpray;

    @FindBy(id = "id_group_35")
    @CacheLookup
    private WebElement BBCream;

    @FindBy(id = "id_group_40")
    @CacheLookup
    private WebElement corrector;

    @FindBy(id = "id_group_42")
    @CacheLookup
    private WebElement tintedMoist;

    @FindBy(id = "id_group_34")
    @CacheLookup
    private WebElement foundation;

    @FindBy(id = "id_group_45")
    @CacheLookup
    private WebElement powder;

    @FindBy(id = "id_group_44")
    @CacheLookup
    private WebElement facePalette;

    @FindBy(id = "id_group_33")
    @CacheLookup
    private WebElement concealer;

    // EYES
    @FindBy(id = "id_group_110")
    @CacheLookup
    private WebElement eyeShadow;

    @FindBy(id = "id_group_111")
    @CacheLookup
    private WebElement eyeConcealer;

    @FindBy(id = "id_group_166")
    @CacheLookup
    private WebElement eyelashes;

    @FindBy(id = "id_group_26")
    @CacheLookup
    private WebElement eyeBrow;

    @FindBy(id = "id_group_27")
    @CacheLookup
    private WebElement eyeShadowPrimer;

    @FindBy(id = "id_group_28")
    @CacheLookup
    private WebElement eyeShadowSingle;

    @FindBy(id = "id_group_29")
    @CacheLookup
    private WebElement eyeliner;

    @FindBy(id = "id_group_30")
    @CacheLookup
    private WebElement mascara;

// BODY

    // BATH SHOWER
    @FindBy(id = "id_group_172")
    @CacheLookup
    private WebElement bodyWash;

    @FindBy(id = "id_group_11")
    @CacheLookup
    private WebElement bathTreatment;

    @FindBy(id = "id_group_18")
    @CacheLookup
    private WebElement scrub;

    // MOISTURIZER
    @FindBy(id = "id_group_108")
    @CacheLookup
    private WebElement butter;

    @FindBy(id = "id_group_173")
    @CacheLookup
    private WebElement sun;

    @FindBy(id = "id_group_15")
    @CacheLookup
    private WebElement lotion;

    @FindBy(id = "id_group_16")
    @CacheLookup
    private WebElement creams;

    @FindBy(id = "id_group_17")
    @CacheLookup
    private WebElement bidyOil;

    // PERSONAL CAR
    @FindBy(id = "id_group_12")
    @CacheLookup
    private WebElement deodorants;

    @FindBy(id = "id_group_14")
    @CacheLookup
    private WebElement hairRemoval;

    @FindBy(id = "id_group_94")
    @CacheLookup
    private WebElement intimateCare;

    @FindBy(id = "id_group_98")
    @CacheLookup
    private WebElement treatment;

    // HAND & FOOT
    @FindBy(id = "id_group_167")
    @CacheLookup
    private WebElement footTreatment;

    @FindBy(id = "id_group_168")
    @CacheLookup
    private WebElement handTreatment;

    @FindBy(id = "id_group_93")
    @CacheLookup
    private WebElement footCream;

// HAIR

    // TREATMENT
    @FindBy(id = "id_group_118")
    @CacheLookup
    private WebElement hairMask;

    @FindBy(id = "id_group_119")
    @CacheLookup
    private WebElement hairFrag;

    @FindBy(id = "id_group_126")
    @CacheLookup
    private WebElement heatProtectant;

    @FindBy(id = "id_group_175")
    @CacheLookup
    private WebElement scalpTreatment;

    @FindBy(id = "id_group_52")
    @CacheLookup
    private WebElement vitSerum;

    // STYLING & COLOUR
    @FindBy(id = "id_group_121")
    @CacheLookup
    private WebElement hairGel;

    @FindBy(id = "id_group_123")
    @CacheLookup
    private WebElement hairFoam;

    @FindBy(id = "id_group_49")
    @CacheLookup
    private WebElement hairColour;

    @FindBy(id = "id_group_51")
    @CacheLookup
    private WebElement hairSpray;

    // SHAMPOO & CONDITIONER
    @FindBy(id = "id_group_124")
    @CacheLookup
    private WebElement dryShampoo;

    @FindBy(id = "id_group_48")
    @CacheLookup
    private WebElement conditioner;

    @FindBy(id = "id_group_50")
    @CacheLookup
    private WebElement shampoo;

// FRAGRANCE
    @FindBy(linkText = "Perfume Oil")
    @CacheLookup
    private WebElement perfumeOil;

    @FindBy(linkText = "Perfume Solid")
    @CacheLookup
    private WebElement perfumeSolid;

    @FindBy(linkText = "EDP")
    @CacheLookup
    private WebElement edp;

    @FindBy(linkText = "EDT")
    @CacheLookup
    private WebElement edt;

    @FindBy(linkText = "Body Mist & Spray")
    @CacheLookup
    private WebElement mistSpray;

// NAILS
    @FindBy(linkText = "Nail Polish Remover")
    @CacheLookup
    private WebElement nailRemover;

    @FindBy(linkText = "Nail Sets")
    @CacheLookup
    private WebElement nailSets;

    @FindBy(linkText = "Top & Base Coat")
    @CacheLookup
    private WebElement baseCoat;

    @FindBy(linkText = "Polish")
    @CacheLookup
    private WebElement polish;

    @FindBy(linkText = "Vitamin & Treatment")
    @CacheLookup
    private WebElement vitTreatment;

// TOOLS

    // NAIL
    @FindBy(id = "id_group_149")
    @CacheLookup
    private WebElement stickerAppl;

    @FindBy(id = "id_group_65")
    @CacheLookup
    private WebElement maniPedi;

    // HAIR
    @FindBy(id = "id_group_154")
    @CacheLookup
    private WebElement stylingTool;

    @FindBy(id = "id_group_155")
    @CacheLookup
    private WebElement brushComb;

    // MAKE UP
    @FindBy(id = "id_group_150")
    @CacheLookup
    private WebElement eyeTools;

    @FindBy(id = "id_group_151")
    @CacheLookup
    private WebElement faceTools;

    @FindBy(id = "id_group_152")
    @CacheLookup
    private WebElement lipsTools;

    @FindBy(id = "id_group_153")
    @CacheLookup
    private WebElement brushCleanser;

    @FindBy(id = "id_group_156")
    @CacheLookup
    private WebElement brushSet;

    // SKINCARE
    @FindBy(id = "id_group_183")
    @CacheLookup
    private WebElement beautyDevice;

    @FindBy(id = "id_group_184")
    @CacheLookup
    private WebElement others;
    // BODY
    @FindBy(linkText = "Body")
    @CacheLookup
    private WebElement body;

// BRANDS


    public categoryList(WebDriver driver) {
        // TODO Auto-generated constructor stub

        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void clickListMoisturizer() {

        wait.until(ExpectedConditions.elementToBeClickable(NightCream));
        NightCream.click();
    }

    public void clickListLotion() {

        wait.until(ExpectedConditions.elementToBeClickable(LotionEmultion));
        LotionEmultion.click();
    }

    public void HoverClickProduct() {

        WebElement wardah = driver.findElement(By.id("id_product_image_12537"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", wardah);

        wait.until(ExpectedConditions.elementToBeClickable(wardah));
        wardah.click();

    }

    public void HoverCLickProduct1() {

        WebElement emina = driver.findElement(By.id("id_product_image_18167"));
        wait.until(ExpectedConditions.elementToBeClickable(emina));
        emina.click();
    }

}
