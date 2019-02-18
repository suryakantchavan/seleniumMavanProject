package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RolbSteps {

	WebDriver driver;

	@Given("^userlaucnhes application in chrome browser$")
	public void userlaucnhes_application_in_chrome_browser() throws Throwable {

		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"/Users/suryakant/eclipse-workspace/Selenium-Cucmber/chromedriver");
		driver.get("http://www.google.com");
		

	}

	@When("^he verifies title of the page is \"([^\"]*)\"$")
	public void he_verifies_title_of_the_page_is(String title) throws Throwable {

		String actualTile = driver.getTitle();
		System.out.println(actualTile);
try
{
		Assert.assertTrue("is not present",actualTile.equals(title));
}
		
finally {
		driver.close();
}

	}

	
}
