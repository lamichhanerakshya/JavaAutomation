package Table;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductName {
    @Test
    public void OpenRunBrowser() throws InterruptedException {
        //Set Chrome Browser instance
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
// create ChromeDriver instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");


        String beforeXpath =" //*[@id=\"main\"]/div[6]/table/tbody/tr[";
        String afterXpath="]/td[2]";
        Thread.sleep(5000);
        for (int i =2;i<=6;i++){
            String actualXpath=beforeXpath+i+afterXpath;
          WebElement element= driver.findElement(By.xpath(actualXpath));
            System.out.println(element.getText());
            Thread.sleep(5000);

            driver.quit();

        }

        }

        //WebElement row = driver.findElement(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[2]"));














    }
