package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstseleniumclass {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
//      GitHub'dan gelen commit   
        driver.get("https://www.google.de/");
        driver.manage().window().maximize();
    }
}
