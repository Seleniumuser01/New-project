package Packageauto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class DragandropJavaEx 
{
public static void main(String[] args) throws Exception
{

	
		System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		//driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement dragElement=driver.findElement(By.id("draggable"));
		WebElement dropElement=driver.findElement(By.id("droppable"));

		Actions builder = new Actions(driver); // Configure the Action
		Action dragAndDrop = builder.clickAndHold(dragElement)
		.moveToElement(dropElement)
		.release(dropElement)
		.build(); // Get the action
		dragAndDrop.perform(); 
	
	
	
	
	/*
		driver.close();
		driver.quit();*/
		
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	//Create webdriver wait object
	WebDriverWait wait=new WebDriverWait(driver,90);
	//Actions class
	Actions act =new Actions(driver);
	//String URL
	String URL="https://dhtmlx.com/docs/products/dhtmlxTree/";
	driver.get(URL);
	//Verify the title is displayed
	wait.until(ExpectedConditions.titleIs("JavaScript Tree Menu - Ajax TreeView - dhtmlxTree"));
	//Take the xpath of thriller
	WebElement from=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='treebox1']/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/span")));
	//Take the xpath of horror from second box
	WebElement to=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='treebox2']/div/table/tbody/tr[2]/td/table/tbody/tr[4]/td/table/tbody/tr/td[4]/span")));
	//Way 1
	act.clickAndHold(from).perform();
	act.moveToElement(to).perform();
	act.click(to).perform();
	System.out.println("Thriller is moved to Table 2");
	Thread.sleep(2000);
	//Way 2
	Action draganddrop=act.clickAndHold(from)
	.moveToElement(to)
	.click(to)
	.build();
	draganddrop.perform();
	System.out.println("Thriller is moved to Table 2");
	Thread.sleep(2000);		
	driver.close();
	driver.quit();
	//Way 3
	act.dragAndDrop(from,to).perform();
	Thread.sleep(2000);	
	System.out.println("Thriller is moved to Table 2");*/

