package PageObjects;

import org.openqa.selenium.By;

import lombok.Getter;

public class CreateAccountPage {

	@Getter
	private static By firstname_txtbox=By.id("com.hostelworld.qacodechallenge:id/firstNameEt");
	@Getter
	private static By secondname_txtbox=By.id("com.hostelworld.qacodechallenge:id/lastNameEt");
	@Getter
	private static By email_txtbox=By.id("com.hostelworld.qacodechallenge:id/emailEt");
	@Getter
	private static By password_txtbox=By.id("com.hostelworld.qacodechallenge:id/passwordEt");
	@Getter
	private static By createaccount_btn=By.id("com.hostelworld.qacodechallenge:id/btnCreateAccount");
	
}
