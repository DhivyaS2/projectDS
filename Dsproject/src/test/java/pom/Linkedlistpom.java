package pom;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Linkedlistpom {
	WebDriver driver;
	By dslist=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/a");
	By linkedlist=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[2]");
	By opt1=By.linkText("Introduction");
	By opt2=By.linkText("Creating Linked LIst");
	By opt3=By.linkText("Types of Linked List");
	By opt4=By.linkText("Implement Linked List in Python");
	By opt5=By.linkText("Traversal");
	By opt6=By.linkText("Insertion");
	By opt7=By.linkText("Deletion");
	By opt=By.xpath("//*[text()='Practice Questions']");
	By stacktryhere= By.xpath("//*[text()='Try here>>>']");
	By stacktext= By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea");
	By stackrun=By.xpath("//*[text()='Run']");
	By stackoutput=By.xpath("//*[@id=\"output\"]");
	By signout =By.xpath("//*[text()='Sign out']");
	public Linkedlistpom(WebDriver driver) {
		this.driver=driver;
		
	}
	public WebDriver linkedstart() {
		driver.findElement(dslist).click();	
	driver.findElement(linkedlist).click();
	return driver;
	}
	public void subtopics(String option) {
		String o="Introduction";
		if(o.equals(option)) {
			
		driver.findElement(opt1).click();
		}
		String o1="Creating Linked LIst";
		if(o1.equals(option))  {
			
			driver.findElement(opt2).click();
		}
		String o2="Types of Linked List";
		if(o2.equals(option)) {
		driver.findElement(opt3).click();
		}
		o="Implement Linked List in Python";
      if(o.equals(option)) {
	   
		driver.findElement(opt4).click();
        }
      o="Traversal";
      if(o.equals(option)) {
	   
		driver.findElement(opt4).click();
        }
      o="Insertion";
      if(o.equals(option)) {
	   
		driver.findElement(opt5).click();
        }
      o="Deletion";
      if(o.equals(option)) {
	   
		driver.findElement(opt6).click();
        }
	}
	
	public void linkedtryhere() {
		driver.findElement(stacktryhere).click();
	}
	public void linkedrun() throws IOException {
		FileInputStream exc= new FileInputStream(".//src/test/resources/Excel/square.xlsx");
		XSSFWorkbook work= new XSSFWorkbook(exc);
		XSSFSheet sheet =work.getSheetAt(0);
		int row= sheet.getLastRowNum();
	
		for(int r=0;r<=row;r++) 
		{
			
		XSSFRow rr=sheet.getRow(r);
		

		XSSFCell usr=rr.getCell(0);
		
	

		driver.findElement(stacktext).sendKeys(usr.getStringCellValue());
		driver.findElement(stacktext).sendKeys("\n");
		
		 }
		
		driver.findElement(stackrun).click();
		work.close();
		}
		
	
	public void linkedoutput() {
		
		System.out.println("***** "+driver.findElement(stackoutput).getText());
		driver.get("https://dsportalapp.herokuapp.com/linked-list/");
	}
	public void signout() {
		
		driver.findElement(signout).click();
	}
}
