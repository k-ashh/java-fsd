package Spring.AutomateAWebappTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgTest1 {
	WebDriver wd;
	@Parameters("browser")

	@BeforeMethod
	public void config(String browser) {
		
		switch(browser) {
			case "chrome":WebDriverManager.chromedriver().setup();
			wd=new ChromeDriver();
			break;
			case "edge":WebDriverManager.edgedriver().setup();
			wd=new EdgeDriver();
			break;
			
			}
			wd.manage().window().maximize();
			
			
		}

		
	

	@AfterMethod
	public void quitbrowser() {
		wd.quit();
	}
	
	@Parameters("url1")
    @Test(priority = 1)
	  public void testRegister(String url1) throws InterruptedException {
		wd.get(url1);
	    wd.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span/span")).click();
	    Thread.sleep(500);
	    wd.findElement(By.id("createAccountSubmit")).click();
	    Thread.sleep(500);
	    wd.findElement(By.id("ap_customer_name")).sendKeys("Ashutosh");
	    Thread.sleep(500);
	    wd.findElement(By.id("ap_phone_number")).sendKeys("9639444055");
	    Thread.sleep(500);
		wd.findElement(By.id("ap_email")).sendKeys("ashukmr919@gmail.com");
		Thread.sleep(500);
		wd.findElement(By.id("ap_password")).sendKeys("ashu@ku99");
		Thread.sleep(5000);
		wd.findElement(By.id("continue")).sendKeys(Keys.ENTER);
		Thread.sleep(8000);
	    
	  }
	
	@Parameters("url2")
    @Test(priority = 2)
	  public void testLogin(String url2) throws InterruptedException {
		  
		  wd.get("https://www.amazon.in/");
		   wd.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();
		   wd.findElement(By.id("ap_email")).sendKeys("ashukmr919@gmail.com");
		   Thread.sleep(2000);
		   wd.findElement(By.id("continue")).click();
		   wd.findElement(By.id("ap_password")).sendKeys("ashu@ku99");
		   Thread.sleep(2000);
		   wd.findElement(By.id("signInSubmit")).submit();
		   Thread.sleep(8000);
	  }
	
	
	  @Parameters("url3")
	  @Test(priority = 3)
	  public void testInvalidLogin(String url3) throws InterruptedException {
		  wd.get(url3);
		  wd.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();
		   WebElement mail=wd.findElement(By.id("ap_email"));
		   mail.sendKeys("ashukmr919@gmail.com");
		   Thread.sleep(5000);
		   wd.findElement(By.id("continue")).click();
		   WebElement pass=wd.findElement(By.id("ap_password"));
		   pass.sendKeys("");
		   Thread.sleep(5000);
		   if(mail.equals("ashukmr919@gmail.com")&&(pass.equals("ashu@ku99"))) {
			   wd.findElement(By.id("signInSubmit"));
			   System.out.println("Signed In successfully"); 
		   	} 
			else if(mail.equals("")){
				wd.close(); 
				System.out.println("Email Id must not be empty"); 
			} 
			else if(pass.equals("")) {
				wd.close();
				System.out.println("Password must not be empty");
				  
			} else { 
				wd.close();
				System.out.println("Signed In Failed,Invalid Credentials");
				 
			}
	  }
	  @Parameters("url4")
	  @Test
	  public void testSearchandAddToCart(String url4) throws InterruptedException {
		  wd.get(url4);
		  wd.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile phone");
		  Thread.sleep(5000);
		  wd.findElement(By.id("nav-search-submit-button")).click();
		  wd.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img" )).click(); 
		  Thread.sleep(5000);

	  }
}
