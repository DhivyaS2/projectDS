package stepdefinitions;


import java.io.IOException;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pom.Dslogin;
import pom.Dsstartpom;
import pom.maindriver;
public class Login {
public static WebDriver driver;
public Dslogin ds;
public Dsstartpom st;
public maindriver dd;
@Given("User registered already clicks Login")
public void user_registered_already_clicks_login() {
	dd= new maindriver();
	//driver.manage().window().maximize();
	driver=dd.driver();
	st=new Dsstartpom (driver);
	st.start();
   ds=new Dslogin(driver);
   ds.login();
}

@When("Enters Different combination of username and password from Excel {string} file")
public void enters_different_combination_of_username_and_password_from_excel_file(String sheetname) throws IOException {
    ds.user(sheetname);
    driver=ds.signin();
}

@Then("Shows respective messages And Navigates to home page when enters correct username and password")
public void shows_respective_messages_and_navigates_to_home_page_when_enters_correct_username_and_password() {
	
	System.out.println("*******Logged in Successfully*******"); 
   
}

@When("Clicks logout after logged in")
public void clicks_logout_after_logged_in() {
	 ds=new Dslogin(driver);
	 ds.logout();
    
}

@Then("logged out from the page")
public void logged_out_from_the_page() {
	System.out.println("*******Logged out Successfully*******"); 
    
}
}
