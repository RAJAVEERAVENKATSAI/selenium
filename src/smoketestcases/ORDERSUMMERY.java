package smoketestcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ORDERSUMMERY {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ulta.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.cssSelector("button[class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]")).click();
		driver.findElement(By.cssSelector("svg[class=\"pal-c-Icon pal-c-Icon--size-xl pal-c-Button__icon pal-c-Button__icon--before\"]")).click();
		driver.findElement(By.name("username")).sendKeys("ntr@gmail.com");
		driver.findElement(By.id("password")).sendKeys("NtR@54321");
		driver.findElement(By.xpath("(//button[@name=\"action\"])[2]")).click();
		WebElement sai = driver.findElement(By.id("search"));
		sai.sendKeys("Nano Titanium Dryer");
		sai.submit();
		driver.findElement(By.xpath("//img[@alt=\"BaBylissPRO Nano Titanium Dryer\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default AddToBagButton__AddToBag\"]")).click();
		driver.findElement(By.xpath("//a[@class=\"pal-c-Link pal-c-Link--buttonPrimary pal-c-Link--compact\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"pal-c-Button pal-c-Button--primary pal-c-Button--default CartActions__CheckoutButton\"]")).click();
		String Subtotal = driver.findElement(By.xpath("(//span[@class=\"Text-ds Text-ds--body-2 Text-ds--right Text-ds--neutral-600\"])[1]")).getText();
		System.out.println("subtotal =" +Subtotal);
		String Shipping = driver.findElement(By.xpath("(//span[@class=\"Text-ds Text-ds--body-2 Text-ds--right Text-ds--neutral-600\"])[2]")).getText();
		System.out.println("shipping="+Shipping);
		String Tax = driver.findElement(By.xpath("//span[contains(text(),'$5.71')]")).getText();
		System.out.println("Tax =" +Tax);
		double subtotal = Double.parseDouble(Subtotal.replace("$",""));
		double tax = Double.parseDouble(Tax.replace("$",""));
		double taxrate =  (tax * 100) / (subtotal);
		System.out.printf("Tax Rate:%.2f%%\n",taxrate);
		double calculatedTax = ((subtotal) * taxrate) / 100;
		System.out.printf("Calculated Tax:$%.2f\n",calculatedTax);
		if(Math.abs(tax - calculatedTax) < 0.01) {
			System.out.println("Tax matches");
			
		}else {
			System.out.println("Tax doesnt matches");
		}
	}

}
