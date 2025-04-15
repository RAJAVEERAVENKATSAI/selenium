package smoketestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ADDTOCART {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.ulta.com/");
		 driver.findElement(By.xpath("//button[@class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")).click();
//	     Thread.sleep(3000);
//	     WebElement sai = driver.findElement(By.id("search"));
//	    sai.sendKeys(" Pureology Hydrate Shampoo");
//	    sai.submit();
//	    driver.findElement(By.xpath("(//button[@class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default AddToBagButton__AddToBag\"])")).click();
//	     Thread.sleep(3000); 
	    driver.findElement(By.id("search")).sendKeys("Gentle Mist Lily Of The Valley Ultra-Soothing Hand Sanitizer");
	    driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default pal-c-Button--iconOnly\"]")).click();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default AddToBagButton__AddToBag\"]")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.id("search")).sendKeys("Hydrating Cream-to-Foam Face Wash for Balanced to Dry Skin");
	    driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default pal-c-Button--iconOnly\"]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//span[@class=\"pal-c-Button__text\"])[17]")).click();
	    Thread.sleep(3000);
	  //  driver.findElement(By.xpath("//class[@class=\"pal-c-Link pal-c-Link--buttonPrimary pal-c-Link--compact\"]")).click();

	}

}
