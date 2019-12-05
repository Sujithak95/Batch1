package Automation;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Basepage {

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement Women;
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement Dress;
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img")
	private WebElement newdr;
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
	private WebElement small;
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a")
	private WebElement medium;
	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a")
	private WebElement large;
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement Tshirt;
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[4]/div/div[1]/div/a[1]/img")
	private WebElement newwomen;
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
	private WebElement newtshirt;
	@FindBy(xpath="//*[@class='heading-counter']")
	private WebElement txtheader;
    @FindBys(@FindBy(xpath="//*[@class='product_list grid row']"))
    private List<WebElement> listproducts;
    @FindBy(id="search_query_top")
    private WebElement search;
    //@FindBy(name="submit_search")
    //private WebElement submit;
    @FindBy(xpath="//*[@class=\"display-title\"]")
    private WebElement show;

	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getwomen() {
		return Women;
	}

	public WebElement getTshirt() {
		return Tshirt;
	}

	public WebElement getnewwomen() {
		return newwomen;
	}


	public WebElement getdress() {
		return Dress;
	}
	public WebElement getdr() {
		return newdr;
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
	public WebElement getnewtshirt() {
		return newtshirt;
	}

	public int getProductnumber()
	{
	String text=txtheader.getText();
	String[] arr=text.split(" ");
	String value=arr[2];
	int num=Integer.parseInt(value);
		return num;				
		//return Integer.parseInt(txtheader.getText().split(" ")[2]);
		}
	
	public int getproductcount() {
		return listproducts.size();
	}
	public WebElement search()

	{
		return search;
		}
//	public WebElement submit() {
//		return submit;
//	}
	public WebElement shows()
	{
		return show;
	}

	}