package smoketestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class COMPARISIONOFPDPPLP {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.100percentpure.com/");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button onetrust-lg ot-close-icon\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("see-all-hyperlink")).click();
        Thread.sleep(2000);
        String X = driver.findElement(By.xpath("(//span[contains(text(),'$7.00')])[3]")).getText();
        System.out.println("X="+X);
        driver.findElement(By.xpath("//article[@class='whole-site product-item grid-item-33']//img[@alt='deep-hydration-sheet-mask']")).click();
        String Y = driver.findElement(By.id("product-price")).getText();
        System.out.println("Y ="+Y);
      
        if (X.equals(Y)) {
        	System.out.println("X is equals to Y");
        	
        }else {
        	System.out.println("X is not equals to Y ");
        }
        
	}

}

