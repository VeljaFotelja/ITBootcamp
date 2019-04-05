package page.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.HomePage;
import page.objects.Registration;
import utils.DataExcel;
import utils.ExcelUtils;

public class RegistrationTest {
	public static void fillform(WebDriver dr, int i) throws Exception {

		String data;
		ExcelUtils.setExcelFile(DataExcel.path + DataExcel.fileName, DataExcel.SHEET);
		Registration.clickFirstName(dr);
		data = ExcelUtils.getCellData(i, 0);
		Registration.sendKeysFirstName(dr, data);
		Registration.clickLastName(dr);
		data = ExcelUtils.getCellData(i, 1);
		Registration.sendKeysLastName(dr, data);
		Registration.clickUserName(dr);
		data = ExcelUtils.getCellData(i, 2);
		Registration.sendKeysUserName(dr, data);
		Registration.clickEmail(dr);
		data = ExcelUtils.getCellData(i, 3);
		Registration.sendKeysEmail(dr, data);
		Registration.clickPassword(dr);
		data = ExcelUtils.getCellData(i, 4);
		Registration.sendKeysPassword(dr, data);

		HomePage.clickRegisterLink(dr);
	}
	
	public static void fillFormManual(WebDriver dr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite firstName");
        String firstName = sc.nextLine();
        Registration.sendKeysFirstName(dr, firstName);
        System.out.println("Unesite lastName");
        String lastName = sc.nextLine();
        Registration.sendKeysLastName(dr, lastName);
        System.out.println("Unesite username");
        String username = sc.nextLine();
        Registration.sendKeysUserName(dr, username);
        System.out.println("Unesite email");
        String email = sc.nextLine();
        Registration.sendKeysEmail(dr, email);
        System.out.println("Unesite password");
        String password = sc.nextLine();
        Registration.sendKeysPassword(dr, password);

        HomePage.clickRegisterLink(dr);
    }

	public static void testWithAllData(WebDriver dr) throws Exception {
		ExcelUtils.setExcelFile(DataExcel.path + DataExcel.fileName, DataExcel.SHEET);
		for (int i = 1; i < ExcelUtils.getWSheet().getLastRowNum() + 1; i++) {
			RegistrationTest.fillform(dr, i);
			Registration.navigateTo(dr);
		}

	}

}
