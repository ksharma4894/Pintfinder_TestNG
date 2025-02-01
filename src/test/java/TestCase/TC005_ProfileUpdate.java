package TestCase;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObject.User_Profil_Page;
import Utilities.AssertCreation;
import Utilities.Browser_launch;

public class TC005_ProfileUpdate {

	@Test(priority = 1)

	public void ProfileBuyer() {
		User_Profil_Page UserPage = new User_Profil_Page(Browser_launch.driver);
		System.out.println("I am in Tc05");
		Browser_launch.driver.navigate().to("https://printsmartz.signitydemo.in/buyer/profile");
		UserPage.BuyerPofileImage();

		AssertCreation assertCreation = AssertCreation.getObject();
		assertCreation.softasr.assertAll();

	}

}
