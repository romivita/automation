package clase1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import junit.framework.TestCase;

public class Clase1_practica extends TestCase {

	public void clase1_practica() {
		System.setProperty("webdriver.ie.driver	", "C:\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");

	}
}