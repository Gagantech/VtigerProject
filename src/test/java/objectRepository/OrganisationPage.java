package objectRepository;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GenericUtilities;

public class OrganisationPage {

	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createOrganizationIcon;
	
	@FindBy(name = "accountname")
	private WebElement organizationName;
	
	@FindBy(id = "employees")
	private WebElement employeesTextField;
	
	@FindBy(name = "industry")
	private WebElement industryDropdown;
	
	@FindBy(name = "accounttype")
	private WebElement industryType;
	
	@FindBy(id = "email1")
	private WebElement emailTextField;
	
	@FindBy(id = "phone")
	private WebElement phoneTextField;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;
	
	@FindBy(xpath = "(//input[@title='Cancel [Alt+X]'])[1]")
	private WebElement cancelButton;
	
	public OrganisationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickCreateOrganizationIcon() {
		createOrganizationIcon.click();
	}
	
	public void enterOrganizationName(String text) {
		organizationName.sendKeys(text);
	}
	
	public void enterNumberOfEmployees(String text) {
		employeesTextField.sendKeys(text);
	}
	
	public void selectIndustry(String text) {
		GenericUtilities gu = new GenericUtilities();
		gu.selectOptionByVisibleText(industryDropdown, text);
	}
	
	public void selectIndustryType(String text) {
		GenericUtilities gu = new GenericUtilities();
		gu.selectOptionByVisibleText(industryType, text);
	}
	
	public void enterEmail(String email) {
		emailTextField.sendKeys(email);
	}
	
	public void enterPhoneNumber(String number) {
		phoneTextField.sendKeys(number);
	}
	
	public void clickSaveButton() {
		saveButton.click();
	}
	
	public void clickCancelButton() {
		cancelButton.click();
	}
	
}


