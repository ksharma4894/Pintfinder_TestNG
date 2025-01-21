package TestCase;

import java.util.Set;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObject.Enquiry_Page;
import Utilities.AssertCreation;
import Utilities.Browser_launch;

public class TC004_Check_Enquiry {
	AssertCreation softCreation = AssertCreation.getObject();
	SoftAssert softasr = softCreation.softasr;

	@Test
	void View_enquiry() throws InterruptedException {
		Enquiry_Page enq = new Enquiry_Page(Browser_launch.driver);
		Thread.sleep(4000);
		Browser_launch.driver.navigate().to("https://printsmartz.signitydemo.in/supplier/enquiries");
		enq.search(Enquiry_Page.enquiryid.split(" ")[1]);
		String titleCnfOrder = enq.create_offer("1234");

		softasr.assertEquals(titleCnfOrder, "Angebote");

		String SupplierWindow = Browser_launch.driver.getWindowHandle();
		System.out.println(SupplierWindow);

		Thread.sleep(2000);
		Browser_launch.driver.switchTo().window(TC002_Add_Enquiry.Buyerwindow);
		System.out.println(TC002_Add_Enquiry.Buyerwindow);

//		Set<String> winhandles = Browser_launch.driver.getWindowHandles();
//		System.out.println(winhandles);

		// enq.logout();

	}

}
