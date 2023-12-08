package Login_Page;

import org.testng.annotations.Test;

import Test_case.Launch;
import io.appium.java_client.MobileBy;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TC_ID_02 extends Launch {
  @Test
		
		public void Testlogin () throws InterruptedException {
		//TC_ID_01_01
	   // TC_ID_01_02
	  	
			
		//driver.findElement(By.xpath("//android.view.View[@content-desc=\"हिंदी\"]")).click();
		
		//TC_ID_01_03
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"English\"]")).click();
		
		Thread.sleep(5000);
		
		
		//TC_ID_01_04
		//TC_ID_01_05
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"Guest Login ￼\"]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]")).click();
		
		Thread.sleep(5000);
  }
}
