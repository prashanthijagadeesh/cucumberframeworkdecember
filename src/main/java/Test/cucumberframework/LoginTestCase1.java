package Test.cucumberframework;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageobjectsexercise.LoginPage;

public class LoginTestCase1 extends LoginPage {
	
	@Parameters({"emailid","password"})
	@Test
		
		public static void login(String arg1, String arg2) throws IOException {
			String actualresult = "";
			try {
				enterEmailId(arg1);

				enterpassword(arg2);

				clickSignInButton();
				
				actualresult =captureInvalidLoginErrorMessage();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			String expectedResult = "Invalid email or password";
			
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(actualresult, expectedResult, "Message is not matching");
			//Assert.assertEquals(actualresult, expectedResult, "Message is not matching");
		
			
			sa.assertAll();
			
		}

	}

