package Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions opt = new ChromeOptions();
		WebDriver driver= new ChromeDriver(opt);
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement RightC = driver.findElement(By.xpath("//span[contains(text(),\"right click me\")]"));
		Actions act= new Actions(driver);
		act.contextClick(RightC).build().perform();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Copy')]")).click();
		Alert alt = driver.switchTo().alert();
		String Text= alt.getText();
		System.out.println(Text);
		Thread.sleep(5000);
		alt.accept();
		
	    act.contextClick(RightC).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),\"Paste\")]")).click();
		Alert alt1= driver.switchTo().alert();
	    String Text1=alt1.getText();
		alt1.accept();
	    System.out.println(Text1);
		Thread.sleep(5000);

		act.contextClick(RightC).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),\"Delete\")]")).click();
		Alert alt2= driver.switchTo().alert();
		String text2= alt2.getText();
		alt2.accept();
		System.out.println(text2);
		Thread.sleep(5000);

		act.contextClick(RightC).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),\"Quit\")]")).click();
		Alert alt3= driver.switchTo().alert();
		String text3= alt3.getText();
		alt3.accept();
		System.out.println(text3);
		Thread.sleep(5000);

		act.contextClick(RightC).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),\"Cut\")]")).click();
		Alert alt4= driver.switchTo().alert();
		String text4= alt4.getText();
		alt3.accept();
		System.out.println(text4);
		Thread.sleep(5000);

		act.contextClick(RightC).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),\"Edit\")]")).click();
		Alert alt5= driver.switchTo().alert();
		String text5= alt5.getText();
		alt3.accept();
		System.out.println(text5);
		Thread.sleep(5000);

		driver.quit();
	}}
