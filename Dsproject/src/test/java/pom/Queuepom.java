package pom;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Queuepom {
	WebDriver driver;
	WebDriverWait wait;
	By dslist=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/a");
	By queue=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[4]");
	By opt1=By.linkText("Implementation of Queue in Python");
	By opt2=By.linkText("Implementation using collections.deque");
	By opt3=By.linkText("Implementation using array");
	By opt4=By.linkText("Queue Operations");
	By tryhere= By.xpath("//*[text()='Try here>>>']");
	By text= By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea");
	By run=By.xpath("//*[text()='Run']");
	By output=By.xpath("//*[@id=\"output\"]");
	By signout =By.xpath("//*[text()='Sign out']");
	
	public Queuepom(WebDriver driver) {
		this.driver=driver;
		
	}
	public WebDriver queuestart() {
		
	driver.findElement(dslist).click();	
	driver.findElement(queue).click();
	return driver;
	}
	public void subtopics(String option) {
		String o="Implementation of Queue in Python";
		if(o.equals(option)) {
			
		driver.findElement(opt1).click();
		}
		String o1="Implementation using collections.deque";
		if(o1.equals(option))  {
			
			driver.findElement(opt2).click();
		}
		String o2="Implementation using array";
		if(o2.equals(option)) {
		driver.findElement(opt3).click();
		}
		o="Queue Operations";
       if(o.equals(option)) {
	    
		driver.findElement(opt4).click();
         }
	}
	
	public void queuetryhere() {
		driver.findElement(tryhere).click();
	}
	public void queuerun() throws IOException {
		FileInputStream exc= new FileInputStream(".//src/test/resources/Excel/square.xlsx");
		XSSFWorkbook work= new XSSFWorkbook(exc);
		XSSFSheet sheet =work.getSheetAt(0);
		int row= sheet.getLastRowNum();
	
		for(int r=0;r<=row;r++) 
		{
			
		XSSFRow rr=sheet.getRow(r);
		

		XSSFCell usr=rr.getCell(0);
		
	

		driver.findElement(text).sendKeys(usr.getStringCellValue());
		driver.findElement(text).sendKeys("\n");
		
		 }
		
		driver.findElement(run).click();
		work.close();
		}
		
	
	public void queueoutput() {
		
		System.out.println("***** "+driver.findElement(output).getText());
		driver.get("https://dsportalapp.herokuapp.com/queue/");
	}
	public void signout() {
		
		driver.findElement(signout).click();
	}
}
