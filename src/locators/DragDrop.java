package locators;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();

      Actions sai = new Actions(driver);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      driver.get("https://jqueryui.com/droppable/");
      WebElement  w = driver.findElement(By.xpath("(//iframe[@class=\"demo-frame\"])"));   //framesin dragdrop
      driver.switchTo().frame(w);
      Thread.sleep(3000);
      sai.dragAndDrop(driver.findElement(By.xpath("(//div[@id=\"draggable\"])")),driver.findElement(By.xpath("(//div[@id=\"droppable\"])"))).build().perform();
      Thread.sleep(3000);
//      driver.get("https://www.facebook.com/login/");  //infacebook
//      sai.moveToElement(driver.findElement(By.id("email"))).sendKeys("venkatsai").doubleClick().build().perform();
//      Thread.sleep(3000);
//      sai.dragAndDrop(driver.findElement(By.id("email")), driver.findElement(By.name("pass"))).build().perform();
//      Thread.sleep(3000);
//      driver.quit();
    	 
      
      
    
	}

}
