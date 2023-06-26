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

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //Thread.sleep(5000); đổi thành wait không xài Thread.sleep nữa hoặc xài cho
        // các btn khác để phù hợp với ngữ cảnh
        // Alt + enter để gợi ý, Shift + F10 để start run
        // Chọn ID để dùng tool chạy thử
        // //a[@class=""] : để truy ra xpath
        WebElement btnMenu = driver.findElement(By.xpath("//i[@class=\"fa fa-bars\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnMenu));
        System.out.println(btnMenu.getText());
        wait.until(ExpectedConditions.elementToBeClickable(btnMenu));
        btnMenu.click();

        WebElement btnMakeApp = driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnMakeApp));
        wait.until(ExpectedConditions.elementToBeClickable(btnMakeApp));
        btnMakeApp.click();
        Thread.sleep(2000);

        WebElement btnOnTop = driver.findElement(By.xpath("//i[@class=\"fa fa-chevron-up fa-fw fa-1x\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnOnTop));
        wait.until(ExpectedConditions.elementToBeClickable(btnOnTop));
        System.out.println(btnOnTop.getText());
        btnOnTop.click();
        Thread.sleep(1500);

        //Connect btn FB, Twitter, Dibble
        WebElement btnFB = driver.findElement(By.xpath("//i[@class=\"fa fa-facebook fa-fw fa-3x\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnFB));
        wait.until(ExpectedConditions.elementToBeClickable(btnFB));
        btnFB.click();
        Thread.sleep(2000);

        WebElement btnTwitter = driver.findElement(By.xpath("//i[@class=\"fa fa-twitter fa-fw fa-3x\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnTwitter));
        wait.until(ExpectedConditions.elementToBeClickable(btnTwitter));
        btnTwitter.click();
        Thread.sleep(2000);

        WebElement btnDibble = driver.findElement(By.xpath("//i[@class=\"fa fa-dribbble fa-fw fa-3x\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnDibble));
        wait.until(ExpectedConditions.elementToBeClickable(btnDibble));
        btnDibble.click();
        Thread.sleep(2000);

        //Print btnPhone
        WebElement btnPhone = driver.findElement(By.xpath("//i[@class=\"fa fa-phone fa-fw\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnPhone));
        wait.until(ExpectedConditions.elementToBeClickable(btnPhone));
        System.out.println(btnPhone);
        btnPhone.click();

        //Scroll btnMakeApp2
        WebElement btnMakeApp2 = driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnMakeApp2));
        wait.until(ExpectedConditions.elementToBeClickable(btnMakeApp2));
        btnMakeApp2.click();
        Thread.sleep(2000);

        //login
        WebElement username = driver.findElement(By.xpath("//input[@id='txt-username']"));
        wait.until(ExpectedConditions.visibilityOf(username));
        wait.until(ExpectedConditions.elementToBeClickable(username));
        username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.xpath("//input[@id='txt-password']"));
        wait.until(ExpectedConditions.visibilityOf(password));
        wait.until(ExpectedConditions.elementToBeClickable(password));
        password.sendKeys("ThisIsNotAPassword");

        //btnLogin
        WebElement btnLogin = driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnLogin));
        wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
        btnLogin.click();
        Thread.sleep(2500);

        //Facility
        WebElement btnSelect = driver.findElement(By.xpath("//select[@id='combo_facility']"));
        wait.until(ExpectedConditions.visibilityOf(btnSelect));
        wait.until(ExpectedConditions.elementToBeClickable(btnSelect));
        btnSelect.click();
        Thread.sleep(2000);

        //Tick : HongKong
        WebElement TickHongKong = driver.findElement(By.xpath("//option[@value='Hongkong CURA Healthcare Center']"));
        wait.until(ExpectedConditions.visibilityOf(TickHongKong));
        wait.until(ExpectedConditions.elementToBeClickable(TickHongKong));
        TickHongKong.click();


        //btnSelect1
        WebElement btnSelect1 = driver.findElement(By.xpath("//select[@id='combo_facility']"));
        wait.until(ExpectedConditions.visibilityOf(btnSelect1));
        wait.until(ExpectedConditions.elementToBeClickable(btnSelect1));
        btnSelect1.click();
        Thread.sleep(2000);

        //CheckBox : Apply
        WebElement CheckBox = driver.findElement(By.xpath("//input[@id='chk_hospotal_readmission']"));
        wait.until(ExpectedConditions.visibilityOf(CheckBox));
        wait.until(ExpectedConditions.elementToBeClickable(CheckBox));
        CheckBox.click();

        //RadioButton : None
        WebElement RadioButton = driver.findElement(By.xpath("//input[@id='radio_program_none']"));
        wait.until(ExpectedConditions.visibilityOf(RadioButton));
        wait.until(ExpectedConditions.elementToBeClickable(RadioButton));
        RadioButton.click();

        //Visit Date cái này khó sau này sẽ học :Đ
//        WebElement btnDate = driver.findElement(By.xpath("//div[@class='input-group-addon']"));
//        wait.until(ExpectedConditions.visibilityOf(btnDate));
//        wait.until(ExpectedConditions.elementToBeClickable(btnDate));
//        btnDate.click();
//        Thread.sleep(3000);
        //PickDate cái này khó sau này sẽ học :Đ
//        WebElement PickDate = driver.findElement(By.xpath("//td[@class='active day']"));
//        wait.until(ExpectedConditions.visibilityOf(PickDate));
//        wait.until(ExpectedConditions.elementToBeClickable(PickDate));
//        PickDate.sendKeys("21/06/2023");
//        PickDate.click();

        //InputDate
        WebElement InputDate = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        wait.until(ExpectedConditions.visibilityOf(InputDate));
        wait.until(ExpectedConditions.elementToBeClickable(InputDate));
        InputDate.sendKeys("21/06/2023");
        InputDate.click();
        Thread.sleep(3000);

        //TextArea
        WebElement TextArea = driver.findElement(By.xpath("//textarea[@class=\"form-control\"]"));
        wait.until(ExpectedConditions.visibilityOf(TextArea));
        wait.until(ExpectedConditions.elementToBeClickable(TextArea));
        TextArea.sendKeys("Team co 3 dua code do? : Bui Le Nhut Tan, Nguyen Thi Be Chiel, va toi");
        TextArea.click();
        Thread.sleep(3000);

        //BtnBookAppointment
        WebElement BtnBookAppointment = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        wait.until(ExpectedConditions.visibilityOf(BtnBookAppointment));
        wait.until(ExpectedConditions.elementToBeClickable(BtnBookAppointment));
        BtnBookAppointment.click();

        //LbFacility
        WebElement LbFacility = driver.findElement(By.xpath("//label[@for=\"facility\"]"));
        wait.until(ExpectedConditions.visibilityOf(LbFacility));
        wait.until(ExpectedConditions.elementToBeClickable(LbFacility));
        System.out.println(LbFacility.getText());

        //LbApply
        WebElement LbApply = driver.findElement(By.xpath("//label[@for=\"hospital_readmission\"]"));
        wait.until(ExpectedConditions.visibilityOf(LbApply));
        wait.until(ExpectedConditions.elementToBeClickable(LbApply));
        System.out.println(LbApply.getText());

        //LbHealthcare
        WebElement LbHealthcare = driver.findElement(By.xpath("//label[@for=\"program\"]"));
        wait.until(ExpectedConditions.visibilityOf(LbHealthcare));
        wait.until(ExpectedConditions.elementToBeClickable(LbHealthcare));
        System.out.println(LbHealthcare.getText());

        //LbVisitDate
        WebElement LbVisitDate = driver.findElement(By.xpath("//label[@for=\"visit_date\"]"));
        wait.until(ExpectedConditions.visibilityOf(LbVisitDate));
        wait.until(ExpectedConditions.elementToBeClickable(LbVisitDate));
        System.out.println(LbVisitDate.getText());

        //LbComment
        WebElement LbComment = driver.findElement(By.xpath("//label[@for=\"comment\"]"));
        wait.until(ExpectedConditions.visibilityOf(LbComment));
        wait.until(ExpectedConditions.elementToBeClickable(LbComment));
        System.out.println(LbComment.getText());

        //btnMenuAppointment
        WebElement btnMenuAppointment = driver.findElement(By.xpath("//i[@class=\"fa fa-bars\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnMenuAppointment));
        wait.until(ExpectedConditions.elementToBeClickable(btnMenuAppointment));
        btnMenuAppointment.click();
        Thread.sleep(2000);

        //btnHistory
        WebElement btnHistory = driver.findElement(By.xpath("//a[text()='History']"));
        wait.until(ExpectedConditions.visibilityOf(btnHistory));
        wait.until(ExpectedConditions.elementToBeClickable(btnHistory));
        btnHistory.click();
        Thread.sleep(2000);

        //LbHeading
        WebElement LbHeading = driver.findElement(By.xpath("//div[@class=\"panel-heading\"]"));
        wait.until(ExpectedConditions.visibilityOf(LbHeading));
        wait.until(ExpectedConditions.elementToBeClickable(LbHeading));
        System.out.println(LbHeading.getText());

        //LbClearfix1
        WebElement LbClearfix1 = driver.findElement(By.xpath("//div[@class=\"clearfix\"]"));
        wait.until(ExpectedConditions.visibilityOf(LbClearfix1));
        wait.until(ExpectedConditions.elementToBeClickable(LbClearfix1));
        System.out.println(LbClearfix1.getText());

        //LbClearfix2
        WebElement LbClearfix2 = driver.findElement(By.xpath("//div[@class=\"clearfix\"]"));
        wait.until(ExpectedConditions.visibilityOf(LbClearfix2));
        wait.until(ExpectedConditions.elementToBeClickable(LbClearfix2));
        System.out.println(LbClearfix2.getText());

        //LbClearfix3
        WebElement LbClearfix3 = driver.findElement(By.xpath("//div[@class=\"clearfix\"]"));
        wait.until(ExpectedConditions.visibilityOf(LbClearfix3));
        wait.until(ExpectedConditions.elementToBeClickable(LbClearfix3));
        System.out.println(LbClearfix3.getText());

        //In btnComment
        WebElement btnComment = driver.findElement(By.xpath("//label[@for=\"comment\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnComment));
        wait.until(ExpectedConditions.elementToBeClickable(btnComment));
        System.out.println(btnComment.getText());

        //Print content in Comment
        WebElement ContentComment = driver.findElement(By.xpath("//p[@id=\"comment\"]"));
        wait.until(ExpectedConditions.visibilityOf(ContentComment));
        wait.until(ExpectedConditions.elementToBeClickable(ContentComment));
        System.out.println(ContentComment.getText());

        //btnMenuProfile
        WebElement btnMenuProfile = driver.findElement(By.xpath("//i[@class=\"fa fa-bars\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnMenuProfile));
        wait.until(ExpectedConditions.elementToBeClickable(btnMenuProfile));
        btnMenuProfile.click();
        Thread.sleep(2000);

        //btnProfile
        WebElement btnProfile = driver.findElement(By.xpath("//a[text()=\"Profile\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnProfile));
        wait.until(ExpectedConditions.elementToBeClickable(btnProfile));
        btnProfile.click();
        Thread.sleep(2000);

        //btnLogout
        WebElement btnLogout = driver.findElement(By.xpath("//a[@class=\"btn btn-default\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnLogout));
        wait.until(ExpectedConditions.elementToBeClickable(btnLogout));
        btnLogout.click();
        Thread.sleep(2000);

        driver.quit();

    }
}