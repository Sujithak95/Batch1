package Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses extends Basepage{
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement Dress;
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
	private WebElement small;
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a")
	private WebElement medium;
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a")
	private WebElement large;

		public Dresses() {
			PageFactory.initElements(driver, this);
		}

		public WebElement getdress() {
			return Dress;
		}

		public WebElement getsmall() {
			return small;
		}

		public WebElement getmedium() {
			return medium;
		}

		public WebElement getlarge() {
			return large;
		}		
		
		
	}


