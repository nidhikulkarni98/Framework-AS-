package Generic_utility;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Durations;

/**
 * this methos is used to maximize window
 */
public class Webdriver_utility {

	
	public void windowMaximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	
	
	/**
	 * thia method is used for wait
	 * @param driver
	 */
	public void pageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	/**
	 * this method is used for move to action
	 * @param driver
	 * @param ele
	 */
	public void mouseMoveToElement(WebDriver driver , WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	
	
	/**
	 * this methos id used to perform window switching
	 * @param driver
	 * @param name
	 */
	public void switchWindow(WebDriver driver, String name) {
		Set<String> allWins = driver.getWindowHandles();

		Iterator<String> it = allWins.iterator();

		while (it.hasNext()) {
			String win = it.next();
			driver.switchTo().window(win);
			String title = driver.getTitle();

			if (title.contains(name)) {
				break;
			}
		}
	}
	
	/**
	 * this method is used to take screenshot when test fails using ITestListener
	 * @param driver
	 * @param screenShotName
	 * @return
	 * @throws Throwable
	 */
	
	
public static String takeScreenShot1(WebDriver driver, String screenShotName) throws Throwable {
		
		TakesScreenshot takesSceenShot = (TakesScreenshot) driver;
		File src = takesSceenShot.getScreenshotAs(OutputType.FILE);
		File dst = new File("./ScreenShots/" + screenShotName +".png");
		FileUtils.copyFile(src, dst);
		return dst.getAbsolutePath();
	}

}
