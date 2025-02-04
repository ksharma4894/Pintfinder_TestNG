package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Page_Factory_Setup;

public class Offer_Page extends Page_Factory_Setup {

	public static String ordnum;

	public Offer_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[text()='Angebot anzeigen']")
	WebElement ViewOffer;
	@FindBy(xpath = "(//button[@class='btn btn-success br-8 ml-2 ng-star-inserted']")
	WebElement PlaceOrder;
	@FindBy(xpath = "//span[@id='jhi-delete-userProfile-heading']")
	WebElement confirmbutton;
	@FindBy(xpath = "//button[@class='btn custom-btn']")
	WebElement orderconfirm;
	@FindBy(xpath = "//button[text()='Bestellung aufgeben']")
	WebElement finalconfirm;
	@FindBy(xpath = "(//div[@style='cursor: pointer;'])[1]")
	WebElement odernum;

	public void viewOffer() throws InterruptedException {
		ViewOffer.click();
		Thread.sleep(2000);	
		PlaceOrder.click();
		Thread.sleep(2000);	
		confirmbutton.click();
		Thread.sleep(2000);	
		orderconfirm.click();
		Thread.sleep(2000);	
		finalconfirm.click();

	}

	public void ordernumber() {

		ordnum = odernum.getText();

	}

}
