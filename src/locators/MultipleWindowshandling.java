package locators;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MultipleWindowshandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    	WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
////		single window
	String parentWindowHandle = driver.getWindowHandle();
		System.out.println("parent Window Handle -"+parentWindowHandle + driver.getTitle());
		 Thread.sleep(3000);
		driver.findElement(By.id("newWindowBtn")).click();
  	Set<String> WindowHandles = driver.getWindowHandles();
		for (String WindowHandle :WindowHandles) {
			if(!WindowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(WindowHandle);
//			System.out.println(WindowHandle + driver.getTitle());
//			
      	}
		}
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("sai venkat");
		Thread.sleep(4000);
	    driver.close();
	    
	    driver.switchTo().window(parentWindowHandle);
        driver.findElement(By.id("name")).sendKeys("R.VENKATSAI");
	    Thread.sleep(3000);
        driver.quit(); 
	    
	    
	    
	    
	    
	    
	  
	}
	   
}
