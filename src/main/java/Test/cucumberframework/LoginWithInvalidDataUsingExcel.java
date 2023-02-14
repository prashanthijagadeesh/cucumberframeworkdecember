package Test.cucumberframework;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjectsexercise.LoginPage;
@Test

public class LoginWithInvalidDataUsingExcel extends LoginPage{

	
	public static void LoginWithInvalidData1() {
		String actualresult = "";
		try {
			FileInputStream fs = new FileInputStream("C:\\Users\\Jagadeesh\\eclipse-workspace\\SeleniumTestng\\Testdata.xlxs");
			XSSFWorkbook wb = new XSSFWorkbook();
			XSSFSheet sheet = wb.getSheet("logindata");
			XSSFRow row = sheet.getRow(1);
          XSSFCell cell = row.getCell(0);
			
          String arg1 = cell.getStringCellValue(); //email id
          System.out.println(arg1);
          
			
			XSSFCell cell1 = row.getCell(1);
			
			String arg2 =cell1.getStringCellValue(); //password
			
			System.out.println(arg2);
			
			enterEmailId(arg1);
			enterpassword(arg2);
			clickSignInButton();
			
			actualresult = captureInvalidLoginErrorMessage();
	}catch(Exception e) {
		e.printStackTrace();
	}
		String expectedResult = "Invalid email or password";
		Assert.assertEquals(actualresult,expectedResult,"Error message is not validated properly");
}
}