package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Post {
	public static final String URL = "http://localhost/izlet/dashboard.php";

	private static final String NEWPOST = "//a[contains(text(),'Make a post')]";
	private static final String TITLE = "//input[@placeholder='Naziv']";
	private static final String LOCATION = "//input[@placeholder='Lokacija']";
	private static final String TRANSPORT = "//select[@name='transport']";
	private static final String DESCRIPTION = "//textarea[@placeholder='Opis']";
	private static final String POST = "//input[@value='Post']";

	public static void openPostPage(WebDriver wd) {
		wd.get(URL);
	}

	public static WebElement getNewPost(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(NEWPOST));
		return driver;
	}

	// Method to click on Make A Post Button
	public static void clickNewPost(WebDriver wd) {
		getNewPost(wd).click();
	}

	public static WebElement getTitle(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(TITLE));
		return driver;
	}

	public static void clickTitle(WebDriver wd) {
		getTitle(wd).click();
	}

	public static void sendKeysTitle(WebDriver wd, String str) {
		getTitle(wd).sendKeys(str);
	}

	public static WebElement getLocation(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(LOCATION));
		return driver;
	}

	public static void clickLocation(WebDriver wd) {
		getLocation(wd).click();
	}

	public static void sendKeysLocation(WebDriver wd, String str) {
		getLocation(wd).sendKeys(str);
	}

	public static void selectTransport(WebDriver wd, String str) {
		Select transport = new Select(wd.findElement(By.xpath(TRANSPORT)));
		transport.selectByVisibleText(str);
	}

	public static WebElement getDescription(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(DESCRIPTION));
		return driver;
	}

	public static void clickDescription(WebDriver wd) {
		getDescription(wd).click();
	}

	public static void sendKeysDescription(WebDriver wd, String str) {
		getDescription(wd).sendKeys(str);
	}

	public static WebElement getPostButton(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(POST));
		return driver;
	}

	public static void clickPostButton(WebDriver wd) {
		getPostButton(wd).click();
	}

}
