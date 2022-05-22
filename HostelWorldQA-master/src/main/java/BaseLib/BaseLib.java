package BaseLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseLib {
	
	public static AndroidDriver<AndroidElement> driver=null;
	public static WebDriverWait wait;
	public static void installApps() throws MalformedURLException
	{
		File appFolder = new File("apk");
		File appPath=new File(appFolder,"hostelworld.apk");
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "adv ");//use TestPhone for emulator
		dc.setCapability(MobileCapabilityType.APP, appPath.getAbsolutePath());
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver,20);
	}
	
	public static String getDatafromProperty(String propertyname) throws IOException {
		
		Properties prop=new Properties();
		System.err.println("Path of current dir is"+System.getProperty("user.dir"));
		
		FileInputStream fis=new FileInputStream(new File(System.getProperty("user.dir")+"/TestData/data.properties"));
		//prop
		prop.load(fis);
		return (String) prop.get(propertyname);
		
	}


}
