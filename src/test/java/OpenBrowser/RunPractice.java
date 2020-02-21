package OpenBrowser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunPractice {
    @Test
    public void openRunPractice () throws InterruptedException{
       System.setProperty("webdriver.chrome.driver","chromedriver.exe") ;
        WebDriver wd = new ChromeDriver();
        wd.get("http://www.facebook.com");
        WebElement login = wd.findElement(By.xpath("//*[@id=\"email\"]"));
        login.sendKeys("rakshya_a1@hotmail.com");

        WebElement password =wd.findElement(By.xpath("//*[@id=\"pass\"]"));
        password.sendKeys("start");
        WebElement click1 =wd.findElement(By.xpath("//*[@id=\"u_0_b\"]"));
        click1.click();

        wd.manage().window().maximize();

        Thread.sleep(5000);




        wd.quit();






    }


}
