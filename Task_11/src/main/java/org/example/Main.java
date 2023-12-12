package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        WebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        browser.get("https://ithillel.ua/");
        System.out.println(browser.getTitle());

        WebElement coursesButton = browser.findElement(By.cssSelector("#body > div.site-wrapper > div.site-header.-online > div.site-header_nav.site-nav > div > div > nav > ul > li:nth-child(2) > button"));
        coursesButton.click();
        System.out.println(coursesButton.getText());

        WebElement programmingButton = browser.findElement(By.cssSelector("#coursesMenuControlPanel > ul > li:nth-child(2) > button"));
        programmingButton.click();
        System.out.println(programmingButton.getText());



        WebElement frontButton = browser.findElement(By.cssSelector("#block-202987 > div > ul > li:nth-child(1)"));
        frontButton.click();
        System.out.println(frontButton.getText());

        WebElement couchList = browser.findElement(By.id("coachesSection"));
        List<WebElement> names = couchList.findElements(By.className("coach-card_name"));
        System.out.println(names);
        browser.quit();
    }
}