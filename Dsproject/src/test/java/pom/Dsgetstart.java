package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dsgetstart {
	 public WebDriver driver;
	
	 By getstart =By.xpath("//*[text()='Get Started']");
	 By starterror=By.className("alert-primary");
	 By datastructure=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]//a");
	 By datastructurelist=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div");

	 public Dsgetstart(WebDriver idriver) {
	  this.driver =idriver;  
}

public void getstart() 
{
	
	 driver.findElement(getstart).click();
}
public void starterror() {
	
	 System.out.println("*****"+driver.findElement(starterror).getText());
}
public void dslist() {
	driver.findElement(datastructure).click();
}
public void dsoptionlist() {
	driver.findElement(datastructurelist).click();
}

}
