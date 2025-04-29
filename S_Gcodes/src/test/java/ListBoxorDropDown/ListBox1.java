package ListBoxorDropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBox1 {

// without select method for selection of listbox or dropdownbox.
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		driver.findElement(By.name("firstname")).sendKeys("ABCD");
		driver.findElement(By.name("lastname")).sendKeys("XYZ");
		driver.findElement(By.name("reg_email__")).sendKeys("abcxyz@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("dcba");
		//driver.findElement(By.id("day")).click();
		//driver.findElement(By.xpath("//option[contains(text(),\"12\")]")).click();
		//driver.findElement(By.id("month")).click();
		//driver.findElement(By.xpath("//option[contains(text(),'May')]")).click();
		//driver.findElement(By.id("year")).click();
		//driver.findElement(By.xpath("//option[contains(text(),\"2000\")]")).click();
		
	//	driver.findElement(By.id("day")).click();
	//	driver.findElement(By.xpath("//option[contains(text(),\"23\")]")).click();
	//	driver.findElement(By.id("month")).click();
	//	driver.findElement(By.xpath("//option[contains(text(),'Dec')]")).click();
	//	driver.findElement(By.id("year")).click();
	//	driver.findElement(By.xpath("//option[contains(text(),\"1995\")]")).click();
		
		driver.findElement(By.id("day")).click();
		driver.findElement(By.xpath("//option[contains(text(),\"16\")]")).click();
		driver.findElement(By.id("month")).click();
		driver.findElement(By.xpath("//option[contains(text(),\"Jun\")]")).click();
		driver.findElement(By.id("year")).click();
		driver.findElement(By.xpath("//option[contains(text(),\"1995\")]")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}}
