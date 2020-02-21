package OpenBrowser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
    @Test
    public void OpenRunBrowser() throws InterruptedException {
        //Set Chrome Browser instance
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
// create ChromeDriver instance
        WebDriver wd = new ChromeDriver();

        //Open browser
        wd.get("http://www.gmail.com");
        WebElement email = wd.findElement(By.id("Email"));
        email.sendKeys("rakshyabme@gmail.com");
        wd.manage().window().maximize();

        Thread.sleep(5000);
        wd.quit();


    }


    }
