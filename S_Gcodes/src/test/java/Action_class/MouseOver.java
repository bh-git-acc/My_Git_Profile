package Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		WebElement Ele= driver.findElement(By.xpath("//span[contains(text(),\"Account & Lists\")]"));
		Actions act= new Actions(driver);
		act.moveToElement(Ele).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Your Orders')]")).click();
		driver.findElement(By.id("ap_email")).sendKeys("Test@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("Test@1234");
		driver.findElement(By.id("signInSubmit")).click();
		driver.close();
}}
