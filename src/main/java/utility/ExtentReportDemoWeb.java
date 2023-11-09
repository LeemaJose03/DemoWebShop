package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemoWeb {

	public static ExtentReports getReport() {
		
		String path="./reports/report.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("DemoWenShop Reporter");
		reporter.config().setDocumentTitle("DemoWenShop Reporter title");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		return extent;
		
		
	}
	
}
