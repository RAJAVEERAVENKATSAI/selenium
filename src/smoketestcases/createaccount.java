package smoketestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createaccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ulta.com/");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("button[class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("svg[class=\"pal-c-Icon pal-c-Icon--size-xl pal-c-Button__icon pal-c-Button__icon--before\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("a[class=\"cdf6f7df0 cd0a55bf0\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("firstName")).sendKeys("VEERA");
	Thread.sleep(3000);
	driver.findElement(By.name("ulp-lastName")).sendKeys("sai");
	Thread.sleep(3000);
	driver.findElement(By.id("phoneNumber")).sendKeys("1234567890");
	Thread.sleep(3000);
	WebElement course =driver.findElement(By.id("province"));
	Select sai = new Select(course);
	sai.selectByValue("FL");
	driver.findElement(By.id("email")).sendKeys("ntr@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.id("password")).sendKeys("NtR@54321");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//label[\"@Stay signed in\"])[13]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//button[@name=\"action\"])[2]")).click();
	Thread.sleep(3000);
	
	

	}

}
