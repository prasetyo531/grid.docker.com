package Pages;

import AssertObject.assertHome;
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

public class addProduct {

        private WebDriver driver;
        private WebDriverWait wait;

        assertHome asser = new assertHome(driver);


// UPLOAD PRODUCT IMAGE
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

        @FindBy(css = "div[class='ReactCrop__crop-selection']")
        @CacheLookup
        private WebElement crop;

        @FindBy(css = "div[class='jsx-3388887939 modal-button crop-button']")
        @CacheLookup
        private WebElement buttonCrop;

        @FindBy(css = "div[class='jsx-3388887939 modal-button cancel-button']")
        @CacheLookup
        private WebElement buttonCancelcrop;

// PRODUCT BRAND & NAME
        @FindBy(id = "addproduct-button-next")
        @CacheLookup
        private WebElement buttonNext;

        @FindBy(id = "react-select-2--value")
        @CacheLookup
        private WebElement brandName;

        @FindBy(id = "react-select-3--value")
        @CacheLookup
        private WebElement productCategory;

        @FindBy(id = "react-select-4--value")
        @CacheLookup
        private WebElement productSubCategory;

        @FindBy(id = "react-select-5--value")
        @CacheLookup
        private WebElement subCategory;

        @FindBy(id = "addproduct-input-product-name")
        @CacheLookup
        private WebElement productName;

        @FindBy(id = "addproduct-input-product-shade")
        @CacheLookup
        private WebElement productShade;

        @FindBy(id = "addproduct-button-submit")
        @CacheLookup
        private WebElement buttonNext1;

// PRODUCT RATING
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

// PRODUCT INFO
        @FindBy(id = "currency-select")
        @CacheLookup
        private WebElement retailPrice;

        @FindBy(id = "number-format")
        @CacheLookup
        private WebElement nominal;

        @FindBy(id = "description-field")
        @CacheLookup
        private WebElement productDesc;

        @FindBy(id = "react-select-7--value")
        @CacheLookup
        private WebElement productTags;

        @FindBy(id = "product-info-button-submit")
        @CacheLookup
        private WebElement buttonSubmit;



        public addProduct(WebDriver driver) {
                // TODO Auto-generated constructor stub

                this.driver = driver;
                this.wait = new WebDriverWait(driver, 30);
                PageFactory.initElements(driver, this);

        }

        public void popUpAddProduct() {
                wait.until(ExpectedConditions.elementToBeClickable(buttonSure));
                buttonSure.click();
        }

       public void imagebyUpload () throws AWTException, InterruptedException {

            String filePath = "C:\\Users\\FDN-Macia\\Pictures\\Saved Pictures\\tes.jpg";
            StringSelection strSel = new StringSelection(filePath);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSel,null);
            System.out.println("selection" +strSel);

            wait.until(ExpectedConditions.elementToBeClickable(addProductbyImage));
            addProductbyImage.click();

           Robot robot = null;

           try {
               robot = new Robot();
           } catch (AWTException e) {
               e.printStackTrace();
           }
           robot.keyPress(KeyEvent.VK_ENTER);
           robot.keyRelease(KeyEvent.VK_ENTER);
           sleep(1000);
           robot.keyPress(KeyEvent.VK_CONTROL);
           robot.keyPress(KeyEvent.VK_V);
           sleep(1000);
           robot.keyRelease(KeyEvent.VK_CONTROL);
           robot.keyRelease(KeyEvent.VK_V);
           sleep(1000);
           robot.keyPress(KeyEvent.VK_ENTER);
           robot.keyRelease(KeyEvent.VK_ENTER);

//           robot.delay(250);
//           robot.keyPress(KeyEvent.VK_ENTER);
//           robot.keyRelease(KeyEvent.VK_ENTER);
//           robot.keyPress(KeyEvent.VK_CONTROL);
//           robot.keyPress(KeyEvent.VK_V);
//           robot.keyRelease(KeyEvent.VK_V);
//           robot.keyRelease(KeyEvent.VK_CONTROL);
//           robot.keyPress(KeyEvent.VK_ENTER);
//           robot.delay(150);
//           robot.keyRelease(KeyEvent.VK_ENTER);
//            //uploadFilewithRobot(filePath);


           sleep(2000);
           //WebElement trycrop = driver.findElementByCssSelector("#modal-crop-showed > div > div.ReactCrop.ReactCrop--fixed-aspect > img");
           WebElement trycrop = driver.findElement(By.cssSelector("class['ReactCrop__crop-selection']"));
           WebElement cropfix = driver.findElement(By.cssSelector("class['ReactCrop ReactCrop--fixed-aspect']"));

           Actions crop = new Actions(driver);

