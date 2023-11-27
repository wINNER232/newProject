import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autopro1 {
		public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shreeya\\Desktop\\automation\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000); 
        driver.manage().window().maximize();
        
  	    WebElement cancel=driver.findElement(By.xpath("//span[@role='button']"));
  	    cancel.click();
  	    
         WebElement helpCenter=driver.findElement(By.xpath("//a[@aria-label='Help Center']"));
                
         ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", helpCenter);
         helpCenter.click();
        
         String st= driver.getCurrentUrl();//test case for the 
         System.out.println(st);
         
         WebElement FlipLogo=driver.findElement(By.xpath("//img[@title='Flipkart']"));
         FlipLogo.click();
         
         String st1=driver.getCurrentUrl();
         System.out.println(st1);
         List<WebElement> links=driver.findElements(By.tagName("a"));
         for (WebElement link : links) { 
          System.out.println(link.getText()); 
         }
             System.out.println("The number of links is " + links.size());                         
             WebElement search=driver.findElement(By.xpath("//input[@type='text']"));
             search.sendKeys("surf ");
             Thread.sleep(2000);
             search.sendKeys(Keys.ENTER); 
             WebElement ItemSelect=driver.findElement(By.xpath("//div[@data-id='LDGGJAGXMBW5TF9S']"));
             Thread.sleep(2000);
             ItemSelect.click();
             String sr=driver.getTitle();
             String sts=   driver.getCurrentUrl();
             System.out.println(sts);
             System.out.println(sr);
             
             ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
             //switch to active tab
             driver.switchTo().window(wid.get(1));
             WebElement PinCode=driver.findElement(By.xpath("//input[@id='pincodeInputId']"));
             PinCode.click();
             PinCode.sendKeys("110005");
             WebElement check=driver.findElement(By.xpath("//span[text()='Check']"));
             check.click();
            // ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", AddToCart);
             JavascriptExecutor js = (JavascriptExecutor) driver;
             js.executeScript("window.scrollBy(0,2000)", "");
             Thread.sleep(2000);
             WebElement AddToCart=driver.findElement(By.xpath("//button[text()='Add to cart']"));
             Thread.sleep(2000);
             AddToCart.click();
           WebElement ItemInCart=driver.findElement(By.xpath("//a[text()='Surf Liquid Fresh Lavender 648ml 24 Wash Lavender Liquid Detergent']"));  
           Thread.sleep(3000);
//            
//           WebElement PlaceOrder=driver.findElement(By.xpath("//span[text()='Place Order']"));
//           PlaceOrder.click();
             
          //   driver.quit();
       		
	}

	}
