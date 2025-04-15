package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing1{  

//	private static final By By = null;
   
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/login/");
//		Thread.sleep(3000);
//		driver.findElement(By.name("email")).sendKeys("sairam");
//		Thread.sleep(3000);
//		highlight(driver,driver.findElement(By.name("pass")));
//		Thread.sleep(3000);
//		highlight(driver,driver.findElement(By.linkText("Forgotten account?")));
//		Thread.sleep(3000);
//		highlight(driver,driver.findElement(By.partialLinkText("Sign up for")));
//		Thread.sleep(3000);
//		highlight(driver,driver.findElement(By.tagName("img")));
//		Thread.sleep(3000);
//		highlight(driver,driver.findElement(By.xpath("//button[@name=\"login\"]")));
//		Thread.sleep(3000);
//		highlight(driver,driver.findElement(By.cssSelector("div[class=\"_9axz\"")));
//		Thread.sleep(3000);
//		highlight(driver,driver.findElement(By.id("email")));
		
//		
//		driver.get("https://github.com/login");
//		Thread.sleep(3000);
//		driver.findElement(By.name("login")).sendKeys("12345");
//		Thread.sleep(3000);
//		highlight(driver,driver.findElement(By.id("login_field")));
//		Thread.sleep(3000);
//	    highlight(driver,driver.findElement(By.name("password")));
//		Thread.sleep(3000);
//	
//		highlight(driver,driver.findElement(By.className("header-logo")));
//		Thread.sleep(3000);
//	
//		highlight(driver,driver.findElement(By.linkText("Forgot password?")));
//		Thread.sleep(3000);
//		highlight(driver,driver.findElement(By.partialLinkText("Create an ")));
//		Thread.sleep(3000);
//		highlight(driver,driver.findElement(By.tagName("h1")));
//		Thread.sleep(3000);
//		highlight(driver,driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]")));
//		Thread.sleep(3000);
//		highlight(driver,driver.findElement(By.cssSelector("input[name='commit']")));
//		Thread.sleep(3000);
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(3000);
		//highlight(driver,driver.findElement(By.name("username")));
		Thread.sleep(3000);
		//highlight(driver,driver.findElement(By.className("_aa4b _add6 _ac4d _ap35")));
		highlight(driver,driver.findElement(By.partialLinkText("Forgot password?")));
		highlight(driver,driver.findElement(By.cssSelector("button[class=\" _acan _acap _acas _aj1- _ap30\"]")));
		//highlight(driver,driver.findElement(By.xpath("//i[@role=\"img\"]")));

	}
	private static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:red')", element);
}

}
