package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public static final String URL = "http://localhost/izlet/";
	
	public static WebElement getRegisterLink(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath("//input[@id='blue_btn']"));
		return wb;
	}
	public static void clickRegisterLink(WebDriver dr) {
		getRegisterLink(dr).click();
	}
	
	public static void openPage(WebDriver dr) {
		dr.get(URL);
	}
	public static void navigateTo(WebDriver dr) {
		dr.navigate().to(URL);
	}

}
