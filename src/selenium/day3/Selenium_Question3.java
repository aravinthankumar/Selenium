package selenium.day3;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Question3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement txtFirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtFirstName.sendKeys("Aravinthan");
		
		WebElement txtLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtLastName.sendKeys("Arunachalam");
		
		
		WebElement txtAdress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		txtAdress.sendKeys("no:4/73,nattar street ,mazhavanthangal");
		
		WebElement txtEmail = driver.findElement(By.xpath("//input[@type='email']"));
		txtEmail.sendKeys("aravinthan@gmail.com");
		
		WebElement txtPhoneNum = driver.findElement(By.xpath("//input[@type='tel']"));
		txtPhoneNum.sendKeys("894556414");
		
		WebElement clkGenderBtn = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		clkGenderBtn.click();
		
		WebElement clkHobbiesBtn = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		clkHobbiesBtn.click();
		
		WebElement txtLanguage = driver.findElement(By.id("msdd"));
		txtLanguage.click();
		
		WebElement clkLanguage = driver.findElement(By.xpath("(//a[@style='text-decoration:none'])[8]"));
		clkLanguage.click();
		
		//skill
		WebElement selectSkills = driver.findElement(By.xpath("(//select[@type='text'])[1]"));
		Select s = new Select(selectSkills);
		s.selectByVisibleText("Java");
		
		
		
		//country
		WebElement selectCountry = driver.findElement(By.xpath("(//span[@aria-haspopup='true'])"));
		selectCountry.click();
		
		WebElement clkIndia = driver.findElement(By.xpath("//li[text()='India']"));
		clkIndia.click();
		
		
		WebElement selectYear = driver.findElement(By.xpath("(//select[@ng-model='yearbox'])"));
		Select b = new Select(selectYear);
		b.selectByVisibleText("1999");
		
		WebElement selectMonth = driver.findElement(By.xpath("(//select[@ng-model='monthbox'])"));
		Select c = new Select(selectMonth);
		c.selectByVisibleText("April");
		
		WebElement selectDay = driver.findElement(By.xpath("(//select[@ng-model='daybox'])"));
		Select d = new Select(selectDay);
		d.selectByVisibleText("25");
		
		WebElement txtpassword = driver.findElement(By.id("firstpassword"));
		txtpassword.sendKeys("aravinth123");
		
		WebElement txtConfirmpassword = driver.findElement(By.id("secondpassword"));
		txtConfirmpassword.sendKeys("aravinth123");
		
		WebElement clksubmitbtn = driver.findElement(By.id("submitbtn"));
		clksubmitbtn.click();
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
