package stepdefinitions;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pom.Dslogin;
import pom.Dsstartpom;
import pom.Stackpom;
import pom.maindriver;

public class Stack {
	// WebDriver driver;
	public static WebDriver stack;
	public Dslogin ds;
	public Dsstartpom st;
	public Stackpom sp;
	public maindriver dd;
@Given("logged in home screen")
public void logged_in_home_screen() throws IOException {
	dd= new maindriver();
	stack=dd.driver();
	stack.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	stack.manage().window().maximize();
	st=new Dsstartpom(stack);
	st.start();
   ds=new Dslogin(stack);
   ds.login();
   ds.signin();
  
}

@When("Clicks to Stack Get started to explore")
public void clicks_to_stack_get_started_to_explore() {
	 sp=new Stackpom (stack);
	   stack=sp.stackstart();
}

@Then("Shows explanation")
public void shows_explanation() {
   
   
}

@Given("Shows option to explore more about Stack")
public void shows_option_to_explore_more_about_stack() {
   
   
}

@When("Clicks Stack {string}")
public void clicks_stack(String topics) {
	 sp=new Stackpom (stack);
   sp.subtopics(topics);
}

@Then("Navigates to topic page")
public void navigates_to_topic_page() {
   
   
}

@When("Clicks Stack Try here in bottom of page")
public void clicks_stack_try_here_in_bottom_of_page() {
   sp.stacktryhere();
   
}

@Then("Shows  Stack Textarea to run Python code")
public void shows_stack_textarea_to_run_python_code() {
   
   
}

@When("Clicks run to execute the program")
public void clicks_run_to_execute_the_program() throws IOException {
   
   sp.stackrun();
}

@Then("Shows output of program")
public void shows_output_of_program() {
   sp.stackoutput();
   
}


@When("Clicks signout from Stack page")
public void clicks_signout_from_stack_page() {
    
}

@Then("logged out from Stack Data Structure")
public void logged_out_from_stack_data_structure() {
	 sp=new Stackpom (stack);
	 sp.signout();
}


}
