import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {
        // ChromeDriver yolunu doğru ayarladığından emin ol
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\batem\\OneDrive\\Masaüstü\\tools\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://the-internet.herokuapp.com/login");

            WebElement hataMesaji = driver.findElement(By.id("flash"));

        } catch (Exception e) {
            System.out.println("🚨 Test sırasında hata oluştu: " + e.getMessage());
        }
    }
}
