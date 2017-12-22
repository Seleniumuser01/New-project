package Packageauto;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Chromedraganddrop {
	public static void main(String[] args) throws Exception
	{
		
	
	System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
    String URL="https://dhtmlx.com/docs/products/dhtmlxTree/";
    Actions act=new Actions(driver);
    WebDriverWait wait=new WebDriverWait(driver,90);    
    driver.get(URL);
    //Verify the title is displayed
    wait.until(ExpectedConditions.titleIs("JavaScript Tree Menu - Ajax TreeView - dhtmlxTree"));
    //Take xpath of thriller
 // Take the xpath of thriller
    WebElement from=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='treebox1']/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/span")));
   // Take the xpath of horror from second box
    WebElement to=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='treebox2']/div/table/tbody/tr[2]/td/table/tbody/tr[4]/td/table/tbody/tr/td[4]/span")));
    //..............................
    Point objfrom=from.getLocation();
    //Get X and Y 
    int Frmx=objfrom.getX();
    int Frmy=objfrom.getY();
    
Point objTo=to.getLocation();
   //Get X AND Y
int Tox=objTo.getX();
int Toy=objTo.getY();
//act.dragandDropBy(from,Tox,Toy).perform();
act.clickAndHold(from).perform();
act.moveToElement(to).moveByOffset(Tox,Toy).perform();
act.release(to).perform();
Thread.sleep(6000);
//driver.close();
//driver.quit();
   
    	
    
}
}

