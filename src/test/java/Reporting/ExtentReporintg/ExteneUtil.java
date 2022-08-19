package Reporting.ExtentReporintg;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExteneUtil{
	
	
	static public  ExtentSparkReporter reporter;
	static public  ExtentReports  extend;
	

	public  static ExtentReports Reporting() {
	
	reporter= new ExtentSparkReporter("C:\\Users\\HP\\eclipse-workspace\\ExtentReporintg\\test-output");
	extend= new ExtentReports();
	
	reporter.config().getReportName();
	
	extend.attachReporter(reporter);
	
	return extend;
	
	
	}
}
	
	
	


