package TestCase;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObject.Login_Page;
import Utilities.AssertCreation;
import Utilities.Browser_launch;

public class TC003_Login_Supplier {

	@Test
	void Supplier_Login() throws InterruptedException {
		Thread.sleep(5000);
		Browser_launch.getInstance().driver.switchTo().newWindow(WindowType.WINDOW);
		Browser_launch.getInstance().driver.navigate().to("https://printsmartz.signitydemo.in");
		System.out.println("Stating new window");
		Browser_launch.getInstance();

		Login_Page l_page = new Login_Page(Browser_launch.driver);
		Thread.sleep(2000);
		// Browser_launch.driver.navigate().to("https://printsmartz.signitydemo.in");
		Thread.sleep(4000);
		l_page.Enter_email("karmranahmad1223@yopmail.com");
		l_page.enter_password("Test@123");
		l_page.submit();
		AssertCreation assertCreation = AssertCreation.getObject();
		assertCreation.softasr.assertAll();

	}
}
