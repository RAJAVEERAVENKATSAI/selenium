package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(3000);
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("sairam");
		Thread.sleep(3000);
		driver.findElement(By.id("hindichbx")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frm3");
		
		driver.switchTo().frame("frm1");
		Thread.sleep(3000);
		Select selectDrop = new Select(driver.findElement(By.id("course"))); 
		Thread.sleep(3000);
		selectDrop.selectByValue("java");

	}

}

