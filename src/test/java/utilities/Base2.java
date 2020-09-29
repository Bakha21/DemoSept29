	package utilities;

	import java.io.FileInputStream;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;

	public class Base2 {
		protected WebDriver driver2;
		// String browser="ie";

		protected Properties prop2;

		@BeforeMethod
		public void setUpDriver() throws Exception {

			// driver = new ChromeDriver();

			prop2 = new Properties();
			FileInputStream fis = new FileInputStream("src\\main\\java\\properties\\main.properties");
			prop2.load(fis);

			String browser = prop2.getProperty("browser");
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
				driver2 = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
				driver2 = new FirefoxDriver();
			} else {
				System.setProperty("webdriver.ie.driver", "C:\\webdrivers\\ie.exe");
				driver2 = new InternetExplorerDriver();
			}

			driver2.manage().window().maximize();
			driver2.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		}

		@AfterMethod
		public void closeDriver() throws InterruptedException {
			driver2.close();
		}

	}

