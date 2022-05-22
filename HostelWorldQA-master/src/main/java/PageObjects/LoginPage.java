package PageObjects;

import org.openqa.selenium.By;

import lombok.Getter;

public class LoginPage {

	@Getter
	private static By Login_btn=By.id("com.hostelworld.qacodechallenge:id/btnLogin");
	@Getter
	private static By email_txtbox=By.id("com.hostelworld.qacodechallenge:id/usernameEt");
	@Getter
	private static By password_txtbox=By.id("com.hostelworld.qacodechallenge:id/passwordEt");
}
