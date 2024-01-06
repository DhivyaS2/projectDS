package pom;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Dsintropom {
	 public WebDriver driver;
	 By dsStart =By.xpath("//*[text()='Get Started']");
	 By dstime =By.xpath("//*[text()='Time Complexity']");
	 By dstryhere= By.className("btn-info");
	 By dstext= By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea");
	 By dsrun =By.xpath("//*[text()='Run']");
	 By dsoutput=By.xpath("//*[@id=\"output\"]");
	 By signout =By.xpath("//*[text()='Sign out']");
public Dsintropom(WebDriver driver) {
	this.driver=driver;
}
public void dsgetstart() {
	driver.findElement(dsStart).click();
}
public void dstime() {
    driver.findElement(dstime).click();
   }
public void dstryhere() throws IOException {
    driver.findElement(dstryhere).click();
   
    File fr= new File(".//src/test/resources/phython/add.txt");
    Scanner sc= new Scanner(fr);

    
  sc.useDelimiter("\\a");
  driver.findElement(dstext).sendKeys(sc.next());
sc.close();
}
public void dsrun() {
    driver.findElement(dsrun).click();
    
}
public void dsoutput() {
	System.out.println("Output:::"+driver.findElement(dsoutput).getText());
}
public void signout() {
	driver.get("https://dsportalapp.herokuapp.com/home");
	driver.findElement(signout).click();
}
}
