package page.tests;

import org.openqa.selenium.WebDriver;

import page.objects.Delete;

public class DeleteTest {
	public static void deletePost(WebDriver wd, int n) {
		Delete.clickDots(wd, n);
		Delete.clickDelete(wd, n);
	}

	public static void deletePosts(WebDriver wd, int k) {
		for (int n = 0, i = 0; i < k; i++) {
			deletePost(wd, n);

		}

	}

}
