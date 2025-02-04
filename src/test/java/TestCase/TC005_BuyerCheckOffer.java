package TestCase;

import org.testng.annotations.Test;

import PageObject.Enquiry_Page;
import PageObject.Offer_Page;
import Utilities.Browser_launch;

public class TC005_BuyerCheckOffer {

	@Test()

	void View_Offer() throws Exception {

		Browser_launch.driver.navigate().to("https://printsmartz.signitydemo.in/buyer/offers");
		Enquiry_Page enpage = new Enquiry_Page(Browser_launch.driver);
		// enpage.search(Enquiry_Page.enquiryid.split(" ")[1]);
		enpage.search(Enquiry_Page.priceId);

		Offer_Page OfferPage = new Offer_Page(Browser_launch.driver);

		OfferPage.viewOffer();
		enpage.Windowchange(TC004_Check_Enquiry.SupplierWindow);

	}

}
