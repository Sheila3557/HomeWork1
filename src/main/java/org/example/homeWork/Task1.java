package org.example.homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");

        WebElement createNewAccount = driver.findElement(By.linkText("Create a new account"));
        createNewAccount.click();
        Thread.sleep(2000);

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Sheila");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys(("Nov"));

        WebElement email = driver.findElement(By.name("reg_email"));
        email.sendKeys("she.nov24@gmail.com");

        WebElement password = driver.findElement(By.name("reg_password"));
        password.sendKeys("noCodeForYou24");



    }
}
