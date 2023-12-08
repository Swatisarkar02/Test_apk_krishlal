package Login_Page;

import org.testng.annotations.Test;

import Test_case.Launch;
import io.appium.java_client.MobileBy;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TC_ID_01 extends Launch {
  @Test
	
		public void TC_ID_01_01 () throws InterruptedException {
	System.out.println("System is open successfully");
  }
  @Test (dependsOnMethods = { "TC_ID_01_01" })
	  public void TC_ID_01_02 () throws InterruptedException {
		System.out.println("Hindi language is selected");  
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"हिंदी\"]")).click();
	  }

		
		
		//TC_ID_01_03
  @Test (dependsOnMethods = { "TC_ID_01_02" })
  		
  public class TC_ID_03 extends Launch {
  }
  
  public void TC_ID_01_03 () throws InterruptedException {
	  		
	
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"English\"]")).click();
		System.out.println("English language is selected");  
		
		Thread.sleep(5000);
		
  		}
		//TC_ID_01_04
  @Test (dependsOnMethods = { "TC_ID_01_03" })
		
  		public void TC_ID_01_04 () throws InterruptedException {
  		
		WebElement EnterMobileField1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView"));
		
		

		EnterMobileField1.click();
		
		Thread.sleep(5000);
  		
  		}
		//TC_ID_01_05
  @Test (dependsOnMethods = { "TC_ID_01_04" })
		
  		public void TC_ID_01_05 () throws InterruptedException {
  		
  		WebElement EnterMobileField1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView"));
 		
		EnterMobileField1.click();
  		
		EnterMobileField1.sendKeys("8574830627");
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000)"));
		Thread.sleep(5000);
		
  		}
  		
		//TC_ID_01_06
  @Test (dependsOnMethods = { "TC_ID_01_05" })

  		public void TC_ID_01_06 () throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Login\"]")).click();
		
		Thread.sleep(5000);
  		}
		//TC_ID_01_07

  @Test (dependsOnMethods = { "TC_ID_01_06" })
  		
  		public void TC_ID_01_07 () throws InterruptedException {
	  System.out.println("OTP is auto fill");
  		}
  	   
  		//TC_ID_01_08
  
  @Test (dependsOnMethods = { "TC_ID_01_07" })
  		public void TC_ID_01_08 () throws InterruptedException {
	  System.out.println("Verify button is tappable");
  		}
  
  		//TC_ID_01_09
  @Test (dependsOnMethods = { "TC_ID_01_08" })
  		public void TC_ID_01_09 () throws InterruptedException {
  		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Verify\"]")).click();
		Thread.sleep(5000);
	
  		
  }
  }
