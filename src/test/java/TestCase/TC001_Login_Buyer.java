package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageObject.Login_Page;
import Utilities.Browser_launch;

public class TC001_Login_Buyer {

	@Test
	void Buyer_Login() throws InterruptedException {
		Browser_launch.getInstance();
		Login_Page l_page = new Login_Page(Browser_launch.driver);
		l_page.Enter_email("anchalpardeshi123@yopmail.com");
		Thread.sleep(2000);
		l_page.enter_password("Test@123");
		Thread.sleep(2000);
		l_page.submit();
		Thread.sleep(5000);
		// Assert.assertEquals(driver.getTitle(), "Dashboard");

	}

}
