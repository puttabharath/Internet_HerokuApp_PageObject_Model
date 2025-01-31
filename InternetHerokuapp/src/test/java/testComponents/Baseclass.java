package testComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Baseclass {

	public WebDriver driver;

	@BeforeMethod
	public void Setup() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\InternetHerokuapp\\InternetHerokuapp\\src\\test\\java\\testData\\Data.properties");
		prop.load(fis);
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


	@AfterMethod
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}}


