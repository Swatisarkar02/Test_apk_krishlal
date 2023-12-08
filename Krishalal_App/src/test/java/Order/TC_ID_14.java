package Order;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Contact.Login;
import Test_case.Launch;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class TC_ID_14 extends Launch {
	@Test
	public void Login_Id () throws InterruptedException {
		
		Login Test = new Login();
		Test.AppLogin();
	}
	
	@Test  
	public void TC_ID_14_01 () throws InterruptedException {
		System.out.println("Home Page Launch sucessfully");
	}
	
	
	@Test	
	public void TC_ID_14_02 () throws InterruptedException {
		  
	     
		driver.findElement(By.xpath("//android.view.View[@index='4']")).click();
		
		Thread.sleep(5000);
		
		
		
//		TouchAction quicklink = new TouchAction(driver);
//
//
//		quicklink.tap(PointOption.point(708, 2264)).perform();
			
		
		
		//WebElement AllSection = driver.findElement(By.xpath("//android.view.View[elementId='00000000-0000-08f6-0000-007f00000004']"));
//		WebElement AllSection = driver.findElement(By.xpath("//android.view.View[@index='4']"));
//		Assert.assertEquals(true, AllSection.isDisplayed());
//		System.out.println("AllSection");
//		Thread.sleep(5000);
		
		WebElement BuyingSection = driver.findElement(By.xpath("//android.view.View[@index='5']"));
		Assert.assertEquals(true, BuyingSection.isDisplayed());
		System.out.println("BuyingSection");
		Thread.sleep(5000);
		
		WebElement SellingSection = driver.findElement(By.xpath("//android.view.View[@index='6']"));
		Assert.assertEquals(true, SellingSection.isDisplayed());
		System.out.println("SellingSection");
		Thread.sleep(5000);
		
		WebElement InsideAllSection = driver.findElement(By.xpath("//android.widget.Button[@index='0']"));
		Assert.assertEquals(true, InsideAllSection.isDisplayed());
		System.out.println("InsideAllSection");
		Thread.sleep(5000);
		
		WebElement Product = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Product']"));
		Assert.assertEquals(true, Product.isDisplayed());
		System.out.println("Product");
		Thread.sleep(5000);
		
		
		WebElement Service = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Service']"));
		Assert.assertEquals(true, Service.isDisplayed());
		System.out.println("Service");
		Thread.sleep(5000);
		
		WebElement Filter = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Filter']"));
		Assert.assertEquals(true, Filter.isDisplayed());
		System.out.println("Filter");
		Thread.sleep(5000);
		
		//driver.navigate().back();
	}	
	
	@Test 
	
	public void TC_ID_14_03 () throws InterruptedException {
	
		WebElement AllSection = driver.findElement(By.xpath("//android.view.View[@index='4']"));
		AllSection.click();
		
		
		WebElement InsideAllSection = driver.findElement(By.xpath("//android.widget.Button[@index='0']"));
		Assert.assertEquals(true, InsideAllSection.isDisplayed());
		System.out.println("InsideAllSection-All-Buying-Selling-Product-and-ServiceBothIsDisplay");
		Thread.sleep(5000);
		
		WebElement Product = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Product']"));
		Assert.assertEquals(true, Product.isDisplayed());
		System.out.println("Product");
		Thread.sleep(5000);
		
		
		WebElement Service = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Service']"));
		Assert.assertEquals(true, Service.isDisplayed());
		System.out.println("Service");
		Thread.sleep(5000);
		
		WebElement Filter = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Filter']"));
		Assert.assertEquals(true, Filter.isDisplayed());
		System.out.println("Filter");
		Thread.sleep(5000);
		
		
//		WebElement BuyingProductOrder = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Automation test... 89, Udyan-1, Eldeco Udyan... 27-Nov 3 Week (wk) ₹6000 Delivered Booking received from Esrafil Ansari 8423073490 Karmaha Ugersen, Uttar Pr...\"])[1]"));
//		Assert.assertEquals(true, BuyingProductOrder.isDisplayed());
//		System.out.println("BuyingProductOrder");
//		Thread.sleep(5000);

		
//		WebElement SellingSectionOrder = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Slasher Rohini Delhi India 04-Aug 8 unit ₹416300 Order Accepted Delivered Product purchased from CHC Farmar Society 9671731990 89, Udyan-1, Eldeco Udyan...\"]]"));
//		Assert.assertEquals(true, SellingSectionOrder.isDisplayed());
//		System.out.println("SellingSectionOrder");
//		Thread.sleep(5000);

	}
	
    @Test 
	 public void TC_ID_14_04 () throws InterruptedException {
	
		 	WebElement Product = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Product']"));
		 	Product.click();
			
			
			WebElement ProductSection = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Product']"));
			Assert.assertEquals(true, ProductSection.isDisplayed());
			System.out.println("ProductSection-All-Buying-Selling-ProductListIsDisplay");
			Thread.sleep(5000);
			
//			Amount is display
//			WebElement ProductAmount = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Product']"));
//			Assert.assertEquals(true, ProductAmount.isDisplayed());
//			System.out.println("ProductSection-All-Buying-Selling-ProductIsDisplay");
//			ProductAmount.click();
//			Thread.sleep(5000);
			//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000)"));	
			
			
			//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1000)"));
			
//			WebElement DeliverdButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Deliverd\"]"));
//			Assert.assertEquals(true, DeliverdButton.isDisplayed());
//			System.out.println("DeliverdButton");
//			Thread.sleep(5000);
			
//			Status
//			WebElement CancelButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Cancel']"));
//			Assert.assertEquals(true, CancelButton.isDisplayed());
//			System.out.println("CancelButton");
//			CancelButton.click();
//			Thread.sleep(5000);
			
			
//			WebElement BuyingProductOrder = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Slasher Rohini Delhi India 04-Aug 8 unit ₹416300 Order Accepted Delivered Product purchased from CHC Farmar Society 9671731990 89, Udyan-1, Eldeco Udyan...\"]"));
//			BuyingProductOrder.click();
//			driver.navigate().back();
			
			
	 }

 @Test    		
    public void TC_ID_14_05 () throws InterruptedException {
    		
	    	WebElement Services = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Service']"));
	    	Services.click();
	    		
		 	WebElement ServiceSection = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Service']"));
			Assert.assertEquals(true, ServiceSection.isDisplayed());
			System.out.println("ServiceSection-All-Buying-Selling-SeviceListIsDisplay");
			Thread.sleep(5000);
			
//			Delivery button id is not display
			
//			WebElement SellServicesOrder = driver.findElement(By.xpath("((//android.widget.ImageView[@content-desc=\"Software Develo... Karwala road aghapur Ramp... 06-Aug 5 दिन ₹22500 Order Accepted Delivered Service taken from Sarjeet Singh 7776912934 Karwala road aghapur Ramp...\"])[1]"));
//			SellServicesOrder.click();
//			
//			driver.navigate().back();    		
    
 
 }

	@Test 
	public void TC_ID_14_06 () throws InterruptedException {
			
			WebElement Filter = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Filter']"));
			Filter.click();
				
			WebElement FilterIsDisplay = driver.findElement(By.xpath("//android.view.View[@content-desc='Filter']"));
			Assert.assertEquals(true, FilterIsDisplay.isDisplayed());
			System.out.println("FilterIsDisplay");
			Thread.sleep(5000);
			
			WebElement SearchFilter = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView"));
			Assert.assertEquals(true, SearchFilter.isDisplayed());
			System.out.println("SearchFilter");
			Thread.sleep(5000);
				
			WebElement ByAmountSection = driver.findElement(By.xpath("//android.view.View[@content-desc='By amount']"));
			Assert.assertEquals(true, ByAmountSection.isDisplayed());
			System.out.println("ByAmountSection");
			Thread.sleep(5000);
			
			WebElement MinAmountField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
			Assert.assertEquals(true, MinAmountField.isDisplayed());
			System.out.println("MinAmountField");
			Thread.sleep(5000);
			
			WebElement MaxAmountField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
			Assert.assertEquals(true, MaxAmountField.isDisplayed());
			System.out.println("MaxAmountField");
			Thread.sleep(5000);
			
			WebElement ByStatus = driver.findElement(By.xpath("//android.view.View[@content-desc='By status']"));
			Assert.assertEquals(true, ByStatus.isDisplayed());
			System.out.println("ByStatus");
			Thread.sleep(5000);
			
			WebElement StatusDropDown = driver.findElement(By.xpath("//android.widget.Button[@content-desc='All']"));
			Assert.assertEquals(true, StatusDropDown.isDisplayed());
			System.out.println("StatusDropDown");
			Thread.sleep(5000);
			
			WebElement ByDate = driver.findElement(By.xpath("//android.view.View[@content-desc='By date']"));
			Assert.assertEquals(true, ByDate.isDisplayed());
			System.out.println("ByDate");
			Thread.sleep(5000);
			
			WebElement StartDate = driver.findElement(By.xpath("//android.view.View[@content-desc='Start Date']"));
			Assert.assertEquals(true, StartDate.isDisplayed());
			System.out.println("StartDate");
			Thread.sleep(5000);
			
			WebElement EndDate = driver.findElement(By.xpath("//android.view.View[@content-desc='End Date']"));
			Assert.assertEquals(true, EndDate.isDisplayed());
			System.out.println("EndDate");
			Thread.sleep(5000);
			
			WebElement Apply = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Apply']"));
			Assert.assertEquals(true, Apply.isDisplayed());
			System.out.println("Apply");
			Thread.sleep(5000);
			
			WebElement Reset = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Reset']"));
			Assert.assertEquals(true, Reset.isDisplayed());
			System.out.println("Reset");
			Thread.sleep(5000);
			
			WebElement Back = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[1]"));
			Assert.assertEquals(true, Back.isDisplayed());
			System.out.println("Back");
			Thread.sleep(5000);
			
			}
	
	@Test 
	
	public void TC_ID_14_07 () throws InterruptedException {
	
			WebElement EnterSerach = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView"));
			EnterSerach.click();
			Thread.sleep(5000);
			EnterSerach.sendKeys("grain");
			Thread.sleep(5000);
				
//			WebElement Reset = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Reset']"));
//			Assert.assertEquals(true, Reset.isDisplayed());
//			System.out.println("Reset");
//			Thread.sleep(5000);
//			
//			WebElement EnterMinAmount = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
//			//WebElement EnterMinAmount = driver.findElement(By.xpath("android.widget.EditText[@index='4']"));
//			EnterMinAmount.click();
//			Thread.sleep(5000);
//			EnterMinAmount.sendKeys("10");
//			Thread.sleep(5000);
//	
//			
//		
//			
//			WebElement EnterMaxAmount = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[7]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
//			EnterMaxAmount.click();
//			Thread.sleep(5000);
//			EnterMaxAmount.sendKeys("1060");
//			Thread.sleep(5000);
			
			WebElement SelectStatusDropDown = driver.findElement(By.xpath("//android.widget.Button[@content-desc='All']"));
			SelectStatusDropDown.click();
			Thread.sleep(5000);
			
			WebElement SelectDeliverdDropDown = driver.findElement(By.xpath("//android.view.View[@content-desc='Deliverd']"));
			SelectDeliverdDropDown.click();
			Thread.sleep(5000);
			
//			WebElement EnterStartDate = driver.findElement(By.xpath("//android.view.View[@content-desc='Start Date']"));
//			EnterStartDate.click();
//			Thread.sleep(5000);
//			
//			WebElement StartDate = driver.findElement(By.xpath("//android.widget.Button[@index= '0']"));
//			StartDate.click();
//			Thread.sleep(5000);
//			StartDate.sendKeys("1-Jul-2023");
//			Thread.sleep(5000);
//			
//			WebElement OkButton = driver.findElement(By.xpath("//android.widget.Button[@index='6']"));
//			OkButton.click();
//			Thread.sleep(5000);
//			
//			WebElement EnterEndDate = driver.findElement(By.xpath("//android.view.View[@content-desc='End Date']"));
//			EnterEndDate.click();
//			Thread.sleep(5000);
//			
//			WebElement EndDate = driver.findElement(By.xpath("//android.widget.Button[@index= '0']"));
//			EndDate.click();
//			Thread.sleep(5000);
//			EndDate.sendKeys("29-Jul-2023");
//			Thread.sleep(5000);
//			
//			WebElement Ok2Button = driver.findElement(By.xpath("//android.widget.Button[@index='6']"));
//			OkButton.click();
//			Thread.sleep(5000);
			
			
			WebElement ClickApplyButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Apply']"));
			ClickApplyButton.click();
			Thread.sleep(5000);
							
	}
	
	
	@Test 
	
	public void TC_ID_14_08 () throws InterruptedException {
		
		WebElement ClickFilter = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Filter']"));
		ClickFilter.click();
		Thread.sleep(5000);
		
		
//		WebElement EnterSerach = driver.findElement(By.xpath("android.widget.ImageView[@index='2']"));
//		EnterSerach.click();
//		Thread.sleep(5000);
//		EnterSerach.sendKeys("");
//		Thread.sleep(5000);
//		
//		
//		WebElement EnterSerach1 = driver.findElement(By.xpath("android.widget.ImageView[@index='2']"));
//		EnterSerach1.click();
//		Thread.sleep(5000);
//		EnterSerach1.sendKeys("grain");
//		Thread.sleep(5000);
//		
////		WebElement EnterStartDate = driver.findElement(By.xpath("//android.view.View[@content-desc='Start Date']"));
////		EnterStartDate.click();
////		Thread.sleep(5000);
////		
////		WebElement StartDate = driver.findElement(By.xpath("//android.widget.Button[@index= '0']"));
////		StartDate.click();
////		Thread.sleep(5000);
////		StartDate.sendKeys("1-Jul-2023");
////		Thread.sleep(5000);
////		
////		WebElement OkButton = driver.findElement(By.xpath("//android.widget.Button[@index='6']"));
////		OkButton.click();
////		Thread.sleep(5000);
////		
////		WebElement EnterEndDate = driver.findElement(By.xpath("//android.view.View[@content-desc='End Date']"));
////		EnterEndDate.click();
////		Thread.sleep(5000);
////		
////		WebElement EndDate = driver.findElement(By.xpath("//android.widget.Button[@index= '0']"));
////		EndDate.click();
////		Thread.sleep(5000);
////		EndDate.sendKeys("29-Jul-2023");
////		Thread.sleep(5000);
////		
////		WebElement Ok2Button = driver.findElement(By.xpath("//android.widget.Button[@index='6']"));
////		OkButton.click();
////		Thread.sleep(5000);
//		
//		
//		TouchAction quicklink = new TouchAction(driver);
//
//		quicklink.tap(PointOption.point(659, 1914)).perform();
		
//		WebElement ResetButton = driver.findElement(By.xpath("//android.widget.Button[@index='12']"));
//		ResetButton.click();
		//Thread.sleep(5000);
		
	}
	
@Test   	
	public void TC_ID_14_09 () throws InterruptedException {
		
	
		TouchAction quicklink = new TouchAction(driver);
	
		quicklink.tap(PointOption.point(547, 402)).perform();
	
//		WebElement BuyingSection = driver.findElement(By.xpath("//android.view.View[@index='5']"));
//		BuyingSection.click();
//		Thread.sleep(5000);
		
		WebElement BuyingAllSection = driver.findElement(By.xpath("//android.widget.Button[@index='0']"));
		Assert.assertEquals(true, BuyingAllSection.isDisplayed());
		System.out.println("BuyingAllSection-All-Buying-Product-and-ServiceBothIsDisplay");
		Thread.sleep(5000);
		
		WebElement BuyingProductSection = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Product']"));
		Assert.assertEquals(true, BuyingProductSection.isDisplayed());
		System.out.println("BuyingAllSection-All-Buying-Product-IsDisplay");
		Thread.sleep(5000);
		
		WebElement BuyingServiceSection = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Service']"));
		Assert.assertEquals(true, BuyingServiceSection.isDisplayed());
		System.out.println("BuyingAllSection-All-Buying-Service-IsDisplay");
		Thread.sleep(5000);
		
		WebElement FilterSection = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Filter']"));
		Assert.assertEquals(true, FilterSection.isDisplayed());
		System.out.println("FilterSection");
		Thread.sleep(5000);
		
//		WebElement Filter = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Filter']"));
//		Filter.click();
//		Thread.sleep(5000);
		
	}


		@Test 
	
		public void TC_ID_14_10 () throws InterruptedException {
		
		WebElement Buying_Product = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Product']"));
		Buying_Product.click();
		Thread.sleep(5000);	
					
//		WebElement Cancel = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Cancel']"));
//		Assert.assertEquals(true, Cancel.isDisplayed());
//		System.out.println("CancelButtonIsDisplay");
//		Thread.sleep(5000);
		
		TouchAction quicklink = new TouchAction(driver);


		quicklink.tap(PointOption.point(477, 808)).perform();
		
//		WebElement BuyingProductItem = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Slasher Rohini Delhi India 04-Aug 8 unit ₹416300 Order Accepted Delivered Product purchased from CHC Farmar Society 9671731990 89, Udyan-1, Eldeco Udyan...\"]"));
//		BuyingProductItem.click();
//		Thread.sleep(5000);
			
		driver.navigate().back();
		}
	
@Test	
		
		public void TC_ID_14_11 () throws InterruptedException {
	
	
		TouchAction quicklink = new TouchAction(driver);
	
	
		quicklink.tap(PointOption.point(536, 402)).perform();
		
		WebElement Buying_Service = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Service']"));
		Buying_Service.click();
		Thread.sleep(5000);	
			
		WebElement Cancel = driver.findElement(By.xpath("(//android.widget.Button[@content-desc='Cancel'])[1]"));
		Assert.assertEquals(true, Cancel.isDisplayed());
		System.out.println("CancelButtonIsDisplay");
		Thread.sleep(5000);
		
		TouchAction quicklink1 = new TouchAction(driver);


		quicklink1.tap(PointOption.point(480, 790)).perform();
		
//		WebElement BuyingServiceItem = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Software Develo... Karwala road aghapur Ramp... 06-Aug 5 दिन ₹22500 Order Accepted Delivered Service taken from Sarjeet Singh 7776912934 Karwala road aghapur Ramp...\"])[1]"));
//		BuyingServiceItem.click();
//		Thread.sleep(5000);
			
		driver.navigate().back();
			
		}
		
@Test  

		public void TC_ID_14_12 () throws InterruptedException {
		
//		WebElement SellingSection = driver.findElement(By.xpath("//android.view.View[index='6']"));
//		SellingSection.click();
//		Thread.sleep(5000);	
		
		
		TouchAction quicklink = new TouchAction(driver);


		quicklink.tap(PointOption.point(875, 398)).perform();
				
//		WebElement Cancel = driver.findElement(By.xpath("(//android.widget.Button[@content-desc='Cancel'])[1]"));
//		Assert.assertEquals(true, Cancel.isDisplayed());
//		System.out.println("CancelButtonIsDisplay");
//		Cancel.click();
//		Thread.sleep(5000);
		
		TouchAction quicklink1 = new TouchAction(driver);


		quicklink1.tap(PointOption.point(413, 823)).perform();
		
		
//		WebElement SellingAllItem = driver.findElement(By.xpath("(android.widget.ImageView[@index='0']"));
//		SellingAllItem.click();
		
		
		
		Thread.sleep(5000);
				
		
		driver.navigate().back();
			
		}
@Test	
		public void TC_ID_14_13 () throws InterruptedException {
	
		TouchAction quicklink = new TouchAction(driver);
	
	
		quicklink.tap(PointOption.point(875, 398)).perform();
			
//		WebElement SellingSection = driver.findElement(By.xpath("//android.view.View[index='6']"));
//		SellingSection.click();
//		Thread.sleep(5000);	
		
		TouchAction quicklink1 = new TouchAction(driver);


		quicklink1.tap(PointOption.point(391, 555)).perform();
		
//		WebElement SellingProductItem = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Product']"));
//		SellingProductItem.click();
//		Thread.sleep(5000);
		
		TouchAction quicklink2 = new TouchAction(driver);


		quicklink2.tap(PointOption.point(454, 793)).perform();
//		WebElement SellingProductList = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\\\"Slasher Rohini Delhi India 04-Aug 8 unit ₹416300 Order Accepted Delivered Product purchased from CHC Farmar Society 9671731990 89, Udyan-1, Eldeco Udyan...\\\"]"));
//		SellingProductList.click();
//		Thread.sleep(5000);
		driver.navigate().back();		
		}

@Test	
		public void TC_ID_14_14 () throws InterruptedException {
		
//		WebElement SellingSection = driver.findElement(By.xpath("//android.view.View[index='6']"));
//		SellingSection.click();
	
		TouchAction quicklink = new TouchAction(driver);
	
	
		quicklink.tap(PointOption.point(875, 387)).perform();
		
		Thread.sleep(5000);	
//		WebElement SellingServiceSection = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Service']"));
//		SellingServiceItem.click();	
		
		
		TouchAction quicklink1 = new TouchAction(driver);
			
			
		quicklink1.tap(PointOption.point(689, 570)).perform();
		
		Thread.sleep(5000);	
		
		
		
//		WebElement SellingServiceItem = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Service']"));
//		SellingServiceItem.click();
		TouchAction quicklink2 = new TouchAction(driver);
		
		
		quicklink2.tap(PointOption.point(484, 745)).perform();
		Thread.sleep(5000);	
		
		driver.navigate().back();
			
			
		}
		}
		

