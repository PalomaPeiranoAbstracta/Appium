package mytraining.Appium;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AppiumBasics extends BaseTest {

	@Test
	public void wifiSettingsName() throws MalformedURLException {
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String popUpTitle = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
		Assert.assertEquals(popUpTitle, "WiFi settings");
		driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("password");
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		}
}
