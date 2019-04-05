package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Edit {
	private static final String DOTS = "fa-ellipsis-v"; 
	private static final String EDIT = "fa-edit";
	private static final String EDIT_TITLE = "//input[@id='title']";
	private static final String EDIT_LOCATION = "//input[@id='location']";
	private static final String EDIT_TRANSPORT = "//select[@id='transport']";
	private static final String EDIT_DESCRIPTION = "//textarea[@id='description']";
	private static final String EDIT_POST = "//div[@class='popupEdit']//input[@value='Post']";
	
	
	public static WebElement getDots(WebDriver wd, int n) {
		List<WebElement> list = wd.findElements(By.className(DOTS));
		WebElement driver = list.get(n);
		return driver;
	}


	public static void clickDots(WebDriver wd, int n) {
		getDots(wd, n).click();
	}

	public static WebElement getEdit(WebDriver wd, int n) {
		List<WebElement> list = wd.findElements(By.className(EDIT));
		WebElement driver = list.get(n);
		return driver;
	}

	public static void clickEdit(WebDriver wd , int n) {
		getEdit(wd,n).click();

	}

	public static WebElement getTitle(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(EDIT_TITLE));
		return driver;
	}

	public static void clickTitle(WebDriver wd) {
		getTitle(wd).click();
	}

	public static void sendKeysTitle(WebDriver wd, String str) {
		getTitle(wd).sendKeys(str);
	}

	public static WebElement getLocation(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(EDIT_LOCATION));
		return driver;
	}

	public static void clickLocation(WebDriver wd) {
		getLocation(wd).click();
	}

	public static void sendKeysLocation(WebDriver wd, String str) {
		getLocation(wd).sendKeys(str);
	}

	public static WebElement getTransport(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(EDIT_TRANSPORT));
		return driver;
	}

	public static void clickTransport(WebDriver wd) {
		getTransport(wd).click();
	}

	public static void sendKeysTransport(WebDriver wd, String str) {
		getTransport(wd).sendKeys(str);
	}

	public static WebElement getDescription(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(EDIT_DESCRIPTION));
		return driver;
	}

	public static void clickDescription(WebDriver wd) {
		getDescription(wd).click();
	}

	public static void sendKeysDescription(WebDriver wd, String str) {
		getDescription(wd).clear();
		getDescription(wd).sendKeys(str);
	}

	public static WebElement getPost(WebDriver wd) {
		WebElement driver = wd.findElement(By.xpath(EDIT_POST));
		return driver;
	}

	public static void clickPost(WebDriver wd) {
		getPost(wd).click();
	}

	public static void sendKeysPost(WebDriver wd, String str) {
		getPost(wd).sendKeys(str);
	}

}
