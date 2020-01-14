import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class Firefoxdrive {
		
	public static void main (String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rodri\\Documents\\Selenium JARs & WebDrivers\\WebDrivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://google.com");
		String g= driver.getTitle();
		System.out.println(g);
		
		driver.get("https://facebook.com");
		String f= driver.getTitle();
		System.out.println(f);
		Assert.assertNotEquals(f, g);
		driver.quit();
	}
}
