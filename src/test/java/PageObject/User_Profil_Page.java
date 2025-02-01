package PageObject;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Page_Factory_Setup;

public class User_Profil_Page extends Page_Factory_Setup {

	public User_Profil_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@FindBy(xpath = "//input[@formcontrolname='company']")
	WebElement cmp_name;
	@FindBy(xpath = "//span[text()='Gesamtzahl der Lieferanten']")
	WebElement headingclick;
	@FindBy(xpath = "//button[text()='Lieferant auswählen '] ")
	WebElement slct_supplier;
	@FindBy(xpath = "//div[text()=' Lieferant ausgewählt ']")
	WebElement conf_sup; // confirmation after selecting supplier
	@FindBy(xpath = "//span[text()='Ausgewählte Lieferanten']")
	WebElement slctd_supplier;
	@FindBy(xpath = "//span[text()='Anfrage versenden']")
	WebElement sbmit_enq;

	@FindBy(xpath = "//li[1]//div[1]//div[2]//span[1]//i[1]")
	WebElement cameraclick;

	public void companyname(String cname) throws InterruptedException {
		cmp_name.sendKeys(cname);
		// act.sendKeys(Keys.ENTER);
		headingclick.click();

	}

	public String supplier_select() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		slct_supplier.click();
		String inf = conf_sup.getText(); // confirmation message displaying
		slctd_supplier.click();

		return inf;
	}

	public String submit_enq()

	{
		sbmit_enq.click();
		String title_enq = driver.getTitle();
		return title_enq;

	}

	public void BuyerPofileImage() {
		// String filepath = ";

		cameraclick.sendKeys("C:\\Users\\singity\\eclipse-workspace1\\PrintFinder_TestNG\\src\\test\\resources\\Screenshots\\Profile Image\\BuyerImage.jpg");	
		System.out.println("user.dir");
	}

}
