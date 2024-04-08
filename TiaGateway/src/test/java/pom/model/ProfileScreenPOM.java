package pom.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import program.utility.BaseUtility;

public class ProfileScreenPOM extends BaseUtility {
	
	public ProfileScreenPOM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[@class='OSFillParent'])[1]") private WebElement account;
	@FindBy(xpath="//input[@placeholder='Enter your username or email']") private WebElement usrnmeTextbox;
	@FindBy(xpath="//input[@placeholder='Enter your Password']") private WebElement passTextBox;
	@FindBy(xpath="//button[contains(text(),'Login')]") private WebElement buttonLogin;
	@FindBy(xpath="//span[contains(text(),'Profile')]")private WebElement profile;
	@FindBy(xpath="//span[contains(text(),'User Profile')]") private WebElement userProfile;
	@FindBy(xpath="//i[@class='icon fa fa-times fa-2x']") private WebElement closeXbutton;
	@FindBy(xpath="//span[contains(text(),'CONTACT INFORMATION')]")private WebElement contactInfo;
	@FindBy(xpath="(//span[@class='ThemeGrid_MarginGutter'])[1]")private WebElement userEmail;
	@FindBy(xpath="//span[contains(text(),'About')]")private WebElement about;
	@FindBy(xpath="//span[contains(text(),'Settings')]")private WebElement setting;
	@FindBy(xpath="//label[contains(text(),'© Tangentia Gateway. - ')]")private WebElement copyrightTangentiaLbl;
	@FindBy(xpath="//span[contains(text(),'Tangentia.com')]")private WebElement TangentiaLink;
	@FindBy(xpath = "//span[contains(text(),' Dashboard')]")private WebElement dashboard;
	public WebElement getDashboard() {
		return dashboard;
	}
	public WebElement getAccount() {
		return account;
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
	public WebElement getProfile() {
		return profile;
	}
	public WebElement getUserProfile() {
		return userProfile;
	}
	public WebElement getCloseXbutton() {
		return closeXbutton;
	}
	public WebElement getContactInfo() {
		return contactInfo;
	}
	public WebElement getUserEmail() {
		return userEmail;
	}
	public WebElement getAbout() {
		return about;
	}
	public WebElement getSetting() {
		return setting;
	}
	public WebElement getCopyrightTangentiaLbl() {
		return copyrightTangentiaLbl;
	}
	public WebElement getTangentiaLink() {
		return TangentiaLink;
	}

}
