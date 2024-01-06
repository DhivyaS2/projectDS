package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dsstartpom {
	public WebDriver driver;
	 By start = By.xpath("//*[text()='Get Started']");
	 

	 public Dsstartpom(WebDriver idriver) {
	  this.driver =idriver;  
}
public void start() {
	
	 driver.findElement(start).click();
	 System.out.println("******Am in HOME page******");
}
}
