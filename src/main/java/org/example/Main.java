package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
//        Thread.sleep(5000); đổi thành wait không xài Thread.sleep nữa
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Alt + enter để gợi ý, Shift + F10 để start run
        // Chọn ID để dùng tool chạy thử
        // //a[@class] : là một cái
        WebElement btnMenu = driver.findElement(By.xpath("//i[@class=\"fa fa-bars\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnMenu));
        System.out.println(btnMenu.getText());
        wait.until(ExpectedConditions.elementToBeClickable(btnMenu));
        btnMenu.click();

        WebElement btnMakeApp = driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnMakeApp));
        wait.until(ExpectedConditions.elementToBeClickable(btnMakeApp));
//        System.out.println(btnMakeApp);
        btnMakeApp.click();
//        Thread.sleep(1500);

        WebElement btnOnTop = driver.findElement(By.xpath("//i[@class=\"fa fa-chevron-up fa-fw fa-1x\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnOnTop));
        wait.until(ExpectedConditions.elementToBeClickable(btnOnTop));
        System.out.println(btnOnTop.getText());
        btnOnTop.click();

        //thắc mắc không link thì nó chỉ refresh trang thôi
        WebElement btnFB = driver.findElement(By.xpath("//i[@class=\"fa fa-facebook fa-fw fa-3x\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnFB));
        wait.until(ExpectedConditions.elementToBeClickable(btnFB));
//        System.out.println(btnFB.getText());
        btnFB.click();
        Thread.sleep(1500);

        WebElement btnTwitter = driver.findElement(By.xpath("//i[@class=\"fa fa-twitter fa-fw fa-3x\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnTwitter));
        wait.until(ExpectedConditions.elementToBeClickable(btnTwitter));
//        System.out.println(btnTwitter);
        btnTwitter.click();
        Thread.sleep(1500);

        WebElement btnDirbbble = driver.findElement(By.xpath("//i[@class=\"fa fa-dribbble fa-fw fa-3x\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnDirbbble));
        wait.until(ExpectedConditions.elementToBeClickable(btnDirbbble));
//        System.out.println(btnDirbbble);
        btnDirbbble.click();
        Thread.sleep(1500);

        //bị lỗi
        WebElement btnPhone = driver.findElement(By.xpath("//i[@class=\"fa fa-phone fa-fw\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnPhone));
        wait.until(ExpectedConditions.elementToBeClickable(btnPhone));
        System.out.println(btnPhone);
        btnPhone.click();

        //login
        WebElement username = driver.findElement(By.xpath("//input[@id='txt-username']"));
        wait.until(ExpectedConditions.visibilityOf(username));
        wait.until(ExpectedConditions.elementToBeClickable(username));
        username.sendKeys("John Doe");
//        System.out.println(username);

        WebElement password = driver.findElement(By.xpath("//input[@id='txt-password']"));
        wait.until(ExpectedConditions.visibilityOf(password));
        wait.until(ExpectedConditions.elementToBeClickable(password));
        password.sendKeys("ThisIsNotAPassword");


        //Nút bấm
        WebElement btnLogin = driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnLogin));
        wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
        btnLogin.click();
//        driver.quit();

    }
}