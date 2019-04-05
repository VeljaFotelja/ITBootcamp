package page.tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.Post;
import utils.DataExcel;
import utils.ExcelUtils;

public class PostTest {
	public static void postFillform(WebDriver wd, int i , String str) throws Exception {
		
		String data;
		//Excel Data
		ExcelUtils.setExcelFile(DataExcel.path + DataExcel.fileName, DataExcel.SHEET1);
		//Making a new post
		Post.clickNewPost(wd);
		//Title
		Post.clickTitle(wd);
		data = ExcelUtils.getCellData(i , 1);
		Post.sendKeysTitle(wd, data);
		//Location
		Post.clickLocation(wd);
		data = ExcelUtils.getCellData(i, 2);
		Post.sendKeysLocation(wd, data);
		//Transportation
		Post.selectTransport(wd, str);
		//Description
		Post.clickDescription(wd);
		data = ExcelUtils.getCellData(i, 0);
		Post.sendKeysDescription(wd, data);
		//Submit
		Post.clickPostButton(wd);
		Thread.sleep(3000);
		
		
	}
	public static void singleUserPost(WebDriver wd, Scanner sc) throws Exception {

		//Making a new post
		Post.clickNewPost(wd);

		//Title
		System.out.println("Post Title:");
		Post.clickTitle(wd);
		Post.sendKeysTitle(wd, sc.nextLine());

		//Location
		System.out.println("Location");
		Post.clickLocation(wd);
		Post.sendKeysLocation(wd, sc.nextLine());

		//Transportation
		System.out.println("Choose transport by typing one:");
		System.out.println("Walk, Car, Motorbike, Bicycle or Bus");
		Post.selectTransport(wd, sc.nextLine());

		//Description
		System.out.println("Post Description");
		Post.clickDescription(wd);
		Post.sendKeysDescription(wd, sc.nextLine());

		//Submit
		Post.clickPostButton(wd);
	}
	
	public static void testPostWithAllData(WebDriver wd, String str) throws Exception {
		ExcelUtils.setExcelFile(DataExcel.path + DataExcel.fileName, DataExcel.SHEET1);
		for (int i = 1; i < ExcelUtils.getWSheet().getLastRowNum() + 1; i++) {
			postFillform(wd, i , str);
		}
		
	}

}
