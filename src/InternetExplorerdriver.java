import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerdriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\rodri\\Documents\\Selenium JARs & WebDrivers\\WebDrivers\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.quit();
	}
}
