package Login_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Test_case.Launch;
import io.appium.java_client.MobileBy;

public class TC_ID_05 extends Launch {

@Test	
	public void AppLogin () throws InterruptedException {
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"English\"]")).click();
		
		Thread.sleep(5000);
		
		WebElement EnterMobileField1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView"));
		
		
		EnterMobileField1.click();
		
		Thread.sleep(5000);
		
		
		EnterMobileField1.sendKeys("8574830627");
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000)"));
		Thread.sleep(5000);
	}
		
@Test		
		public void TC_ID_05_02 () throws InterruptedException {
		
		System.out.println("OTP is not send");	
			
		}
@Test		
		public void TC_ID_05_03 () throws InterruptedException {
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Login\"]")).click();
		
		System.out.println("Application is launch sucessfully");	
		
		Thread.sleep(10000);
	
		}
		
@Test		
		public void TC_ID_05_04 () throws InterruptedException {
			
		driver.findElement(By.xpath("//android.view.View[@content-desc='Didn’t receive OTP ? Send Again']")).click();	
			
		}
@Test		
		public void TC_ID_05_05 () throws InterruptedException {
			
		driver.findElement(By.xpath("//android.widget.Button[@content-desc='Verify']")).click();	
		
		System.out.println("Application is launch sucessfully");
				
		}
		
		
}
