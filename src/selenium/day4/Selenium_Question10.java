package selenium.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Question10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement clkCancel = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clkCancel.click();
		
		WebElement txtProductName = driver.findElement(By.name("q"));
		txtProductName.sendKeys("sony Xperiya",Keys.ENTER);
		
		driver.navigate().refresh();
		
	}

}
