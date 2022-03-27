package selenium.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Question7 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.cleartrip.com/trains");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement txtFromStation = driver.findElement(By.id("from_station"));
	txtFromStation.sendKeys("villupuram");
	
	WebElement txtToStation = driver.findElement(By.id("to_station"));
	txtToStation.sendKeys("Chennai Beach (MSB)");
	
	WebElement selectTrainClass = driver.findElement(By.name("train[class]"));
    Select s = new Select(selectTrainClass);
    s.selectByVisibleText("AC First Class (1A)");
    
    WebElement txtDate = driver.findElement(By.name("depart_date"));
    txtDate.sendKeys("20/03/2022");
    
    WebElement selectAdults = driver.findElement(By.name("adults"));
    Select a = new Select(selectAdults);
    a.selectByVisibleText("3");
    
    WebElement selectchinds = driver.findElement(By.name("children"));
    Select b = new Select(selectchinds);
    b.selectByVisibleText("3");
    
    WebElement selectSeiorMan = driver.findElement(By.name("male_seniors"));
    Select c = new Select(selectSeiorMan);
    c.selectByVisibleText("1");
    
    WebElement selectSeiorMale = driver.findElement(By.name("female_seniors"));
    Select d = new Select(selectSeiorMale);
    d.selectByVisibleText("2");
    
    WebElement clkSearchTrain = driver.findElement(By.id("trainFormButton"));
    clkSearchTrain.click();
    



	
	
	
}

}
