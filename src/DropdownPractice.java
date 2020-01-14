import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownPractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rodri\\Documents\\Selenium JARs & WebDrivers\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement country= driver.findElement(By.id("autocomplete"));
		country.sendKeys("uni");
		//Gets the text presented in the field using JS DOM
		JavascriptExecutor js= (JavascriptExecutor) driver;
		String text = js.executeScript("return document.getElementById(\"autocomplete\").value;").toString();
		int i=0;
		while (!text.contains("United States") && i<10) {
			country.sendKeys(Keys.DOWN);
			//Gets the text presented in the field using JS DOM
			text= js.executeScript("return document.getElementById(\"autocomplete\").value;").toString();
			
			i++;
		}
		if (i==10) {
			System.out.println("Element not found");
		} else {
			country.sendKeys(Keys.ENTER);
			System.out.println("Element found is: " + text);
		}
		
		driver.quit();
	}
}
