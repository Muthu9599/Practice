package com.PracticeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class OpenGoogle {
	
	public static void main(String[] args) {
		ExtentReports extentReport = new ExtentReports();
		ExtentHtmlReporter htmlReport = new ExtentHtmlReporter("Report.html");
		extentReport.attachReporter(htmlReport);
		ExtentTest test=extentReport.createTest("Wattsapp Duck");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(option);
		driver.get("http://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Wattsapp Duck!");
		driver.findElement(By.name("q")).submit();
		test.pass("Test Pass");
		extentReport.flush(); 
		
		
		// this code to change executable file build pannau edha jar haa
		//mathanu opengoogle-->R.c-->Export --->Runnablejar-->main class kudukanu
	}

}
