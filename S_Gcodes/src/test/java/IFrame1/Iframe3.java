package IFrame1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),\"Iframe with in an Iframe\")and @class=\"analystic\"]")).click();
		WebElement outerframe = driver.findElement(By.xpath("//div[@id=\"Multiple\"]//iframe"));
		driver.switchTo().frame(outerframe);
		
		WebElement first= driver.findElement(By.xpath("//h5[contains(text(),\"Nested iFrames\")]"));
		String text = first.getText();
		
		if(text.equals("Nested iFrames")) {
			System.out.println("correct text");
		}else {
			System.out.println("incorrect text");}
		
        WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
        driver.switchTo().frame(innerframe);
        
        WebElement demo= driver.findElement(By.xpath("//input[@type=\"text\"]"));
        demo.sendKeys("automation testing");
        Thread.sleep(5000);
        
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
        
        driver.close();
        
   }}
