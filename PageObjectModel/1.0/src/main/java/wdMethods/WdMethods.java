package wdMethods;

import java.net.MalformedURLException;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public interface WdMethods {
		
	
		 
		 
		public void startApp(String browser) throws MalformedURLException ;

		/**
		 * This method will locate the element using any given locator
		 
		 */
		public WebElement locateElement(String locator, String locValue) ;	
		
		/**
		 * This method will locate the element using id
		 *
		 */
		public WebElement locateElement(String locValue) ;	
		
		/**
		 * This method will enter the value in the given text field 
		 *		 * 
		 */
		public void type(WebElement ele, String data) ;
		
		/**
		 * This method will click the element and take snap
		 */
		public void click(WebElement ele);

		/**
		 * 
		public String getText(WebElement ele);

		/**
		 * This method will select the drop down visible text
		 * 
		 */
		public void selectDropDownUsingText(WebElement ele, String value) ;
		
		/**
		 *This method will get the text of the element
	 
	 */
	public String getText(WebElement ele);
	
		
		
		/**
		 * This method will verify exact given text with actual text on the given element
		 		 */
		public void verifyExactText(WebElement ele, String expectedText);
		
		 /* This method will take snapshot of the browser
		 
		 */
		public long takeSnap();
			
		/**
		 * This method will close the active browser
		
		 */
		public void closeBrowser();		
		
		
}



