package Tempack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pack1.ArchivesData;
import pack1.Cricbuzz;
import pack1.TeamsNations;

public class Testcalss {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shreeya\\Desktop\\automation\\chromedrivernew\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver(); // launch the browser
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://www.cricbuzz.com/");
	
	Cricbuzz cricbuzz=new Cricbuzz(driver);
	cricbuzz.Archives();
	
	ArchivesData archivesData=new ArchivesData(driver);
	archivesData.clickOnTeamsArchives();
	
    TeamsNations teamsNations=new TeamsNations(driver);
    teamsNations.clickOnIndia();
	}
}
