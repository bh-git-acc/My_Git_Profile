package Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardAction1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions opt= new ChromeOptions();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
        WebElement input1= driver.findElement(By.id("email"));
        WebElement input2= driver.findElement(By.id("pass"));
        input1.sendKeys("Test@gmail.com");
        Actions act= new Actions(driver);
        
        //cntrl+A
       act.keyDown(Keys.CONTROL);
       act.sendKeys("a");
       act.keyUp(Keys.CONTROL);
       act.build().perform();
       
       //cntrl+C
       act.keyDown(Keys.CONTROL);
       act.sendKeys("c");
       act.keyUp(Keys.CONTROL);
       act.build().perform();
       
       //Tab
       act.keyDown(Keys.TAB);
       act.build().perform();
       
       //cntrl+v
       act.keyDown(Keys.CONTROL);
       act.sendKeys("v");
       act.keyUp(Keys.CONTROL);
       act.build().perform();
	
       //compare text
       String T1= input1.getAttribute("value");
       System.out.println(T1);
       
       String T2= input2.getAttribute("value");
       System.out.println(T2);
       
       if(T1.equals(T2)) {
    	   System.out.println("correct text");
       } else
       {System.out.println("incorrect text");}
	}}
