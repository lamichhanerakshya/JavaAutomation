package Table;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableSum {

        @Test
        public void OpenRunBrowser() throws InterruptedException {
            //Set Chrome Browser instance
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
// create ChromeDriver instance
            WebDriver driver = new ChromeDriver();
            double sum = 0;
            double expectedSum = 91.35;


            driver.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");
            driver.manage().window().maximize();
            WebElement mytable = driver.findElement(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[6]"));
            List<WebElement> rows = mytable.findElements(By.tagName("td"));
            for (WebElement row : rows) {

                double no = Double.parseDouble(row.getText());
                sum = sum + no;
            }
            System.out.println("The sum is "+sum);
            Assert.assertEquals(sum, expectedSum, 2);
            Thread.sleep(5000);


            driver.quit();


        }
    }
