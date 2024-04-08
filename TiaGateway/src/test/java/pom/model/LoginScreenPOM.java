package pom.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import program.utility.BaseUtility;

public class LoginScreenPOM extends BaseUtility {
	
	public LoginScreenPOM() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//img") private WebElement tiaLogo;
	@FindBy(xpath="//span[contains(text(),'Username or Email')]") private WebElement usrnameLabel;
	@FindBy(xpath="//span[contains(text(),'Password')]") private WebElement passLabel;
	@FindBy(xpath="//input[@placeholder='Enter your username or email']") private WebElement usrnmeTextbox;
	@FindBy(xpath="//input[@placeholder='Enter your Password']") private WebElement passTextBox;
	@FindBy(xpath="//i[@class='icon fa fa-eye fa-1x']") private WebElement eyeicon;
	@FindBy(xpath = "//span[contains(text(),' Dashboard')]")private WebElement dashboard;
	@FindBy(xpath="//i[@class='icon fa fa-times fa-1x']") private WebElement xlogo;
	@FindBy(xpath="//span[contains(text(),'This field is required.')]") private WebElement emsg;
	@FindBy(xpath="(//span[@class='OSFillParent'])[1]") private WebElement profile;
	@FindBy(xpath="//span[contains(text(),'Sign-Out')]") private WebElement signout;
	@FindBy(xpath="//button[contains(text(),'Yes')]") private WebElement signoutyes;
	@FindBy(xpath="//button[contains(text(),'Cancel')]") private WebElement signoutCancel;
	@FindBy(xpath="//span[contains(text(),'Logout')]") private WebElement logout;
	@FindBy(xpath="//div[@class='menu-icon OSInline']") private WebElement menuBtn;
	public WebElement getMenuBtn() {
		return menuBtn;
	}
	public WebElement getLogout() {
		return logout;
	}
	public WebElement getSignoutCancel() {
		return signoutCancel;
	}
	public void setSignoutCancel(WebElement signoutCancel) {
		this.signoutCancel = signoutCancel;
	}
	public WebElement getProfile() {
		return profile;
	}
	public WebElement getSignout() {
		return signout;
	}
	public WebElement getSignoutyes() {
		return signoutyes;
	}
	public WebElement getEmsg() {
		return emsg;
	}
	public WebElement getDashboard() {
		return dashboard;
	}
	public WebElement getXlogo() {
		return xlogo;
	}
	public WebElement getEyeicon() {
		return eyeicon;
	}
	public WebElement getTiaLogo() {
		return tiaLogo;
	}
	public WebElement getUsrnameLabel() {
		return usrnameLabel;
	}
	public WebElement getPassLabel() {
		return passLabel;
	}
	public WebElement getUsrnmeTextbox() {
		return usrnmeTextbox;
	}
	public WebElement getPassTextBox() {
		return passTextBox;
	}
	public WebElement getButtonLogin() {
		return buttonLogin;
	}
	public WebElement getCntWtTia() {
		return cntWtTia;
	}
	public WebElement getTanLink() {
		return tanLink;
	}

	@FindBy(xpath="//button[contains(text(),'Login')]") private WebElement buttonLogin;
	@FindBy(xpath="//span[contains(text(),'Connect with TiA')]") private WebElement cntWtTia;
	@FindBy(xpath="//span[contains(text(),'https://tangentia.com/')]") private WebElement tanLink;

}
