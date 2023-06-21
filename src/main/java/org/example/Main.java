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

        //refresh lại trang 3 lần
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

        WebElement btnDirbbble = driver.findElement(By.xpath("//i[@class=\"fa fa-dribbble fa-fw fa-3x\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnDirbbble));
        wait.until(ExpectedConditions.elementToBeClickable(btnDirbbble));
        btnDirbbble.click();
        Thread.sleep(2000);

        //in ra giá trị của Phone
        WebElement btnPhone = driver.findElement(By.xpath("//i[@class=\"fa fa-phone fa-fw\"]"));
        wait.until(ExpectedConditions.visibilityOf(btnPhone));
        wait.until(ExpectedConditions.elementToBeClickable(btnPhone));
        System.out.println(btnPhone);
        btnPhone.click();

        //cho kéo xuống để đăng nhập
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

        //Nút bấm Login
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


        //Đóng lại Select
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

        //input Date
        WebElement InputDate = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        wait.until(ExpectedConditions.visibilityOf(InputDate));
        wait.until(ExpectedConditions.elementToBeClickable(InputDate));
        InputDate.sendKeys("21/06/2023");
        InputDate.click();
        Thread.sleep(3000);

        // TextArea
        WebElement TextArea = driver.findElement(By.xpath("//textarea[@class=\"form-control\"]"));
        wait.until(ExpectedConditions.visibilityOf(TextArea));
        wait.until(ExpectedConditions.elementToBeClickable(TextArea));
        TextArea.sendKeys("Team co 3 dua code do? : Bui Le Nhut Tan, Nguyen Thi Be Chiel, va toi");
        TextArea.click();
        Thread.sleep(3000);

        //BtnBookAppointment //button[@type="submit"]
        WebElement BtnBookAppointment = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        wait.until(ExpectedConditions.visibilityOf(BtnBookAppointment));
        wait.until(ExpectedConditions.elementToBeClickable(BtnBookAppointment));
        BtnBookAppointment.click();

        //Label Facility
        WebElement LbFacility = driver.findElement(By.xpath("//label[@for=\"facility\"]"));
        wait.until(ExpectedConditions.visibilityOf(LbFacility));
        wait.until(ExpectedConditions.elementToBeClickable(LbFacility));
        System.out.println(LbFacility);

        //Label Apply for hospital readmission
        WebElement LbApply = driver.findElement(By.xpath("//label[@for=\"hospital_readmission\"]"));
        wait.until(ExpectedConditions.visibilityOf(LbApply));
        wait.until(ExpectedConditions.elementToBeClickable(LbApply));
        System.out.println(LbApply);

        //Label Healthcare Program //label[@for="program"]
        WebElement LbHealthcare = driver.findElement(By.xpath("//label[@for=\"program\"]"));
        wait.until(ExpectedConditions.visibilityOf(LbHealthcare));
        wait.until(ExpectedConditions.elementToBeClickable(LbHealthcare));
        System.out.println(LbHealthcare);

        //Label Visit Date //label[@for="visit_date"]
        WebElement LbVisitDate = driver.findElement(By.xpath("//label[@for=\"visit_date\"]"));
        wait.until(ExpectedConditions.visibilityOf(LbVisitDate));
        wait.until(ExpectedConditions.elementToBeClickable(LbVisitDate));
        System.out.println(LbVisitDate);

        //Label Comment //label[@for="comment"]
        WebElement LbComment = driver.findElement(By.xpath("//label[@for=\"comment\"]"));
        wait.until(ExpectedConditions.visibilityOf(LbComment));
        wait.until(ExpectedConditions.elementToBeClickable(LbComment));
        System.out.println(LbComment);

        driver.quit();

    }
}