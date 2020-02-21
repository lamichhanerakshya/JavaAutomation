package OpenBrowser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
    @Test
    public void OpenRunBrowser() throws InterruptedException {
        //Set Chrome Browser instance
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
// create ChromeDriver instance
        WebDriver driver = new ChromeDriver();


        //linktext
        driver.get("https://www.ebay.com/");
       // WebElement link = driver.findElement(By.linkText("Sign in"));
       // link.click();

        //partial linktext
        //driver.findElement(By.partialLinkText("Verified Rights")).click();
        //driver.manage().window().maximize();

        //CSSselector
       // driver.findElement(By.cssSelector("#gh-ac")).sendKeys("laptop");
        //Classname locator
        driver.findElement(By.className("desktop gh-1199 gh-979 gh-939 gh-899 gh-799 gh-699 gh-599")).click();
        Thread.sleep(5000);









        driver.quit();
    }
}
