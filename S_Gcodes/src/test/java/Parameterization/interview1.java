package Parameterization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class interview1 {

	public static void main(String[] args) throws InterruptedException {
		
		        // Set up WebDriver using WebDriverManager
		        WebDriverManager.chromedriver().setup();
		        WebDriver driver = new ChromeDriver();

		        try {
		            // Open DemoBlaze website
		            driver.get("https://www.demoblaze.com/");
		            Thread.sleep(3000); // Wait for page to load

		            // Navigate to categories and count items
		            countCategoryItems(driver, "Phones");
		            countCategoryItems(driver, "Laptops");
		            countCategoryItems(driver, "Monitors");

		        } finally {
		            // Close the browser
		            driver.quit();
		        }
		    }

		    public static void countCategoryItems(WebDriver driver, String category) throws InterruptedException {
		        // Click on the category link
		        driver.findElement(By.linkText(category)).click();
		        Thread.sleep(3000); // Wait for products to load

		        // Get all items in the category
		        List<WebElement> items = driver.findElements(By.className("card-block"));
		        System.out.println(category + " count: " + items.size());
		    }
		}

	


