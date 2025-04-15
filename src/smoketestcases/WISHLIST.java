package smoketestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WISHLIST {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.ulta.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("svg[class=\"pal-c-Icon pal-c-Icon--size-xl pal-c-Button__icon pal-c-Button__icon--before\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("ntr@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("NtR@54321");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@name=\"action\"])[2]")).click();
		Thread.sleep(3000);
	     WebElement sai = driver.findElement(By.id("search"));
	    sai.sendKeys("Hollywood Flawless Filter");
	    sai.submit();
	    driver.findElement(By.cssSelector("img[alt=\"Charlotte Tilbury Airbrush Flawless Longwear Foundation\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--secondary pal-c-Button--default ProductBookmark\"]")).click();
	    driver.navigate().back();
	    driver.findElement(By.xpath("//img[@alt=\"Charlotte Tilbury Hollywood Flawless Filter\"]")).click();
	    driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--secondary pal-c-Button--default ProductBookmark\"]")).click();
	    driver.navigate().back();
	    driver.findElement(By.xpath("//img[@alt=\"e.l.f. Cosmetics Halo Glow Liquid Filter\"]")).click();
	    driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--secondary pal-c-Button--default ProductBookmark\"]")).click();
	    driver.navigate().back();
	    driver.findElement(By.xpath("//img[@alt=\"Charlotte Tilbury Hollywood Contour Wand\"]")).click();
	    driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--secondary pal-c-Button--default ProductBookmark\"]")).click();
	    driver.navigate().back();
	    driver.navigate().back();
	    Thread.sleep(2000);
       // driver.findElement(By.xpath("//span[@class=\"pal-c-Link__icon-before\"]")).click();
		//Thread.sleep(2000);
	}

}
