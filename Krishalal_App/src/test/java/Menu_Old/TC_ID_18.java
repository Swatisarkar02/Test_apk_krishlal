package Menu_Old;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;

import io.appium.java_client.touch.offset.PointOption;

import Contact.Login;
import Test_case.Launch;

public class TC_ID_18 extends Launch {
	
	@Test
public void Login_Id () throws InterruptedException {
		
		Login Test = new Login();
		Test.AppLogin();
	}
@Test	
		public void TC_ID_18_01 () throws InterruptedException {
			System.out.println("Home Page Launch sucessfully");
		}

@Test		
		public void TC_ID_18_02 () throws InterruptedException {
			  
		    
			driver.findElement(By.xpath("//android.widget.ImageView[@index='3']")).click();
			
			Thread.sleep(5000);
			
			WebElement Reward = driver.findElement(By.xpath("//android.view.View[@index='7']"));
			Assert.assertEquals(true, Reward.isDisplayed());
			System.out.println("Reward");
			Thread.sleep(5000);
			
			
			WebElement Weather = driver.findElement(By.xpath("//android.view.View[@index='8']"));
			Assert.assertEquals(true, Weather.isDisplayed());
			System.out.println("Weather");
			Thread.sleep(5000);
			
			
			WebElement eNamMandi = driver.findElement(By.xpath("//android.view.View[@index='9']"));
			Assert.assertEquals(true, eNamMandi.isDisplayed());
			System.out.println("eNamMandi");
			Thread.sleep(5000);
			
			WebElement Report = driver.findElement(By.xpath("//android.view.View[@index='10']"));
			Assert.assertEquals(true, Report.isDisplayed());
			System.out.println("Report");
			Thread.sleep(5000);
			
			
			WebElement ContactUs = driver.findElement(By.xpath("//android.view.View[@index='11']"));
			Assert.assertEquals(true, ContactUs.isDisplayed());
			System.out.println("ContactUs");
			Thread.sleep(5000);
			
			WebElement QuickLink = driver.findElement(By.xpath("//android.view.View[@index='12']"));
			Assert.assertEquals(true, QuickLink.isDisplayed());
			System.out.println("QuickLink");
			Thread.sleep(5000);
			
			WebElement Language = driver.findElement(By.xpath("//android.view.View[@index='13']"));
			Assert.assertEquals(true, Language.isDisplayed());
			System.out.println("Language");
			Thread.sleep(5000);
			
			WebElement Invite = driver.findElement(By.xpath("//android.view.View[@index='14']"));
			Assert.assertEquals(true, Invite.isDisplayed());
			System.out.println("Invite");
			Thread.sleep(5000);
			
			WebElement KropDoc = driver.findElement(By.xpath("//android.view.View[@index='15']"));
			Assert.assertEquals(true, KropDoc.isDisplayed());
			System.out.println("KropDoc");
			Thread.sleep(5000);
			
			WebElement Logout = driver.findElement(By.xpath("//android.view.View[@index='16']"));
			Assert.assertEquals(true, Logout.isDisplayed());
			System.out.println("Logout");
			Thread.sleep(1000);
		}
			
@Test		
	public void TC_ID_18_03 () throws InterruptedException {
	  
	

	TouchAction quicklink = new TouchAction(driver);

	quicklink.tap(PointOption.point(361, 1438)).perform();
	//driver.findElement(By.xpath("//android.view.View[@content-desc='Quick Link']")).click();
	
	Thread.sleep(5000);
	
	WebElement QuickLink = driver.findElement(By.xpath("//android.view.View[@content-desc='Quick Link']"));
	Assert.assertEquals(true, QuickLink.isDisplayed());
	System.out.println("Quick Link is display");
	Thread.sleep(5000);

	WebElement KrishLalWebsite = driver.findElement(By.xpath("//android.view.View[@index='2']"));
	Assert.assertEquals(true, KrishLalWebsite.isDisplayed());
	System.out.println("KrishLal Website");
	Thread.sleep(10000);
	
	
	WebElement GovernmentSchemes = driver.findElement(By.xpath("//android.view.View[@content-desc='Goverment Schemes']"));
//	//WebElement GovernmentSchemes = driver.findElement(By.xpath("//android.view.View[@index='3'"));
	Assert.assertEquals(true, GovernmentSchemes.isDisplayed());
	System.out.println("GovernmentSchemes");
	Thread.sleep(5000);
	
	WebElement MeriFasalMeraByora = driver.findElement(By.xpath("//android.view.View[@index='4']"));
	Assert.assertEquals(true, MeriFasalMeraByora.isDisplayed());
	System.out.println("MeriFasalMeraByora");
	Thread.sleep(5000);

	
	WebElement BackButton = driver.findElement(By.xpath("//android.widget.Button[@index='0']"));
	Assert.assertEquals(true, BackButton.isDisplayed());
	System.out.println("BackButton");
	Thread.sleep(5000);

	
}	

@Test
public void TC_ID_18_04 () throws InterruptedException {
	 
	
	driver.findElement(By.xpath("//android.view.View[@index='2']")).click();
	Thread.sleep(5000);
	
}
@Test

public void TC_ID_18_05 () throws InterruptedException {	
	
	driver.navigate().back();
	Thread.sleep(5000);
	
	
}


@Test
public void TC_ID_18_06 () throws InterruptedException {

	
	driver.findElement(By.xpath("//android.view.View[@index='3']")).click();
	
	Thread.sleep(5000);
		}
@Test

public void TC_ID_18_07 () throws InterruptedException {
	driver.navigate().back();
	
	Thread.sleep(5000);
	
}
@Test

public void TC_ID_18_08 () throws InterruptedException {

	driver.findElement(By.xpath("//android.view.View[@index='4']")).click();
	Thread.sleep(5000);

}

@Test
public void TC_ID_18_09 () throws InterruptedException {
	driver.navigate().back();
	Thread.sleep(5000);
	
	driver.navigate().back();
	Thread.sleep(5000);
	
}

}

		


