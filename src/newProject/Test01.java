package newProject;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//url
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
// destination
		driver.findElement(By.xpath("//p-autocomplete[@id='origin']")).click();
		List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox'] //li[@role='option']"));
		int noOfStations = options.size();
		System.out.println("No of stations = " + noOfStations);

		for (int i = 0; i < options.size(); i++) {
			String nameOfStation = options.get(i).getText();
			if (nameOfStation.contains("SECUNDERABAD")) {
				driver.findElements(By.xpath("//ul[@role='listbox'] //li[@role='option']")).get(i).click();
				break;
			}
		}

// destination
		driver.findElement(By.xpath("//p-autocomplete[@id='destination']")).click();
		List<WebElement> destination_options = driver
				.findElements(By.xpath("//ul[@ role=\"listbox\"] //li[@role='option']"));

		for (int i = 0; i < destination_options.size(); i++) {
			String nameOfDestination = destination_options.get(i).getText();

			if (nameOfDestination.contains("DELHI")) {
				driver.findElements(By.xpath("//ul[@ role=\"listbox\"] //li[@role='option']")).get(i).click();
				break;
			}
		}

//General

		driver.findElement(By.xpath("//p-dropdown[@id='journeyQuota']")).click();

		List<WebElement> general = driver
				.findElements(By.xpath("//p-dropdown[@id='journeyQuota']//ul [@role='listbox']"));

		for (int i = 0; i < general.size(); i++) 
		{
			String type = general.get(i).getText();

			if (type.contains("LADI")) {
				driver.findElements(By.xpath("//p-dropdown[@id='journeyQuota']//ul [@role='listbox']")).get(i).click();
				break;
			}
		}
//callender Month
		
		driver.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']")).click();

//		WebElement nextButton = driver.findElement(By.cssSelector("a[class='ui-datepicker-next ui-corner-all ng-tns-c58-10 ng-star-inserted']"));
		String month = driver.findElement(By.cssSelector("span[class*='ui-datepicker-month']")).getText();
		// ! --> nagation 
		// May  --> June
		while(!month.contains("June"))
		{
			driver.findElement(By.cssSelector("a[class='ui-datepicker-next ui-corner-all ng-tns-c58-10 ng-star-inserted']")).click();
			month = driver.findElement(By.cssSelector("span[class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
			// may
		}
	
//date
	  List<WebElement> dates = driver.findElements(By.xpath("//tbody/tr/td"));
		driver.findElement(By.xpath("//a[@class='ui-state-default ng-tns-c58-10 ui-state-active ng-star-inserted'] ")).click();

		
		
	  /*for (int i = 0; i < dates.size(); i++) 
		{
			String mnth_date = dates.get(i).getText();

			if (!mnth_date.contains("5"))
			{   */
				
				//driver.findElements(By.xpath("//a[@class='ui-state-default ng-tns-c58-10 ui-state-active ng-star-inserted'] ")).click();
				//break;
			//}
		}
		
		
		
		
		
		
		
		
		// driver.close();

	}

}
