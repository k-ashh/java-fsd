import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		// configuring the web-driver		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashuk\\Desktop\\jar_files\\95\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		
		// maximizing the screen
		wd.manage().window().maximize();
		Thread.sleep(1000);
		
		// setting the URL
		wd.get("https://www.amazon.com/");
		Thread.sleep(1000);
		
		// Finding the sign in option
		wd.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();
		Thread.sleep(1000);
		
		// Giving the entries
		wd.findElement(By.id("ap_email")).sendKeys("ashukmr919@gmail.com");
		Thread.sleep(1000);
		wd.findElement(By.id("continue")).click();
		Thread.sleep(1000);
		wd.findElement(By.id("ap_password")).sendKeys("ashu@ku99");
		Thread.sleep(1000);
		
		// logging in
		wd.findElement(By.id("signInSubmit")).submit();
		//wd.close();

	}

}
