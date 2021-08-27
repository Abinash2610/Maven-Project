package chromeLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Appu Abi\\eclipse-workspace\\SeleniumTesting\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		Actions a =new Actions(driver);
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		close.click();
		
		WebElement home = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[6]"));
		
		a.moveToElement(home).perform();
		
		WebElement bathTovel = driver.findElement(By.xpath("//a[contains(text(),'Bath linen')]"));
		
		a.moveToElement(bathTovel).perform();
		
		bathTovel.click();
		
		
		WebElement tovel = driver.findElement(By.xpath("//a[contains(text(),'NezTech Cotton 500 GSM Hair Towel Set')]"));
		
		tovel.getText();
		
		
				
		
		
		
		
		
		
		
		
		
	}

}
