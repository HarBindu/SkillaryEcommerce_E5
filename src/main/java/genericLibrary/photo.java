package genericLibrary;

import java.io.File;

public class photo {
	
	public void getphoto(WebDriver driver,String name) throws IOException
	{
		Date d = new Date();
		String currentdate = d.toString().replaceAll(":","-");
		TakeScreenshot ts = (TakeScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.File);
		File dest = new File(IPathConstant.photopath+currentdate+name+".png");
		FileUtils.copyFile(src,dest);
		
	}

}
