package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Page_Factory_Setup;

public class Order_Page extends Page_Factory_Setup {

	public Order_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[text()='Bestelleingang bestätigen']")
	WebElement ordeconfirm;

	public void conf_order()
	{
		
		ordeconfirm.click();
	}
	
	
}
