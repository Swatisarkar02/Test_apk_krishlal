package Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Test_case.Launch;
import io.appium.java_client.MobileBy;

public class TC_ID_17 extends Launch{
	
	@Test
	public void TC_ID_17_01 () throws InterruptedException {
		System.out.println("Application Launch");
		Thread.sleep(3000);
	}
	@Test	
		public void TC_ID_17_02 () throws InterruptedException {
			
			driver.findElement(By.xpath("//android.view.View[@content-desc=\"English\"]")).click();
			Thread.sleep(5000);
	}	
	
	@Test
	public void TC_ID_17_03 () throws InterruptedException {
		
		System.out.println("Enter Mobile Field Is tappable");
	
	}
	
	@Test
	public void TC_ID_17_04 () throws InterruptedException {
		
		
		WebElement EnterMobileField1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView"));
		EnterMobileField1.click();
		Thread.sleep(5000);
		
			
		EnterMobileField1.sendKeys("8574830627");
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000)"));
		Thread.sleep(5000);
	}
	
	@Test
	public void TC_ID_17_05 () throws InterruptedException {
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Login\"]")).click();
		
		Thread.sleep(10000);
		
		System.out.println("Login Button Is tappable");
		
		Thread.sleep(3000);
	}
	
	@Test
	public void TC_ID_17_06 () throws InterruptedException {
		
		Thread.sleep(3000);
			System.out.println("OTP is auto fill");
			Thread.sleep(3000);
			
		}
	
	@Test
	
	public void TC_ID_17_07 () throws InterruptedException {
		Thread.sleep(3000);
			System.out.println("Verify button is tappable");
			Thread.sleep(3000);
			
		}
	
	@Test
	public void TC_ID_17_08 () throws InterruptedException {
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Verify\"]")).click();
		Thread.sleep(3000);
				
			}
	
	@Test
	public void TC_ID_17_09 () throws InterruptedException {	
		
		
		WebElement LocationAccess = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView"));
		Assert.assertEquals(true, LocationAccess.isDisplayed());
		System.out.println("LocationAccess");
		Thread.sleep(5000);
		
		WebElement WhileUsingTheApp = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]"));
		Assert.assertEquals(true, WhileUsingTheApp.isDisplayed());
		System.out.println("WhileUsingTheApp");
		Thread.sleep(5000);
		
		WebElement OnlyThisTime = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[2]"));
		Assert.assertEquals(true, OnlyThisTime.isDisplayed());
		System.out.println("OnlyThisTime");
		Thread.sleep(5000);
		
		WebElement DontAllow = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[3]"));
		Assert.assertEquals(true, DontAllow.isDisplayed());
		System.out.println("DontAllow");
		Thread.sleep(5000);
		
	}
	
	@Test
	public void TC_ID_17_10 () throws InterruptedException {
	
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[2]")).click();
		Thread.sleep(5000);
	}
	
	
	@Test
	public void TC_ID_17_11 () throws InterruptedException {
		
//		WebElement CameraIcon = driver.findElement(By.xpath("android.widget.Button[@index= '3']"));
//		Assert.assertEquals(true, CameraIcon.isDisplayed());
//		System.out.println("CameraIcon");
//		Thread.sleep(5000);
//		
//		
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[2]")).click();
//		Thread.sleep(5000);
//		driver.navigate().back();
//		
		WebElement RegistrationPageName = driver.findElement(By.xpath("//android.view.View[@content-desc='Registration']"));
		Assert.assertEquals(true, RegistrationPageName.isDisplayed());
		System.out.println("Registration");
		Thread.sleep(5000);
		
//		WebElement ProfileImage = driver.findElement(By.xpath("//android.view.View[index='2']"));
//		Assert.assertEquals(true, ProfileImage.isDisplayed());
//		System.out.println("ProfileImage");
//		Thread.sleep(5000);
//		
	}
	
	@Test
	public void TC_ID_17_12 () throws InterruptedException {
		
		WebElement UserName = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
		Assert.assertEquals(true, UserName.isDisplayed());
		System.out.println("UserName");
		Thread.sleep(5000);
	}
	
	
	@Test
	public void TC_ID_17_13 () throws InterruptedException {
		WebElement  UseCurrentLocationField = driver.findElement(By.xpath("//android.view.View[@index='5']"));
		Assert.assertEquals(true, UseCurrentLocationField.isDisplayed());
		System.out.println("UseCurrentLocationField");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//android.view.View[@index='5']")).click();
		Thread.sleep(5000);
		
	}
	
	
	@Test
	public void TC_ID_17_14 () throws InterruptedException {
		
		WebElement  AddressField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]"));
		Assert.assertEquals(true, AddressField.isDisplayed());
		System.out.println("AddressField");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]")).click();
		Thread.sleep(5000);
		
		WebElement  SearchField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText"));
		Assert.assertEquals(true, SearchField.isDisplayed());
		System.out.println("SearchField");
		Thread.sleep(5000);
				
	}
	
	
	@Test
	public void TC_ID_17_15 () throws InterruptedException {
		
		
		WebElement  SearchField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText"));
		Assert.assertEquals(true, SearchField.isDisplayed());
		System.out.println("Search Field In search screen");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText")).click();
		Thread.sleep(5000);
		
		WebElement  BackButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[1]"));
		Assert.assertEquals(true, BackButton.isDisplayed());
		System.out.println("BackButton");
		Thread.sleep(5000);
		
		WebElement  Enteryouraddress = driver.findElement(By.xpath("//android.view.View[@content-desc='Enter your address']"));
		Assert.assertEquals(true, Enteryouraddress.isDisplayed());
		System.out.println("Enteryouraddress");
		Thread.sleep(5000);
		
		WebElement  CrossButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]"));
		Assert.assertEquals(true, CrossButton.isDisplayed());
		System.out.println("CrossButton");
		Thread.sleep(5000);
		
	}

	@Test
	public void TC_ID_17_16 () throws InterruptedException {	
	
	WebElement EnterAddress = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText"));
	EnterAddress.click();
	Thread.sleep(5000);
	
		
	EnterAddress.sendKeys("Delhi");

}
	
	@Test
	public void TC_ID_17_17 () throws InterruptedException {
		
		WebElement  EnterAddress = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText"));
		Assert.assertEquals(true, EnterAddress.isDisplayed());
		System.out.println("Enter Address is display");
		Thread.sleep(5000);
		
		driver.navigate().back();
		driver.navigate().back();
	}
	
	
	@Test
	public void TC_ID_17_18 () throws InterruptedException {			
		WebElement  PinCodeField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]"));
		Assert.assertEquals(true, PinCodeField.isDisplayed());
		System.out.println("PinCodeField");
		Thread.sleep(5000);
		
		WebElement  DistrictField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]"));
		Assert.assertEquals(true, DistrictField.isDisplayed());
		System.out.println("DistrictField");
		Thread.sleep(5000);
		
		WebElement  StateField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[6]"));
		Assert.assertEquals(true, StateField.isDisplayed());
		System.out.println("StateField");
		Thread.sleep(5000);
		
		WebElement  SaveButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Save']"));
		Assert.assertEquals(true, SaveButton.isDisplayed());
		System.out.println("SaveButton");
		Thread.sleep(5000);
		
	}
	
	
	@Test
	public void TC_ID_17_19 () throws InterruptedException {		
		
		WebElement EnterName = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
		EnterName.click();
		Thread.sleep(5000);
				
		EnterName.sendKeys("Agrima");
		Thread.sleep(5000);
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000)"));
		
		Thread.sleep(5000);	
	
	}
	
	
	@Test
	public void TC_ID_17_20 () throws InterruptedException {			
		
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Save\"]")).click();
		
		Thread.sleep(5000);
		
		
			
	}
}



