import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class test1 {
	public static void main(String[] args){
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.thetestroom.com/webapp/");
		driver.findElement(By.id("contact_link")).click();
		String title = driver.getTitle();
		
		if(title.equals("About Zoo")){
			System.out.println("found about page value" + title);
		}else{
			System.out.println("Not found" + title);
		}
		
		driver.close();
		
	}

}


//http://www.thetestroom.com/webapp/