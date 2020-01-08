import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class MixOfExercises {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Rodri/Documents/Eclipse-Workspace/WebDrivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Checkbox for Option 2
		WebElement radiobutton2 = driver.findElement(By.id("checkBoxOption2"));
		radiobutton2.click();
		String option = driver.findElement(By.cssSelector("[for=\"benz\"]")).getText().trim();
		
		//Select option from previous action
		Select selection = new Select(driver.findElement(By.id("dropdown-class-example")));
		selection.selectByVisibleText(option);
		
		//Enter option value in Switch to Alert box
		driver.findElement(By.id("name")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
		
		//Switch to alert and verify option text is present
		String alert = driver.switchTo().alert().getText();
		Assert.assertTrue(alert.contains(option));
		System.out.println("PASS");
		
		driver.quit();
	}

}
