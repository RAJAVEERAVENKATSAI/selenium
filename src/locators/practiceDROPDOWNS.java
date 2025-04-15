package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiceDROPDOWNS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement courseElement = driver.findElement(By.id("course"));
		Select courseNameDropDown = new Select(courseElement);
		List<WebElement> courseNameDropDownOptions = courseNameDropDown.getOptions();
		for(WebElement option:courseNameDropDownOptions) {
			System.out.println(option.getText());
		}
		courseNameDropDown.selectByIndex(0);
		Thread.sleep(3000);
		courseNameDropDown.selectByValue("net");
		Thread.sleep(3000);
		courseNameDropDown.selectByVisibleText("Javascript");
		Thread.sleep(3000);
		courseNameDropDown.selectByIndex(2);
		Thread.sleep(3000); 
		
		String selectedText = courseNameDropDown.getFirstSelectedOption().getText();
		System.out.println("Selected visible text-"+selectedText);
		
		WebElement ideElement = driver.findElement(By.id("ide"));
		Select ideDropDown = new Select(ideElement);
		List<WebElement> ideDropDownOptions = ideDropDown.getOptions();
		for(WebElement option: ideDropDownOptions) {
			System.out.println(option.getText());
		}
		ideDropDown.selectByIndex(1);
		Thread.sleep(3000);
		ideDropDown.selectByValue("ij");
		Thread.sleep(3000);
		ideDropDown.selectByValue("vs");
		Thread.sleep(3000);
		ideDropDown.selectByVisibleText("NetBeans");
		Thread.sleep(3000);
		ideDropDown.selectByValue("ec");
		Thread.sleep(3000);
		ideDropDown.deselectByIndex(1);
		Thread.sleep(3000);
		ideDropDown.deselectByValue("nb");
		Thread.sleep(3000);
		ideDropDown.deselectByVisibleText("IntelliJ IDEA");
		Thread.sleep(3000);
		ideDropDown.deselectByVisibleText("Visual Studio");
		Thread.sleep(3000);
        List<WebElement> selectedoptions = ideDropDown.getAllSelectedOptions();
        for(WebElement selectedoption: selectedoptions) {
        	System.out.println("selected visible text-"+selectedoption.getText());
        }
		
		
		
		

	}

}
