import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FacebookElement {
	
	public static void main(String[] args) {

		// Invoke first the webdriver with the key and the path of the '.exe' file
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rodri\\Documents\\Selenium JARs & WebDrivers\\WebDrivers\\chromedriver.exe");
		
		//Instance the class WebDriver and create a new instance of ChromeDriver
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("XXXXX@hotmail.com");
		
		//Set a valid password to logs in successfully on Facebook page
		driver.findElement(By.id("pass")).sendKeys("XXXXXXXXXXXXXXXXX");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		try {
			WebElement intro = driver.findElement(By.cssSelector("#contentArea"));
			if(intro.isDisplayed()==true) {
				System.out.println("Log in Succesfully");
			}
		}
		catch (Exception e) {
			System.out.println("Unable to Log in on Facebook");
		}
		driver.quit();
	}
}
