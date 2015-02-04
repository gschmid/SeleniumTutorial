import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WebAppPageTitleTest2 {
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
	public void locatorsTest1(){
		driver.findElement(By.id("contact_link")).click();
		Assert.assertTrue(
				driver.findElement(By.className("subhead")).getText().equals("Contact Form"));
		driver.findElement(By.name("address_field"));
		driver.findElement(By.cssSelector("[id=adoption_link]")).click();
		driver.findElement(By.linkText("HOME")).click();
		driver.findElement(By.partialLinkText("ABO")).click();
		Assert.assertTrue(
				driver.findElement(By.tagName("p")).getText().contains("animal"));
		String please = driver.findElement(By.tagName("p")).getText();
		System.out.println("text ouput " + please);
		driver.findElement(By.xpath("//*[@id='contact_link']")).click();
	
	}

}
