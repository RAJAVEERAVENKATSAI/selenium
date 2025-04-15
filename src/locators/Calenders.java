package locators;


import java.time.Duration;
import java.util.List;

//import javax.swing.text.html.parser.DTD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Calenders {
	static void SelectDate(WebDriver driver,String Year,String Month,String Date) {
	
		//select month & year
		while (true) 
		{
     	    String currentMonth = driver.findElement(By.xpath("(//span[@class=\"ui-datepicker-month\"])")).getText();//action month from application 
    		String currentYear = driver.findElement(By.xpath("(//span[@class=\"ui-datepicker-year\"])")).getText();  //action year from application
			
//     	    System.out.println(currentYear);//action month from application 
//		    System.out.println(currentMonth);
		    
		    
			if (currentMonth.equals(Month) && currentYear.equals(Year) )
			{
				break;	
			}
 	 	driver.findElement(By.xpath("(//span[@class=\"ui-icon ui-icon-circle-triangle-e\"])")).click();//next
			   
	         //     driver.findElement(By.xpath("(//span[@class=\"ui-icon ui-icon-circle-triangle-w\"])")).click();//previous
		}
    //selectdate:
	
	List<WebElement> allDates = driver.findElements(By.xpath("(//table[@class=\"ui-datepicker-calendar\"])//tbody//tr/td//a"));

	for(WebElement sai:allDates)	
	{
		
		if(sai.getText().equals(Date))
		{
			
			sai.click();
			break;
		}
			
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
	
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get("https://jqueryui.com/datepicker/");
				
				//switchTo
				driver.switchTo().frame(0);
				
				//method using Sendkeys
//				driver.findElement(By.xpath("(//input[@class=\"hasDatepicker\"])")).sendKeys("03/07/2025"); //mm/dd/yyyy
//				Thread.sleep(3000);
				
				//method2 using date picker
				//expected data
				String Year = "2026";
				String Month = "March";
				String Date = "23";	
				
//		    	String Year = "2023";
//				String Month = "October";
//				String Date = "23";	
				
				driver.findElement(By.xpath("(//input[@id=\"datepicker\"])")).click();//open date picker
				
				
				SelectDate(driver,Year,Month,Date);
				
		       
				}}