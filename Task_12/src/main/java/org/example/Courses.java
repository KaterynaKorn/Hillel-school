package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class Courses {

    public  static final String MAIN_URL = "https://ithillel.ua/courses/testing";
    public static final String CATEGORY_BUTTON = ".cats-list_btn[data-category*=";
    public static final String COURSES_BLOCK_LIST = ".profession-bar_title";
    public static final String COURSES_ADD_LIST = "//p[text()='Додаткові курси']/ancestor::*[@class='block-profession_group']//ul//p[@class='profession-bar_title']";
    public static final String OPP_LIST =".opportunity-item_title.p-l";
    public static final String COURSES_BUTTON =".site-nav-link[data-dropdown-trigger*='coursesMenu']";

    public WebDriver browser;
    public WebElement schoolDropdown;
    public WebElement coursesDropdown;
    public WebElement businessButton;
    public WebElement JobButton;
    public WebElement blogButton;
    public WebElement contactsButton;
    public  WebElement consultationButton;
    public WebElement phoneNumber;
    public WebElement privateRoomButton;

    public Courses(WebDriver browser) {
        this.browser = browser;
    }

    public Courses openPage(){
        browser.get(MAIN_URL);
        return this;
    }

    public Courses getCourses(){
        List<WebElement> coursesAllList = browser.findElements(By.cssSelector(COURSES_BLOCK_LIST));
        List<String> coursesNamesList = coursesAllList.stream().map(WebElement::getText).toList();
        System.out.println("All courses:" + coursesNamesList);
            return this;
        }
    public List<String> getAdditionalCourses(){
       List <WebElement> coursesAddList = browser.findElements(By.xpath(COURSES_ADD_LIST));
        List<String> coursesAdditional = coursesAddList.stream().map(WebElement::getText).toList();
        return coursesAdditional;
    }

    public Courses getOpportunities(){
        List <WebElement> oppList = browser.findElements(By.cssSelector(OPP_LIST));
        List<String> opportunityList = oppList.stream().map(WebElement::getText).toList();
        System.out.println("Чому варто стати тестувальником:" + opportunityList);
        return this;
    }


    public Courses goToCategory(String category){
        WebElement buttonCourses = browser.findElement(By.cssSelector(COURSES_BUTTON));
        buttonCourses.click();
        String css = CATEGORY_BUTTON + category +"]";
        WebElement element = browser.findElement(By.cssSelector(css));
        element.click();
        return this;
    }







}
