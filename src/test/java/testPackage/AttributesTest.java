package testPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class AttributesTest extends BaseClass{
	
	@Test(groups = "smoke")
	public void moveToCalenderPage()
	{
		hp.clickCalenderLink();
		System.out.println("smoke 1");
		
		
	}
	
	
	@Test(groups = "integration")
	public void moveToLeadsPage() throws InterruptedException
	{
		
		hp.clickLeadsLink();
		System.out.println("integration 1");
		
	}
	
	
	@Test(groups = "integration")
	public void moveToOrganisationPage()
	{
		hp.clickOrganizationLink();
		System.out.println("integration 2");
	}
	
	@Test(groups = "adhoc")
	public void moveToContactsPage()
	{
		hp.clickContactsLink();
		System.out.println("adhoc 1");
	}
	
	@Test(groups = "adhoc")
	public void moveToContactsPage1()
	{
		hp.clickContactsLink();
		System.out.println("adhoc 2");
	}
	

}
