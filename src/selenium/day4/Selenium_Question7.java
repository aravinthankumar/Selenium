package selenium.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Question7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement txtgreensVal = driver.findElement(By.name("q"));
		txtgreensVal.sendKeys("greens velmurugan",Keys.ENTER);
		
		WebElement clkFirstLink = driver.findElement(By.xpath("//h3[text()='Velmurugan K - Technical Manager - GTL Limited | LinkedIn']"));
		clkFirstLink.click();
		
	}

}
