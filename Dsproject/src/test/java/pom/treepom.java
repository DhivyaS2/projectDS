package pom;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class treepom {
	public WebDriver driver;
	By dslist=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/a");
	By stree=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[5]");
	 By tryhere=By.xpath("//*[text()='Try here>>>']");
	 By textarea=By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea");
	 By run=By.xpath("//*[text()='Run']");
	 By output=By.xpath("//*[@id=\"output\"]");
	 By overview=By.linkText("Overview of Trees");
	 By terminologies =By.linkText("Terminologies");
	 By typesoftrees= By.linkText("Types of Trees");
	 By treetraversals =By.linkText("Tree Traversals");
	 By traversalsillustration= By.linkText("Traversals-Illustration");
	 By binarytrees =By.linkText("Binary Trees");
	 By typesofbinarytrees= By.linkText("Types of Binary Trees");
	 By implementationinpython =By.linkText("Implementation in Python");
	 By binarytreetraversals= By.linkText("Binary Tree Traversals");
	 By implementationofbinarytrees =By.linkText("Implementation of Binary Trees");
     By applicationsofbinarytrees= By.linkText("Applications of Binary trees");
	 By binarysearchtrees =By.linkText("Binary Search Trees");
	 By implementationOfBST= By.linkText("Implementation Of BST");
	 By signout =By.xpath("//*[text()='Sign out']");
	 public treepom(WebDriver driver) {
			this.driver=driver;
			
		}
	 
	 public WebDriver treestart() {
		 driver.findElement(dslist).click();	
			driver.findElement(stree).click();
			return driver;
			}
			
			public void treetopics(String option) {
				driver.get("https://dsportalapp.herokuapp.com/tree/");
				String o="Overview of Trees";
				if(o.equals(option)) {
					
				driver.findElement(overview).click();
				}
				String o1="Terminologies";
				if(o1.equals(option))  {
					
					driver.findElement(terminologies).click();
				}
				String o2="Types of Trees";
				if(o2.equals(option)) {
				driver.findElement(typesoftrees).click();
				}
				o="Tree Traversals";
		if(o.equals(option)) {
				driver.findElement(treetraversals).click();
		}
		o="Traversals-Illustration";
		if(o.equals(option)) {
				driver.findElement(traversalsillustration).click();
		}
		o="Binary Trees";
		if(o.equals(option)) {
				driver.findElement(binarytrees).click();
		}
		o="Types of Binary Trees";
		if(o.equals(option)) {
				driver.findElement(typesofbinarytrees).click();
		}
		o="Implementation in Python";
		if(o.equals(option)) {
				driver.findElement(implementationinpython).click();
		}
		o="Binary Tree Traversals";
		if(o.equals(option)) {
				driver.findElement(binarytreetraversals).click();
		}
		o="Implementation of Binary Trees";
		if(o.equals(option)) {
				driver.findElement(implementationofbinarytrees).click();
		}
		o="Applications of Binary trees";
		if(o.equals(option)) {
				driver.findElement(applicationsofbinarytrees).click();
		}
		o="Binary Search Trees";
		if(o.equals(option)) {
				driver.findElement(binarysearchtrees).click();
		}
		o="Implementation Of BST";
		if(o.equals(option)) {
				driver.findElement(implementationOfBST).click();
		}
			}
			public void tryhere() throws IOException, CsvException{
			driver.findElement(tryhere).click();
			try {
			CSVReader reader = new CSVReader(new FileReader(".//src/test/resources/phython/squareroot.csv"));
			List<String[]> li=reader.readAll();
			 Iterator<String[]>i1= li.iterator();
			    
			 // Iterate all values 
			 while(i1.hasNext()){
			 String[] str=i1.next();
			   
			 System.out.print(" Values are ");

			 for(int i=0;i<str.length;i++)
			{
				 //System.out.print(" "+str[i]);
				 driver.findElement(textarea).sendKeys(str[i]+"\n");

			}
			 } 
			
			}
			catch(NullPointerException e) {
				e.getMessage();
			}
			
			}
			public void run() {
			driver.findElement(run).click();
			
			}
			public void output() {
				System.out.println("*****"+driver.findElement(output).getText());
			}
			
		
		public void signout() {
			driver.get("https://dsportalapp.herokuapp.com/tree/");
			driver.findElement(signout).click();
		}
}
