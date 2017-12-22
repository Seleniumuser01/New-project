package Packageauto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivercommands {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\tet\\Selenium_Demp\\chromedriver_win32\\chromedriver.exe");
		//
			ChromeDriver driver=new ChromeDriver();
			//url
			driver.get("http://apps.qaplanet.in/WebApp/AssertXPath.html");
			List<WebElement> clascount= driver.findElements(By.className("className"));
			System.out.println(clascount.size());
			//Get buttons count
			List<WebElement> bc=driver.findElements(By.className("button"));
			System.out.println("buttons count is" +bc.size());
			//link size
			int lc=driver.findElements(By.tagName("a")).size();
			System.out.println("links count is"+lc);
			//int row count
			int rc=driver.findElements(By.xpath("//table/tbody/tr")).size();
			//int columns count
			System.out.println("rows count is" +rc);
			int colc=driver.findElements(By.xpath("//table/tbody/tr[1]/td")).size();
			System.out.println("columns count is" +colc);
			//to get cell count
			int cc=driver.findElements(By.xpath("//table/tbody/tr/td")).size();
			System.out.println("cell count is" +cc);
			
			driver.close();
			driver.quit();

		
		
	}

}
