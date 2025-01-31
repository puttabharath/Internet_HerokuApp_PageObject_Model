package testComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Baseclass {

	public WebDriver driver;

	@BeforeClass
	public void Setup() throws Throwable {
		
		FileInputStream fis = new FileInputStream("C:\\InternetHerokuapp\\InternetHerokuapp\\src\\test\\java\\testData\\Data.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String browserName = System.getProperty("browser")!=null ? System.getProperty("browser") :prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/");
	}
	
	public String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
	    if (driver == null) {
	        System.out.println("Driver is null, skipping screenshot capture");
	        return null;
	    }
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
	    FileUtils.copyFile(source, file);
	    return file.getAbsolutePath();
	}


	@AfterClass
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}}


