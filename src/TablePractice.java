import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Rodri/Documents/Eclipse-Workspace/WebDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Get number of rows
		List<WebElement> table = driver.findElements(By.cssSelector("table[id='product'] tr"));
		int row = table.size();
		System.out.println("Number of rows is:" + row);
		//Get number of columns		
		List<WebElement> columnsElements = driver.findElements(By.cssSelector("table[id='product'] th"));
		int columns = columnsElements.size();
		System.out.println("Number of rows is:" + columns);
		// Alternative Get number of columns
		WebElement tableElement = driver.findElement(By.id("product"));
		System.out.println(tableElement.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());


		//Get second row
		System.out.println("Second row: \n" + table.get(2).getText());
		
		driver.quit();
	}

}
