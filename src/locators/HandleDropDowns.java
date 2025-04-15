package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
         Thread.sleep(3000);
        WebElement courseElememt = driver.findElement(By.id("course"));
        Select courseNameDropDown = new Select(courseElememt);
        List<WebElement>courseNameDropDownOptions = courseNameDropDown.getOptions();
        for(WebElement Option :courseNameDropDownOptions) {
        	System.out.println(Option.getText());
        }
        courseNameDropDown.selectByIndex(1);//java
        Thread.sleep(3000);
        courseNameDropDown.selectByValue("net");//Dot net
        Thread.sleep(3000);
        courseNameDropDown.selectByVisibleText("Javascript");//javascript
        Thread.sleep(3000);
       String selectedText= courseNameDropDown.getFirstSelectedOption().getText();
       System.out.println("selected visible text -" +    selectedText);
       
       
		WebElement ideElement = driver.findElement(By.id("ide"));
      Select ideDropDown = new Select(ideElement);
      List<WebElement>ideDropdownOptions = ideDropDown.getOptions();
      for(WebElement Option :ideDropdownOptions) {
      	System.out.println(Option.getText());
      }
      ideDropDown.selectByIndex(0);//Eclips
      Thread.sleep(3000);
      ideDropDown.selectByValue("ij");//intellij idea
      Thread.sleep(3000);
      ideDropDown.selectByVisibleText("NetBeans");//netbeans 
      Thread.sleep(3000);
      
      ideDropDown.deselectByVisibleText("IntelliJ IDEA");
      
     List<WebElement> selectedoptions = ideDropDown.getAllSelectedOptions();
     for(WebElement selectedOptions : selectedoptions) {
    	 System.out.println("selected visible text -" + selectedOptions.getText());     
	 
     }
     
}}
 