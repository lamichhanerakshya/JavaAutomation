package Table;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationDemo {
    @Test
    public void OpenRunBrowser() throws InterruptedException {
        //Set Chrome Browser instance
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
// create ChromeDriver instance
        WebDriver wd = new ChromeDriver();

        //Open browser
        wd.get("https://www.toolsqa.com/automation-practice-form/");
        wd.manage().window().maximize();
        WebElement partiallink = wd.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[2]"));
        Thread.sleep(5000);
       partiallink.click();
        System.out.println(partiallink.isDisplayed());
        Thread.sleep(5000);
wd.quit();


    }

    @Test
    public void OpenBrowser() throws InterruptedException {
        //Set Chrome Browser instance
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
// create ChromeDriver instance
        WebDriver wd = new ChromeDriver();

        //Open browser
        wd.get("https://www.toolsqa.com/automation-practice-form/");
        wd.manage().window().maximize();
        WebElement linkText = wd.findElement(By.xpath("//*[@id=\"sex-1\"]"));
        Actions actions = new Actions(wd);
        actions.moveToElement(linkText);

        actions.click(linkText);
        System.out.println(linkText.isDisplayed());
        Thread.sleep(5000);
        wd.quit();

    }

}
