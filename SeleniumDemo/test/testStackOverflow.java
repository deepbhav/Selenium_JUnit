import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class testStackOverflow {


	@Test
	void testStack() throws InterruptedException {
		
		WebDriver driver=setEnvForSelenium.setEnv();
		WebElement loginLink = driver.findElement(By.linkText("Log In"));
		
		loginLink.click();
		
   		assertTrue(driver.getPageSource().contains("Email"));
   		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("dbhavale4831@outlook.com");
		
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pass.sendKeys("Deepak@4831");
   		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
		login.click();
//		Thread.sleep(2000);
		
		WebElement profile=driver.findElement(By.xpath("/html/body/header/div/ol/li[2]/a/div[1]/img"));
		profile.click();
		assertTrue(driver.getPageSource().contains("Deepak Bhavale"));

	}

}
