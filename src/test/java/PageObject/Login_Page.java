package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Page_Factory_Setup;

public class Login_Page extends Page_Factory_Setup {

	public Login_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
	}

	@FindBy(id = "inputEmail4")
	WebElement email;
	@FindBy(id = "inputEmail5")
	WebElement pwd;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement login_btn;

	public void Enter_email(String email_login) {
		email.sendKeys(email_login);

	}

	public void enter_password(String passwrd) {

		pwd.sendKeys(passwrd);
	}

	public void submit() {

		login_btn.submit();
	}
}
