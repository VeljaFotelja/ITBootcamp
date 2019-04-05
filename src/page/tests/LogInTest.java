package page.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.HomePage;
import page.objects.LogIn;
import page.objects.Registration;
import utils.DataExcel;
import utils.ExcelUtils;

public class LogInTest {
	public static void logInFillorm(WebDriver dr, int i) throws Exception {

		String data;
		ExcelUtils.setExcelFile(DataExcel.path + DataExcel.fileName, DataExcel.SHEET);
		LogIn.clickUsername(dr);
		data = ExcelUtils.getCellData(i, 2);
		LogIn.sendKeysUsername(dr, data);
		LogIn.clickPassword(dr);
		data = ExcelUtils.getCellData(i, 4);
		LogIn.sendKeysPassword(dr, data);
		LogIn.clickLogIn(dr);
		Thread.sleep(3000);
		LogIn.clickLogOut(dr);
	}

	public static void fillForm(WebDriver dr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite username");
		String username = sc.nextLine();
		LogIn.sendKeysUsername(dr, username);
		System.out.println("Unesite password");
		String password = sc.nextLine();
		LogIn.sendKeysPassword(dr, password);

		LogIn.clickLogIn(dr);
	}

	public static void testWithAllData(WebDriver dr) throws Exception {
		ExcelUtils.setExcelFile(DataExcel.path + DataExcel.fileName, DataExcel.SHEET);
		for (int i = 1; i < ExcelUtils.getWSheet().getLastRowNum() + 1; i++) {
			LogInTest.logInFillorm(dr, i);
			LogIn.navigateTo(dr);

		}

	}
}
