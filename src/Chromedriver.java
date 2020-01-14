import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		//Create Driver object whith ChromeDriver
		// Invoke first the .exe files
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rodri\\Documents\\Selenium JARs & WebDrivers\\WebDrivers\\chromedriver.exe");
		//Instance the class WebDriver and create a new instance of ChromeDriver
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(2000L);
		driver.quit();
	}

}
