package selenium.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Question14 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		 WebElement clkSignin = driver.findElement(By.xpath("//a[text()='Sign up']"));
		 clkSignin.click();
		 
		 WebElement txtPhoneNum = driver.findElement(By.id("mobile"));
		 txtPhoneNum.sendKeys("758727012");
		 
		 WebElement txtName = driver.findElement(By.id("name"));
		 txtName.sendKeys("Aravinthan");
		 
		 WebElement txtEmail = driver.findElement(By.id("email"));
		 txtEmail.sendKeys("aravinthan@gmail.com");
		 
		 WebElement txtPasswoed = driver.findElement(By.id("password"));
		 txtPasswoed.sendKeys("78965413");
		 
		 WebElement clkContinue = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		 clkContinue.click();
		 
		
	}

}
