import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Rodri/Documents/Eclipse-Workspace/WebDrivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String text= "Rodrigo";
		//Write a string inside the label
		WebElement alertlabel = driver.findElement(By.id("name"));
		alertlabel.sendKeys(text);
		Thread.sleep(2000);
		
		//Click on Alert and Accept the alert
		WebElement alertbtn = driver.findElement(By.id("alertbtn"));
		alertbtn.click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//Click on Confirm and Cancel the alert
		WebElement confirmbtn = driver.findElement(By.id("confirmbtn"));
		confirmbtn.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		driver.quit();
	}
		
}
