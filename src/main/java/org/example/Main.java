package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#");

        //WAITT
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

//        WebElement button = driver.findElement(By.xpath("//i[@class=\"fa fa-bars\"]"));
//        System.out.println(button.getText());
//        button.click();

        WebElement btnMakeApp = driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]"));
        System.out.println(btnMakeApp.getText());
        btnMakeApp.click();
        Thread.sleep(1500);

//        WebElement btnChervonUp = driver.findElement(By.xpath("//i[@class=\"fa fa-chevron-up fa-fw fa-1x\"]"));
//        System.out.println(btnChervonUp.getText());
//        btnChervonUp.click();

        //Get the WebElement user
        WebElement Username = driver.findElement(By.xpath("//input[@id='txt-username']"));
        wait.until(ExpectedConditions.visibilityOf(Username));
        Username.sendKeys("John Doe");
        System.out.println(Username.getText());


        //Get the WebElement Password
        WebElement Password = driver.findElement(By.xpath("//input[@id='txt-password']"));
        wait.until(ExpectedConditions.visibilityOf(Password));
        Password.sendKeys("ThisIsNotAPassword");
        System.out.println(Password.getText());

        //Get the WebElement Login
        WebElement btnLogin = driver.findElement(By.xpath("//button[@id='btn-login']"));
        wait.until(ExpectedConditions.visibilityOf(btnLogin));
        wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
        btnLogin.click();

        //Get the WebElement Menu
        WebElement Menu = driver.findElement(By.xpath("//a[@id='menu-toggle']"));
        wait.until(ExpectedConditions.visibilityOf(Menu));
        wait.until(ExpectedConditions.elementToBeClickable(Menu));
        Menu.click();
        Thread.sleep(2000);

        //Get the WebElement Home
        WebElement btnHome = driver.findElement(By.xpath("//a[text()='Home']"));
        wait.until(ExpectedConditions.visibilityOf(btnHome));
        wait.until(ExpectedConditions.elementToBeClickable(btnHome));
        btnHome.click();
        Thread.sleep(2000);

        WebElement Menu2 = driver.findElement(By.xpath("//a[@id='menu-toggle']"));
        wait.until(ExpectedConditions.visibilityOf(Menu2));
        wait.until(ExpectedConditions.elementToBeClickable(Menu2));
        Menu2.click();
        Thread.sleep(2000);

        //Get the WebElement History
        WebElement btnHistory = driver.findElement(By.xpath("//a[text()='History']"));
        wait.until(ExpectedConditions.visibilityOf(btnHistory));
        wait.until(ExpectedConditions.elementToBeClickable(btnHistory));
        btnHistory.click();

        WebElement Menu3 = driver.findElement(By.xpath("//a[@id='menu-toggle']"));
        wait.until(ExpectedConditions.visibilityOf(Menu3));
        wait.until(ExpectedConditions.elementToBeClickable(Menu3));
        Menu3.click();
        Thread.sleep(2000);

        //Get the WebElement Profile
        WebElement btnProfile = driver.findElement(By.xpath("//a[text()='Profile']"));
        wait.until(ExpectedConditions.visibilityOf(btnProfile));
        wait.until(ExpectedConditions.elementToBeClickable(btnProfile));
        btnProfile.click();

        WebElement Menu4 = driver.findElement(By.xpath("//a[@id='menu-toggle']"));
        wait.until(ExpectedConditions.visibilityOf(Menu4));
        wait.until(ExpectedConditions.elementToBeClickable(Menu4));
        Menu4.click();
        Thread.sleep(2000);

        //Get the WebElement Logout
        WebElement btnLogout = driver.findElement(By.xpath("//a[text()='Logout']"));
        wait.until(ExpectedConditions.visibilityOf(btnLogout));
        wait.until(ExpectedConditions.elementToBeClickable(btnLogout));
        btnLogout.click();

        WebElement Menu5 = driver.findElement(By.xpath("//a[@id='menu-toggle']"));
        wait.until(ExpectedConditions.visibilityOf(Menu5));
        wait.until(ExpectedConditions.elementToBeClickable(Menu5));
        Menu5.click();
        Thread.sleep(2000);


    }
}