package newSelenium.newSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class selTest {
	@Test
	public void test()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	System.setProperty("webdriver.http.factory", "jdk-http-client");
	//driver =new ChromeDriver();
	 ChromeOptions ops = new ChromeOptions();
	 ops.addArguments("--remote-allow-origins=*");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.javatpoint.com/java-string");

}
}
