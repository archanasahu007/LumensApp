package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;

public class LumenStepstoTest {
	
	WebDriver driver;
	WebDriverWait wait;

	
	@Given("^Navigate to Application URL$")
	public void navigate_to_Application_URL() throws Throwable {
		
		ConfigFileReader ConfigFileReader= new ConfigFileReader();
		System.setProperty("webdriver.chrome.driver", ConfigFileReader.getDriverPath());
		driver = new ChromeDriver(); 
		
		driver.get(ConfigFileReader.getApplicationUrl());
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ltkpopup-close-button']")));
		driver.findElement(By.xpath("//*[@id='ltkpopup-close-button']")).click();
		
	}
	
	@When("^Verify the title of Home Page$")
	public void verify_the_title_of_Home_Page() throws Throwable {
	    
		String ExpectedTitle = "Modern Lighting, Ceiling Fans, Furniture & Home Decor | Lumens.com";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
	}

//	@Then("^User click on Account and and Create Account$")
//	public void user_click_on_Account_and_and_Create_Account() throws Throwable {
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='btn-group dropdown-group']")));
//		
//		Actions actions = new Actions(driver);
//		
//		
//		WebElement Account = driver.findElement(By.xpath("//div[@class='btn-group dropdown-group']"));
//		actions.moveToElement(Account).click().build().perform();
//		
//		WebElement AccountCreation = driver.findElement(By.xpath("//a[@id='my_account_hdr_link']"));
//		actions.moveToElement(AccountCreation).click().build().perform();
//		
//	    driver.findElement(By.xpath ("//input[@id='dwfrm_profile_customer_firstname']")).sendKeys("Archana");
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_lastname']")).sendKeys("Sahu");
//	    driver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_email']")).sendKeys("preetish.k4u@gmail.com");
//
//	    driver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_emailconfirm']")).sendKeys("preetish.k4u@gmail.com");
//	    Thread.sleep(2000);
//	       driver.findElement(By.xpath("//input[@id='dwfrm_profile_login_password']")).sendKeys("Test321");
//	      driver.findElement(By.xpath("//input[@id='dwfrm_profile_login_passwordconfirm']")).sendKeys("Test321");
//	               Thread.sleep(2000);
//	    driver.findElement(By.xpath("//span[contains(text(),'Create Account')]")).click(); 
//	    
//	 
//	}

//	@And("^Account is successfully created$")
//	public void account_is_successfully_created() throws Throwable {
//		
//		 System.out.println("User is in Home page");
//		 
//	}
	
	@Then("^User Sign in the application with User id and Password$")
	public void user_Sign_in_the_application_with_User_id_and_Password() throws Throwable {
		
        Actions actions = new Actions(driver);
		
		WebElement Account = driver.findElement(By.xpath("//div[@class='btn-group dropdown-group']"));
		actions.moveToElement(Account).click().build().perform();
		
		WebElement signin = driver.findElement(By.xpath("//div[@class='customerInfo dropdown-item']//a[@class='userlogin'][normalize-space()='Sign In']"));
		actions.moveToElement(signin).click().build().perform();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='dwfrm_login_username']")));
		driver.findElement(By.xpath("//input[@id='dwfrm_login_username']")).sendKeys("sahu.archana06@gmail.com");
		  Thread.sleep(2000);
		    
	    driver.findElement(By.xpath("//*[@id='dwfrm_login_password']")).sendKeys("Test123"); 
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[@class='global pop-up']")).click();
	    
	    Thread.sleep(2000);
	    
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='btn-group dropdown-group']")));
//	    actions.moveToElement(Account).click().build().perform();
		
	}

	@Then("^User Search item$")
	public void user_Search_item() throws Throwable {
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='searchinput']")).sendKeys("ceiling fans");
		driver.findElement(By.xpath("//*[@id='searchinput']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
	}
	@Then("^Click on Add to cart$")
	public void click_on_Add_to_cart() throws Throwable {

		wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@title='Torsion Ceiling Fan']")));
		driver.findElement(By.xpath("//img[@title='Torsion Ceiling Fan']")).click();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)"); 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id = 'add-to-cart']")).click();
		Thread.sleep(2000);
	}

	@Then("^Navigate to the Cart and validate the item$")
	public void navigate_to_the_Cart_and_validate_the_item() throws Throwable {
		
		wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='minicart_checkout_continue minicart_popup_normal d-inline-block float-right mb-3 mt-0']/a[1]")));
		driver.findElement(By.xpath("//div[@class='minicart_checkout_continue minicart_popup_normal d-inline-block float-right mb-3 mt-0']/a[1]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='divquantity']/span[2]")).click();
        
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)");

		Thread.sleep(3000);

		WebElement text=driver.findElement(By.xpath("//div[@class='couponcode']/input"));
		text.sendKeys("Archana");
		text.getText();
		driver.findElement(By.xpath("//div[@class='couponcode']/button")).click();
		Thread.sleep(3000);
		
		WebElement mycart =driver.findElement(By.xpath("//*[@id='mcBookMark']/span[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(mycart).build().perform();

	    
	}




}
