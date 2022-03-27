package selenium.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Question13 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement txtNumber = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		txtNumber.sendKeys("6797971588");
		
		WebElement clkContinue = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		clkContinue.click();
		
		
		
	}

}
