package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenericUtilities;

public class HomePage {
	
	//declaration
	@FindBy(linkText = "Calendar")
	private WebElement calenderLink;
	
	@FindBy(linkText = "Leads")
	private WebElement leadsLink;
	
	@FindBy(linkText = "Organizations")
	private WebElement organizationLink;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactsLink;
	
	@FindBy(xpath = "/html/body/table[1]/tbody/tr/td[3]/table/tbody/tr/td[2]/img")
	private WebElement adminIcon;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;
	
	//Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void clickCalenderLink() {
		calenderLink.click();
	}
	
	public void clickLeadsLink() {
		leadsLink.click();
	}
	
	public void clickOrganizationLink() {
		organizationLink.click();
	}
	
	public void clickContactsLink() {
		contactsLink.click();
	}
	
	public void signout(WebDriver driver) {
		GenericUtilities gu = new GenericUtilities();
		gu.mouseHoverOn(driver, adminIcon);
		signOutLink.click();
	}

}
