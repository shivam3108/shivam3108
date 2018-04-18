
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class LoginIT {
	public static String a;
	public static String b;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new InternetExplorerDriver();
		System.out.println("Login Test Passed");
		driver.get("https://sjavaapp.azurewebsites.net/InformationCentre/Login.jsp");
		System.out.println("Login Test Passed");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		System.out.println("Login Test Passed");
		Thread.sleep(2000);
		driver.findElement(By.id("click")).click();
		a=driver.getTitle();
		b=driver.findElement(By.id("name")).getText();
		System.out.println("Login Test Passed");
		if (b.equalsIgnoreCase("Hello admin ,")) {
			System.out.println("Login Test Passed");
		}
		else{
			System.out.println("Login Test  Failed");
		}
		if (a.equalsIgnoreCase("CICD:Home page")) {
			System.out.println("Home page Verified");
		}
		else{
			System.out.println("Login Test Failed");
		}
	}

}
