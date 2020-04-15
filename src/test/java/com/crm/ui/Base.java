package com.crm.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	public static WebDriver driver = null;
	public static Properties prop = null;
	private static String OS = System.getProperty("os.name").toLowerCase();
	
	public WebDriver initializeDriver() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/data.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		
		if(isWindows()) {
			
			if(browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
				driver = new ChromeDriver();
				
			} else if(browserName.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "E://geckodriver.exe");
				driver = new FirefoxDriver();
			} else {
				System.setProperty("webdriver.ie.driver", "E://IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			
		} else if(isMac()) {
			System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
			driver = new ChromeDriver();
		} else {
			System.out.println("This Program is not suitable for your operating System...");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public static boolean isWindows() {

		return (OS.indexOf("win") >= 0);

	}

	public static boolean isMac() {

		return (OS.indexOf("mac") >= 0);

	}
	
	public void getScreenshot(String result) throws IOException {
		System.out.println("Taking Screenshot..................");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("c://test//"+result+"screenshot.png"));
	}
}