package stepdefinitions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Dsintropom;
import pom.Dslogin;
import pom.Dsstartpom;
import pom.maindriver;

public class DsIntro {
	public Dslogin ds;
	public Dsstartpom st;
	public Dsintropom di;
	public maindriver dd;
public static WebDriver driver;
@Given("User in Home page with logged username")
public void user_in_home_page_with_logged_username()throws IOException {
	dd= new maindriver();
	driver=dd.driver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	st=new Dsstartpom(driver);
	st.start();
   ds=new Dslogin(driver);
   ds.login();
   ds.signin();
	
	di=new Dsintropom(driver);
    
}

@When("Clicks Get Started to read about DS Introduction")
public void clicks_get_started_to_read_about_ds_introduction() {
   di.dsgetstart();
}

@Then("Goes to DS Introduction page")
public void goes_to_ds_introduction_page() {
    
    
}

@When("Clicks Time complexity to explore")
public void clicks_time_complexity_to_explore() {
    di.dstime();
    
}

@Then("Navigates to Time complexity page")
public void navigates_to_time_complexity_page() {
    
    
}

@When("clicks Try here And Enters  phython program And clicks Run")
public void clicks_try_here_and_enters_phython_program_and_clicks_run() throws IOException {
  di.dstryhere();
  di.dsrun();
}

@Then("It runs progam And shows Output")
public void it_runs_progam_and_shows_output() {
    
   di.dsoutput(); 
	
}

@When("Clicks signout from site")
public void clicks_signout_from_site() {
	di=new Dsintropom(driver);
	di.signout();
}

@Then("logged out from Data structure page")
public void logged_out_from_data_structure_page() {
    
}

}
