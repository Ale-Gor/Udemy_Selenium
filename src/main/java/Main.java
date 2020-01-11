import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

  public static void main(String[] args) {


    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\IntelliJ IDEA Community Edition 2019.1\\selenium\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.get("http://facebook.com");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys(System.getenv("M_login"));// input credential from system user env
    driver.findElement(By.id("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys(System.getenv("F_pass")); // input credential from system env
    driver.findElement(By.partialLinkText("Forgot")).click();

  }


}
