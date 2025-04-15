package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("HYRTUTORIALS");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).submit();
	 	driver.navigate().to("https://www.facebook.com/login/");
		Thread.sleep(3000); 
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
             driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.quit();
        
        
//        driver.get("https://www.google.com/");
//        Thread.sleep(3000);
//        driver.findElement(By.name("q")).sendKeys("VENKATSAI");
//        driver.findElement(By.name("q")).submit();
//        driver.navigate().to("https://www.youtube.com/");
//        Thread.sleep(3000);
//        driver.findElement(By.name("search_query")).sendKeys("https://www.youtube.com/results?search_query=food+on+farm");
//        Thread.sleep(5000);
//        driver.navigate().refresh();
//        Thread.sleep(3000);
//        driver.navigate().back();
//        Thread.sleep(3000);
//        driver.navigate().forward();
//        Thread.sleep(3000);
//        driver.quit();
       
	}

}
