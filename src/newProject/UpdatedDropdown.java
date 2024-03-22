package newProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	     
	     driver.findElement(By.id("divpaxinfo")).click();
	     
	     Thread.sleep(2000L);
	     
	    /* int i=1;
	     while(i<5);
	     {
	    	 driver.findElement(By.id("hrefIncAdt")).click();
	    	 i++;
	    	 
	     }   */
	     
	     System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	     
	     for ( int i=1; i<5; i++ )
	     {
	    	 driver.findElement(By.id("hrefIncAdt")).click();
	    	
	     }
	     
	     driver.findElement(By.id("btnclosepaxoption")).click();
	     System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	     
	    	
	     //xpath--"//a[@value='MAA']"  ---for CHENNAI  (from)    ---- for to ---xpath---"(//a[@value='MAA'])[2]"
	     //xpath-- "//a[@value='BLR']" --- for Bangalore
	     
	     driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	     driver.findElement(By.xpath("//a[@value='BLR']")).click();
	     Thread.sleep(2000);
	     //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	     
	     // instead of index for to place
	     ////div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']  //a[@value='MAA']
	     
	     driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']  //a[@value='MAA']")).click();
	         
	}

}
