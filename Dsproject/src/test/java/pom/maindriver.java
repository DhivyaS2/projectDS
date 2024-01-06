package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.safari.SafariDriver;


public class maindriver {
	public static WebDriver cdriver=new ChromeDriver();
	 WebDriver driver;
public maindriver() {
	driver= cdriver ; 
}
public WebDriver driver() {
	driver.get("https://dsportalapp.herokuapp.com/"); 
	return driver;
}
	
}
