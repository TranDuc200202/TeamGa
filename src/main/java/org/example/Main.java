package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // bo link de test vao
//        Thread.sleep(5000);

        //
        WebElement button = driver.findElement(By.xpath("//i[@class=\"fa fa-bars\"]"));
        System.out.println(button.getText());
        button.click();


        WebElement btnFace = driver.findElement(By.xpath("//i[@class =\"fa fa-facebook fa-fw fa-3x\"]"));
        System.out.println(btnFace.getText());
        btnFace.click();

        //Username
        WebElement userName = driver.findElement((By.xpath("//input[@id='txt-username']")));
        userName.sendKeys("John Doe");
        System.out.println(userName.getText());

        //Password
        WebElement Password = driver.findElement((By.xpath("//input[@id='txt-password']")));
        Password.sendKeys("ThisIsNotAPassword");
        System.out.println(Password.getText());

        //Get the WebElement Login
        WebElement btnLogin = driver.findElement(By.xpath("//button[@id='btn-login']"));
        wait.until(ExpectedConditions.visibilityOf(btnLogin));
        wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
        btnLogin.click();




        //bnt Make App
        WebElement btnMakeApp = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        System.out.println(btnMakeApp.getText());
        btnMakeApp.click();

        //Click checkbox apply for HPT RM
        driver.findElement(By.xpath("//input[@id='chk_hospotal_readmission']")).click();

        //Facility
        WebElement Select = driver.findElement(By.xpath("//select[@id='combo_facility']"));
        wait.until(ExpectedConditions.visibilityOf(Select));
        wait.until(ExpectedConditions.elementToBeClickable(Select));
        Select.click();

        //Select HongKong
        WebElement SlHongKong = driver.findElement(By.xpath("//option[@value='Hongkong CURA Healthcare Center']"));
        wait.until(ExpectedConditions.visibilityOf(SlHongKong));
        wait.until(ExpectedConditions.elementToBeClickable(SlHongKong));
        SlHongKong.click();

        //Click checkbox medicares
        driver.findElement(By.xpath("//input[@value='Medicare']")).click();

        //Date/moth/year
        WebElement VisitDate = driver.findElement((By.xpath("//input[@id='txt_visit_date']")));
        VisitDate.sendKeys("27/06/2023");
        System.out.println(VisitDate.getText());

        //Comment
        WebElement AcComment = driver.findElement((By.xpath(" //textarea[@id = 'txt_comment']")));
        wait.until(ExpectedConditions.visibilityOf(AcComment));
        wait.until(ExpectedConditions.elementToBeClickable(AcComment));
        AcComment.sendKeys("111");
        System.out.println(AcComment.getText());

        //
        WebElement Submit = driver.findElement(By.xpath("//button[@id='btn-book-appointment']"));
        wait.until(ExpectedConditions.visibilityOf(Submit));
        wait.until(ExpectedConditions.elementToBeClickable(Submit));
        Submit.click();

        //Menu
        WebElement Menu = driver.findElement(By.xpath("//i[@class=\"fa fa-bars\"]"));
        wait.until(ExpectedConditions.visibilityOf(Menu));
        wait.until(ExpectedConditions.elementToBeClickable(Menu));
        Menu.click();

        //History
        WebElement History = driver.findElement(By.xpath("//a[text()='History']"));
        wait.until(ExpectedConditions.visibilityOf(History));
        wait.until(ExpectedConditions.elementToBeClickable(History));
        History.click();



        //ontop
//        WebElement btnOnTop = driver.findElement(By.xpath("//i[@class=\"fa fa-chevron-up fa-fw fa-1x\"]"));
//        System.out.println(btnOnTop.getText());
//        btnOnTop.click();
    }
}