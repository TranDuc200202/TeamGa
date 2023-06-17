package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        Thread.sleep(5000);
        // Alt + enter để gợi ý, Shift + F10 để start run
        // Chọn ID để dùng tool chạy thử
        // //a[@class] : là một cái
        WebElement btnMenu = driver.findElement(By.xpath("//i[@class=\"fa fa-bars\"]"));
        System.out.println(btnMenu.getText());
        btnMenu.click();

        WebElement btnMakeApp = driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]"));
        System.out.println(btnMakeApp);
        btnMakeApp.click();
        Thread.sleep(1500);

        WebElement btnOnTop = driver.findElement(By.xpath("//i[@class=\"fa fa-chevron-up fa-fw fa-1x\"]"));
        System.out.println(btnOnTop.getText());
        btnOnTop.click();
        //thắc mắc không link thì nó chỉ refresh trang thôi
        WebElement btnFB = driver.findElement(By.xpath("//i[@class=\"fa fa-facebook fa-fw fa-3x\"]"));
        System.out.println(btnFB.getText());
        btnFB.click();

        WebElement btnTwitter = driver.findElement(By.xpath("//i[@class=\"fa fa-twitter fa-fw fa-3x\"]"));
        System.out.println(btnTwitter);
        btnTwitter.click();

        WebElement btnDirbbble = driver.findElement(By.xpath("//i[@class=\"fa fa-dribbble fa-fw fa-3x\"]"));
        System.out.println(btnDirbbble);
        btnDirbbble.click();

        //bị lỗi
        WebElement btnPhone = driver.findElement(By.xpath("//i[@class=\"fa fa-phone fa-fw\"]"));
        System.out.println(btnPhone);
        btnPhone.click();





    }
}