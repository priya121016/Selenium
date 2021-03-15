

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
   @BeforeSuite
	public void setup() {
	   
	   WebDriverManager.chromedriver().setup();
		
		if(driver==null) {
		driver= new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		
		}
		
	}
   @AfterSuite
   public void teardown() {
	   
	   driver.quit();
   }

}
