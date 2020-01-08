import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker_Calendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Rodri/Documents/Eclipse-Workspace/WebDrivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		//Select May 21
		driver.findElementByXPath(".//*[@id='travel_date']").click();

		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
				.contains("Jun")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}

		List<WebElement> dates = driver.findElements(By.className("day"));
		
		//Grab common attribute//Put into list and iterate
		for (int i = 0; i < dates.size(); i++) {
			String text = dates.get(i).getText();
			if (text.equalsIgnoreCase("25")) {
				dates.get(i).click();
				break;
			}
		}
	}
}
