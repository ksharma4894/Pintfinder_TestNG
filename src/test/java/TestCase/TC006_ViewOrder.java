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
		enpage.search(Enquiry_Page.priceId);
		System.out.println("Orde id is -->"+Enquiry_Page.priceId);
		
	}
}
