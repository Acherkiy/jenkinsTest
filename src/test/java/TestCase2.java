import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase2 {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("Before test");
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("After test");
	}

	@Test
	public void Test_Case1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/mohammedacherkiy/Downloads/chromedriver");
		driver = new ChromeDriver();
		Thread.sleep(7000);
		driver.get("http:/www.linkedin.com");
		Thread.sleep(7000);
		Thread.sleep(7000);
		driver.findElement(By.cssSelector(".link-forgot-password")).click();

		// driver.findElement(By.id("u_0_s")).sendKeys("testTest");

	}

	@Test

	public void close() {
		driver.quit();
		System.out.println("quitingDriver");
	}

}
