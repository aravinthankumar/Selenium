package selenium.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Question5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement fr1 = driver.findElement(By.xpath("//frame[@marginheight='0']"));
		driver.switchTo().frame(fr1);
		
		
		WebElement txtUserId = driver.findElement(By.xpath("//input[@class='form-control text-muted']"));
		txtUserId.sendKeys("12345");
		
		driver.switchTo().defaultContent();
		
	}
	

}
