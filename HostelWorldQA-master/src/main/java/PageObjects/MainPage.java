package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidElement;
import lombok.Getter;


public class MainPage {
	
	@Getter
	private static By createaccount_btn=By.id("com.hostelworld.qacodechallenge:id/btnCreateAccount");
	@Getter
	private static By Login_btn=By.id("com.hostelworld.qacodechallenge:id/btnLogin");
	
}
