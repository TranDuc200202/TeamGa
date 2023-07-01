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

        btnHome.click();
        Thread.sleep(1000);

        menu2.click();
        Thread.sleep(1000);

        History.click();
        Thread.sleep(1000);

        menu3.click();
        Thread.sleep(1000);

        Profile.click();
        Thread.sleep(1000);

        BtnLogout.click();
        Thread.sleep(1000);

//        menu4.click();
//        Thread.sleep(1000);
//
//        Logout.click();
//        Thread.sleep(1000);


    }


}