package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class loginStepTest {
	
	WebDriver driver;
  
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application1() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse work space\\Testing\\exefiles\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://ec2-18-220-244-125.us-east-2.compute.amazonaws.com:9292/login");
	}

	
	@Then("^I click on Login buttton$")
	public void i_click_on_Login_buttton() throws Throwable {
		driver.findElement(org.openqa.selenium.By.xpath("/html/body/div[1]/div/div/div/div/div[2]/a[2]")).click();
	   
	}

	@Then("^i enter emali And password$")
	public void i_enter_emali_And_password() throws Throwable {
		driver.findElement(org.openqa.selenium.By.id("email")).sendKeys("revanthrocz139@gmail.com");
	    driver.findElement(org.openqa.selenium.By.id("pwd")).sendKeys("revanthni");
	   
	}

	@Then("^i click on login button$")
	public void i_click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"myModallogin\"]/div/div/div/form/fieldset/div/div[1]/div/div[3]/p/input")).click();
	   
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		
	   
	}

	@Then("^application sholud be closed$")
	public void application_sholud_be_closed() throws Throwable {
	   
	}

	
	
	
	
	
	
	
	
}
