import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseOne {
	WebDriver driver;

	@Test
	public void Test_Case1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/mohammedacherkiy/Downloads/chromedriver");
		driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("http:/www.linkedin.com");
		Thread.sleep(5000);
		System.out.println("before");
		driver.findElement(By.cssSelector(".link-forgot-password")).click();

		// driver.findElement(By.id("u_0_s")).sendKeys("testTest");

	}

	@Test

	public void close() {
		driver.quit();
	}

}
