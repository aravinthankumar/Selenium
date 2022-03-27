package selenium.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Question11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement clkCancel = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clkCancel.click();
		
		WebElement clkLoginBtn = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		clkLoginBtn.click();
		
		WebElement txtUserName = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		txtUserName.sendKeys("aravinthan@gmail.com");
		String attribute = txtUserName.getAttribute("value");
		System.out.println(attribute);
		
		WebElement txtPassword = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		txtPassword.sendKeys("79652302");
		String attribute1 = txtPassword.getAttribute("value");
		System.out.println(attribute1);
		
		
	
	}

}
