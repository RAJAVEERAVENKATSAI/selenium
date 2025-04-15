package smoketestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
       
public class FORGOTPASSWORD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ulta.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("svg[class=\"pal-c-Icon pal-c-Icon--size-xl pal-c-Button__icon pal-c-Button__icon--before\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("ntr@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@name=\"action\"])[2]")).click();
		Thread.sleep(3000);
	
	
	}

}
