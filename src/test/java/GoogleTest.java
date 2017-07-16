import org.apache.xpath.SourceTree;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by fayaz on 15/07/2017.
 */
public class GoogleTest {
    @Test
    public void myTest() {
        System.setProperty("webdriver.chrome.driver", "//Users//fayaz//Downloads//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("Added green balls to jenkins!!!!");
        System.out.println("Added green balls to jenkins!!!!");

    }
}
