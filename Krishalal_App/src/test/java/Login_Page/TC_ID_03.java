package Login_Page;

import org.testng.annotations.Test;

import Test_case.Launch;
import io.appium.java_client.MobileBy;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TC_ID_03 extends Launch {
  @Test
		
		public void Testlogin () throws InterruptedException {
		//TC_ID_01_01
	   // TC_ID_01_02
	  	
			
		//driver.findElement(By.xpath("//android.view.View[@content-desc=\"हिंदी\"]")).click();
		
		//TC_ID_01_03
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"English\"]")).click();
		
		Thread.sleep(5000);
		
		//TC_ID_01_04
		
		
		WebElement Term = driver.findElement(By.xpath("//android.view.View[@index='4']"));
		Assert.assertEquals(true, Term.isDisplayed());
		System.out.println("Term");
		Thread.sleep(5000);
		
		WebElement OfUs = driver.findElement(By.xpath("//android.view.View[@index='1']"));
		Assert.assertEquals(true, OfUs.isDisplayed());
		System.out.println("OfUs");
		Thread.sleep(5000);
		
		//TC_ID_01_05
		//TC_ID_01_06
		
		driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]")).click();
		
		Thread.sleep(5000);
		
		
  }
}
