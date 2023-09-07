package genericLibrary;

import java.util.Set;


public class WebDriverUtilities {

	public void dropdown(WebElement ele,String text) {
		Select s = new Select (ele);
		s.selectByVisibleText(text);
	}
	
	public void mouseHover(WebDriver driver,WebElement ele)
	{
		Action a = new Action(driver);
		a.moveToElement(ele).perform();
		
	}
	
public void doubleClick(WebDriver driver,WebElement ele)
{
	Actions a = new Actions(driver);
	a.doubleClick(ele).perform();
	
}
public void rightclick(WebDriver,WebElement ele)
{
	Actions a = new Actions(driver);
	a.contextClick (ele).perform();
}
public void dragdrop(WebDriver,WebElement src,WebElement target)
{
	Actions a = new Actions(driver);
	a.dragAndDrop(src,target).perform();
}

public void switchFrame(WebDriver driver,String value)
{
	driver.switchTo().frame(value);
	
}

public void switchbackframe(WebDriver driver)

{
	driver.switchTo().defaultContent();
	
}
public void switchingtabs(WebDriver driver) {
	Set<String> child = driver.getWindowHandles();
	for(String b:child) {
		driver.switchTo().window(b);
		}
}
public void scrollbar(WebDriver driver,int x,int y)
{
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
	}
}


