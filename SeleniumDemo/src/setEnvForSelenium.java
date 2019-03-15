import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class setEnvForSelenium {
	public static WebDriver setEnv()
	{
		System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS); 
		driver.get("https://stackoverflow.com/");
		
		return driver;
	}
}
