package org.mobiquity.com.ex_30122024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1 {
    @Test
    public void testMethod() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.idrive360.com/enterprise/login");
        Thread.sleep(3000);
        WebElement emailID = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

        emailID.sendKeys("augtest_040823@idrive.com");
        password.sendKeys("123456");

        WebElement signInButton = driver.findElement(By.xpath("//button[@class='id-btn id-info-btn-frm']"));
        signInButton.click();

        Thread.sleep(20000);

        WebElement freeTrialMessage = driver.findElement(By.xpath("//h5[@class='id-card-title']"));
        System.out.println("Free Trial Message = "+freeTrialMessage.getText());
        Assert.assertEquals(freeTrialMessage.getText(), "Your free trial has expired");

        driver.quit();
    }
}
