package TestCase;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import PageObject.Enquiry_Page;
import PageObject.User_Profil_Page;
import Utilities.AssertCreation;
import Utilities.Browser_launch;

public class TC002_Add_Enquiry {

	public static String Buyerwindow;

	@Test

	void Add_enquiry() throws InterruptedException {

		Enquiry_Page add_enq = new Enquiry_Page(Browser_launch.driver);
		Thread.sleep(2000);

	//	Browser_launch.driver.navigate().refresh();

		Browser_launch.driver.navigate().to("https://printsmartz.signitydemo.in/buyer/enquiries");
		// add_enq.enq_lefsidemenu();
		Thread.sleep(2000);

		add_enq.add_enquiry();
		Thread.sleep(2000);

		String id = add_enq.Add_enq_details(); // Adding details in enquiry
		

		User_Profil_Page supplier_srch = new User_Profil_Page(Browser_launch.driver);
		supplier_srch.companyname("Pexpo Printing Automation");
		Thread.sleep(5000);

		String confirm = supplier_srch.supplier_select();
//		Assert.assertEquals(confirm, " Lieferant ausgewählt ");
//	
		SoftAssert softassert = new SoftAssert();
		
		softassert.assertEquals(confirm, " Lieferant ausgewählt ");
		Thread.sleep(5000);
		String title = supplier_srch.submit_enq();
		// Assert.assertEquals(title, c);
		softassert.assertEquals(title, "Anfragen");
		Thread.sleep(5000);
		
		String Buyerwindow = Browser_launch.driver.getWindowHandle();
		System.out.println("This is the Whandlesof Buyer" +Buyerwindow);
		
		//add_enq.logout();

	}

}
