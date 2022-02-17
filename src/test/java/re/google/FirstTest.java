package re.google;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void firstTest(){
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        for(int i = 0; i < 10; i++) {
            driver.get("https://www.google.ru/");
            String title = driver.getTitle();
            Assert.assertTrue(title.equals("Google"));
        }


        driver.quit();
    }
}
