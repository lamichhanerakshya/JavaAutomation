package Table;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Sum {
    @Test
    public void OpenRunBrowser() throws InterruptedException {
        //Set Chrome Browser instance
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
// create ChromeDriver instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");
        driver.manage().window().maximize();
        //WebElement basetable = driver.findElement(By.tagName("table"));
        //WebElement tablerow=driver.findElement(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr[1]/th[6]"));
        WebElement Row=driver.findElement(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody"));
        List<WebElement> totalrow = Row.findElements(By.tagName("table"));
        int row_count=totalrow.size();
        System.out.println("Total number of row in the table are: "+ row_count);



        /*
        WebElement ToGetColumns = driver.findElement(By.xpath("//table[@id='users_table']/tbody/tr"));
List<WebElement> TotalColsList = ToGetColumns.findElements(By.tagName("td"));
System.out.println("Total Number of Columns in the table are: "+TotalColsList.size());

         */




        Thread.sleep(5000);

driver.quit();
    }
    }
