package Test.cucumberframework;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class LoginTestWithDataProviderEx extends ReusableMethods {
	
		
		//This test case will enter wrong credentials and verify the error message is displaying or not
		@Test(dataProvider = "Logindata")
		public static void loginWithInvalidData(String arg1, String arg2) {
			String actualresult = "";
			try {
				driver.findElement(By.id("user_email")).sendKeys(arg1);

				driver.findElement(By.name("user[password]")).sendKeys(arg2);

				driver.findElement(By.name("commit")).click();
				
				 actualresult = driver.findElement(By.xpath("//p[text()='Invalid email or password.']")).getText();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String expectedResult = "Invalid email or password.";
			
			
			if(actualresult.equals(expectedResult)) {
				System.out.println("Test case is passed");
				System.out.println("Actual result is "+actualresult);
			}else {
				System.out.println("Test case is failed");
				System.out.println("Actual result is "+actualresult);
			}

			
			
		}
		
		
		@DataProvider(name = "Logindata")
		public Object[][] dpMethod() {
		
		 return new Object [][] { {"test321@gmail.com", "Test@123"}, {"prashanthi@gmail.com","Test@123"} 
		};
		 
		}}

		
