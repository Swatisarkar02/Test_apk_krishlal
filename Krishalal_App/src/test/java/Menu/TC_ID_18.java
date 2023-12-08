package Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Contact.Login;
import Test_case.Launch;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class TC_ID_18 extends Launch {

	
@Test	
public void Login_Id () throws InterruptedException {
		
		Login Test = new Login();
		Test.AppLogin();
	}

@Test
public void Home_Page () throws InterruptedException {
	System.out.println("Home Page Launch sucessfully");
}

@Test
public void TC_ID_18_13 () throws InterruptedException {
	  
	driver.findElement(By.xpath("//android.widget.ImageView[@index='3']")).click();
	
	Thread.sleep(5000);

	TouchAction quicklink = new TouchAction(driver);

	quicklink.tap(PointOption.point(413, 1430)).perform();
	driver.findElement(By.xpath("//android.view.View[@content-desc='Quick Link']")).click();
	
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

//	WebElement GovernmentSchemes = driver.findElement(By.xpath("//android.view.View[@index='3'"));
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

public void TC_ID_18_14 () throws InterruptedException {
	 
	
	driver.findElement(By.xpath("//android.view.View[@index='2']")).click();
	Thread.sleep(5000);
	
	driver.navigate().back();
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//android.view.View[@index='3']")).click();
	
	Thread.sleep(5000);
	
	driver.navigate().back();
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//android.view.View[@index='4']")).click();
	Thread.sleep(5000);
	
	
	driver.navigate().back();
	Thread.sleep(5000);
	
	driver.navigate().back();
	Thread.sleep(5000);
	
}

@Test

public void TC_ID_18_15 () throws InterruptedException {
	  
    
//	driver.findElement(By.xpath("//android.widget.ImageView[@index='3']")).click();
//	
//	Thread.sleep(5000);
	
	TouchAction quicklink = new TouchAction(driver);

	quicklink.tap(PointOption.point(372, 1609)).perform();
	
	Thread.sleep(5000);
	
	System.out.println("Select Language is display");
	Thread.sleep(5000);
}
	

@Test
	public void TC_ID_18_16 () throws InterruptedException {
	
//	driver.findElement(By.xpath("//android.view.View[@content-desc='English']")).click();
//
//	Thread.sleep(5000);

	
	TouchAction quicklink = new TouchAction(driver);

	quicklink.tap(PointOption.point(254, 1200)).perform();
	
	Thread.sleep(5000);
		
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
	Thread.sleep(5000);	
	}

@Test

public void TC_ID_18_17 () throws InterruptedException {
	//driver.navigate().refresh();
	Thread.sleep(5000);
	

	}

@Test
	
public void TC_ID_18_18 () throws InterruptedException {
		
		
		TouchAction quicklink = new TouchAction(driver);

		quicklink.tap(PointOption.point(298, 1739)).perform();
		
		Thread.sleep(5000);
		
		System.out.println("Social Media option is open");
		
	}

@Test
public void TC_ID_18_19 () throws InterruptedException {	
	
	TouchAction Whatsapp = new TouchAction(driver);

	Whatsapp.tap(PointOption.point(158, 1680)).perform();
	
	Thread.sleep(5000);
	
	System.out.println("Whatsapp Contact list is display");
	
	
	//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Search']")).click();
	
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	
}	


@Test
public void TC_ID_20_20 () throws InterruptedException {	

	TouchAction quicklink = new TouchAction(driver);

	quicklink.tap(PointOption.point(313, 1888)).perform();
	
	Thread.sleep(5000);
	
	System.out.println("Social Media option is open");


}


@Test
public void TC_ID_18_21 () throws InterruptedException {	
	
	TouchAction whtasapp = new TouchAction(driver);

	whtasapp.tap(PointOption.point(158, 1680)).perform();
	
	Thread.sleep(5000);
	
	System.out.println("Whatsapp Contact list is display");
	
	//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Search']")).click();
	driver.navigate().back();
	driver.navigate().back();
}


@Test
public void TC_ID_18_22 () throws InterruptedException {
	
	
	TouchAction quicklink = new TouchAction(driver);

	quicklink.tap(PointOption.point(343, 2045)).perform();
	
	Thread.sleep(5000);
	
	System.out.println("Come Back Soon");
	
	WebElement Logout = driver.findElement(By.xpath("//android.widget.Button[@index='0']"));
	Assert.assertEquals(true, Logout.isDisplayed());
	System.out.println("Logout");
	Thread.sleep(5000);
	
//	WebElement Cancel = driver.findElement(By.xpath("//android.widget.Button[@index='1']"));
//	Assert.assertEquals(true, Cancel.isDisplayed());
//	System.out.println("Cancel");
//	Thread.sleep(5000);
}


@Test
public void TC_ID_18_23 () throws InterruptedException {

	TouchAction quicklink = new TouchAction(driver);

	quicklink.tap(PointOption.point(689, 1460)).perform();
	
	Thread.sleep(5000);
	
	
}

@Test
public void TC_ID_18_24 () throws InterruptedException {
	
	TouchAction quicklink1 = new TouchAction(driver);

	quicklink1.tap(PointOption.point(343, 2045)).perform();
	
	Thread.sleep(5000);

	}

@Test
public void TC_ID_18_25 () throws InterruptedException {
	
	TouchAction quicklink = new TouchAction(driver);

	quicklink.tap(PointOption.point(365, 1449)).perform();
	
	Thread.sleep(5000);

}


}
	
