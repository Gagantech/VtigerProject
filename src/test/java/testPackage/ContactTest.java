package testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class ContactTest extends BaseClass {
	
	
	@Test(dataProvider = "dataBaseContactDetails", dataProviderClass = DataSupply.class)
	public void createContact(String salutation, String firstName, String lastname, String leadsrc,
			String title, String department, String email, String mobNo) {
		hp.clickContactsLink();
		cp.clickCreateContactIcon();
		cp.selectSalutation(salutation);
		cp.enterFirstName(firstName);
		cp.enterLastName(lastname);
		cp.selectLeadSrc(leadsrc);
		cp.enterTitle(title);
		cp.enterDepartment(department);
		cp.enterEmail(email);
		cp.enterMobileNumber(mobNo);
		cp.clickSaveButton();
		
	}

}
