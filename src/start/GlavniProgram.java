package start;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HomePage;
import page.tests.DeleteTest;
import page.tests.EditTest;
import page.tests.LogInTest;
import page.tests.PostTest;
import page.tests.RegistrationTest;

public class GlavniProgram {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();

		System.out.println("Dobrodosli u testiranje programa");

		try {

			HomePage.openPage(wd);

			System.out.println("Ukoliko zelite sami da se registrujete, unesite 1");
			System.out.println("Ukoliko hocete da se korisnici unesu iz Excel-a, pritisnite 2");

			int a = sc.nextInt();
			switch (a) {
			case 1:
				RegistrationTest.fillFormManual(wd);
				break;
			case 2:
				RegistrationTest.testWithAllData(wd);
				break;
			default:
				System.out.println("You entered the wrong number");
			}
			System.out.println("Ukoliko zelite sami da se ulogujete, unesite 1");
			System.out.println("Ukoliko hocete da se korisnici uloguju iz Excel-a, pritisnite 2");
			
			switch (a) {
			case 1:
				LogInTest.fillForm(wd);
				break;
			case 2:
				LogInTest.testWithAllData(wd);
				break;
			default:
				System.out.println("Uneli ste pogresan broj");
			}
			System.out.println("Ukoliko zelite sami da postujete, unesite 1");
			System.out.println("Ukoliko hocete da se automatski postuje, pritisnite 2");
			switch (a) {
			case 1:
				PostTest.singleUserPost(wd, sc);
				break;
			case 2:
				PostTest.testPostWithAllData(wd, "Bus");
				break;
			default:
				System.out.println("Uneli ste pogresan broj");
			}
			DeleteTest.deletePosts(wd, 2);
			EditTest.editPost(wd, 0);
			
			
		}finally {
			System.out.println("Hvala");
		}
	}
}

	


