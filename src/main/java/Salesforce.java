import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

  public static void main(String[] args) {


    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\IntelliJ IDEA Community Edition 2019.1\\selenium\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.get("https://login.salesforce.com/");
    driver.findElement(By.id("username")).sendKeys("hello");
    driver.findElement(By.name("pw")).sendKeys("world");

  }


}
