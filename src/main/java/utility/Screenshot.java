package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import pojo.LaunchBrowser;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		
	WebDriver driver = LaunchBrowser.chrome("https://www.facebook.com/");
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File destination = new File("D:\\SceenShot\\newww.png");
	
	FileHandler.copy(source, destination);
	
	
	}

}
