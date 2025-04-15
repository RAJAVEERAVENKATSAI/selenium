package locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class calenders1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
        driver.findElement(By.id("third_date_picker")).click();
        Thread.sleep(3000);
        WebElement Month = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]"));//Month
        Thread.sleep(3000);
        Select Month1 = new Select(Month);
        Month1.selectByIndex(9);
        Thread.sleep(3000);
        WebElement Year = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]"));//Year
        Select Year1 = new Select(Year);
        Year1.selectByValue("2035");
        Thread.sleep(3000);
        String Date = "23";
        
        //selecting Date
        
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr//td//a"));

    	for(WebElement sai:allDates)	//forloop
    	{
    		
    		if(sai.getText().equals(Date))
    		{
    			
    			sai.click();
    			break;
    		}
    			
    	}
        
        
        
	}

}
