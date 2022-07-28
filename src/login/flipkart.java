package login;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class flipkart {
public static void main(String[] args) {
// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ifinder\\chromedriver.exe");
// Instantiate a ChromeDriver class.
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize(); //Maximizes the browser window
driver.get("");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input")).sendKeys("6381835437");
driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[2]/input")).sendKeys("12345");
driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[4]/button")).click();

}
}