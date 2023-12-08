package Login_Page;

import org.testng.annotations.Test;

import Test_case.Launch;
import io.appium.java_client.MobileBy;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest extends Launch {
  @Test
		
		public void Testlogin () throws InterruptedException {
		
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"English\"]")).click();
		
		
		Thread.sleep(5000);
		
		WebElement EnterMobileField1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView"));
		
		
		EnterMobileField1.click();
		
		Thread.sleep(5000);
		
		
		EnterMobileField1.sendKeys("8574830627");
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000)"));
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Login\"]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Verify\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//android.view.View[@index='3']")).click();
		WebElement Your = driver.findElement(By.xpath("//android.view.View[@content-desc='Your']"));
		Assert.assertEquals(true, Your.isDisplayed());
		System.out.println("Your");
		Thread.sleep(5000);
		
		WebElement Contacts = driver.findElement(By.xpath("//android.view.View[@content-desc=' Contacts']"));
		Assert.assertEquals(true, Contacts.isDisplayed());
		System.out.println("Contacts");
		Thread.sleep(5000);

		WebElement UserName = driver.findElement(By.xpath("//android.view.View[@content-desc='Priya']"));
		Assert.assertEquals(true, UserName.isDisplayed());
		System.out.println("UserName");
		Thread.sleep(5000);
		
		WebElement Address = driver.findElement(By.xpath("//android.view.View[@content-desc='89, Udyan-1, Eldeco Udyan-1, Ashiyana, Lucknow, Uttar Pradesh 226012, India']"));
		Assert.assertEquals(true, Address.isDisplayed());
		System.out.println("Address");
		
		//Add Contact
		
		driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[4]")).click();
		Thread.sleep(5000);
		
		WebElement Add = driver.findElement(By.xpath("//android.view.View[@content-desc='Add']"));
		Assert.assertEquals(true, Add.isDisplayed());
		System.out.println("Add");
		Thread.sleep(5000);
		
		WebElement NewContact = driver.findElement(By.xpath("//android.view.View[@content-desc=' new contact']"));
		Assert.assertEquals(true, NewContact.isDisplayed());
		System.out.println("NewContact");
		Thread.sleep(5000);
		
		WebElement EnterMobileNumber = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText"));
		Assert.assertEquals(true, EnterMobileNumber.isDisplayed());
		System.out.println("EnterMobileNumber");
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText")).sendKeys("8547562351");
		
		WebElement EnterMobileField2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText"));
		
		
		EnterMobileField2.click();
		
		Thread.sleep(5000);
		
		
		EnterMobileField2.sendKeys("8574830627");
		
		
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText")).click();		
		//browser.click();
		
		Thread.sleep(5000);
		
		
		//browser.sendKeys("9856241587");
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Save\"]")).click();
		
		Thread.sleep(5000);
  }

}
