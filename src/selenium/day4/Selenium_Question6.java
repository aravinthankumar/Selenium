package selenium.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Question6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("aravinthan@gmail.com");
		String attribute2 = txtUserName.getAttribute("value");
		System.out.println(attribute2);
		
		
        WebElement txtPassword = driver.findElement(By.id("pass"));
        txtPassword.sendKeys("789541230");
        String attribute = txtPassword.getAttribute("value");
        System.out.println(attribute);
        
		
		
		
	}

}
