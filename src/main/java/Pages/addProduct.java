package Pages;

import AssertObject.assertHome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addProduct {
    public class homepage {

        private WebDriver driver;
        private WebDriverWait wait;

        assertHome asser = new assertHome(driver);

//upload product image
        @FindBy(id = "id_sure")
        @CacheLookup
        private WebElement buttonSure;

        @FindBy(id = "id_cancel")
        @CacheLookup
        private WebElement buttonCancel;

        @FindBy(id = "addproduct-button-upload")
        @CacheLookup
        private WebElement addProductbyImage;

        @FindBy(id = "addproduct-image-url")
        @CacheLookup
        private WebElement addProductbyURL;

        @FindBy(id = "addproduct-button-show-image")
        @CacheLookup
        private WebElement buttonShow;

        @FindBy(css = "div[class='jsx-3388887939 modal-button crop-button']")
        @CacheLookup
        private WebElement buttonCrop;

        @FindBy(css = "div[class='jsx-3388887939 modal-button cancel-button']")
        @CacheLookup
        private WebElement buttonCancelcrop;

//product brand and name
        @FindBy(id = "addproduct-button-next")
        @CacheLookup
        private WebElement buttonNext;

        @FindBy(id = "react-select-18--value")
        @CacheLookup
        private WebElement brandName;

        @FindBy(id = "react-select-19--value")
        @CacheLookup
        private WebElement productCategory;

        @FindBy(id = "react-select-22--value")
        @CacheLookup
        private WebElement productSubCategory;

        @FindBy(id = "addproduct-input-product-name")
        @CacheLookup
        private WebElement productName;

        @FindBy(id = "addproduct-input-product-shade")
        @CacheLookup
        private WebElement productShade;

        @FindBy(id = "addproduct-button-submit")
        @CacheLookup
        private WebElement buttonNext1;

//product rating
        @FindBy(id = "star-1")
        @CacheLookup
        private WebElement overallRating;

        @FindBy(id = "star-2")
        @CacheLookup
        private WebElement overallRating1;

        @FindBy(id = "star-3")
        @CacheLookup
        private WebElement overallRating2;

        @FindBy(id = "star-5")
        @CacheLookup
        private WebElement overallRating4;

        @FindBy(id = "rating-price-1")
        @CacheLookup
        private WebElement productPrice;

        @FindBy(id = "rating-price-2")
        @CacheLookup
        private WebElement productPrice1;

        @FindBy(id = "rating-price-3")
        @CacheLookup
        private WebElement productPrice2;

        @FindBy(id = "rating-quality-1")
        @CacheLookup
        private WebElement packageQuality;

        @FindBy(id = "rating-quality-2")
        @CacheLookup
        private WebElement packageQuality1;

        @FindBy(id = "rating-quality-3")
        @CacheLookup
        private WebElement packageQuality2;

        @FindBy(id = "rating-quality-4")
        @CacheLookup
        private WebElement packageQuality3;

        @FindBy(id = "repurchase-yes")
        @CacheLookup
        private WebElement repurchase;

        @FindBy(id = "repurchase-no")
        @CacheLookup
        private WebElement repurchase1;

        @FindBy(id = "review-field")
        @CacheLookup
        private WebElement reviewBox;

        @FindBy(id = "product-rating-button-submit")
        @CacheLookup
        private WebElement buttonNext2;

//product info
        @FindBy(id = "currency-select")
        @CacheLookup
        private WebElement retailPrice;

        @FindBy(id = "number-format")
        @CacheLookup
        private WebElement numberFormat;

        @FindBy(id = "description-field")
        @CacheLookup
        private WebElement productDesc;

        @FindBy(css = "div[class='Select-control']")
        @CacheLookup
        private WebElement productTags;

        @FindBy(id = "product-info-button-submit")
        @CacheLookup
        private WebElement buttonSubmit;

    }
}
