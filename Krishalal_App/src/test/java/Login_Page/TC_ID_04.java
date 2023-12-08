package Login_Page;

import org.testng.annotations.Test;

import Test_case.Launch;
import io.appium.java_client.MobileBy;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TC_ID_04 extends Launch {
  @Test
		
		public void Testlogin () throws InterruptedException {
		//TC_ID_01_01
	   // TC_ID_01_02
	  	
			
		//driver.findElement(By.xpath("//android.view.View[@content-desc=\"हिंदी\"]")).click();
		
		//TC_ID_01_03
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"English\"]")).click();
		
		Thread.sleep(5000);
		
		//TC_ID_01_04
		
		
		//WebElement PrivacyPolicy = driver.findElement(By.xpath("//android.view.View[@index='2']"));
		WebElement PrivacyPolicy = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Privacy policy']"));
		Assert.assertEquals(true, PrivacyPolicy.isDisplayed());
		System.out.println("PrivacyPolicy");
		Thread.sleep(5000);
		
		//TC_ID_01_05
		//TC_ID_01_06
		
		driver.findElement(By.xpath("//android.view.View[@index='2']")).click();
		
		//Thread.sleep(5000);
		
		
  }
  
}
