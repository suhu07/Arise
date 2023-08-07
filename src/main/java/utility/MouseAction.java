package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pojo.LaunchBrowser;

public class MouseAction {
public static void main(String[] args) {
		
		WebDriver driver = LaunchBrowser.chrome("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions actions = new Actions(driver);
		
		actions.contextClick(rightClick);
		
		actions.perform();
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions action1 = new Actions(driver);
		
		action1.doubleClick(doubleClick);
		
		action1.perform();

}

}
