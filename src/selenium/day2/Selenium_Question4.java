package selenium.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Question4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=Au"
				+ "thenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__="
				+ "&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement clkUserName = driver.findElement(By.name("DUMMY1"));
		clkUserName.click();
		
		WebElement txtUserName = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
		txtUserName.sendKeys("aravinthan@gmail.com");
		
		WebElement txtpassword = driver.findElement(By.name("AuthenticationFG.ACCESS_CODE"));
		txtpassword.sendKeys("7896541230");
	
	}

}
