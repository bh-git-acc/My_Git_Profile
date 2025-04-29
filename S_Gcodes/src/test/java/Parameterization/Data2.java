package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data2 {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement Username = driver.findElement(By.id("email"));
		WebElement Password = driver.findElement(By.id("pass"));
		FileInputStream File = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\28octAutomation\\src\\test\\java\\TestData\\Sheet1.xlsx");
		String User = WorkbookFactory.create(File).getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
	
		FileInputStream File1= new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\28octAutomation\\src\\test\\java\\TestData\\Sheet1.xlsx");
		String Pass = WorkbookFactory.create(File1).getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
		//int data = (int) Pass;
		
		Username.sendKeys(User);
		Password.sendKeys(Pass);
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
	
	
	
	
	
	}

}
