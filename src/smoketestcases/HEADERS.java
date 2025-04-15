package smoketestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HEADERS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver .manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     driver.get("https://www.ulta.com/");
     Thread.sleep(3000);
     driver.findElement(By.xpath("//button[@class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//span[@class=\"pal-c-Button__text\"])[1]")).click();
     driver.findElement(By.xpath("(//span[@class=\"pal-c-Button__text\"])[2]")).click();
     driver.findElement(By.xpath("(//span[@class=\"pal-c-Button__text\"])[3]")).click();
     driver.findElement(By.xpath("(//span[@class=\"pal-c-Button__text\"])[4]")).click(); 
     driver.quit();
    
	}

}
