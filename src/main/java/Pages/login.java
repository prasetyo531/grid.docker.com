package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {

	private WebDriver driver;
	private WebDriverWait wait;

	@FindBy(css = "span[id='id_menuburger_home']")
	@CacheLookup
	private WebElement hamburger;

	@FindBy(css = "input[data-element-id='button-red']")
	@CacheLookup
	private WebElement loginBtn;

	@FindBy(id = "login_home")
	@CacheLookup
	private WebElement userLogin;

	By username=By.cssSelector("input[placeholder='Email / Username']");
	By password=By.cssSelector("input[placeholder='Password']");
	By rememberme=By.xpath("//*[@id='__next']/div/div/div[2]/div/form/div[4]/div[1]/div/span");
	By forgotPassword=By.linkText("Forgot Password?");
	By emailForgotPassword=By.cssSelector("input[placeholder='Email']");
	By sendEmailForgotPass=By.cssSelector("input[value='SEND AN EMAIL']");
	By warningMesssage=By.xpath("//*[@id='__next']/div/div/div[2]/div/form/div[1]");
	//By buttonlogin=By.cssSelector("input[value='Login']");
	By buttonloginFb=By.cssSelector("input[value='Login with Facebook']");
	
	
	By createaccount=By.cssSelector("input[value='Create Account']");
	By emailReg=By.cssSelector("input[placeholder='Email']");
	By usernameReg=By.cssSelector("input[placeholder='Username']");
	By confirmPasswordReg=By.cssSelector("input[placeholder='Confirm Password']");
	By checklistAgree=By.cssSelector("span[data-element-id='register-checkbox']");
	By syaratKondisi=By.linkText("Syarat & Kondisi");
	By createAccountRegisterPage=By.cssSelector("input[value='create account']");
	
	By clickfacebook=By.cssSelector("input[value='Login with Facebook']");
	
	public login(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
		
	}

	public void clickBtnLoginUser() {

		userLogin.click();
	}
	
	public WebElement fillusername(){

		return driver.findElement(username);
	}
	
	public WebElement fillpassword(){
		
		return driver.findElement(password);
	}
	
	public WebElement clickForgotPassword(){

		return driver.findElement(forgotPassword);
	}
	
	public WebElement clicButtonSendEmailForgotPassword(){
		
		return driver.findElement(sendEmailForgotPass);
	}
	
	public void clickbuttonlogin(){

		loginBtn.click();
	}
	
	//register page
	public WebElement clickCreateAccount(){
		
		return driver.findElement(createaccount);
	}
	
	public WebElement fillEmail(){
		
		return driver.findElement(emailReg);
	}
	
	public WebElement fillUsername(){
		
		return driver.findElement(usernameReg);
	}
	
	public WebElement fillPassword(){
		
		return driver.findElement(password);
	}
	
	public WebElement fillConfirmPasword(){
		
		return driver.findElement(confirmPasswordReg);
	}
	
	public WebElement tickAggrement(){
		
		return driver.findElement(checklistAgree);
	}
	
	public WebElement syaratKondisi(){
		
		return driver.findElement(syaratKondisi);
	}
	
	public WebElement clickCreateAccountRe(){
		
		return driver.findElement(createAccountRegisterPage);
	}
	
	public WebElement getWarningRegister(){
		
		return driver.findElement(warningMesssage);
	}
	
	public WebElement fillEmailForgotPass(){
		
		return driver.findElement(emailForgotPassword);
	}
	
	public WebElement GetWarningMessage(){
		
		return driver.findElement(warningMesssage);
	}	
	
	public WebElement registerFacebook(){
		
		return driver.findElement(clickfacebook);
	}
}

