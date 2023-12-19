package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        WebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Courses testingPage = new Courses(browser);
        testingPage
                .openPage()
                .getCourses()
                .getAdditionalCourses()
                .getOpportunities()
                .goToCategory("testing");

        browser.quit();

    }
}