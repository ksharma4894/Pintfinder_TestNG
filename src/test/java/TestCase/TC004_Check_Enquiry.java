package TestCase;

import java.util.Set;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObject.Enquiry_Page;
import Utilities.AssertCreation;
import Utilities.Browser_launch;
import Utilities.Page_Factory_Setup;

public class TC004_Check_Enquiry {
	AssertCreation softCreation = AssertCreation.getObject();
	SoftAssert softasr = softCreation.softasr;

	public static String SupplierWindow;

	@Test
	void View_enquiry() throws InterruptedException {

		Enquiry_Page enq = new Enquiry_Page(Browser_launch.driver);

		Thread.sleep(4000);
		Browser_launch.driver.navigate().to("https://printsmartz.signitydemo.in/supplier/enquiries");
		enq.search(Enquiry_Page.enquiryid.split(" ")[1]);
		Thread.sleep(3000);
		String titleCnfOrder = enq.create_offer("1234");

		softasr.assertEquals(titleCnfOrder, "Angebote");
		// enq.search();
		enq.offerId(Enquiry_Page.enquiryid.split(" ")[1]);

	//	System.out.println("Offer id in Test Case" +enq.priceId);

		SupplierWindow = Browser_launch.driver.getWindowHandle();

		Thread.sleep(2000);

		enq.Windowchange(TC002_Add_Enquiry.Buyerid); // For Change to buyer window
		AssertCreation assertCreation = AssertCreation.getObject();
		assertCreation.softasr.assertAll();

	}

}
