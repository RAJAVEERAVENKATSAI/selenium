package smoketestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FOOTERS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.ulta.com/");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")).click();
        Thread.sleep(3000);
        jsExecutor.executeScript("document.getElementsByClassName('Footer__bottomWrapperRow')[0].scrollIntoView()\r\n");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[@class=\"Text-ds Text-ds--body-2 Text-ds--left Text-ds--black\"])[88]")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.xpath("(//span[@class=\"Text-ds Text-ds--body-2 Text-ds--left Text-ds--black\"])[89]")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.xpath("(//span[@class=\"Text-ds Text-ds--body-2 Text-ds--left Text-ds--black\"])[92]")).click();
        Thread.sleep(3000);
        driver.navigate().back();		
        driver.quit();
        
	}

}
