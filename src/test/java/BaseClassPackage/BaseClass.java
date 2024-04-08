package BaseClassPackage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
public static Properties properties;
public static WebDriver  driver;

	@BeforeTest
	public Properties LoadConfig() throws FileNotFoundException {
		Properties properties = new Properties();
		FileInputStream fileInputStream = new FileInputStream("F:\\eclipse-workspace\\LeafTest\\Configuraton\\Config.properties");
		try {
			properties.load(fileInputStream);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;
	}
	public void LaunchBrowser() throws FileNotFoundException {
		LoadConfig();
		WebDriverManager.chromedriver().setup();
		System.out.println("driver"+driver);
		String browsername= properties.getProperty("browser");
		if(browsername.equalsIgnoreCase("Chrome")) {
			BaseClass.driver = new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("Firefox")) {
			BaseClass.driver = new ChromeDriver();
		}
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}
}

