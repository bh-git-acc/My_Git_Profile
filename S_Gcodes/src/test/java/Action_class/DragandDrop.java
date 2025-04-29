package Action_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
		
		ChromeOptions opt = new ChromeOptions();
		WebDriver driver= new ChromeDriver(opt);
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    
		WebElement Src=driver.findElement(By.id("box3"));
		WebElement dest=driver.findElement(By.id("box103"));

		Actions  act= new Actions(driver);
		act.dragAndDrop(Src, dest).build().perform();
		Thread.sleep(2000);
	
		WebElement Src1= driver.findElement(By.id("box5"));
		WebElement dest1= driver.findElement(By.id("box105"));
		Actions act1= new Actions(driver);
		act.dragAndDrop(Src1, dest1).build().perform();
		Thread.sleep(2000);
		
		WebElement Src2= driver.findElement(By.id("box6"));
		WebElement dest2= driver.findElement(By.id("box106"));
		Actions act2= new Actions(driver);
		act.dragAndDrop(Src2, dest2).build().perform();
		Thread.sleep(2000);
		
		WebElement Src3= driver.findElement(By.id("box7"));
		WebElement dest3= driver.findElement(By.id("box107"));
		Actions act3= new Actions(driver);
		act.dragAndDrop(Src3, dest3).build().perform();
		Thread.sleep(2000);
		
		WebElement Src4= driver.findElement(By.id("box1"));
		WebElement dest4= driver.findElement(By.id("box101"));
		Actions act4= new Actions(driver);
		act.dragAndDrop(Src4, dest4).build().perform();
		Thread.sleep(2000);
		
		WebElement Src5= driver.findElement(By.id("box2"));
		WebElement dest5= driver.findElement(By.id("box102"));
		Actions act5= new Actions(driver);
		act.dragAndDrop(Src5, dest5).build().perform();
		Thread.sleep(2000);
		
		WebElement Src6=driver.findElement(By.id("box4"));
		WebElement dest6= driver.findElement(By.id("box104"));
		Actions act6= new Actions(driver);
		act.dragAndDrop(Src6, dest6).build().perform();
		Thread.sleep(2000);
		
	    driver.close();
        }}
