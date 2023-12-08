package Contact;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Test_case.Launch;
import io.appium.java_client.MobileBy;

public class TC_ID_12 extends Launch {

	@Test
	public void TC_ID_12_01 () throws InterruptedException {
	
		Login Test = new Login();
		Test.AppLogin();

	
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
		
		
		EnterMobileField2.sendKeys("9685582306");
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Save\"]")).click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		WebElement EnterName = driver.findElement(By.xpath("//android.widget.EditText[@index='3']"));
		Assert.assertEquals(true, EnterName.isDisplayed());
		System.out.println("EnterName");
		Thread.sleep(5000);
		
	  }
	
 @Test
 //TC_ID_12_05
	  public void TC_ID_12_05 () throws InterruptedException {
	  
		WebElement EnterName = driver.findElement(By.xpath("//android.widget.EditText[@index='3']"));
		EnterName.click();
		
		Thread.sleep(5000);
		
		
		EnterName.sendKeys("Script9");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Save\"]")).click();
		
		Thread.sleep(5000);
  
  
}
 @Test
       public void TC_ID_12_06 () throws InterruptedException {
    	   
    	WebElement CallIcon = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Rohini Delhi India\"]/android.view.View[2]"));
    	CallIcon.click();
   		
   		Thread.sleep(5000);
   		
   		WebElement LocalCallIcon = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.TabHost/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/com.oplus.widget.OplusViewPager/com.android.internal.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView"));
		Assert.assertEquals(true, LocalCallIcon.isDisplayed());
		System.out.println("LocalCallIcon");
		Thread.sleep(5000);
    	   
       }
 
 @Test
 
       public void TC_ID_12_07 () throws InterruptedException {
    	   
       	WebElement LocalCallIcon = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.TabHost/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/com.oplus.widget.OplusViewPager/com.android.internal.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView"));
       	LocalCallIcon.click();
      		
      	Thread.sleep(5000);
      	driver.navigate().back();
      	
      	driver.navigate().back();
      	
      	driver.navigate().back();
       }
 @Test
 
       public void TC_ID_12_08 () throws InterruptedException {
    	   
          	WebElement MessageIcon = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Rohini Delhi India\"]/android.view.View[3]"));
          	MessageIcon.click();
         		
         	Thread.sleep(5000);
         	
         	WebElement ContactName = driver.findElement(By.xpath("//android.view.View[@content-desc=\"CHC\"]"));
    		Assert.assertEquals(true, ContactName.isDisplayed());
    		System.out.println("ContactName");
    		Thread.sleep(5000);
         		
    		WebElement ReportIcon = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]"));
    		Assert.assertEquals(true, ReportIcon.isDisplayed());
    		System.out.println("ReportIcon");
    		Thread.sleep(5000);
    		
    		
    		WebElement MessageField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText"));
    		Assert.assertEquals(true, MessageField.isDisplayed());
    		System.out.println("MessageField");
    		Thread.sleep(5000);
    		
    		WebElement EmojiIcon = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText/android.view.View"));
    		Assert.assertEquals(true, EmojiIcon.isDisplayed());
    		System.out.println("EmojiIcon");
    		Thread.sleep(5000);
    		
    		WebElement Attachment = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button[1]"));
    		Assert.assertEquals(true, Attachment.isDisplayed());
    		System.out.println("Attachment");
    		Thread.sleep(5000);
    		
    		WebElement Camera = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button[2]"));
    		Assert.assertEquals(true, Camera.isDisplayed());
    		System.out.println("Camera");
    		Thread.sleep(5000);
    		
    		WebElement MessageIcon1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]"));
    		Assert.assertEquals(true, MessageIcon1.isDisplayed());
    		System.out.println("MessageIcon1");
    		Thread.sleep(5000);
    		
    		WebElement BackButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[1]"));
    		Assert.assertEquals(true, BackButton.isDisplayed());
    		System.out.println("BackButton");
    		Thread.sleep(5000);
    		
    				
          }
 @Test      
 
 
 		public void TC_ID_12_09 () throws InterruptedException {
 			
 			WebElement SendaMessage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText"));
    		Assert.assertEquals(true, SendaMessage.isDisplayed());
    		System.out.println("SendaMessage");
    		Thread.sleep(5000);
 			
 			WebElement EnterMessageField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.EditText"));
 			EnterMessageField.click();
 			
 			Thread.sleep(5000);
 			
 			
 			EnterMessageField.sendKeys("Test");
 			//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]]")).click();
 			Thread.sleep(5000);
 			
 			//driver.navigate().back();
 			
 		}
 		
 		@Test
 		
 		public void TC_ID_12_10 () throws InterruptedException {
 			
 			WebElement Attatchment = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button[1]"));
 			
 			
 			Attatchment.click();
 			
 			Thread.sleep(5000);
 			
 			WebElement Photo = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Photo\"]"));
    		Assert.assertEquals(true, Photo.isDisplayed());
    		System.out.println("Photo");
    		Thread.sleep(5000);
 			
    		WebElement Document = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Document\"]"));
    		Assert.assertEquals(true, Document.isDisplayed());
    		System.out.println("Document");
    		Thread.sleep(5000);
    		
    		WebElement Video = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Video\"]"));
    		Assert.assertEquals(true, Video.isDisplayed());
    		System.out.println("Video");
    		Thread.sleep(5000);
    		
    		WebElement TapPhoto = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Photo\"]"));
 			
 			
    		TapPhoto.click();
 			
 			Thread.sleep(5000);
    		
 			
 			WebElement TapOnPhoto = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Photo taken on Aug 16, 2023, 10:56:59 AM\"]/androidx.cardview.widget.CardView/android.widget.FrameLayout/android.widget.ImageView"));
 			TapOnPhoto.click();
 			Thread.sleep(5000);
    		
 			driver.navigate().back();
 		}
 		
 @Test		
 		public void TC_ID_12_11 () throws InterruptedException {
 			
 			WebElement TapOnCamera = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button[2]"));
 			TapOnCamera.click();
 			Thread.sleep(5000);
 			
 			//WebElement CameraPermissionMessage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]"));
 			//CameraPermissionMessage.click();
 			//Thread.sleep(5000);
 			
 			//WebElement tapOnLocalCamera = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[4]/android.widget.RelativeLayout/android.widget.ImageView[3]"));
 			//tapOnLocalCamera.click();
 			//Thread.sleep(5000);
		
 			driver.navigate().back();
 			//driver.navigate().back();
 			
 			
 			//WebElement SendIcon = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[4]/android.widget.RelativeLayout/android.widget.ImageView[3]"));
 			//SendIcon.click();
 			Thread.sleep(5000);
// 			
 		}
 		@Test 		
 		public void TC_ID_12_12 () throws InterruptedException {
 			
 			WebElement ReportIcon = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]"));
 			ReportIcon.click();
 			Thread.sleep(5000);
 			
 			
