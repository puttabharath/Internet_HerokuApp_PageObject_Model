package testData;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExtentReporterNG {
    public static ExtentReports getReportObject() {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
        String formattedDateTime = now.format(formatter);

        // Construct the dynamic path with date and time
        String path = System.getProperty("user.dir") + "./reports//InternetHerokuapp_"+ formattedDateTime+"index.html";

        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        // Configure HTML report settings

        reporter.config().setReportName("Web Automation Results");
        reporter.config().setDocumentTitle("InternetHerokuApp Test Results");
        reporter.config().setTheme(Theme.DARK);
   
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Bharath Kumar Putta");
        extent.setSystemInfo("Host Name", "InternetHeroku");
        extent.setSystemInfo("Environment", "Automation Script - QA");
        extent.setSystemInfo("User Name", "PBK");
        
      
        return extent;
    }
}
