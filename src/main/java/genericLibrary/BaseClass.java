package genericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.ITestresult;
import org.testing.annotations.AfterMethod;
import org.testing.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public WebDriver driver;

public Propertyfile pdata= new Propertyfile();
public WebDriverUtilities utilies=new WebDriver Utilities();
@BeforeMethod
public void openApp() throws IOException{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(pdata.getProperydata("url"));
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
@AfterMethod
public void closeApp(ITestResult res) throwsIOException
{
	int status=res.getstatus();
	String nasme=res.getName();
	if(status ==2)
	{
		//photo p=new Photo();
		photo p=new Photo();
		p.getphoto(driver, nasme);
	}
	driver.quit();
}
}

	
	
