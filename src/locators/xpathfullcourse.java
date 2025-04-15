
package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathfullcourse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(3000);
 //		highlight(driver,driver.findElement(By.id("navbtn_exercises")));
		
		//absolute xpath	
//	    highlight(driver,driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/nav[1]/a[3]")));
//		highlight(driver,driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/nav[1]/a[2]")));
//       highlight(driver,driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/nav[1]/a[4]")));
		//Relative xpath
		highlight(driver,driver.findElement(By.xpath("(//a[@title=\"Certificates\"])[1]")));
		
		
	}
	    private static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
}
	    }

