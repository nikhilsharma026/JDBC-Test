package SQL.JDBC;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllWaits {

	static WebDriver driver;
	
	
	public static void main(String[] args) {
	
//	1. driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ; --->Implicit
//	1. driver.manage().timeouts().implicitlyWait(10,TimeUnit.valueOf("30");
		
		
	WebDriverWait wait=new WebDriverWait(driver, 20); 		// --->Explicit
	//wait.until(ExpectedConditions.visibilityOf(element));
//	elementToBeClickable()
//	elementToBeSelected()
//	visibilityOf()
//	visibilityOfAllElements()
//	visibilityOfAllElementsLocatedBy()
//	visibilityOfElementLocated()

	}	
	// 3. Fluent wait(advanced version of explicit with polling frequency)	
	
	public void fluentTest() {
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
			.withTimeout(java.time.Duration.ofSeconds(30)) 			
			.pollingEvery(java.time.Duration.ofSeconds(5)) 			
			.ignoring(NoSuchElementException.class);      //as its caused by implicitwait
	
	WebElement foo = wait.until(new Function<WebDriver, WebElement>() {			//Function is interface
	     public WebElement apply(WebDriver driver) {
	       return driver.findElement(By.id("foo"));
	     }
	   });
	
	
	
	}







}	

