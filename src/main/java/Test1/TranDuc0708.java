package Test1;

import Data.CommonPageObject;
import Data.DataField;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.input.Input;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.crypto.Data;
import java.time.Duration;

public class  TranDuc0708 extends CommonPageObject {
    public WebDriverWait ewait;
    public WebDriver edriver;
    public DataField InputData;


    public TranDuc0708(){
        super (CommonPageObject.edriver);
        edriver = CommonPageObject.edriver;
        ewait = CommonPageObject.ewait;
        InputData = new DataField("src/main/java/Test1/Data.xlsx");
    }

    @Test
    public void test() throws Exception{
//        Test thử Data lên excel
//        System.out.println(InputData.getData(0, 0));
//        System.out.println(InputData.getData(0,1));

        waitUntilElementVisible( username);
        username.sendKeys("John Doe");
        Thread.sleep(1000);
        InputData.write(username.getAttribute("value"), 0, 0);

        password.sendKeys("ThisIsNotAPassword");
        Thread.sleep(1000);
        InputData.write(password.getAttribute("value"), 0, 1);

        login.click();
        Thread.sleep(1000);

        select.click();
        Thread.sleep(1000);
        tick.click();
//        TestCase lỗi
//        tick.sendKeys(InputData.getData(0,0));
        checkbox.click();
        radiobox.click();

//      test case 1
        inputdate.sendKeys("23/06/2023");
        Thread.sleep(1000);
        InputData.write(inputdate.getAttribute("value"), 0, 2);

//      test case 2
        inputcmt.sendKeys("Hello các bạn");
        Thread.sleep(1000);
        InputData.write(inputcmt.getAttribute("value"), 0, 3);

//        Hàm này viết sai
//        inputcmt.sendKeys(InputData.getData(1,1));
        book.click();
//        System.out.println(print1.getText());
//        System.out.println(print2.getText());
//        System.out.println(print3.getText());
//        System.out.println(print4.getText());
//        System.out.println(print5.getText());
//        btnMenu.click();
//        Thread.sleep(1000);
//        btnHistory.click();
//        Thread.sleep(1000);
//        System.out.println(printlb1.getText());
//        System.out.println(print1.getText());
//        System.out.println(printlb2.getText());
//        System.out.println(print2.getText());
//        System.out.println(printlb3.getText());
//        System.out.println(print3.getText());
//        System.out.println(printlb4.getText());
//        System.out.println(printlb5.getText());
//        System.out.println(printlb6.getText());
//        btnMenu.click();
//        Thread.sleep(1000);
//        btnProfile.click();
//        Thread.sleep(1000);
//        btnLogout.click();
//        edriver.quit();
    }


}
