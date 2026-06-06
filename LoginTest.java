import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("file:///C:/Users/smm/Desktop/smartproject/login.html");

        driver.findElement(By.id("username")).sendKeys("admin");

        driver.findElement(By.id("password")).sendKeys("1234");

        driver.findElement(By.tagName("button")).click();

        Thread.sleep(2000);

        String alertText = driver.switchTo().alert().getText();

        System.out.println(alertText);

        driver.switchTo().alert().accept();

        driver.quit();
    }
}