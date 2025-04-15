package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboardactions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.youtube.com/");
	      Actions act = new Actions(driver);     //shift  button
	      act.moveToElement(driver.findElement(By.xpath("(//div[@class=\"ytSearchboxComponentInputBox ytSearchboxComponentInputBoxDark\"])"))).click().keyDown(Keys.SHIFT).sendKeys("viratkohli").build().perform();
	      Thread.sleep(3000);
	      act.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).build().perform();//clear data

	}

} 
