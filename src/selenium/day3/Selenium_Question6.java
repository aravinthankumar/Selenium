package selenium.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Question6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement clkSignin = driver.findElement(By.id("sign-in-icon-down"));
		clkSignin.click();
		
		
		WebElement clkSigninLink = driver.findElement(By.id("signInLink"));
		clkSigninLink.click();
		
	    WebElement fr1 = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
	    driver.switchTo().frame(fr1);
	    
		
		WebElement txtMobileNum = driver.findElement(By.id("mobileNoInp"));
		txtMobileNum.sendKeys("78965412360");
		
		WebElement fr2 = driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']"));
		driver.switchTo().frame(fr2);
		
		
		WebElement clkIamNotRobot = driver.findElement(By.xpath("(//div[@class='recaptcha-checkbox-border'])"));
		clkIamNotRobot.click();
		
		Thread.sleep(25000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(fr1);
		
		WebElement clkGenerateOTP = driver.findElement(By.id("otp-container"));
		clkGenerateOTP.click();
		
	}

}
