package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertsinwebpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		//ALERT BOX
//		System.out.println( driver.findElement(By.id("output")).getText());
//		Thread.sleep(3000);
//		driver.findElement(By.id("alertBox")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
//		System.out.println( driver.findElement(By.id("output")).getText());
//		Thread.sleep(3000);
//		driver.quit();
		
//		System.out.println(driver.findElement(By.id("output")).getText());
//		Thread.sleep(3000);
//		driver.findElement(By.id("confirmBox")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
//		System.out.println(driver.findElement(By.id("output")).getText());
//		Thread.sleep(3000);
//		driver.quit();
		
		
//		System.out.println(driver.findElement(By.id("output")).getText());
//		Thread.sleep(3000);
//		driver.findElement(By.id("confirmBox")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().dismiss();
//		System.out.println(driver.findElement(By.id("output")).getText());
//		Thread.sleep(3000);
//		driver.quit();
//		
		
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("HYR");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.findElement(By.id("promptBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(3000);
		driver.quit();
		

	}

}
