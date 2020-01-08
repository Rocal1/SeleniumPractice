import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExamples {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rodri\\Documents\\Eclipse-workspace\\WebDrivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
		
		//Match with some value text
		driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();
		
		//Match with the second following sibling below li[1] of class "responsive-tabs__list"
		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();
		
		//Match with the first ul parent above the element "tablist1-tab2" and get ROLE attribute
		System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));

	}
}

