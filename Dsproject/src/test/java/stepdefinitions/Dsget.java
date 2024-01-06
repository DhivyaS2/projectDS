package stepdefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pom.Dsgetstart;
import pom.Dsstartpom;
import pom.maindriver;

public class Dsget {
	public WebDriver driver;
	 public Dsstartpom st; 
    public Dsgetstart sg; 
	public maindriver dd;

@Given("Trys to get start by clicking Get started")
public void trys_to_get_start_by_clicking_get_started()  {
	dd= new maindriver();
	driver=dd.driver();
	 st=new Dsstartpom (driver);
	 st.start();
	sg=new Dsgetstart(driver);	
	sg.getstart();
   
}

@Then("Alerts You are not logged in")
public void alerts_you_are_not_logged_in() {
   
   sg.starterror();
}

@When("Clicks Data Structure drop down")
public void clicks_data_structure_drop_down() {
	sg.dslist();
   
}

@Then("Shows six lists of data structure")
public void shows_six_lists_of_data_structure() {
   
   
}

@When("Clicks List in Data structure")
public void clicks_list_in_data_structure() {
   sg.dsoptionlist();
   
}

@When("Clicks Sign in To login")
public void clicks_sign_in_to_login() {
   
   
}

@Then("Navigates to login page")
public void navigates_to_login_page() {
   
   
}
}
