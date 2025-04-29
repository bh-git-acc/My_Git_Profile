package ListBoxorDropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listbox7 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Rohit");
		driver.findElement(By.name("lastname")).sendKeys("Patil");
		driver.findElement(By.name("reg_email__")).sendKeys("23456");
		driver.findElement(By.id("password_step_input")).sendKeys("@#$%");
		
		WebElement Day = driver.findElement(By.id("day"));
		WebElement Month = driver.findElement(By.id("month"));
		WebElement Year =  driver.findElement(By.id("year"));
	
	// Ques: How will you get the total number of size of the list/drop down
		
		List<WebElement>D1 = driver.findElements(By.xpath("//select[@id=\"day\"]//option"));
	    int Number = D1.size();
	    System.out.println("total Number of days"+ Number);
	    
    //Ques: How will you print all the values
	     for(int i=0; i<D1.size(); i++) {
	    	 String DayValues = D1.get(i).getText();
	    	 System.out.println(DayValues);
	    	 
	//Ques: How will you select specific values from listbox
	    	 if(DayValues.equals("20")) {
	    		 D1.get(i).click();
	    	 }}
	
	   List<WebElement>Month1 = driver.findElements(By.xpath("//select[@id=\"month\"]//option"));
	   System.out.println(Month1.size());
	   for(int i=0; i<Month1.size(); i++) {
		   String MonthValues = Month1.get(i).getText();
		   System.out.println(MonthValues);
		   
		  if(MonthValues.equals("Mar")) {
			  Month1.get(i).click();
		  }}
		
	   List<WebElement>Year1 = driver.findElements(By.xpath("//select[@id=\"year\"]//option"));
		System.out.println(Year1.size());
		for(int i=0; i<Year1.size();i++) {
		   String YearValues= Year1.get(i).getText();
		   System.out.println(YearValues);
		
		   if(YearValues.equals("1995")) {
			   Year1.get(i).click();
		   }}
	}}
