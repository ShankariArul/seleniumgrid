package Selenium.SeleniumGrid;

import java.net.MalformedURLException;
import java.time.Duration;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.http.ClientConfig;

public class SeleniumGridLogin {
	
	public static void main(String[] args) throws MalformedURLException {
		
	DesiredCapabilities CAP = new DesiredCapabilities();
	
	CAP.setBrowserName("chrome");
	
	CAP.setPlatform(Platform.MAC);
		
	ClientConfig config = ClientConfig.defaultConfig().connectionTimeout(Duration.ofMinutes(20)).readTimeout(Duration.ofMinutes(20));
		
	System.setProperty("webdriver.chrome.driver", "/Users/shankari/Downloads/chromedriver-mac-arm64/chromedriver");
	
	WebDriver driver = RemoteWebDriver.builder().oneOf(CAP).address("http://192.168.0.16:4444").config(config).build();
	
	driver.get("https://www.rediff.com");
	
	driver.manage().window().maximize();
	
	System.out.println("Rediffmail.com website is launched");
	
	driver.close();
	
	
}
}