package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pojo.LaunchBrowser;

public class Dropdowns {
	private static final WebElement Products = null;

	public static void main(String[] args) throws InterruptedException  {
		  WebDriver driver = LaunchBrowser.chrome("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
				
				WebElement Animals = driver.findElement(By.xpath("//select[@id='animals']"));
				
				Select select = new Select(Animals);
				
				select.selectByIndex(2);
				
				Thread.sleep(2000);
				
				Select select1 = new Select(Products);
				
				select1.selectByValue("Google");
	}

}
