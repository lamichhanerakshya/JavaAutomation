package OpenBrowser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Webdriverdemo {
    @Test




        public void Webdriverdemo() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.calculator.net/mortgage-payoff-calculator.html");
        driver.manage().window().maximize();
        WebElement button = driver.findElement(By.id("cpayoff1"));
        button.click();
        boolean result = button.isSelected();
        System.out.println("The output of ISselected "+result);
       boolean result1=  button.isEnabled();
        System.out.println("The output of isEnabled "+ result1);

        //boolean result2= button.isDisplayed();
        System.out.println("The output of isDisplayed "+ driver.findElement(By.id("cpayoff1")).isDisplayed());


        Thread.sleep(5000);





        driver.quit();


    }
    }



















