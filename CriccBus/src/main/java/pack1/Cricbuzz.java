package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cricbuzz {
	
	@FindBy(xpath="//a[text()='Archives']")
	public WebElement archives;
	
	
	//public constructor
	
	public Cricbuzz(WebDriver driver) {
		
	PageFactory.initElements(driver, this);
	}
	
	//public methods 
	
	public void Archives() {
		archives.click();
	}

}
