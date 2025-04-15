package smoketestcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class Head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
		        WebDriver driver = new ChromeDriver();

		        try {
		            driver.get("https://www.ulta.com"); // Replace with the actual URL
		            boolean hasNextPage = true;

		            while (hasNextPage) {
		                // Find all headers on the current page
		                List<WebElement> headers = driver.findElements(By.tagName("h1")); // Adjust tagName if needed
		                for (WebElement header : headers) {
		                    System.out.println("Header: " + header.getText());
		                    header.click(); // Click the header (if clickable)
		                    driver.navigate().back(); // Navigate back after clicking
		                }

		                // Check if the "Next Page" button exists and is clickable
		                List<WebElement> nextButton = driver.findElements(By.xpath("//button[contains(text(),'Next')]")); // Adjust XPath
		                if (!nextButton.isEmpty()) {
		                    nextButton.get(0).click(); // Click the "Next Page" button
		                } else {
		                    hasNextPage = false; // No more pages
		                }
		            }
		        } finally {
//		            driver.quit(); // Close the browser
		        }
		    }
		
		
		
		
	

}
