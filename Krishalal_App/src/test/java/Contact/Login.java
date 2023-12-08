package Contact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Test_case.Launch;
import io.appium.java_client.MobileBy;

public class Login extends Launch {
	
	
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
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Login\"]")).click();
	
	Thread.sleep(10000);
	
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Verify\"]")).click();
	Thread.sleep(5000);
	
	System.out.println("Application is launch sucessfully");
	}

	
        }



