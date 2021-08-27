package chromeLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chrome {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Appu Abi\\eclipse-workspace\\SeleniumTesting\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get(" http://greenstech.in/selenium-course-content.html");
	
	driver.manage().window().maximize();
	
	Actions a = new Actions(driver);
	
	WebElement course = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
	
	a.moveToElement(course).perform();
	
	Thread.sleep(2000);
	
	WebElement softwareTesting = driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
	
	a.moveToElement(softwareTesting).perform();
	
	Thread.sleep(2000);
	
	WebElement seleniumTraning = driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
	
	a.moveToElement(seleniumTraning).perform();
	
	seleniumTraning.click();


 
}
}


