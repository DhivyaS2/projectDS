package stepdefinitions;


import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pom.Dsstartpom;
import pom.maindriver;

public class Dsstart {
	 public WebDriver driver;
     public Dsstartpom st; 
	public maindriver dd;
	
	
@Given("The user opens site link")
public void the_user_opens_site_link() {
	dd= new maindriver();
	driver=dd.driver();
	
	st=new Dsstartpom(driver);	
	
	 
}

@Then("Site will load")
public void site_will_load() {
   
   
}

@When("Click get started to enter into the site")
public void click_get_started_to_enter_into_the_site() {
	
st.start();
	

}

@Then("Home page will get load")
public void home_page_will_get_load() {
   
   
}


}