           crop.dragAndDrop(trycrop, cropfix).build().perform();

           wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("crop")));
           wait.until(ExpectedConditions.elementToBeClickable(buttonCrop));
           buttonCrop.click();

//           //Move to the desired co-ordinates of the image element, In the code below I am staring from bottom left corner of the image
//           crop.moveToElement(trycrop.findCrop(buttonCrop),0,0);
//
//           //locate the co-ordinates of image you want to move by and perform the click   and hold which mimics the crop action
//           crop.clickAndHold().moveByOffset(196,238).release().build().perform();
//
//           buttonCrop.cropPicture().click();
//
//           wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("crop")));
//           wait.until(ExpectedConditions.elementToBeClickable(buttonCrop));
//           buttonCrop.click();
        }
        
//    public void imagebyURL() {
//                addProductbyURL.sendKeys("data:image/jpeg;base64,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");
//                wait.until(ExpectedConditions.elementToBeClickable(buttonShow));
//                buttonShow.click();
//
//        }

        public void clickbuttonNext() {
                wait.until(ExpectedConditions.elementToBeClickable(buttonNext));
                buttonNext.click();
        }

        public void selectBrand() {
                JavascriptExecutor js = (JavascriptExecutor)driver;
                js.executeScript("arguments[0].click();", brandName);

                Actions actions = new Actions(driver);
                actions.moveToElement(brandName);
                actions.click();
                actions.sendKeys("Emina", Keys.ENTER);
                actions.build().perform();
        }

        public void selectProductCategory() {
                JavascriptExecutor js = (JavascriptExecutor)driver;
                js.executeScript("arguments[0].click();", productCategory);

                Actions actions = new Actions(driver);
                actions.moveToElement(productCategory);
                actions.click();
                actions.sendKeys("Make Up", Keys.ENTER);
                actions.build().perform();

        }

        public void selectSubProductCategory() {
                JavascriptExecutor js = (JavascriptExecutor)driver;
                js.executeScript("arguments[0].click();", productSubCategory);

                Actions actions = new Actions(driver);
                actions.moveToElement(productSubCategory);
                actions.click();
                actions.sendKeys("Face", Keys.ENTER);
                actions.build().perform();
        }

        public void selectSubCategory() {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();", subCategory);

                Actions actions = new Actions(driver);
                actions.moveToElement(subCategory);
                actions.click();
                actions.sendKeys("BB & CC Cream", Keys.ENTER);
                actions.build().perform();
        }
        public void inputProductName() {

                productName.sendKeys("Bare With Me Mineral Cushion");
        }

        public void inputProductShade() {
                productShade.sendKeys("Caramel");
        }

        public void clickbuttonNext1() {
                wait.until(ExpectedConditions.elementToBeClickable(buttonNext1));
                buttonNext1.click();
        }

        public void inputRating() {
                overallRating2.click();
        }

        public void setProductPrice() {
                productPrice.isSelected();
        }

        public void setPackageQuality() {
                packageQuality1.isSelected();
        }

        public void setRepurchase() {
                repurchase1.isSelected();
        }

        public void inputReview() {
                reviewBox.sendKeys("Cushion pertama aku! suka sih, shade caramelnya cocok di kulitku yang mendium, untuk coveragenya lumayan oke sih. Biasanya masih aku timpa bedak, biar agak mate. Trus makenya agak di tepuk pelan pelan kalau enggak nanti kaya ketebalan gitu. Overall aku suka produknya. Apalagi harganya yang masih super terjangkau di bandingkan cushion yang lain.");
        }

        public void clickbuttonNext2() {
                wait.until(ExpectedConditions.elementToBeClickable(buttonNext2));
                buttonNext2.click();
        }

//        public void selectCurrecy() {
//                JavascriptExecutor js = (JavascriptExecutor) driver;
//                js.executeScript("arguments[0].click();", retailPrice);
//
//                Actions actions = new Actions(driver);
//                actions.moveToElement(retailPrice);
//                actions.click();
//                actions.sendKeys("IDR", Keys.ENTER);
//                actions.build().perform();
//        }

        public void inputNominal() {
                nominal.sendKeys("135000");
        }

        public void productDescription() {
                productDesc.sendKeys("Emina BB Cushion Shade Caramel");
        }

        public void tagsProduct() {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();", productTags);

                Actions actions = new Actions(driver);
                actions.moveToElement(productTags);
                actions.click();
                actions.sendKeys("Make Up, BB Cushion", Keys.ENTER);
                actions.build().perform();
        }

        public void clickbuttonSubmit() {
                wait.until(ExpectedConditions.elementToBeClickable(buttonSubmit));
                buttonSubmit.click();
        }
}


