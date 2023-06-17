package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#");
        // bo link de test vao
        Thread.sleep(5000);
        WebElement button = driver.findElement(By.xpath("//i[@class=\"fa fa-bars\"]"));
        System.out.println(button.getText());
        button.click();

        WebElement btnMakeApp = driver.findElement(By.xpath("//i[@id=\"btn-make-appointment\"]"));
        System.out.println(btnMakeApp.getText());
        btnMakeApp.click();
        Thread.sleep(1500);

        WebElement btnChervonUp = driver.findElement(By.xpath("//i[@class=\"fa fa-chevron-up fa-fw fa-1x\"]"));
        System.out.println(btnChervonUp.getText());
        btnChervonUp.click();


    }
}