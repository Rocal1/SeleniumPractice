import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rodri\\Documents\\Selenium JARs & WebDrivers\\WebDrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radiobutton1 = driver.findElement(By.id("checkBoxOption1"));
		
		radiobutton1.click();
		Assert.assertTrue(radiobutton1.isSelected(),"Check validation");
		radiobutton1.click();
		Assert.assertFalse(radiobutton1.isSelected(),"Uncheck validation");
		
		int radiobuttons= driver.findElements(By.cssSelector("input[type=\"checkbox\"]")).size();
		
		System.out.println(radiobuttons);
		driver.quit();
	}
}
