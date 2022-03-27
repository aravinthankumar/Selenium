package selenium.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Question2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("aravinthan@gmail.com");
		
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("516814068");
		
		WebElement clkloginBtn = driver.findElement(By.name("login"));
		clkloginBtn.click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
