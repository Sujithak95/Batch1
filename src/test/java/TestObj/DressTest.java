package TestObj;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.Basepage;
import Automation.Dresses;

public class DressTest {
	Dresses dr;
	Basepage bp;

	public DressTest() {
		dr = new Dresses();
		bp = new Basepage();
	}

@BeforeMethod
public void click() {
	 dr.getdress().click();
}

@Test(priority = 1)
public void verifyDressText() {
	Assert.assertTrue(dr.getdress().isDisplayed());

}

@AfterClass
public void close()
{
	bp.driver.close();
}
@Test(priority = 2)
public void navigate() {
	Assert.assertTrue(bp.elementFound(dr.getsmall()));
	Assert.assertTrue(bp.elementFound(dr.getlarge()));
	Assert.assertTrue(bp.elementFound(dr.getmedium()));

}

}
