package TestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.util;

public class NaukriAutomate  extends util{

	WebDriver driver;
	
	
	@BeforeTest
	public void BeforeMethod() {
		System.setProperty("webdriver.chrome.driver",
			    "C:\\Users\\HP\\git\\Naukri\\Demo_For_Naukri\\drivers\\chromedriver-win64\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				 driver = new ChromeDriver(options);
				driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
				driver.manage().window().maximize();
	}
	
	
	@Test
	public void VeifyNaukri() throws InterruptedException {
		
				
				
				Thread.sleep(500);
				driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("vaishubgawande@gmail.com");
				
				driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("Vaishnavi@123");
				Thread.sleep(500);
				driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
				
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[text()='View' and text()=' profile']")).click();
				Thread.sleep(500);
				JavascriptExecutor js = ((JavascriptExecutor)driver);
				js.executeScript("window.scrollBy(0,100)","");
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"lazyResumeHead\"]/div/div/div[1]/span[2]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("/html/body/div[6]/div[8]/div[2]/form/div[3]/div/button")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div[@class='nI-gNb-bar2']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				
	}
	
				@AfterTest
				public void TearDown() {
					driver.close();
					
				}
				
				
				
				
				
	}

