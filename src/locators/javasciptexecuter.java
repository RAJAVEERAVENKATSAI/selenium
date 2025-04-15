package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javasciptexecuter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver() ;
	driver.manage().window().maximize();
	
//    driver.get("https://www.facebook.com/login/");
    driver.get("https://www.hyrtutorials.com/");
	
	
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//	WebElement Element = (WebElement) jsExecutor.executeScript("return  document.getElementsByName(\"email\")['0'];");
//	Element.sendKeys("id");
	
//	WebElement Element = (WebElement) jsExecutor.executeScript("return  document.getElementsByName(\"email\")['0'];");
//	Element.sendKeys("venkatsai");//name
	
//	WebElement Element = (WebElement) jsExecutor.executeScript("return  document.querySelector('#email');");
//	Element.sendKeys("cssselector");
	
//	WebElement Element = (WebElement) jsExecutor.executeScript("return document.evaluate((\"(//input[@id='email'])\"),document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue;\r\n");
//	Element.sendKeys("xpath");
	
	//putting value
	
//	jsExecutor.executeScript("document.getElementById('email').value='id'");
//	Thread.sleep(3000);
//    jsExecutor.executeScript("document.getElementsByClassName('inputtext')[0].value='classname';");
//	Thread.sleep(3000);
//	jsExecutor.executeScript(" document.getElementsByName(\"email\")['0'].value='name';");
//	Thread.sleep(3000);
//	jsExecutor.executeScript("document.getElementsByTagName(\"input\")[13].value='tagname';");
//	Thread.sleep(3000);
//	jsExecutor.executeScript("document.querySelector('#email').value='cssselctor';");
//	Thread.sleep(3000);
//	jsExecutor.executeScript("document.evaluate((\"(//input[@id='email'])\"),document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.value='xpath';");
//	Thread.sleep(3000);
	
	//jsExecutor.executeScript("document.getElementsByName('login')[0].click()");
//	jsExecutor.executeScript("document.getElementById('email').style.border='10px red solid';");
//	Thread.sleep(3000);
//	jsExecutor.executeScript("document.getElementById('email').style.background='yellow';");
//	Thread.sleep(3000);
	//jsExecutor.executeScript("document.getElementById(\"pass\").setAttribute(\"style\", \"border:5px red solid; background:yellow\");\r\n"+ "");
	
	//Scroll
	//driver.get("https://www.hyrtutorials.com/#google_vignette");
	//jsExecutor.executeScript("window.scrollBy(0,500);\r\n"+ "");
//	jsExecutor.executeScript("window.scrollTo(0,500);\r\n"+ "");
//	Thread.sleep(3000);
//	jsExecutor.executeScript("window.scrollTo(0,500);\r\n"+ "");
//	jsExecutor.executeScript("document.getElementById(\"ty_footer\").ScrollIntoView();\r\n"+ "");
	
	jsExecutor.executeScript("document.getElementById('ty_footer').scrollIntoView()");
	Thread.sleep(3000);
	
//	WebElement username = driver.findElement(By.id("loginbutton"));
//	jsExecutor.executeScript("arguments[0].setAttribute('style','border:5px red solid;background:yellow');",username);
//	WebElement user = driver.findElement(By.id("email"));	
//	jsExecutor.executeScript("arguments[0].setAttribute('style','border:5px red solid;background:blue');",user);
////	WebElement sai = driver.findElement(By.className("clearfix _5466 _44mg"));	
////	jsExecutor.executeScript("arguments[0].setAttribute('style','border:10px red solid;background:green');",sai);
//	Thread.sleep(5000);
//	driver.quit();

	}

}