// 			WebElement Reportedthis = driver.findElement(By.xpath("//android.view.View[@content-desc='Reported this']"));
//    		Assert.assertEquals(true, Reportedthis.isDisplayed());
//    		System.out.println("Reportedthis");
//    		Thread.sleep(5000);
    		
    		WebElement ReportedthisChat = driver.findElement(By.xpath("//android.view.View[@content-desc='chat']"));
    		Assert.assertEquals(true, ReportedthisChat.isDisplayed());
    		System.out.println("ReportedthisChat");
    		Thread.sleep(5000);
    		
    		WebElement CrossIcon = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.Button[1]"));
    		Assert.assertEquals(true, CrossIcon.isDisplayed());
    		System.out.println("CrossIcon");
    		Thread.sleep(5000);
    		
    		WebElement Description = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText"));
    		Assert.assertEquals(true, Description.isDisplayed());
    		System.out.println("Description");
    		Thread.sleep(5000);
    		
    		WebElement AddScreenShot = driver.findElement(By.xpath("//android.view.View[@content-desc='Add screenshot']"));
    		Assert.assertEquals(true, AddScreenShot.isDisplayed());
    		System.out.println("AddScreenShot");
    		Thread.sleep(5000);
    		
//    		WebElement Save = driver.findElement(By.xpath("//android.widget.Button[@accessibility id='Save']"));
//    		Assert.assertEquals(true, Save.isDisplayed());
//    		System.out.println("Save");
//    		Thread.sleep(5000);  		
    		
 		}
@Test
 		public void TC_ID_12_13 () throws InterruptedException {
 		
 			//WebElement EnterReportDescription = driver.findElement(By.xpath("android.widget.EditText[@elementId='00000000-0000-07ee-0000-00e500000004']"));
 			WebElement EnterReportDescription = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText"));
			
 			EnterReportDescription.click();
			
			Thread.sleep(5000);
			
			
			EnterReportDescription.sendKeys("Test_Report");
			
			//driver.findElement(By.xpath("//android.widget.Button[@accessibility id='Save']")).click();
			
			Thread.sleep(10000);
			
}
}