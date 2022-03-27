package selenium.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Question9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement clkCancelBtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clkCancelBtn.click();
		
		WebElement clkLoginBtn = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		clkLoginBtn.click();
		
		WebElement txtUserName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtUserName.sendKeys("aravithan@gmail.com");
		
		WebElement txtPassword = driver.findElement(By.xpath("(//input[@type='password'])"));
		txtPassword.sendKeys("789654123");
		
		WebElement clkLogin = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clkLogin.click();
		
		
	}

}
