package smoketestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GUESTUSER {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.100percentpure.com/");
		driver.findElement(By.xpath("//button[@class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button onetrust-lg ot-close-icon\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("see-all-hyperlink")).click();
		driver .findElement(By.xpath("(//button[@class=\"btn btn-secondary add-to-cart-modal no-m-v-gutter w-full\"])[39]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src=\"https://www.100percentpure.com/s/files/1/0648/1955/files/cross.svg?v=1699049258&em-origin=cdn.shopify.com\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary add-to-cart-modal no-m-v-gutter w-full\"])[40]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src=\"https://www.100percentpure.com/s/files/1/0648/1955/files/cross.svg?v=1699049258&em-origin=cdn.shopify.com\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"btn btn-secondary add-to-cart-modal no-m-v-gutter w-full\"])[33]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Checkout')]")).click();
		
		
		
		
		
		
		
		
		
	}

}
