package com.kodilla.selenium.eBay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayTestingApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/home/stbanas/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.eBay.com");

        WebElement inputField = driver.findElement(By.name("_nkw"));
        inputField.sendKeys("Laptop");
        inputField.submit();

    }
}
