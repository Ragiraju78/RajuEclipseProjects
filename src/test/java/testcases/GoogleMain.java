package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleMain {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // waits for the presence of elements for 10
																			// seconds

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q"))).sendKeys("Way 2 Automation");
		WebElement elm = driver.findElement(By.name("q"));
		elm.submit();
		Thread.sleep(1000);
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/ntp-app//div[1]/ntp-realbox//div/input"))).sendKeys("Way
		// 2 Automation");

		driver.quit();

	}

}
