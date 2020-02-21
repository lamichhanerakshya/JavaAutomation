package OpenBrowser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownButton {
    @Test
    public void OpenRunBrowser() throws InterruptedException {
        //Set Chrome Browser instance
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
// create ChromeDriver instance
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/interest-calculator.html");
        Select select = new Select(driver.findElement(By.xpath("//*[@id=\"ccompound\"]")));
        select.selectByVisibleText("daily");
        System.out.println("The Output of the Isselected "+ driver.findElement(By.xpath("//*[@id=\"ccompound\"]")).isSelected());
        System.out.println("The output of the Isenabled "+ driver.findElement(By.xpath("//*[@id=\"ccompound\"]")).isEnabled());
        System.out.println("The output of the isDisplayed "+ driver.findElement(By.xpath("//*[@id=\"ccompound\"]")).isDisplayed());

Thread.sleep(5000);
driver.quit();
    }

}
