package selenium.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Question9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement txtProductName = driver.findElement(By.name("keyword"));
		txtProductName.sendKeys("sony xperia",Keys.ENTER);
		
		WebElement down = driver.findElement(By.xpath("//p[@title='hitage Sony Xperia LT29i Hayabusa  Neckband Wireless With Mic Headphones/Earphones Multicolor']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true)", down);
        		
		
		WebElement clkFirstProduct = driver.findElement(By.xpath("//p[@title='hitage Sony Xperia LT29i Hayabusa  Neckband Wireless With Mic Headphones/Earphones Multicolor']"));
		clkFirstProduct.click();
		String attribute = clkFirstProduct.getAttribute("value");
		System.out.println(attribute);
	
	
	}

}
