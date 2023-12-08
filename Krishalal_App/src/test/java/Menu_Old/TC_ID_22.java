package Menu_Old;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Contact.Login;
import Test_case.Launch;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class TC_ID_22 extends Launch {
	
@Test	
public void Login_Id () throws InterruptedException {
		
		Login Test = new Login();
		Test.AppLogin();


}
@Test

public void TC_ID_22_01 () throws InterruptedException {
	System.out.println("Home Page Launch sucessfully");

}
@Test
public void TC_ID_22_02 () throws InterruptedException {
	  
    
	driver.findElement(By.xpath("//android.widget.ImageView[@index='3']")).click();
	
	Thread.sleep(5000);
}
@Test
public void TC_ID_22_03 () throws InterruptedException {
	
	
	TouchAction quicklink = new TouchAction(driver);

	quicklink.tap(PointOption.point(343, 2045)).perform();
	
	Thread.sleep(5000);
	
	System.out.println("Come Back Soon");
	
	WebElement Logout = driver.findElement(By.xpath("//android.widget.Button[@index='0']"));
	Assert.assertEquals(true, Logout.isDisplayed());
	System.out.println("Logout");
	Thread.sleep(5000);
	
	WebElement Cancel = driver.findElement(By.xpath("//android.widget.Button[@index='1']"));
	Assert.assertEquals(true, Cancel.isDisplayed());
	System.out.println("Cancel");
	Thread.sleep(5000);
}
@Test
public void TC_ID_22_04 () throws InterruptedException {

	TouchAction quicklink = new TouchAction(driver);

	quicklink.tap(PointOption.point(689, 1460)).perform();
	
	Thread.sleep(5000);
	
}

@Test
public void TC_ID_22_05 () throws InterruptedException {
  
	TouchAction quicklink = new TouchAction(driver);

	quicklink.tap(PointOption.point(343, 2045)).perform();
	
	Thread.sleep(5000);

	}

@Test
public void TC_ID_22_06 () throws InterruptedException {
	
	TouchAction quicklink = new TouchAction(driver);

	quicklink.tap(PointOption.point(365, 1449)).perform();
	
	Thread.sleep(5000);

}


}
