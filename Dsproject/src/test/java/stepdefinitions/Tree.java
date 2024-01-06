package stepdefinitions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.opencsv.exceptions.CsvException;

import io.cucumber.java.en.*;
import pom.Dslogin;
import pom.Dsstartpom;
import pom.maindriver;
import pom.treepom;

public class Tree {
	public WebDriver driver;
	public Dslogin ds;
	public Dsstartpom st;
	public treepom tr;
	public maindriver dd;
public static WebDriver next;
@Given("logged in DS Home page")
public void logged_in_ds_home_page() throws IOException {
	dd= new maindriver();
	driver=dd.driver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	st=new Dsstartpom(driver);
	st.start();
   ds=new Dslogin(driver);
   ds.login();
   ds.signin();
	
    
}

@When("Clicks Get started to enter into the tree page")
public void clicks_get_started_to_enter_into_the_tree_page() {
   
	tr=new treepom(driver);  
	
	next=tr.treestart();
}

@Then("Shows information about tree")
public void shows_information_about_tree() {
   
    
}

@Given("Shows options to read more about Tree")
public void shows_options_to_read_more_about_tree() {
   
    
}

@When("Clicks tree {string}")
public void clicks_tree(String option) {
	tr=new treepom(next); 
   tr.treetopics(option);
    
}

@Then("Shows Explanation of tree")
public void shows_explanation_of_tree() {
   
    
}

@When("Clicks tree Try here to run the program")
public void clicks_tree_try_here_to_run_the_program() throws IOException, CsvException {
   tr.tryhere();
    
}

@Then("It shows tree text area to type the phython code")
public void it_shows_tree_text_area_to_type_the_phython_code() {
   
    
}

@When("clicks tree Run")
public void clicks_tree_run() {
   tr.run();
    
}

@Then("It runs the progam and Shows output in tree page")
public void it_runs_the_progam_and_shows_output_in_tree_page() {
   tr.output();
    
}

@When("Clicks signout from tree page")
public void clicks_signout_from_tree_page() {
	tr=new treepom(next); 
	tr.signout();
    
}

@Then("logged out from tree Data structure")
public void logged_out_from_tree_data_structure() {
   
    
}


}
