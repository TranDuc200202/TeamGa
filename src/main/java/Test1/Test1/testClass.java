package Test1.Test1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.CommonPageObject;
import page.DataField;

import java.awt.*;
import java.time.Duration;

public class testClass extends CommonPageObject {
    public WebDriver edriver;

    public WebDriverWait ewait;

    DataField dataField;



    public testClass() throws Exception {
        super(CommonPageObject.edriver);
        edriver = CommonPageObject.edriver;
        ewait = CommonPageObject.ewait;
        dataField = new DataField("src/main/java/page/tesdata.xlsx");
    }



    @Test()
    public void test() throws Exception {
        waitUntilElementVisible(userName);
        Thread.sleep(1000);

        userName.sendKeys(dataField.getData(0,0));
        Thread.sleep(1000);

        password.sendKeys(dataField.getData(0,1));
        Thread.sleep(1000);


        try{
            Assert.assertEquals(dataField.getData(0,2),makeAppointment.getText());
        }catch (Exception e){

        }

        login.click();
        Thread.sleep(1000);

        menu.click();
        Thread.sleep(1000);
        dataField.write("menu-toggle",1,0);
        System.out.println(menu.getAttribute("id"));

        btnHome.click();
        Thread.sleep(1000);
        dataField.write("Home",1,1);
        System.out.println(btnHome.getText());

        btnmakeAppointment.click();
        Thread.sleep(1000);
        dataField.write("Make Appointment",1,2);
        System.out.println(btnmakeAppointment.getText());

        menu2.click();
        Thread.sleep(1000);
        dataField.write("menu-toggle",2,0);
        System.out.println(menu2.getAttribute("id"));

        History.click();
        Thread.sleep(1000);
        dataField.write("History",2,1);
        System.out.println(History.getText());

        btnGotoHomepage.click();
        Thread.sleep(1000);
        dataField.write("GotoHomepage",2,2);
        System.out.println(History.getText());

        menu3.click();
        Thread.sleep(1000);
        dataField.write("menu-toggle",3,0);
        System.out.println(menu3.getAttribute("id"));

        Profile.click();
        Thread.sleep(1000);
        dataField.write("Profile",3,1);
        System.out.println(Profile.getText());

//        BtnLogout.click();
//        Thread.sleep(1000);
//        dataField.write("Logout",3,2);
//        System.out.println(BtnLogout.getText());

        menu4.click();
        Thread.sleep(1000);
        dataField.write("menu-toggle",4,0);
        System.out.println(menu4.getAttribute("id"));

        System.out.println(Logout.getText());
        Logout.click();
        Thread.sleep(1000);
        dataField.write("Logout",4,1);

        btnmakeAppointment2.click();
        Thread.sleep(1000);
        dataField.write("Make Appointment",4,2);
        System.out.println(btnmakeAppointment2.getText());

        //




    }


}