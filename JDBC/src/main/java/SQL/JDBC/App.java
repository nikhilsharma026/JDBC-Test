package SQL.JDBC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
   @Test
   public void test() {
    	
    	WebDriver driver=new FirefoxDriver();
        System.out.println( "Hello World!" );
        System.out.println( "Hello World2!" );
        System.out.println( "Hello World3!" );
        
        //Cookie is a small piece of data that contains user info and his preferneces in form of key value pairs.
        // Sent by web application and stored in browser.
        
        //Explicit wait for ajax elements as it can wait for them till theyr etrieve data from server and become visisble
        
        
        //js.executeScript("arguments[0].scrollIntoView();", Element);  -->scroll the page till the element is found
        //js.executeScript("window.scrollBy(0,1000)")
        // 	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
     
        
        
        //Object repositories can be .properties or .xml files.
        
        
        //Cucumber is a testing approach which supports Behavior Driven Development (BDD). It explains the behavior of the application in a simple English text using Gherkin language.
        
        driver.manage().getCookies();   // Return The List of all Cookies
        driver.manage().getCookieNamed("cookiename");  //Return specific cookie according to name
        //driver.manage().addCookie();   //Create and add the cookie
        //driver.manage().deleteCookie();  // Delete specific cookie
        driver.manage().deleteCookieNamed("cookiename"); // Delete specific cookie according Name
        driver.manage().deleteAllCookies();  // Delete all cookies
    }
}
