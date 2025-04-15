package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MOUSEACTIONS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//COMREVO youtybe
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		Actions act = new Actions(driver);
		
		//MouseHover
		act.moveToElement(driver.findElement(By.xpath("(//div[@class=\"YBLJE4\"])[3]"))).build().perform();
		Thread.sleep(3000);
		//Click
		act.moveToElement(driver.findElement(By.xpath("(//div[@class=\"YBLJE4\"])[1]"))).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		//DoubleClick
		act.moveToElement(driver.findElement(By.xpath("(//input[@class=\"Pke_EE\"])"))).click().sendKeys("motorola").doubleClick().build().perform();
		Thread.sleep(3000);
		//anothermethodfor doubleclick:
	//	act.doubleClick(driver.findElement(By.xpath("(//input[@class=\"Pke_EE\"])"))).click().sendKeys("moto").build().perform();
	  //   Thread.sleep(3000);
		
	//	RightClick
		act.moveToElement(driver.findElement(By.xpath("(//div[@class=\"_3n8fna1co _3n8fna10j _3n8fnaod _3n8fna1 _3n8fnac7 _1i2djtb9 _1i2djt0 _1i2djt30\"])[9]"))).contextClick().build().perform();
		Thread.sleep(3000);
		//anothermehtod
//		act.contextClick(driver.findElement(By.xpath("(//div[@class=\"_3n8fna1co _3n8fna10j _3n8fnaod _3n8fna1 _3n8fnac7 _1i2djtb9 _1i2djt0 _1i2djt30\"])[9]"))).build().perform();
//		Thread.sleep(3000);
	     driver.quit();

	    
	     
	     
	}

}
