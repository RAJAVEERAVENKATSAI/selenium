package smoketestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOGINaccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ulta.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("svg[class=\"pal-c-Icon pal-c-Icon--size-xl pal-c-Button__icon pal-c-Button__icon--before\"]")).click();
		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("button[class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default pal-c-Button--fullWidth\"]")).click();
//		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("ntr@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("NtR@54321");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@name=\"action\"])[2]")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//button[@class=\"pal-c-Button pal-c-Button--primary pal-c-Button--compact\"])[1]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default pal-c-Button--fullWidth\"]")).click();
//		Thread.sleep(3000);
		
		

	}

}
