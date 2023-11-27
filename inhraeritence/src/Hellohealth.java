import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hellohealth {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shreeya\\Desktop\\automation\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://hellohealth.com/");
		Thread.sleep(2000); 
        driver.manage().window().maximize();
        
 	    WebElement accept=driver.findElement(By.xpath("//a[@class='modal-cacsp-btn modal-cacsp-btn-accept']"));
  	    accept.click();
  	    
  	    WebElement Login=driver.findElement(By.xpath("(//a[@href='https://consumer.hellohealth.com/login'])[1]"));
  	    Login.click();
  	    ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
        //switch to active tab
        driver.switchTo().window(wid.get(1));
        String sr1=driver.getTitle();
        System.out.println(sr1);
        Thread.sleep(2000);
  	    WebElement Email=driver.findElement(By.xpath("//input[@type='email']"));
  	    Email.sendKeys("amruta.rd55@yahoo.com");
  	    WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
    	password.sendKeys("Shreeya24*");
  	    WebElement SignIn=driver.findElement(By.xpath("//button[@type='submit']"));
  	    SignIn.click();
  	   	// WebElement Search=driver.findElement(By.xpath("//button[@id='searchClick']"));
  	   	 WebDriverWait wait = new WebDriverWait(driver, 70);
  	     WebElement Search=   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='searchClick']")));
  	   // Thread.sleep(4000);
  	    Search.click();
  	    Thread.sleep(2000);
  	    WebElement Block2=driver.findElement(By.xpath("//li[@title='2']"));
       ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", Block2);
        Block2.click();
//  	    JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,7000)", "");
        System.out.println("hello");

	}}
