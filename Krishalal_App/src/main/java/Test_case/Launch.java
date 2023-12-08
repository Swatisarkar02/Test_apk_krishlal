package Test_case;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;

import java.net.URL;

public class Launch {

	public static AndroidDriver driver = null;
	
	@BeforeTest
	public void setUp () throws InterruptedException, MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities ();
		desiredCapabilities.setCapability ("appium:deviceName", "OnePlus Nord CE 2 Lite 5G");
		desiredCapabilities.setCapability ("appium:platformName", "Android");
		desiredCapabilities.setCapability ("appium:platformVersion", "13");
		desiredCapabilities.setCapability ("appium:udid", "b2d53740");
		desiredCapabilities.setCapability ("appium:app", "C:\\Users\\SwatiSarkar\\Downloads\\krishlal-test_V115.apk");
		desiredCapabilities.setCapability ("appium:newcommandTimeout", 3600);
		desiredCapabilities.setCapability ("appium:connectHardwareKeyboard", true);
		
		URL remoteUrl = new URL("http://localhost:4723/wd/hub");
		
		driver = new AndroidDriver(remoteUrl, desiredCapabilities);
		
		Thread.sleep(5000);}
	
			
	}
	

