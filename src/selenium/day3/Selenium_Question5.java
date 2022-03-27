package selenium.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Question5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement scrollDown = driver.findElement(By.xpath("//li[text()='Introduction to Java']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
        
        WebElement clkInterviewQues = driver.findElement(By.id("heading20"));
        clkInterviewQues.click();
        
        WebElement clkCtsQuestion = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
        clkCtsQuestion.click();
        
        
		
	}

}
