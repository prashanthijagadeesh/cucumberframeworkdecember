package Test.cucumberframework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReusableMethods {

	public static WebDriver driver;
	
	
	public static void launchApplication(String browser) {
		
		if(browser.equals("Edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://studio.cucumber.io/users/sign_in");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		}else if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://studio.cucumber.io/users/sign_in");
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		}

	}
	
	
	
	public static void closeBrowser() {
		driver.close();
	}
}
