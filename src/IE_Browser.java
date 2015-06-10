
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_Browser {
	
	
	public static void main(String[] args) 
	{

		
	System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer.exe");	
	WebDriver driver = new InternetExplorerDriver();
	driver.get("http://localhost:8012/AssetCore/");
	driver.manage().window().maximize();
	System.out.println("Start of IE_Browser Testing");
	System.out.println(driver.getTitle());
  
    driver.get("http://localhost:8012/AssetCore/login");
	System.out.println(driver.getTitle());
	driver.findElement(By.id("username_or_email")).clear();
    driver.findElement(By.id("username_or_email")).sendKeys("u");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("p");
    driver.findElement(By.id("remember_me")).click();
    driver.findElement(By.id("login")).click();
    driver.findElement(By.linkText("Manage")).click();
    driver.findElement(By.linkText("View")).click();
    driver.findElement(By.linkText("Reports")).click();
    driver.findElement(By.linkText("?")).click();
    driver.findElement(By.linkText("M")).click();
    driver.findElement(By.xpath("(//a[contains(@href, '#')])[6]")).click();
    driver.findElement(By.xpath("(//a[contains(@href, '#')])[7]")).click();
    driver.findElement(By.linkText("<")).click();
    driver.findElement(By.linkText("<")).click();
    driver.findElement(By.linkText(">")).click();
    driver.findElement(By.linkText("^")).click();
    driver.findElement(By.linkText("+")).click();
    driver.findElement(By.cssSelector("a.logo")).click();
    
    driver.close();
    System.out.println("Connection closed");
    System.out.println("End of IE_Browser Testing");
	}

}
