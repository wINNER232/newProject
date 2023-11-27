package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePojo {
	
	
	public static WebDriver  OpenChromeDriver()
	 {
 		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shreeya\\Desktop\\automation\\chromedrivernew\\chromedriver.exe");
 		WebDriver driver= new ChromeDriver();
 		return driver;
		
	 }
	public static WebDriver FirefoxDriver  ()
	 {
	    System.setProperty("webdriver.gecko.driver","C:\\Users\\Shreeya\\Desktop\\automation\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		 WebDriver driver= new FirefoxDriver(); 
		return driver;
		
	 }


}
