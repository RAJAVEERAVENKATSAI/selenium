package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiceDROPDOWNS2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
//		WebElement countryElement = driver.findElement(By.id("country"));
//		Select countryNameDropDown = new Select(countryElement);
//		List<WebElement> countryNameDropDownOptions = countryNameDropDown.getOptions();
//		for(WebElement Option : countryNameDropDownOptions) {
//			System.out.println(Option.getText());
//			
//			countryNameDropDown.selectByIndex(9);
//			Thread.sleep(3000);
//			countryNameDropDown.selectByIndex(1);
//			Thread.sleep(2000);
//			countryNameDropDown.selectByValue("uk");
//			Thread.sleep(2000);
//			countryNameDropDown.selectByValue("germany");
//			Thread.sleep(2000);
//			countryNameDropDown.selectByVisibleText("France");
//			Thread.sleep(2000);
//			countryNameDropDown.deselectByIndex(9);
//			Thread.sleep(2000);
//			countryNameDropDown.deselectByValue("canada");
//			Thread.sleep(2000);
//			countryNameDropDown.deselectByIndex(2);
//			Thread.sleep(2000);
//			countryNameDropDown.deselectByVisibleText("Germany");
//			Thread.sleep(2000);
//			countryNameDropDown.deselectByValue("France");
//			Thread.sleep(2000);
//			
//			String SelectedText = countryNameDropDown.getFirstSelectedOption().getText();
//			System.out.println("SelectedText");
//		}
		
		   WebElement colorsElement = driver.findElement(By.id("colors"));
		   Select colorsDropDown = new Select(colorsElement);
		   List<WebElement> colorsDropDownOptions = colorsDropDown.getOptions();
		   for(WebElement Option: colorsDropDownOptions) {
			   System.out.println(Option.getText());
			   
		   }
		   colorsDropDown.selectByIndex(2);
		   Thread.sleep(2000);
		   colorsDropDown.selectByValue("red");
		   Thread.sleep(2000);
		   colorsDropDown.selectByVisibleText("Blue");
		   Thread.sleep(2000);
		   colorsDropDown.deselectByIndex(3);
		   Thread.sleep(2000);
		   colorsDropDown.selectByValue("green");
		   Thread.sleep(2000);
		   colorsDropDown.selectByVisibleText("White");
		   Thread.sleep(3000);
		   colorsDropDown.selectByVisibleText("Yellow");
		   Thread.sleep(3000);
		   colorsDropDown.deselectByVisibleText("Green");
		   Thread.sleep(3000);
		   colorsDropDown.deselectByValue("blue");
		   Thread.sleep(3000);
		   colorsDropDown.deselectByIndex(0);
		   Thread.sleep(3000);
		   colorsDropDown.deselectByIndex(3);
		   Thread.sleep(3000);
		   colorsDropDown.deselectByIndex(2);
		   Thread.sleep(3000);
		   colorsDropDown.deselectByValue("green");
		   Thread.sleep(3000);
		   colorsDropDown.deselectByIndex(4);
		   Thread.sleep(2000);
		   colorsDropDown.deselectByIndex(5);
		   Thread.sleep(2000); 
		   List<WebElement> selectedOptions = colorsDropDown.getAllSelectedOptions();
		   for(WebElement selectedOption : selectedOptions) {
			   System.out.println("selected visible text-"+selectedOption.getText());
		   }
		  
		   
		  
		

	}

}
