package Menu_Old;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Contact.Login;
import Test_case.Launch;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

	public class TC_ID_20 extends Launch{

@Test		
	
	public void Login_Id () throws InterruptedException {
		
		Login Test = new Login();
		Test.AppLogin();
}

@Test
	public void TC_ID_20_01 () throws InterruptedException {
	System.out.println("Home Page Launch sucessfully");

}

@Test
	public void TC_ID_20_02 () throws InterruptedException {
		  
	    
		driver.findElement(By.xpath("//android.widget.ImageView[@index='3']")).click();
		
		Thread.sleep(5000);
	}

@Test
	public void TC_ID_20_03 () throws InterruptedException {
		
		
		TouchAction quicklink = new TouchAction(driver);

		quicklink.tap(PointOption.point(298, 1739)).perform();
		
		Thread.sleep(5000);
		
		System.out.println("Social Media option is open");
		
	}

@Test
	public void TC_ID_20_04 () throws InterruptedException {	
	
		TouchAction quicklink = new TouchAction(driver);

		quicklink.tap(PointOption.point(168, 1739)).perform();
		
		Thread.sleep(5000);
		
		System.out.println("Whatsapp Contact list is display");
		
	
	}

@Test
	public void TC_ID_20_05 () throws InterruptedException {
	
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Search']")).click();
		
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
}



//@Test
//	public void TC_ID_20_06 () throws InterruptedException {
//	
//	WebElement EnterSearchName = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView"));
//	
//	
//	EnterSearchName.click();
//	
//	Thread.sleep(5000);
//	
//	
//	EnterSearchName.sendKeys("Reyan");
//	
//	System.out.println("Reyan - Consultants");
//	
//
//	}
//@Test
//
//	public void TC_ID_20_07 () throws InterruptedException {
//	TouchAction quicklink = new TouchAction(driver);
//
//	quicklink.tap(PointOption.point(574, 544)).perform();
//	
//	Thread.sleep(5000);
//	
//	
//	}
	
//@Test	
//	
//	public void TC_ID_20_08 () throws InterruptedException {
//		
//		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Send']")).click();
//		
//		Thread.sleep(5000);	
//	
//	
//	}
//
//@Test
//	public void TC_ID_20_09 () throws InterruptedException {
//		
//		TouchAction quicklink = new TouchAction(driver);
//
//		quicklink.tap(PointOption.point(998, 1438)).perform();
//		
//		Thread.sleep(5000);
//	
//	}
	
}
