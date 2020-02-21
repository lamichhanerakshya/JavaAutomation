package Assignment;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Assignment {
    WebDriver wd;
    WebElement gender,partialLink,profession,senddate,p1,p2;
    @Before

    public void openwebsite() {
        //Set Chrome Browser instance
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        // create ChromeDriver instance
         wd = new ChromeDriver();
        //Open browser
        wd.get("https://www.toolsqa.com/automation-practice-form/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
    }

@Test
    public void verifyTest () throws InterruptedException{
      partialLink =wd.findElement(By.id("content"));
        partialLink.click();

    System.out.println(partialLink.isDisplayed());


    }
    @Test
    public void verifyLinkTest() throws InterruptedException{
        wd.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[5]/a/strong")).click();

    }
@Test
public void sendFirstname () throws InterruptedException{
        wd.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input")).sendKeys("Rakshya");

}
@Test
public void sendLastName ()throws InterruptedException{
        wd.findElement(By.id("lastname")).sendKeys("Lamichhane");

}
@Test
public void chooseGender() throws InterruptedException{
    JavascriptExecutor js = (JavascriptExecutor) wd;
    js.executeScript("window.scrollBy(0,750)");

   gender= wd.findElement(By.id("sex-1"));
   gender.click();
Thread.sleep(5000);
}
@Test
public void chooseProfession() throws InterruptedException{
    JavascriptExecutor js = (JavascriptExecutor) wd;
    js.executeScript("window.scrollBy(0,1000)");

    profession=wd.findElement(By.id("exp-4"));
        profession.click();

}
@Test
public void sendDate()throws InterruptedException{
        senddate=wd.findElement(By.id("datepicker"));

}

@Test
public void verifyTitle()
{




}

@After
public void endSession () throws InterruptedException{
Thread.sleep(5000);
wd.quit();
    }







}
