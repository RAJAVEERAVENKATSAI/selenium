package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmlbasiccontrols {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(4000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("hindichbx")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("spanishchbx")).click();
		Thread.sleep(4000);
		WebElement spanishchbx = driver.findElement(By.id("spanishchbx"));
		spanishchbx.click();
		Thread.sleep(4000);
		if(spanishchbx.isSelected())
			spanishchbx.click();
		Thread.sleep(3000);
		driver.findElement(By.id("registerbtn")).click();
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		
		
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("hindichbx"));
		Thread.sleep(3000);
		WebElement hindichbx = driver.findElement(By.id("hindichbx")); 
		hindichbx.click();
		Thread.sleep(3000);
		if(hindichbx.isSelected())
			hindichbx.click();
		Thread.sleep(3000);
		driver.findElement(By.id("registerbtn")).click();
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		
		
		
		
		
		
		
	}

}
