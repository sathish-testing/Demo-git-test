package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Git {

	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		long startTime=System.currentTimeMillis();
		driver.get("https://dev.ninocity.com");
		long endTime=System.currentTimeMillis();
		long totalTime=endTime - startTime;
		System.out.println("Total url load time : "+totalTime +"milliseconds");
		long seconds = TimeUnit.MILLISECONDS.toSeconds(totalTime);
		System.out.println("Total url load time in sec : "+seconds +"seconds");
	}
	@Test
	public void signup() throws InterruptedException
	{
		System.out.println("Home Page Title->"+driver.getTitle());
		System.out.println("HomePage_|URL->"+driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Create your account")).click();
		Thread.sleep(2000);
		System.out.println("Sign_Up URL->"+driver.getCurrentUrl());
		try
		{
		driver.findElement(By.className("_1nnEY")).click();
		System.out.println("Next Button is Clickable when SignUp page is open");
		}
		catch(Throwable t)
		{
			System.out.println("Next Button is not clickable when signUp page is open");
		}
		driver.findElement(By.id("firstName")).sendKeys("Arumugam");
		try
		{
		driver.findElement(By.className("_1nnEY")).click();
		System.out.println("Next Button is Clickable when after enter FirstName");
		}
		catch(Throwable t)
		{
			System.out.println("Next Button is not clickable when after enter FirstName");
		}
		driver.findElement(By.id("secondName")).sendKeys("Sathish");
		try
		{
		driver.findElement(By.className("_1nnEY")).click();
		System.out.println("Next Button is Clickable when after enter SecondName");
		}
		catch(Throwable t)
		{
			System.out.println("Next Button is not clickable when after enter SecondName");
		}
		driver.findElement(By.id("email")).sendKeys("hello11@zetmail.com");
		try
		{
		driver.findElement(By.className("_1nnEY")).click();
		System.out.println("Next Button is Clickable when after enter EmailID");
		}
		catch(Throwable t)
		{
			System.out.println("Next Button is not clickable when after enter EmailID");
		}
		driver.findElement(By.id("password")).sendKeys("welcome");
		try
		{
		driver.findElement(By.className("_1nnEY")).click();
		System.out.println("Next Button is Clickable when after enter Password");
		}
		catch(Throwable t)
		{
			System.out.println("Next Button is not clickable when after enter Password");
		}
		driver.findElement(By.className("passwordRevealer")).click();
		
		driver.findElement(By.className("_1nnEY")).click();
		System.out.println("*********SignUp Address field is Completed*******************");
		Thread.sleep(2000);
	}
	@AfterClass
	public void end()
	{
		driver.quit();
	}
}
