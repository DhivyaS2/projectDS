package stepdefinitions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import com.opencsv.exceptions.CsvException;

import io.cucumber.java.en.*;
import pom.Dsstartpom;
import pom.maindriver;
import pom.Dslogin;
import pom.Arraypom;

public class Array {
	public WebDriver driver;
	public Dslogin ds;
	public Dsstartpom st;
	public Arraypom di;
	public maindriver dd;
public static WebDriver next;
@Given("logged in Home page")
public void logged_in_home_page()  {
	
}

@When("Clicks Get started to enter into the page")
public void clicks_get_started_to_enter_into_the_page() throws IOException{
	dd= new maindriver();
	driver=dd.driver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	st=new Dsstartpom(driver);
	st.start();
   ds=new Dslogin(driver);
   ds.login();
   ds.signin();
	
}
@Then("Shows information about arrays")
public void shows_information_about_arrays() {
   
	di=new Arraypom(driver);  
	//System.out.println(driver.getTitle());
	next=di.arraystart();
	//System.out.println(driver.getTitle());
}

@Given("Shows options to read more about Arrays")
public void shows_options_to_read_more_about_arrays() {
	
  
}
@When("Clicks {string}")
public void clicks(String option) {
	di=new Arraypom(next); 
	next.get("https://dsportalapp.herokuapp.com/array/");

   di.arrayphython(option);
}

@Then("Shows Explanation")
public void shows_explanation() {
   
   
}

@When("Clicks Try here to run the program")
public void clicks_try_here_to_run_the_program()throws IOException, CsvException{
	di.tryhere(); 
	
}
@Then("It shows text area to type the phython code")
public void it_shows_text_area_to_type_the_phython_code()  {
  
   
}

@When("clicks Run")
public void clicks_run() {
   di.run();
   
}

@Then("It runs the progam and Shows output")
public void it_runs_the_progam_and_shows_output() {
   di.output();
  
  next.get("https://dsportalapp.herokuapp.com/array/");
   
}



@Given("Clicks Practise Questions")
public void clicks_practise_questions() {
	next.get("https://dsportalapp.herokuapp.com/array/arrays-in-python/");
	di=new Arraypom(next); 
	di.pq();
   
}


@When("Clicks Question {string}")
public void clicks_question(String ques) {
   
   di.question(ques);
}

@Then("Shows Questions and text area to run the code")
public void shows_questions_and_text_area_to_run_the_code() {
   di.quesrun();
   
}

@When("Enters code And Runs or Submit")
public void enters_code_and_runs_or_submit() {
   di.quesalert();
   
}

@Then("Shows Output or Alert message or error message")
public void shows_output_or_alert_message_or_error_message() {
   
   di.quessubmit();
}

@When("Clicks signout from array page")
public void clicks_signout_from_array_page() {
   
}

@Then("logged out from array Data structure")
public void logged_out_from_array_data_structure() {
	di=new Arraypom(next); 
	di.signout();
}





}
