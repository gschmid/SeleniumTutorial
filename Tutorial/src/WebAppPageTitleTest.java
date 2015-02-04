import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WebAppPageTitleTest {
	WebDriver driver;
	
	@Before
	public void testSetup(){
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.thetestroom.com/webapp/");
	}

	@After
	public void testShutDown(){
		driver.quit();
	}

	@Test
	public void shouldHavePageTitleOfAboutZoo(){
		driver.findElement(By.id("about_link")).click();
		Assert.assertTrue(driver.getTitle().equals("About Zoo"));
	}

	@Test
	public void shouldHavePageTitleOfContact(){
		driver.findElement(By.id("contact_link")).click();
		Assert.assertTrue(driver.getTitle().equals("Contact"));
	}
}
		
		
