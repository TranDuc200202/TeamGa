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
        Thread.sleep(10000);
        // Alt + enter để gợi ý, Shift + F10 để start run
//        WebElement button = driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]"));
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

        WebElement buttonFB = driver.findElement(By.xpath("//i[@class=\"fa fa-facebook fa-fw fa-3x\"]"));
        System.out.println(buttonFB.getText());
        buttonFB.click();

        // Chọn ID để dùng tool chạy thử
        // //a[@class] : là một cái


    }
}