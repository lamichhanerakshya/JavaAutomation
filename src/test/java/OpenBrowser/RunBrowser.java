package OpenBrowser;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunBrowser {
    @Test
        public void OpenRunBrowser() throws InterruptedException {
            //Set Chrome Browser instance
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
// create ChromeDriver instance
            WebDriver wd = new ChromeDriver();

            //Open browser
            wd.get("http://www.gmail.com");

        WebElement email = wd.findElement(By.xpath("//*[@id='identifierId']"));
        email.sendKeys("qatesting00567@gmail.com");
        //Maximize browser
        wd.manage().window().maximize();

        //wait for 5 sec

        // close browser
        WebElement next = wd.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span"));
        next.click();


        Thread.sleep(5000);


        WebElement password = wd.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        password.sendKeys("Tes123");


        WebElement next1 =wd.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span"));
        next1.click();
        Thread.sleep(5000);






        Thread.sleep(5000);



        wd.quit();







        }




}
