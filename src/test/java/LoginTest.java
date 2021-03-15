

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass{
	
	
	@Test
	public void doLogin() {
		driver.findElement(By.id("identifierId")).sendKeys("priyagupta2729@gmail.com");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		
	}

}
