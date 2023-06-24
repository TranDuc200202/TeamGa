package Test1.Test1;

import Page.CommonPageObject;
import Page.DataField;
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

import java.time.Duration;

public class testClass extends CommonPageObject {
    public WebDriver edriver;

    public WebDriverWait ewait;

    DataField dataField;



    public testClass() throws Exception {
        super(CommonPageObject.edriver);
        edriver=CommonPageObject.edriver;
        ewait=CommonPageObject.ewait;
        dataField=new DataField("C:\\Users\\Chiêl\\IdeaProjects\\Maven\\src\\main\\java\\Page\\DataField.xlsx");
    }


    @Test
    public void test() throws Exception {
        waitUntilElementVisible(userName);
        userName.sendKeys(dataField.getData(0,0));
        Thread.sleep(1500);
        password.sendKeys(dataField.getData(0,1));

        Thread.sleep(1500);
        loginBtn.click();
        Thread.sleep(1500);
        waitUntilElementVisible(Facility);

        Facility.click();
        waitUntilElementVisible(HongKong);

        HongKong.click();

        waitUntilElementVisible(CheckboxHospital);

        CheckboxHospital.click();
        CheckboxMedicare.click();
        waitUntilElementVisible(Date);
        Date.sendKeys("27/06/2023");
        waitUntilElementVisible(Comment);
        Comment.sendKeys("111");
        waitUntilElementVisible(BookAppointment);
        BookAppointment.click();
        waitUntilElementVisible(Menu);
        Menu.click();
        waitUntilElementVisible(History);
        History.click();
        Thread.sleep(3000);
        try {
            Assert.assertEquals(dataField.getData(0,2),HistoryRecord1.getText());
            System.out.println("match");
        }catch (Exception e){
            System.out.println("not match");

        }

    }
}



