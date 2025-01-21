package Utilities;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_launch {

	public static WebDriver driver;
	private static Browser_launch Browser_launch;

	private Browser_launch() {
	}

	public static Browser_launch getInstance() {
		if (null == Browser_launch) {
			Browser_launch = new Browser_launch();
			WebDriverManager.chromedriver().setup();
			// Initialize WebDriver
			driver = new ChromeDriver();
			// Configure browser settings
			driver.manage().window().maximize();
			// driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			// Navigate to the desired URL
			driver.navigate().to("https://printsmartz.signitydemo.in/");
		}
		return Browser_launch;
	}

	@Test
	public void browser() {

		try {
			Browser_launch.getInstance();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to initialize browser in @BeforeClass", e);
		}
	}
	

//	@AfterClass
//	public void teardown() {
//		// Close the browser after the test
//		if (driver != null) {
//			driver.quit();
//		}
//	}
}
