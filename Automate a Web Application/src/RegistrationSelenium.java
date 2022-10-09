import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class RegistrationSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		// configuring the web-driver	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashuk\\Desktop\\jar_files\\95\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		
		// maximizing the screen
		wd.manage().window().maximize();
		Thread.sleep(2000);
		
		// setting the URL
		wd.get("https://www.amazon.com/");
		Thread.sleep(1000);
		
		// Finding the sign up option
	    wd.findElement(By.linkText("Start here.")).click();
	    Thread.sleep(1000);
	    
	    // Entering the details 
		wd.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("Ashutosh");
		Thread.sleep(1000);
		wd.findElement(By.id("ap_email")).sendKeys("ashukmr919@gmail.com");
		Thread.sleep(1000);
		wd.findElement(By.id("ap_password")).sendKeys("ashu@tosh99");
		Thread.sleep(1000);
		wd.findElement(By.id("ap_password_check")).sendKeys("ashu@tosh99");
		Thread.sleep(1000);
		
		// signing up
		wd.findElement(By.id("continue")).sendKeys(Keys.ENTER);
	    //wd.close();
	}

}
