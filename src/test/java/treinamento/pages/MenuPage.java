package treinamento.pages;

import static treinamento.config.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;

import io.appium.java_client.MobileBy;

public class MenuPage {
	
	private By devicePermission = By.id("com.android.permissioncontroller:id/continue_button");
	private By outdateOK = By.id("android:id/button1");
	private By accessibilityMenu = MobileBy.AccessibilityId("Accessibility");
	private By animationMenu = MobileBy.AccessibilityId("Animation");
	
	public void givePermission() {
		getDriver().findElement(devicePermission).click();
	}
	
	public void outdateNoProblem() {
		getDriver().findElement(outdateOK).click();
	}
	
	public void accessibility() {
		getDriver().findElement(accessibilityMenu).click();
		getDriver().navigate().back();		
	}
	
	public void animation() {
		getDriver().findElement(animationMenu).click();
		getDriver().navigate().back();
		
	}
}