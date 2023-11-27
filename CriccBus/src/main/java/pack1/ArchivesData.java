package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArchivesData {
	
		
		@FindBy(xpath="(//a[text()='Teams'])")
		public WebElement archivesTeams;
		
		
		public ArchivesData(WebDriver driver) {
			
		PageFactory.initElements(driver, this);
		}
		
		public void clickOnTeamsArchives() {
			archivesTeams.click();
		}

}
