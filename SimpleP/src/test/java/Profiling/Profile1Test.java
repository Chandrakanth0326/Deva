package Profiling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Profile1Test 
{
	@Test(groups="SmokeTest")
	public void hiTest()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.close();
	}
	@Test(groups="RegressionTest")
	public void hiiTest()
	{
		System.out.println("hi regression");
		System.out.println("hi smoke");
	}

}
