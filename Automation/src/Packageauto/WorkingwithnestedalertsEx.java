package Packageauto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingwithnestedalertsEx
{
public static void main(String[] args) 
{
	
System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
//Create a webdriver object
ChromeDriver driver=new ChromeDriver();
//Create a new webdriver wait object
WebDriverWait Wait=new WebDriverWait(driver, 60);
//open URL
driver.get("http://apps.qaplanet.in/WebApp/NestedAlerts.html");
//To verify the element is displayed as the title is not present
WebElement objSubmit=Wait.until(ExpectedConditions.presenceOfElementLocated(By.name("Submit")));
//Choose answer
driver.findElement(By.xpath("//html/body/input[4]"));
objSubmit.click();
//Wait for confirmation alert
Alert A=Wait.until(ExpectedConditions.alertIsPresent());
if(A.getText().equals("Are you sure you want to submit this answer?"))
{
System.out.println("Confirmation displayed");
A.accept();
	
Alert A1=Wait.until(ExpectedConditions.alertIsPresent());
if(A1.getText().equals("submitted"))
{
	System.out.println("submitted is displayed");
	A1.accept();
}
}
driver.close();
driver.quit();
}
}
