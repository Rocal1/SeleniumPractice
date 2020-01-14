import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowsHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rodri\\Documents\\Selenium JARs & WebDrivers\\WebDrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		//get windows handling 
		Set<String> handle = driver.getWindowHandles();
		//make that handle iterable
		Iterator<String> it = handle.iterator();
		String currentWindows = it.next();
		String newWindows = it.next();
		
		//Switch and show message displayed in new windows
		driver.switchTo().window(newWindows);
		System.out.println(driver.findElement(By.className("example")).getText());
		
		//SwitchBack and show title displayed in previous windows
		driver.switchTo().window(currentWindows);
		System.out.println(driver.findElement(By.cssSelector("div[class='example']> h3")).getText());
				
		
	}
}
