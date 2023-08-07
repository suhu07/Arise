package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.LaunchBrowser;

public class FBlogin {
		WebDriver driver;
		
		@BeforeMethod
		public void openBrowser() {
	         driver = LaunchBrowser.chrome("https://www.facebook.com/");
		}
		@Test
		public void loginWithValidCred() {
			
			FbLaunch login = new FbLaunch(driver);
			login.enterEmail("Arise12@gmail.com");
			login.entrePassword("123456789");
			login.clickonLogIn();
			login.clickonCeateAccount();
		}
		@Test
		public void loginWithValidUsenamendInvalidPass() {
			
			FbLaunch login = new FbLaunch(driver);
			login.enterEmail("Arise12@gmail.com");
			login.entrePassword("77777777");
			login.clickonLogIn();
			login.clickonCeateAccount();
		}
		@Test
		public void loginWithInvalidUsernamendPass() {
				
				FbLaunch login = new FbLaunch(driver);
				login.enterEmail("Arise@gmail.com");
				login.entrePassword("2122254777");
				login.clickonLogIn();
				login.clickonCeateAccount();
		}
		@AfterMethod
		public void closeBrowser() {
			driver.close();
		}
}
