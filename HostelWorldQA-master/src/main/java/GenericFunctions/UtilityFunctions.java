package GenericFunctions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BaseLib.BaseLib;
import PageObjects.MainPage;

public class UtilityFunctions extends BaseLib{

	public static void clickElement(By element)
	{
		wait.until(ExpectedConditions.presenceOfElementLocated(element));	
		driver.findElement(element).click();
	}

	public static void enterValueToTextBox(By element,String valuetoenter) {
		wait.until(ExpectedConditions.presenceOfElementLocated(element));	
		driver.findElement(element).sendKeys(valuetoenter);
		
	}
	public static void waitforfewseconds(int secondstowait)
	{
		try {
			Thread.sleep(secondstowait*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String getTextFromElement(By element)
	{
		wait.until(ExpectedConditions.presenceOfElementLocated(element));	
		return driver.findElement(element).getText().trim();
	}

	public static boolean isElementVisible(By element) {
		File  fs;
		return driver.findElement(element).isDisplayed();
		
	}
}
