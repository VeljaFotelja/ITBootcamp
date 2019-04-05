package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Delete {
	private static final String DOTS = "fa-ellipsis-v"; 
	private static final String DELETE = "fa-trash-alt";

	public static WebElement getDelete(WebDriver wd, int n) {
		List<WebElement> list = wd.findElements(By.className(DELETE));
		WebElement driver = list.get(n);
		return driver;
	}

	
	public static void clickDelete(WebDriver wd, int n) {
		getDelete(wd, n).click();
	}

	public static WebElement getDots(WebDriver wd, int n) {
		List<WebElement> list = wd.findElements(By.className(DOTS));
		WebElement driver = list.get(n);
		return driver;
	}

	
	public static void clickDots(WebDriver wd, int n) {
		getDots(wd, n).click();
	}

}
