package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        WebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        browser.get("https://ithillel.ua/");

        WebElement coursesButton = browser.findElement(By.cssSelector("#body > div.site-wrapper > div.site-header.-online > div.site-header_nav.site-nav > div > div > nav > ul > li:nth-child(2) > button"));
        coursesButton.click();

        WebElement programmingButton = browser.findElement(By.cssSelector("#coursesMenuControlPanel > ul > li:nth-child(2) > button"));
        programmingButton.click();



        WebElement frontButton = browser.findElement(By.cssSelector("#block-202987 > div > ul > li:nth-child(1)"));
        frontButton.click();
        JavascriptExecutor js = (JavascriptExecutor) browser;
        js.executeScript("window.scrollBy(0,3000);");
        WebElement showAll = browser.findElement(By.cssSelector("#coachesShowAllButton > span.coaches_show"));
        showAll.click();

        WebElement couchList = browser.findElement(By.id("coachesSection"));
        List<WebElement> names = couchList.findElements(By.className("coach-card_name"));
        for (WebElement name: names)
        {
        System.out.println(name.getText());

        }

//        System.out.println(name);
//        browser.quit();
    }
}