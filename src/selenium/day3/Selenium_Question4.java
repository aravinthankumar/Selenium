package selenium.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Question4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://toolsqa.com/selenium-training?q=headers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement clkGoToRegester = driver.findElement(By.xpath("//a[@class='btn btn-primary-shadow btn-block']"));
		clkGoToRegester.click();
		
		WebElement clkClosePopUp = driver.findElement(By.xpath("//button[@aria-label='Close modal']"));
		clkClosePopUp.click();
		
		WebElement scrollUp = driver.findElement(By.id("first-name"));
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(false)", scrollUp);
		
		WebElement txtFirstName = driver.findElement(By.id("first-name"));
		txtFirstName.sendKeys("Aravinthan");
		
		WebElement txtLastName = driver.findElement(By.id("last-name"));
		txtLastName.sendKeys("Arunachalam");
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("aravinthan@gmail.com");
		
		WebElement txtMobile = driver.findElement(By.id("mobile"));
		txtMobile.sendKeys("79565665555");
		
		WebElement selectCountry = driver.findElement(By.id("country"));
		Select a = new Select(selectCountry);
		a.selectByVisibleText("India");
		
		WebElement txtCity = driver.findElement(By.id("city"));
		txtCity.sendKeys("Villupuram");
		
		WebElement txtMessage = driver.findElement(By.name("message"));
		txtMessage.sendKeys("iam doing in java ,selenium course");
		
		WebElement clksend = driver.findElement(By.xpath("//button[text()='Send']"));
		clksend.click();
		
		
	}

}
