package Packageauto;

import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EX {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    String URL="https://dhtmlx.com/docs/products/dhtmlxTree/";
	    Actions builder = new Actions(driver); 
	    WebDriverWait wait=new WebDriverWait(driver,90);    
	    driver.get(URL);
	    //Verify the title is displayed
	    wait.until(ExpectedConditions.titleIs("JavaScript Tree Menu - Ajax TreeView - dhtmlxTree"));
	    //Take xpath of thriller
	
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(0,1000)");
	    
	    Thread.sleep(6000);
	    // Take the xpath of thriller
	    WebElement from=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='treebox1']/div/table/tbody/tr[3]/td[2]/table/tbody/tr[1]/td[4]/span")));
	   // Take the xpath of horror from second box
	    WebElement to=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[6]/td[2]/table/tbody/tr[1]/td[4]/span")));
	    Thread.sleep(2000);
	  // from.click();
	    
	   // Configure the Action
	   builder.clickAndHold(from).perform();
	   Thread.sleep(2000);
	  builder.moveToElement(to).release().perform();
	   
	    System.out.println("hello");
	    
	/* Action dragAndDrop = builder.clickAndHold(from)
						
		.moveToElement(to)
		.release(to)
		.build(); // Get the action
		dragAndDrop.perform(); */
	    
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
