package selenium.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Question12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement moveToSignin = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		Actions a = new  Actions(driver);
		a.moveToElement(moveToSignin).perform();
		
		WebElement clkRegester = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		clkRegester.click();
		
         WebElement fr1 = driver.findElement(By.xpath("//li[@class='footerSubCategory']"));		
         driver.switchTo().frame(fr1);
		
		WebElement txtPhoneNum1 = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		txtPhoneNum1.sendKeys("7938916981");
		
		driver.switchTo().defaultContent();
		
		WebElement clkContinue = driver.findElement(By.id("checkUser"));
		clkContinue.click();
		
	}

}
