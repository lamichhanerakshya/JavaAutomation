package com.itsutra;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {
    @Test
    public void OpenRunBrowser() throws InterruptedException {
        //Set Chrome Browser instance
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
// create ChromeDriver instance
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.toolsqa.com/automation-practice-form/");
        WebElement fristname = wd.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input"));
fristname.sendKeys("Rakshya");
WebElement lastname =wd.findElement(By.id("lastname"));
lastname.sendKeys("lamichhane");
 wd.findElement(By.xpath("//*[@id=\"sex-1\"]")).click();

 wd.findElement(By.id("exp-4")).click();

        Actions actions = new Actions(wd);
        actions.click();

        wd.manage().window().maximize();
Thread.sleep(5000);

    }
}