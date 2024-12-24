package org.mobiquity.com.ex_23122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Task1 {
    public static void main(String[] args) {
        testMethod();
    }
    public static void testMethod() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");

        WebElement makeAppointmentBtn = driver.findElement(By.id("btn-make-appointment"));
        makeAppointmentBtn.click();

        WebElement usernameTxt = driver.findElement(By.id("txt-username"));
        WebElement passwordTxt = driver.findElement(By.id("txt-password"));

        usernameTxt.sendKeys("John Doe");
        passwordTxt.sendKeys("ThisIsNotAPassword");

        WebElement logInBtn = driver.findElement(By.id("btn-login"));
        logInBtn.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        driver.quit();
    }
}
