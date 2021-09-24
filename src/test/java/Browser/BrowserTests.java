package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTests {

    @Test
    public void main(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://facebook.com";
        driver.get(baseUrl);

        WebElement element = driver.findElement(By.id("email"));
        driver.close();

    }
}
