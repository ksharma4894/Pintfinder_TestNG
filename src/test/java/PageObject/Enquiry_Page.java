package PageObject;

import java.awt.Window;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import Utilities.Browser_launch;
import Utilities.Page_Factory_Setup;

public class Enquiry_Page extends Page_Factory_Setup {

	public static String enquiryid;

	public Enquiry_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@FindBy(xpath = "//a[@routerlink='/buyer/enquiries']")
	WebElement enquiry;
	@FindBy(xpath = "//a[text()='Neue Anfrage erstellen']")
	WebElement Add_enq;
	@FindBy(xpath = "//div[@class='col-md-6 etb-right']")
	WebElement enquiry_id;
	@FindBy(xpath = "//input[@placeholder ='Eingabe Projektname']")
	WebElement proj_name;
	@FindBy(xpath = "//ng-select[@ng-reflect-name='product']")
	WebElement prod_name;
	@FindBy(xpath = "//input[@placeholder='Auflage']")
	WebElement copies;
	@FindBy(xpath = "//button[text()='Lieferanten auswählen']")
	WebElement Srch_supplier;
	@FindBy(xpath = "//span[text()='Abmelden']")
	WebElement log_out;

	@FindBy(id = "currentSearch")
	WebElement srch_enq;

	@FindBy(xpath = "//span[text()='Anzeigen & Angebot erstellen']")
	WebElement offer;

	@FindBy(xpath = "//a[text()='Angebot erstellen']")
	WebElement create_offer;

	@FindBy(xpath = "//input[@formcontrolname='pricePerThousand']")
	WebElement addprice;
	@FindBy(xpath = "//button[text()='Angebot senden']")
	WebElement submit;
@FindBy(xpath = "//div[@class='ng-tns-c157-1 ng-star-inserted ng-trigger ng-trigger-flyInOut ngx-toastr toast-success']")
WebElement ordercnf;
	public void enq_lefsidemenu() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		enquiry.click();
	}

	public void add_enquiry() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Add_enq.click();
	}

	public String Add_enq_details() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(4000);
		String enqid = enquiry_id.getText();
		System.out.println("Below is enq id");
		System.out.println(enqid);
		enquiryid = enqid;

		proj_name.sendKeys("Checkinig with automation tool");
//		prod_name.click();
//		prod_name.sendKeys("Becher");
//		prod_name.sendKeys(Keys.ENTER);
		copies.sendKeys("234");
		Srch_supplier.click();
		return enqid;
	}

//	public void logout()
//
//	{
//		log_out.click();
//
//	}

	public void search(String enqid2) {

		srch_enq.sendKeys(enqid2);
		srch_enq.sendKeys((Keys.ENTER));
		// js.executeScript("window.scrollBy(300, 0);");
	}

	public String create_offer(String price) throws InterruptedException {
		offer.click();
		create_offer.click();
		addprice.sendKeys(price);
		submit.click();
		Thread.sleep(4000);
		return driver.getTitle();
		

	}
	public String BuyerWindow() {
		String Buyerwindow = Browser_launch.driver.getWindowHandle();
		System.out.println("This is the Whandlesof Buyer" +Buyerwindow);
		return Buyerwindow;
		
	}


	public void Windowchange(String windowId) {

		Set<String> allWindowHandles = Browser_launch.driver.getWindowHandles();

		for (String handle : allWindowHandles) {
			// Here you can check for the desired window handle
			if (handle.equals(windowId)) {
				Browser_launch.driver.switchTo().window(handle);
				break;

			}
		}
	}


}
