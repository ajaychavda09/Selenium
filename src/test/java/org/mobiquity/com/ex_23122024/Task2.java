package org.mobiquity.com.ex_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {
        testMethod();
    }
public static void testMethod(){
    WebDriver driver = new ChromeDriver();
    driver.get("https://awesomeqa.com/practice.html");

    WebElement firstnameTxt = driver.findElement(By.name("firstname"));
    firstnameTxt.sendKeys("Test");

    WebElement lastnameTxt = driver.findElement(By.name("lastname"));
    lastnameTxt.sendKeys("Test");

    WebElement maleRadioBtn = driver.findElement(By.id("sex-0"));
    maleRadioBtn.click();

    WebElement yearsOfExperienceRadioBtn = driver.findElement(By.id("exp-3"));
    yearsOfExperienceRadioBtn.click();

    WebElement datePicker = driver.findElement(By.id("datepicker"));
    datePicker.sendKeys("24/12/2024");

    WebElement professionChkBox = driver.findElement(By.id("profession-1"));
    professionChkBox.click();

    WebElement SeleniumChkBox = driver.findElement(By.id("tool-2"));
    SeleniumChkBox.click();

    driver.quit();
}
}
