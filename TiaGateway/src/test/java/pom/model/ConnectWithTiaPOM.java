package pom.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import program.utility.BaseUtility;

public class ConnectWithTiaPOM extends BaseUtility {
	
	public ConnectWithTiaPOM() {
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//img[@src='/TIA/img/TIA.TiALOGO2_2x.png?HMdjTBkksos4mqw+y1G1yw']")private WebElement tiaLogo;	
@FindBy(xpath="//i[@class='icon fa fa-times fa-1x']")private WebElement closeX;	
@FindBy(xpath="//span[contains(text(),'First Name')]")private WebElement fNameLbl;	
@FindBy(xpath="//span[contains(text(),'Last Name')]")private WebElement lNamelbl;	
@FindBy(xpath="//span[contains(text(),'Phone')]")private WebElement pNlbl;	
@FindBy(xpath="//span[contains(text(),'Email')]")private WebElement emaillbl1;
@FindBy(xpath="//span[contains(text(),'Company')]")private WebElement companylbl1;
@FindBy(xpath="//span[contains(text(),'Requirements')]")private WebElement reqLbl;
@FindBy(xpath="//span[contains(text(),'Country')]")private WebElement countryLbl1;
@FindBy(xpath="//span[contains(text(),'Your message to TiA team:')]")private WebElement feedLbl1;
@FindBy(xpath="//input[@placeholder='First Name']")private WebElement fNametxtBox1;
@FindBy(xpath="//input[@placeholder='Last Name']")private WebElement lNametxtBox1;
@FindBy(xpath="//input[@placeholder='Phone Number']")private WebElement pNumtextBox;
@FindBy(xpath="//input[@placeholder='Email']")private WebElement emailtxtBox;
@FindBy(xpath="//input[@placeholder='Company']")private WebElement companyTextBox;
@FindBy(xpath="//select[@id='Dropdown1']")private WebElement reqDropDown;
@FindBy(xpath="//input[@placeholder='Country']")private WebElement countryTextBox;
@FindBy(xpath="//textarea[@id='TextArea_message']")private WebElement messageTextBox;
@FindBy(xpath="//button[contains(text(),'Submit Details')]")private WebElement submitBtn;
@FindBy(xpath="//button[contains(text(),'Clear')]")private WebElement clearBtn;
@FindBy(xpath="//span[contains(text(),'Connect with TiA')]") private WebElement cntWtTia;
public WebElement getCntWtTia() {
	return cntWtTia;
}
public WebElement getTiaLogo() {
	return tiaLogo;
}
public WebElement getCloseX() {
	return closeX;
}
public WebElement getfNameLbl() {
	return fNameLbl;
}
public WebElement getlNamelbl() {
	return lNamelbl;
}
public WebElement getpNlbl() {
	return pNlbl;
}
public WebElement getEmaillbl1() {
	return emaillbl1;
}
public WebElement getCompanylbl1() {
	return companylbl1;
}
public WebElement getReqLbl() {
	return reqLbl;
}
public WebElement getCountryLbl1() {
	return countryLbl1;
}
public WebElement getFeedLbl1() {
	return feedLbl1;
}
public WebElement getfNametxtBox1() {
	return fNametxtBox1;
}
public WebElement getlNametxtBox1() {
	return lNametxtBox1;
}
public WebElement getpNumtextBox() {
	return pNumtextBox;
}
public WebElement getEmailtxtBox() {
	return emailtxtBox;
}
public WebElement getCompanyTextBox() {
	return companyTextBox;
}
public WebElement getReqDropDown() {
	return reqDropDown;
}
public WebElement getCountryTextBox() {
	return countryTextBox;
}
public WebElement getMessageTextBox() {
	return messageTextBox;
}
public WebElement getSubmitBtn() {
	return submitBtn;
}
public WebElement getClearBtn() {
	return clearBtn;
}

}
