package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class loginSteps {
	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
		String projectpath = System.getProperty("user.dir");
		System.out.println("Project path"+projectpath);
		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}
	@When("User is on Volunteer Sign up page")
	public void user_is_on_Volunteer_Sign_up_page() throws InterruptedException {
	   driver.navigate().to("http://testautomationpractice.blogspot.com/");
	   Thread.sleep(20000);
	   //validate if user is on testautomationpractice page
	   driver.getPageSource().contains("Volunteer Sign Up");
	}

	@And("User enters text fields")
	public void user_enters_text_fields() throws InterruptedException {
		Thread.sleep(10000);
		//Switching to the frame where all webelements are present
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		//Enter the text fields from the page 
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("Gupta");
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("Badam");
	    driver.findElement(By.id("RESULT_TextField-3")).sendKeys("7875870088");
	    driver.findElement(By.id("RESULT_TextField-4")).sendKeys("India");
	    driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Hyderabad");
	    driver.findElement(By.id("RESULT_TextField-6")).sendKeys("gupta@gmail.com");
	}

	@And("User selects radio button & checkbox")
	public void user_selects_radio_button_checkbox() throws InterruptedException {
		Thread.sleep(5000);
		//select the Radio button
	    driver.findElement(By.xpath("//*[@id=\"RESULT_RadioButton-7_1\"]/following::label[1]")).click();
	    Thread.sleep(5000);
	    //select the checkbox
	    driver.findElement(By.xpath("//*[@id=\"RESULT_CheckBox-8_1\"]/following::label[1]")).click();
	}

	@And("User selects option from drop down")
	public void user_selects_option_from_drop_down() throws InterruptedException {
		Thread.sleep(5000);
		//Select value from the dropdown list
	    Select select = new Select(driver.findElement(By.name("RESULT_RadioButton-9")));
	    select.selectByVisibleText("Morning");
	}

	@And("User uploads file")
	public void user_uploads_file() throws InterruptedException {
		
		Thread.sleep(5000);
	    WebElement upload = driver.findElement(By.name("RESULT_FileUpload-10"));
	    Thread.sleep(5000);
	    //upload.sendKeys("Desktop/Test.txt");
	    //driver.findElement(By.name("send")).click();
	    
	}

	@Then("User clicks on submit button")
	public void user_clicks_on_submit_button() throws InterruptedException {
		Thread.sleep(5000);
		//Click on Submit button to submit the form
	    driver.findElement(By.xpath("//*[@id=\"FSsubmit\"]")).click();
	    Thread.sleep(5000);
	    driver.close();
		driver.quit();
	    
	}

}
