package ListBoxorDropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBox4 {

//Select method --- with SelectbyIndex
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		driver.findElement(By.name("firstname")).sendKeys("ABCD");
		driver.findElement(By.name("lastname")).sendKeys("XYZ");
		driver.findElement(By.name("reg_email__")).sendKeys("abcxyz@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("dcba");
		
		WebElement Day = driver.findElement(By.id("day"));
		WebElement Month = driver.findElement(By.id("month"));
		WebElement Year = driver.findElement(By.id("year"));
		
		//select by index
		Select S1 = new Select(Day);
		S1.selectByIndex(5);
		
		Select S2 = new Select(Month);
		S2.selectByIndex(5);
		
		Select S3 = new Select(Year);
		S3.selectByIndex(20);
		
		Thread.sleep(5000);
		driver.quit();

	}

}
