package Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver opt= new ChromeDriver();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Actions act= new Actions(driver);
		act.keyDown(Keys.DELETE).perform();
		String Text1 = driver.findElement(By.id("result")).getText();
		System.out.println(Text1);
		Thread.sleep(3000);
		
		act.keyDown(Keys.SHIFT).perform();
		String  Text2= driver.findElement(By.id("result")).getText();
		System.out.println(Text2);
		Thread.sleep(3000);

		act.keyDown(Keys.ESCAPE).perform();
		String Text3= driver.findElement(By.id("result")).getText();
		System.out.println(Text3);
		Thread.sleep(3000);

	}

}
