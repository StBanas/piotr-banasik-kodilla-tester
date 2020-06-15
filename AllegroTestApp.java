package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllegroTestApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/selenium-drivers/Chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement inputItem = driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/div/div/div/div/form/div[2]/div/select"));
        inputItem.sendKeys("Elektronika");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        inputItem = driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/div/div/div/div/form/input"));
        inputItem.sendKeys("mavic mini");
        inputItem.submit();
    }
}
