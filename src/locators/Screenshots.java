package locators;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		driver.get("https://www.facebook.com/login/");
		
		//FILE
//		File sourseFile = driver.getScreenshotAs(OutputType.FILE) ;
//		File destFile = new File("./Screenshots/img1.jpg");
//		FileUtils.copyFile(sourseFile, destFile);
//		System.out.println("Screenshot saved successfully");
//		 driver.quit();
		 
//		 Bytes
//		byte[] byteArr = driver.getScreenshotAs(OutputType.BYTES);
//		File destFile = new File("./Screenshots/img1.jpg");
//		FileOutputStream fos = new FileOutputStream(destFile);
//		fos.write(byteArr);
//		fos.close();
//		System.out.println("Screenshot saved successfully");
//		driver.quit();
		
//		BASE64
//		String base64 = driver.getScreenshotAs(OutputType.BASE64);
//		byte[] byteArr = Base64.getDecoder().decode(base64);
//		File destFile = new File("./screenshots/img1.jpg");
//		FileOutputStream fos = new FileOutputStream(destFile);
//		fos.write(byteArr);
//		fos.close();
//		System.out.println("Screenshot saved successfully");
//		driver.quit();
		
		//using Webdriver
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
//		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//		File sourseFile = takesScreenshot.getScreenshotAs(OutputType.FILE) ;
//		File destFile = new File("./Screenshots/img1.jpg");
//		FileUtils.copyFile(sourseFile, destFile);
//		System.out.println("Screenshot saved successfully");
//		 driver.quit();
		
//		 Bytes
		 
//		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//		byte[] byteArr = takesScreenshot.getScreenshotAs(OutputType.BYTES);
//		File destFile = new File("./Screenshots/img1.jpg");
//		FileOutputStream fos = new FileOutputStream(destFile);
//		fos.write(byteArr);
//		fos.close();
//		System.out.println("Screenshot saved successfully");
//		driver.quit();
		
		//BASE64
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		String base64 = takesScreenshot.getScreenshotAs(OutputType.BASE64);
		byte[] byteArr = Base64.getDecoder().decode(base64);
		File destFile = new File("./screenshots/img1.jpg");
		FileOutputStream fos = new FileOutputStream(destFile);
		fos.write(byteArr);
		fos.close();
		System.out.println("Screenshot saved successfully");
		driver.quit();

	}

}
