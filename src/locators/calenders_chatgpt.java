package locators;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenders_chatgpt {


	



	    public static void main(String[] args) throws InterruptedException {
	        // TODO Auto-generated method stub
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.get("https://jqueryui.com/datepicker/");
	        
	        //switchTo
	        driver.switchTo().frame(0);
	        
	        // Method 2 using date picker
	        // expected data
	        String Year = "2025";
	        String Month = "october";
	        String Date = "23";
	        
	        driver.findElement(By.xpath("(//input[@id=\"datepicker\"])")).click(); // Open date picker
	        
	        // Select month & year
	        while (true) {
	            // Get current month and year from the application
	            String currentYear = driver.findElement(By.xpath("(//span[@class=\"ui-datepicker-year\"])")).getText().trim();
	            String currentMonth = driver.findElement(By.xpath("(//span[@class=\"ui-datepicker-month\"])")).getText().trim().toLowerCase();
	            
	            System.out.println("Current Year: " + currentYear); // Debugging output
	            System.out.println("Current Month: " + currentMonth); // Debugging output

	            // Check if the current month and year match the expected values
	            if (currentMonth.equals(Month.toLowerCase()) && currentYear.equals(Year)) {
	                break; // Exit the loop once the correct month and year are found
	            }
	            
	            // Click the next button to go to the next month
	            driver.findElement(By.xpath("(//span[@class=\"ui-icon ui-icon-circle-triangle-e\"])")).click();
	            Thread.sleep(1000); // Small delay to avoid busy-wait issues
	        }
	        
	        // Now that we are in the correct month, select the date
	       // driver.findElement(By.xpath("//a[text()='" + Date + "']")).click(); // Click on the desired date
	        
	        // You can now add any further logic to handle the form submission if required
	    }
	}


