package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandling2 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//singleTab
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("parent windpw handle -  "+parentWindowHandle+driver.getTitle());
		driver.findElement(By.id("newTabBtn")).click();
		java.util.Set<String> windowhandles = driver.getWindowHandles();
		for (String windowhandles1 : windowhandles) {
		if(!windowhandles.equals(parentWindowHandle)) {
		driver.switchTo().window(parentWindowHandle);
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.findElement(By.id("alertBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.close();

		}}
		
		

	}

//	private static void click() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static String getwindowhandle() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
