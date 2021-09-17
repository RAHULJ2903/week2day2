package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( Duration .ofSeconds(10));
        driver.get("https://en-gb.facebook.com/");
        driver.findElement(By.xpath("//form[@class='_9vtf']/div[5]/a")).click();
		driver.findElement(By.name("firstname")).sendKeys("RAHUL");
		driver.findElement(By.name("lastname")).sendKeys("J");
		driver.findElement(By.name("reg_email__")).sendKeys("j.rahul2903@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("j.rahul2903@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("sugandeseNuts");
		
		WebElement day = driver.findElement(By.id("day"));
		Select selectDate = new Select(day);
		selectDate.selectByValue("29");
		
		WebElement month = driver.findElement(By.id("month"));
		Select selectMonth = new Select(month);
		selectMonth.selectByValue("3");
		
		WebElement year = driver.findElement(By.id("year"));
		Select selectYear = new Select(year);
		selectYear.selectByValue("1999");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		driver.findElement(By.name("websubmit")).click();

        

	}

}
