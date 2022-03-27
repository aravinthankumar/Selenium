package selenium.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Question2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement clkText = driver.findElement(By.xpath("//span[@title='Trainer']"));
		clkText.click();
		
		WebElement down = driver.findElement(By.id("home-tab"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true)", down);
        		
		WebElement txtPrint = driver.findElement(By.xpath("//p[text()='He has 12+ years of total IT experienc"
				+ "e. Out of this, 10+ years in Selenium and QA Services working on various "
				+ "tools and techniques. In the last 10 years, Velmurugan have trained and place"
				+ "d 5000+ students in Selenium and supported many o"
				+ "f his students to switch from non-technical field to technical field. ']"));
	
		String text = txtPrint.getText();
        System.out.println(text);
	
	}

}
