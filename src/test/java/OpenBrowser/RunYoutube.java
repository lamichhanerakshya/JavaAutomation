package OpenBrowser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunYoutube {
    @Test
    public void OpenRunBrowser() throws InterruptedException {
        //Set Chrome Browser instance
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
// create ChromeDriver instance
        WebDriver wd = new ChromeDriver();

        //Open browser
        wd.get("http://www.youtube.com");
        WebElement search = wd.findElement(By.name("search_query"));
        search.sendKeys("Selenium");
        WebElement login =wd.findElement(By.id("search-icon-legacy"));
        login.click();

        wd.manage().window().maximize();
        Thread.sleep(5000);





        wd.quit();


    }

}
