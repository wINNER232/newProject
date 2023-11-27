package Tempack1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BasePojo;
import pack1.ArchivesData;
import pack1.Cricbuzz;
import pack1.TeamsNations;
import utils.utill;



public class TestNG2Cricc  
{
    WebDriver driver; 
    Cricbuzz cricbuzz;
    ArchivesData archivesData;
    TeamsNations teamsNations;
    int testID;
    @Parameters ("browser")
    @BeforeTest
    public void launchbrowser(String browserName)
  {
        if(browserName.equals("Chrome"))   
     	   { 		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shreeya\\Desktop\\automation\\chromedrivernew\\chromedriver.exe");

     		driver= new ChromeDriver(); // launch the browser
     	   }
        if(browserName.equals("FireFox"))   
        {	
    		 driver= new FirefoxDriver(); 
         }
             driver.manage().window().maximize();
         	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         	driver.get("https://www.cricbuzz.com/");

       }
    @BeforeClass
	public void criccbuzzUrlLaunch()
	{
    	cricbuzz=new Cricbuzz(driver);
    	archivesData=new ArchivesData(driver);
	    teamsNations=new TeamsNations(driver);
}

@Test
public void  teamsArchives()
{   
	testID=1001;
	System.out.println("Before Method ");
	String s=driver.getCurrentUrl();
	System.out.println(s);
	Assert.assertEquals(s, "https://www.cricbuzz.com/");
//		if(s.equals("https://www.cricbuzz.com"))
//		{
//		System.out.println("test pass ");
//		}
//		else
//		{
//		System.out.println("test fail");
//	    }
    cricbuzz.Archives();
	System.out.println("test running");
	archivesData.clickOnTeamsArchives();
	String s1=driver.getCurrentUrl();
    System.out.println(s1);	 
	Assert.assertEquals(s1, "https://www.cricbuzz.com/crcket-team");
	cricbuzz.Archives();
  }	  
	 @Test
	  public  void test1()
	     {testID=1002;
			    teamsNations.clickOnIndia();
			    String s2= driver.getCurrentUrl();
			    System.out.println(s2);  
			    Assert.assertEquals(s2, "https://www.crcbuzz.com/cricket-match/live-scores");

		  } 
	 @AfterMethod
	 public void aftermethod(ITestResult result ) throws IOException
	 {System.out.println("aftermethod");
        if(ITestResult.FAILURE==result.getStatus())
	 {
       utill.captureScreenShot(driver, testID);		 }
        System.out.println("jljolkl.");
	 }
	 
	 @AfterClass
		public void clenPOMObject()
		{
		      cricbuzz =null;
		      archivesData =null;
		      teamsNations 	=null  ;
		}
		 @AfterTest
		   public void afterClass()
		  {
		    System.out.println("After method");
			driver.close();
			System.gc();
		  }
	 }
