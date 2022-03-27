package selenium.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Question8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("aravinthan@gmail.com");
		String attribute = txtUserName.getAttribute("value");
        System.out.println(attribute);
        
        WebElement txtpassword = driver.findElement(By.id("password"));
        txtpassword.sendKeys("789654120");
		String attribute1 = txtpassword.getAttribute("value");
        System.out.println(attribute1);
        
        
        
        
	}

}
