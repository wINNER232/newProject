package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeamsNations {
	
	@FindBy(xpath="(//a[text()='Live Scores'])")
	public WebElement archivesTeams;
	
	
	public TeamsNations(WebDriver driver) {
		
	PageFactory.initElements(driver, this);
	}
	
	public void clickOnIndia() {
		archivesTeams.click();
	}

}
