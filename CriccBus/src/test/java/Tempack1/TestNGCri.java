package Tempack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
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

public class TestNGCri {
     WebDriver driver; 
     Cricbuzz cricbuzz;
     ArchivesData archivesData;
     TeamsNations teamsNations;
      
      @Parameters ("browser")
      @BeforeTest
      public void launchbrowser(String browserName)
      {
          if(browserName.equals("Chrome"))   
       	   { 		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shreeya\\Desktop\\automation\\chromedrivernew\\chromedriver.exe");

       		driver= new ChromeDriver(); // launch the browser
       	   }
    System.out.println("hi");
          if(browserName.equals("FireFox"))   
          {	
      		 driver= new FirefoxDriver(); 
           }
               driver.manage().window().maximize();
           	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         }
      
      @BeforeClass
   	public void creatPOMObject()
   	{ 
    	   cricbuzz=new Cricbuzz(driver);
	       archivesData=new ArchivesData(driver);
		    teamsNations=new TeamsNations(driver);
			driver.get("https://www.cricbuzz.com/"); 
   	}@Test
     public void test()
	  {     
	        cricbuzz.Archives();
			System.out.println("test running");
			archivesData.clickOnTeamsArchives();
			String s1=driver.getTitle();
		    System.out.println(s1);	    	
			if(s1.equals("Live Cricket Score, Schedule, Latest News, Sta & Videos | Cricbuzz.com"))
			{
			System.out.println("test pass ");
			}
			else
			{
			System.out.println("test fail");
			}
			cricbuzz.Archives();
	  }	  
  @Test
  public  void test1()
     {
		    teamsNations.clickOnIndia();
		    String s2= driver.getCurrentUrl();
		    System.out.println(s2);    	
		    if(s2.equals("https://www.cricbuzz.com/cricket-mat/live-scores"))
		    {
		   	System.out.println("page navigated to correct destination  test pass");	  
			}
		    else
		    {
		    System.out.println("page navigated to wrong page test fail");
		    }
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