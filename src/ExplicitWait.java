import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Rodri/Documents/Eclipse-Workspace/WebDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		driver.navigate().to("http://www.itgeared.com/demo/1506-ajax-loading.html");
		WebElement link = driver.findElement(By.linkText("Click to load get data via Ajax!"));
		link.click();
		WebElement messageElement = driver.findElement(By.id("results"));
		wait.until(ExpectedConditions.visibilityOf(messageElement));
		String message=messageElement.getText(); 
		Assert.assertEquals(message, "Process completed! This response has been loaded via the Ajax request directly from the web server, without reoading this page.");
		System.out.println("PASS");
	}

}
