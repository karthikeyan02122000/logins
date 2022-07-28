package selinium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

public static void main(String[] args) {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",
"C:\\Users\\ifinder\\chromedriver.exe");
// Instantiate a ChromeDriver class.
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize(); //Maximizes the browser window

driver.get("https://www.facebook.com/");

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.linkText("Create New Account")).click();

driver.findElement(By.xpath("//input[@value='2']")).click();

}

}