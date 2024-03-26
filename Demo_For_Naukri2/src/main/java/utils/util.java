package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class util {
	WebDriver driver;
	
	public void Start()
	{
		System.setProperty("webdriver.chrome.driver",
			    "C:\\Users\\HP\\git\\DMS-ERP-TESTING\\DinshawsTesting\\Drivers\\chromedriver-win64\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				WebDriver driver = new ChromeDriver(options);
				driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
				driver.manage().window().maximize();
	}
}
