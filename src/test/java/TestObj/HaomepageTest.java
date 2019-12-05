package TestObj;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.Basepage;
import Automation.Homepage;

public class HaomepageTest {

	Homepage hp;
	Basepage bp;

	public HaomepageTest() {
		hp = new Homepage();
		bp = new Basepage();
	}

	@Test(priority = 1)
	public void verifyWomentext() {
		Assert.assertTrue(hp.getwomen().isDisplayed());
		hp.getwomen().click();
		Assert.assertTrue(bp.elementFound(hp.getnewwomen()));
	}

	@Test(priority = 2)
	public void verifyDressText() {
		Assert.assertTrue(hp.getdress().isDisplayed());
		hp.getdress().click();

	}

	@Test(priority = 3)
	public void navigate() {
		Assert.assertTrue(bp.elementFound(hp.getdr()));
		Assert.assertTrue(bp.elementFound(hp.getsmall()));
		Assert.assertTrue(bp.elementFound(hp.getmedium()));
		Assert.assertTrue(bp.elementFound(hp.getlarge()));

	}

	@Test(priority = 4)
	public void verifyTshirt() {
		Assert.assertTrue(hp.getTshirt().isDisplayed());
		hp.getTshirt().click();
		Assert.assertTrue(bp.elementFound(hp.getnewtshirt()));
	}

	@Test(priority = 5)
	public void verifyProduct() {
		Assert.assertTrue(hp.getProductnumber() == hp.getproductcount(), "Failed");

	}

	@AfterClass
	public void close() {
		bp.driver.close();
	}

	@Test(priority = 6)
	public void verifysearch() {
		hp.search().sendKeys("Dresses" + Keys.ENTER);
		// hp.submit().click();
		Assert.assertTrue(bp.elementFound(hp.shows()));

	}

}
