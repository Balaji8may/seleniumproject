package elementeryreporsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	 WebDriver driver;
		public Homepage(WebDriver driver) { 
		   this.driver=driver;
		PageFactory.initElements(driver, this);
		}
				
		@FindBy(className = "bm-burger-button")
		private WebElement menuButton;
		
		@FindBy(id = " ")
		private WebElement cartButton;

		@FindBy(className = " ")
		private WebElement sortDropdown;
		
		@FindBy(className = " ")
		private WebElement sortDropdown;
}
