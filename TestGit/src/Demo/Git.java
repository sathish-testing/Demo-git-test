package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
		System.out.println("Success the value");
	}
	@Test
	public void country() throws InterruptedException
	{
		System.out.println("************SignUp Country field starting**********************");
		try
		{
		driver.findElement(By.className("_1nnEY")).click();
		System.out.println("Next Button is Clickable when before select country");
		}
		catch(Throwable t)
		{
			System.out.println("Next Button is not clickable when before select country");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div[2]/form/div[1]/div/div[2]")).click();
		Thread.sleep(2000);
		for(int i=1;i<=3;i++)
		{
			driver.findElement(By.xpath("//*[@id=\"myDropdown\"]/div/a["+i+"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div[2]/form/div[1]/div/div[2]")).click();
			Thread.sleep(3000);
		}
		driver.findElement(By.partialLinkText("Ireland")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("_1nnEY")).click();
		Thread.sleep(2000);
		String PL1=driver.findElement(By.id("countryName")).getAttribute("value");
		System.out.println("Country Name-->"+PL1);
		for(int j=1;j<=3;j++)
		{
			String PL=driver.findElement(By.xpath("//*[@id=\"address"+j+"\"]")).getAttribute("placeholder");
			System.out.println("Ireland Placeholder-->"+PL);
		}
		Thread.sleep(2000);
		String PL2=driver.findElement(By.id("city")).getAttribute("placeholder");
		System.out.println("Ireland Placeholder-->"+PL2);
		Thread.sleep(2000);
		String PL3=driver.findElement(By.id("county")).getAttribute("placeholder");
		System.out.println("Ireland Placeholder-->"+PL3);
		Thread.sleep(2000);
		String PL4=driver.findElement(By.id("postcode")).getAttribute("placeholder");
		System.out.println("Ireland Placeholder-->"+PL4);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div[2]/form/div[1]/div/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("United Kingdom")).click();
		Thread.sleep(2000);
		String PL5=driver.findElement(By.id("countryName")).getAttribute("value");
		System.out.println("Country Name-->"+PL5);
		String PL6=driver.findElement(By.id("postcode")).getAttribute("placeholder");
		System.out.println(PL5+" placeholder-->"+PL6);
		Thread.sleep(2000);
		try
		{
		boolean but=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/form/div[1]/div/div/button")).isEnabled();
		System.out.println("Find Button Before Status-->"+but);
		System.out.println("The button is enabled and clickabled");
		}
		catch(Throwable t)
		{
			System.out.println("The Find Button is disabled and non-clickable");
		}
		Thread.sleep(2000);
		driver.findElement(By.id("postcode")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("postcode")).sendKeys("sw1a1aa");
		Thread.sleep(2000);
		try
		{
		boolean but1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/form/div[1]/div/div/button")).isEnabled();
		System.out.println("Find Button After Status-->"+but1);
		System.out.println("The button is enabled and clickabled");
		}
		catch(Throwable t)
		{
			System.out.println("The Button is disabled and not clickabled");
		}
		Thread.sleep(2000);
		
		driver.findElement(By.className("ofuCf")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/form/div[1]/div/div/div[2]/div[2]/div")).click();
		
		Thread.sleep(3000);
		WebElement actual = driver.findElement(By.xpath("//div[@class='_3y_mZ _1_V1n ']//following-sibling::a//preceding::a[1]"));
		Thread.sleep(2000);
		WebElement act = driver.findElement(By.xpath("//div[@class='_3y_mZ _1_V1n ']//following-sibling::a"));
		String actual_value = actual.getText();
		Thread.sleep(2000);
		String expected_value = "Buckingham Palace,London";
		System.out.println("Actual Result_1-->" + actual_value);
		String act1 = act.getText();
		String expected = "Comedy Knights, Leicester Square, London, Greater London";
		System.out.println("Actual Result_2-->" + act1);
		Thread.sleep(3000);	
		if(expected_value.equalsIgnoreCase(actual_value))
		{
			
			System.out.println("Matching Correctly");
		actual.click();
		}
		else if(expected.equalsIgnoreCase(act1))
		{
			System.out.println("Select the Address for Not Actual Result");
			act.click();
		}
		else
		{
			System.out.println("Not Matching of Actual Result");
			Thread.sleep(2000);
			driver.findElement(By.id("postcode")).click();
			driver.findElement(By.id("postcode")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("postcode")).sendKeys("se5 8db");
			Thread.sleep(2000);
			driver.findElement(By.className("ofuCf")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/form/div[1]/div/div/div[2]/div[2]/div")).click();
			Thread.sleep(3000);
			WebElement target = driver.findElement(By.xpath("//*[@id=\"myDropdown\"]/div/a[19]"));
			Actions build = new Actions(driver);
			Actions ss = build.moveToElement(target);
			ss.perform();
			Thread.sleep(2000);
			target.click();
		}
		Thread.sleep(2000);
		driver.findElement(By.className("_1nnEY")).click();
		Thread.sleep(2000);
		
	}
	
	@AfterClass
	public void end()
	{
		driver.quit();
	}
}
