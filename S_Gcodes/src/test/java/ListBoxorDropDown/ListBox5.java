package ListBoxorDropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBox5 {

	public static void main(String[] args) throws InterruptedException {
// By using Select class
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		driver.findElement(By.name("firstname")).sendKeys("DFG");
		driver.findElement(By.name("lastname")).sendKeys("GHI");
		driver.findElement(By.name("reg_email__")).sendKeys("defghi@gmail.in");
		driver.findElement(By.name("reg_passwd__")).sendKeys("@#$%&*bhj");
		
		WebElement DAY = driver.findElement(By.id("day"));
		WebElement MONTH = driver.findElement(By.id("month"));
		WebElement YEAR = driver.findElement(By.id("year"));
		
		String DOB = "20/May/2005";
		String DOB1 = "12/Mar/1998";
		
		String date[] = DOB1.split("/");
		ListBox5.Listbox(DAY, date[0]);
		ListBox5.Listbox(MONTH, date[1]);
		ListBox5.Listbox(YEAR, date[2]);
		
		Thread.sleep(5000);
		driver.quit();
}
	public static void Listbox(WebElement element,String text) {
		Select S1 = new Select (element);
		S1.selectByVisibleText(text);
	}}
