package selenium.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Question11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?service=acc"
				+ "ountsettings&continue=https%3A%2F%2Fmyaccount.google.com%2F%"
				+ "3Futm_source%3Dsign_in_no_continue%26pli%3D1%26nlr%3D1&ec=GA"
				+ "lAwAE&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement clkCreateAccount = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
		clkCreateAccount.click();
		
		WebElement clkForMyChild = driver.findElement(By.xpath("(//span[@jsname='K4r5Ff'])[1]"));
		clkForMyChild.click();
		
        WebElement txtFirstName = driver.findElement(By.name("firstName"));
        txtFirstName.sendKeys("Aravinthan");
		
        WebElement txtLastName = driver.findElement(By.name("lastName"));
        txtLastName.sendKeys("Arunachalam");
		
        WebElement txtUserName = driver.findElement(By.name("Username"));
        txtUserName.sendKeys("1aravinthan11@gmail.com");
		
        WebElement txtPassWord = driver.findElement(By.name("Passwd"));
        txtPassWord.sendKeys("Aravinthan@123");
		
        WebElement txtConfirmPassWord = driver.findElement(By.name("ConfirmPasswd"));
        txtConfirmPassWord.sendKeys("Aravinthan@123");
        
        WebElement clkShowPassword = driver.findElement(By.xpath("(//input[@jsname='YPqjbf'])[6]"));
        clkShowPassword.click();
        
        WebElement clkNext1 = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
        clkNext1.click();
        
        WebElement chooseCountry = driver.findElement(By.xpath("//div[@role='combobox']"));
        chooseCountry.click();
        
        WebElement txtCountryAndEnter = driver.findElement(By.xpath("//div[@role='combobox']"));
        txtCountryAndEnter.sendKeys("india",Keys.ENTER);
        Thread.sleep(2000);
        
        WebElement txxPhoneNumber = driver.findElement(By.id("phoneNumberId"));
        txxPhoneNumber.sendKeys("9342233587");
        
        WebElement clkNext2 = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
        clkNext2.click();
        
        
        Thread.sleep(40000);
        
        
        
        
        
        WebElement clkNext3 = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
        clkNext3.click();
        
    
        WebElement txtRecoveryEmail = driver.findElement(By.name("recoveryEmail"));
        txtRecoveryEmail.sendKeys("aravinthankumara@gmail.com");
        
        WebElement txtDat = driver.findElement(By.name("day"));
        txtDat.sendKeys("25");
        
        WebElement selectMonth = driver.findElement(By.id
        		("month"));
        Select s = new Select(selectMonth);
        s.selectByVisibleText("April");
        
        WebElement txtYear = driver.findElement(By.name("year"));
        txtYear.sendKeys("1999");
        
        WebElement selectGender = driver.findElement(By.id("gender"));
        Select g = new Select(selectGender);
        g.selectByVisibleText("Male");
        
        WebElement clkNext4 = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
        clkNext4.click();
        Thread.sleep(5000);
        
        WebElement clkNext5 = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
        clkNext5.click();
        
        WebElement scrollDown = driver.findElement(By.xpath("//span[text()='More options']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(false)", scrollDown);
        
        Thread.sleep(5000);

        
        WebElement clkCancel = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[3]"));
        clkCancel.click();
			
			
			
        
		
		
		
	}

}
