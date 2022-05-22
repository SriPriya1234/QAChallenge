package PageObjects;

import org.openqa.selenium.By;

import lombok.Getter;

public class MainDashboardPage {
	@Getter
	private static By logout_btn=By.id("com.hostelworld.qacodechallenge:id/logoutBtn");
	@Getter
	private static By email_lbl=By.id("com.hostelworld.qacodechallenge:id/emailTv");
	@Getter
	private static By lastname_lbl=By.id("com.hostelworld.qacodechallenge:id/lastNameTv");
	@Getter
	private static By firstname_lbl=By.id("com.hostelworld.qacodechallenge:id/firstNameTv");
	@Getter
	private static By Loggedin_lbl=By.id("com.hostelworld.qacodechallenge:id/greetingTv");
}
