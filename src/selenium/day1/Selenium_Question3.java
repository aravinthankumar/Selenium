package selenium.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Question3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://www.greenstechnologys.com/");
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.get("http://www.greenstechnologys.com/");
		driver.get("http://greenstech.in/selenium-course-content.html");
	}

}
