package instagram;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class login{
public static void main(String[] args) {
// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ifinder\\chromedriver.exe");
// Instantiate a ChromeDriver class.
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize(); //Maximizes the browser window
driver.get("https://www.instagram.com/accounts/login/?hl=en");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("doc_chennai_");
driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("docchennai46");
driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();

}}