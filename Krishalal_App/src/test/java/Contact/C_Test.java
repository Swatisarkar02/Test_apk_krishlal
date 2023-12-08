package Contact;

import org.testng.annotations.Test;
import Test_case.Launch;
import io.appium.java_client.MobileBy;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class C_Test extends Launch {
  @Test
  public void Login () throws InterruptedException {
	Login Test = new Login();
	Test.AppLogin();
  }

  @Test
  public void TC_ID_12_01 () throws InterruptedException {
	  
	System.out.println("Application is launch sucessfully");  
  }
	
  
  
   @Test
	  public void TC_ID_12_02 () throws InterruptedException {
	  
	     
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
		Thread.sleep(5000);
		
		WebElement Search = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]"));
		Assert.assertEquals(true, Search.isDisplayed());
		System.out.println("Search");
		Thread.sleep(5000);
		
		WebElement AddContactList = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[4]"));
		Assert.assertEquals(true, AddContactList.isDisplayed());
		System.out.println("AddContactList");
		Thread.sleep(5000);
		
		WebElement Notification = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[3]"));
		Assert.assertEquals(true, Notification.isDisplayed());
		System.out.println("Notification");
		Thread.sleep(5000);
		
		WebElement Profile = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]"));
		Assert.assertEquals(true, Profile.isDisplayed());
		System.out.println("Profile");
		Thread.sleep(5000);
		
		WebElement CallIcon = driver.findElement(By.xpath("//android.view.View[@index='2']"));
		Assert.assertEquals(true, CallIcon.isDisplayed());
		System.out.println("CallIcon");
		Thread.sleep(5000);
		
		WebElement MessageIcon = driver.findElement(By.xpath("//android.view.View[@index='3']"));
		Assert.assertEquals(true, MessageIcon.isDisplayed());
		System.out.println("MessageIcon");
		Thread.sleep(5000);
		
	  }
		
		
		//TC_ID_12_03
   @Test
	  public void TC_ID_12_03 () throws InterruptedException {
	  
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
		
		WebElement SaveButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Save']"));
		Assert.assertEquals(true, SaveButton.isDisplayed());
		System.out.println("SaveButton");
		Thread.sleep(5000);
	  }
		//TC_ID_12_04
   @Test	
	  public void TC_ID_12_04 () throws InterruptedException {
		
		WebElement EnterMobileField2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText"));
		
		
		EnterMobileField2.click();
		
		Thread.sleep(5000);
		
		
		EnterMobileField2.sendKeys("9685742356");
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Save\"]")).click();
		Thread.sleep(5000);
		
		WebElement EnterName = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[2]"));
		Assert.assertEquals(true, EnterName.isDisplayed());
		System.out.println("EnterName");
		Thread.sleep(5000);
		
	  }
	
   @Test
   //TC_ID_12_05
	  public void TC_ID_12_05 () throws InterruptedException {
	  
		WebElement EnterName = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText[2]"));
		
		
		EnterName.click();
		
		Thread.sleep(5000);
		
		
		EnterName.sendKeys("Script1");
		
		
		
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText")).click();		
		//browser.click();
		
		Thread.sleep(5000);
		
		
		//browser.sendKeys("9856241587");
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Save\"]")).click();
		
		Thread.sleep(5000);
 
	  }
	  
}
	  
	  
