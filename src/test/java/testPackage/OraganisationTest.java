package testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class OraganisationTest extends BaseClass{
	
	@Test
	public void createOrganisation() {
		
		hp.clickOrganizationLink();
		op.clickCreateOrganizationIcon();
		op.enterOrganizationName("Renai Medicity");
		op.enterNumberOfEmployees("100");
		op.selectIndustry("Healthcare");
		op.selectIndustryType("Investor");
		op.enterPhoneNumber("7890234516");
		op.enterEmail("renai@gmail.com");
		op.clickSaveButton();
		
		
	}

}
