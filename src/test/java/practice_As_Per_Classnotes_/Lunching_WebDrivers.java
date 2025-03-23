package practice_As_Per_Classnotes_;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lunching_WebDrivers {
	public static void main(String[] args) {
		
												
		WebDriver driver= new ChromeDriver();     // Initialize WebDriver
		
		driver.get("https://www.google.co.in/");    // Open a website
		
		driver.quit();
	
		
	}
}