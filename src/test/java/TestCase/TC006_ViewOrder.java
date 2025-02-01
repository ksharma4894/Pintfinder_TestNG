package TestCase;

import org.testng.annotations.Test;

import PageObject.Enquiry_Page;
import PageObject.Offer_Page;
import Utilities.Browser_launch;

public class TC006_ViewOrder {
	
	
	@Test
	void CheckOder()

	{
		System.out.println("I am in Supplier window");
		Browser_launch.driver.navigate().to("https://printsmartz.signitydemo.in/supplier/orders");
		Enquiry_Page enpage = new Enquiry_Page(Browser_launch.driver);
		enpage.search(Offer_Page.ordnum);
		System.out.println("Orde id is -->"+Offer_Page.ordnum);
		
	}
}
