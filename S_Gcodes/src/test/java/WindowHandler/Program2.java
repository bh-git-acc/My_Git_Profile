package WindowHandler;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Program2 {

	public static void main(String[] args) throws InterruptedException {
 
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.findElement(By.xpath("//a[contains(text(),\"OrangeHRM, Inc\")]")).click();
	    Thread.sleep(5000);
	    
//	    String WinID = driver.getWindowHandle();
//	    System.out.println(WinID);
//	    
//	    driver.findElement(By.name("EmailHomePage")).sendKeys("Test@gmail.com");
//	    driver.findElement(By.id("Form_submitForm_action_request")).click();
	    Thread.sleep(5000);
	    
//GetWindowHandles();
	    //it is used to store all opened windows IDsin the set of Data.
	    Set<String>WinIDs =driver.getWindowHandles();
	 
	    //first method to fetch ids-
	    Iterator<String> Test = WinIDs.iterator();
	    String ParentWindowId= Test.next();
	    String ChildWindowId = Test.next();
//	    System.out.println("ParentWindowId--"+ParentWindowId);
//	    System.out.println("ChildWindowId---"+ ChildWindowId);
//	    ParentWindowId--2877E683EF4A912669C51E71C3A21FB5
//	    ChildWindowId---891C8198C611F82DAC616E68159B54D5
	
	 //second method
	    ArrayList<String> WinList = new ArrayList<String>(WinIDs);
	    String parentWin = WinList.get(0);
	    String ChildWin  = WinList.get(1);
	    System.out.println("ParentWindowId--"+parentWin);
	    System.out.println("ChildWindowId--"+ChildWin);
	    
	    //How to switch focus from parent to child window
	    driver.switchTo().window(ChildWin);
	    String Title = driver.getTitle();
	    System.out.println("ChildWindow Title--"+Title);
	    driver.switchTo().window(parentWin);
	    System.out.println("parent window Title--"+driver.getTitle());
	    Thread.sleep(3000);
	    driver.close();
	}}
