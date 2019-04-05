package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {

	public static final String URL = "http://localhost/izlet/izlet/index.php";

	public static final String USERNAME = "//input[@placeholder='username']";
	public static final String PASSWORD = "//input[@placeholder='password']";
	private static final String LOGIN = "//input[@value='Log in']";
	private static final String LOGOUT = "//a[@id='logoutBtn']";

	public static WebElement getUsername(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(USERNAME));
		return driver;
	}

	public static void clickUsername(WebDriver wd) {
		getUsername(wd).click();
	}

	public static void sendKeysUsername(WebDriver wd, String str) {
		getUsername(wd).sendKeys(str);
	}

	public static WebElement getPassword(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(PASSWORD));
		return driver;
	}

	public static void clickPassword(WebDriver wd) {
		getPassword(wd).click();
	}

	public static void sendKeysPassword(WebDriver wd, String str) {
		getPassword(wd).sendKeys(str);

	}

	public static WebElement getLogIn(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(LOGIN));
		return driver;
	}

	public static void clickLogIn(WebDriver wd) {
		getLogIn(wd).click();
	}

	public static WebElement getLogOut(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(LOGOUT));
		return driver;
	}

	public static void clickLogOut(WebDriver wd) {
		getLogOut(wd).click();
	}
	public static void navigateTo(WebDriver dr) {
		dr.navigate().to(URL);

	}

}
