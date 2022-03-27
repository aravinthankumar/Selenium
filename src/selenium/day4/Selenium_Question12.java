package selenium.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Question12 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement txtAnyProduct = driver.findElement(By.id("autocomplete"));
		txtAnyProduct.sendKeys("sony xperiya",Keys.ENTER);
		
		WebElement clkFirstProduct = driver.findElement(By.xpath("//h2[text()='Sony PS2 160GB HDD Consoles 1 Month Seller Warranty']"));
		clkFirstProduct.click();
	
	
	}

}
