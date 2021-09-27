package raw;

import java.sql.Driver;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import jdk.jshell.Diag;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver","C:\\geckoDriver\\geckoDriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		
		List<WebElement>links=driver.findElements(By.xpath("//*[@href]"));
		for(WebElement link:links)
		{
			System.out.println(link.getAttribute("href"));
		}
         driver.findElement(By.id("txtUsername")).sendKeys("Admin");
         driver.findElement(By.id("txtPassword")).sendKeys("admin123");
         driver.findElement(By.id("btnLogin")).click();
         
         driver.findElement(By.id("menu_admin_viewAdminModule")).click();
        
        /* Set obji=new HashSet<>();
         obji.add("a");
         obji.add(1);
         obji.add("a");
         for(Object obj:obji)
         {
        	 System.out.println(obj);
         }
         */
		List<WebElement>allraows=driver.findElements(By.xpath("//table[@id='resultTable']"));
		for(WebElement row:allraows)
		{
		List<WebElement>allcells=row.findElements(By.tagName("td"));
		for(WebElement cells:allcells)
		{System.out.println(cells.getText());
		}

}
	}
}