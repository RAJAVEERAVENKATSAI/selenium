package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class handletextbox {

	public static void main(String[] args) throws InterruptedException {
	
		// TODO Auto-generated method stub
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		WebElement usernameTxt= driver.findElement(By.id("login_field"));
	//	if(usernameTxt.isDisplayed()) {
	//	if(usernameTxt.isEnabled()) {
			usernameTxt.sendKeys("SAI");
			Thread.sleep(4000);
			usernameTxt.clear();
			String enteredTxt = usernameTxt.getAttribute("value"); 
		System.out.println(enteredTxt);
			Thread.sleep(3000);
			WebElement username= driver.findElement(By.id("password"));
			username.sendKeys("venkat");
			String entered = username.getAttribute("value"); 
			System.out.println(entered);
			Thread.sleep(4000);
			username.clear();
		}}		
			
//			WebDriver driver = new ChromeDriver();
//			//WebDriver driver;
//			driver.get("https://www.facebook.com/login/");
//			Thread.sleep(3000);
//			WebElement usernameText = driver.findElement(By.id("email"));
//			usernameText.sendKeys("12345");
//			//System.out.println(enteredTxt);
//			Thread.sleep(3000);
//			WebElement usernamet = driver.findElement(By.id("email"));
//			usernamet.sendKeys("67890");
//			String entere = usernamet.getAttribute("value"); 
//			System.out.println(entere);
	

