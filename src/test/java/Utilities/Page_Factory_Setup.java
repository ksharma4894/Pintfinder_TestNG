package Utilities;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import TestCase.TC002_Add_Enquiry;

public class Page_Factory_Setup {

	public WebDriver driver;
	public Actions act;
	public JavascriptExecutor js;

	public Page_Factory_Setup(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
		js = (JavascriptExecutor) driver;

	}


}
