package stepdefinitions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pom.Dslogin;
import pom.Dsstartpom;
import pom.Queuepom;
import pom.maindriver;

public class Queue {
	public static WebDriver queue;
	public Dslogin ds;
	public Dsstartpom st;
	public Queuepom qp;
	public maindriver dd;
@Given("logged in Ds home screen")
public void logged_in_ds_home_screen() throws IOException {
	dd= new maindriver();
	queue=dd.driver();
	queue.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	queue.manage().window().maximize();
	st=new Dsstartpom(queue);
	st.start();
   ds=new Dslogin(queue);
   ds.login();
   ds.signin();
    
}

@When("Clicks to Queue Get started to explore")
public void clicks_to_queue_get_started_to_explore() {
   
	 qp=new Queuepom (queue);
	   queue=qp.queuestart();
}

@Then("Shows Queue explanation")
public void shows_queue_explanation() {
   
    
}

@Given("Shows option to explore more about Queue")
public void shows_option_to_explore_more_about_queue() {
   
    
}

@When("Clicks Queue {string}")
public void clicks_queue(String string) {
	qp=new Queuepom (queue);
	qp.subtopics(string);
    
}

@Then("Navigates to queue sub topics page")
public void navigates_to_queue_sub_topics_page() {
   
    
}

@When("Clicks Queue Try here in bottom of page")
public void clicks_queue_try_here_in_bottom_of_page() {
   qp.queuetryhere();
    
}

@Then("Shows  Queue Textarea to run Python code")
public void shows_queue_textarea_to_run_python_code() {
   
   
}

@When("Clicks Queue run to execute the program")
public void clicks_queue_run_to_execute_the_program() throws IOException {
   
    qp.queuerun();
}

@Then("Shows Queue output of program")
public void shows_queue_output_of_program() {
   qp.queueoutput();
    
}

@When("Clicks signout from Queue page")
public void clicks_signout_from_queue_page() {
	qp=new Queuepom(queue);
    qp.signout();
}

@Then("logged out from Queue Data Structure")
public void logged_out_from_queue_data_structure() {
   
    
}



}
