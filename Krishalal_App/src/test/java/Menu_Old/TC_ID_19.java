package Menu_Old;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Contact.Login;
import Test_case.Launch;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

	public class TC_ID_19 extends Launch {
		
@Test
	public void Login_Id () throws InterruptedException {
		
		Login Test = new Login();
		Test.AppLogin();
	}
@Test

	public void TC_ID_19_01 () throws InterruptedException {
	System.out.println("Home Page Launch sucessfully");
}

@Test
	public void TC_ID_19_02 () throws InterruptedException {
	  
    
	driver.findElement(By.xpath("//android.widget.ImageView[@index='3']")).click();
	
	Thread.sleep(5000);
	
	TouchAction quicklink = new TouchAction(driver);

	quicklink.tap(PointOption.point(372, 1609)).perform();
	
	Thread.sleep(5000);
	
	}

//@Test
//	public void TC_ID_19_03 () throws InterruptedException {
//		System.out.println("Select Language is display");
//		Thread.sleep(5000);
//	}
//
//@Test
//	public void TC_ID_19_04 () throws InterruptedException {
//	driver.findElement(By.xpath("//android.view.View[@content-desc='हिंदी']")).click();
//	Thread.sleep(5000);
//	
//	}
//
//@Test
//	public void TC_ID_19_05 () throws InterruptedException {
//	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
//	Thread.sleep(5000);
//
//}
//
//
//@Test
//	public void TC_ID_19_06 () throws InterruptedException {
//		driver.navigate().refresh();
//		Thread.sleep(5000);
//}
//
//@Test
//	public void TC_ID_19_07 () throws InterruptedException {
//		  
//	    
//		driver.findElement(By.xpath("//android.widget.ImageView[@index='3']")).click();
//		
//		Thread.sleep(5000);
//		
//		TouchAction quicklink = new TouchAction(driver);
//
//		quicklink.tap(PointOption.point(372, 1609)).perform();
//		
//		Thread.sleep(5000);
//		
//		}


@Test
		public void TC_ID_19_08 () throws InterruptedException {
			System.out.println("Select Language is display");
			Thread.sleep(5000);
}


@Test
		public void TC_ID_19_09 () throws InterruptedException {
		driver.findElement(By.xpath("//android.view.View[@content-desc='English']")).click();

		Thread.sleep(5000);
		}
@Test	
		public void TC_ID_19_10 () throws InterruptedException {
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
		Thread.sleep(5000);	
		
}


@Test
		public void TC_ID_19_11 () throws InterruptedException {
			//driver.navigate().refresh();
			Thread.sleep(5000);
			}
	

}
