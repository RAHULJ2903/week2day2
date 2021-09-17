package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	        ChromeDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("http://www.leafground.com/pages/Dropdown.html");
	        WebElement findElement = driver.findElement(By.id("dropdown1"));
	        
	        Select drop1=new Select(findElement);
	        drop1.selectByIndex(3);
	        driver.findElement(By.id("dropdown1"));


	}

}
