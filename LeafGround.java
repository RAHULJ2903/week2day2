package week2day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import  java.time.Duration;
public class LeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait( Duration .ofSeconds(10));
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		//1. Fill a TextBox
		WebElement eMailBox = driver.findElement(By.id("email"));
		eMailBox.sendKeys("j.rahul2903@gmail.com");
		
		//2. Append a Text Box
		WebElement appendWordBox = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		appendWordBox.sendKeys("If you see this, this is Appended!");
		
		//3. Retrieve a TextBox Data
		 WebElement textBox = driver.findElement(By.name("username"));
		String text = textBox.getAttribute("value");
		System.out.println(text);
		
		//4. Clear a TextBox Data
		WebElement clearTextBox = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		clearTextBox.clear(); 
		
		//5. DisableStatus Check.
		WebElement disableBox = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		boolean disableStatus = disableBox.isEnabled();
		System.out.println(disableStatus);
		
		

	}

}
