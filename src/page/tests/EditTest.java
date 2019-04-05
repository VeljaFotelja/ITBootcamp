package page.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.Edit;
import utils.DataExcel;
import utils.ExcelUtils;

public class EditTest {

	public static void editPost(WebDriver wd, int n) {
		Scanner sc = new Scanner(System.in);
		Edit.clickDots(wd, n);
		Edit.clickEdit(wd, n);

		System.out.println("Unesite novi naslov");
		String str = sc.nextLine();
		Edit.clickTitle(wd);
		Edit.sendKeysTitle(wd, str);

		System.out.println("Unesite novu lokaciju");
		str = sc.nextLine();
		Edit.clickLocation(wd);
		Edit.sendKeysLocation(wd, str);

		System.out.println("Unesite transport koji zelite");
		str = sc.nextLine();
		Edit.clickTransport(wd);
		Edit.sendKeysTransport(wd, str);

		System.out.println("Unesite novi opis");
		str = sc.nextLine();
		Edit.getDescription(wd).clear();
		Edit.clickDescription(wd);
		Edit.sendKeysDescription(wd, str);

		Edit.clickPost(wd);
	}

	public static void editPosts(WebDriver wd, int n, int k) throws Exception {
		ExcelUtils.setExcelFile(DataExcel.path + DataExcel.fileName, DataExcel.SHEET1);
		String str;
		Edit.clickDots(wd, n);
		Edit.clickEdit(wd, n);
		
		str=ExcelUtils.getCellData(k, 1);
		Edit.clickTitle(wd);
		Edit.sendKeysTitle(wd, str);
		
		str=ExcelUtils.getCellData(k, 2);
		Edit.clickLocation(wd);
		Edit.sendKeysLocation(wd, str);
		
		str=ExcelUtils.getCellData(k,0);
		Edit.clickDescription(wd);
		Edit.sendKeysDescription(wd, str);
		
		Edit.clickPost(wd);
		

	}

}
