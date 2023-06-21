package Test1;

import org.example.WebDriverWait;
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
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class TestClass {
    public WebDriver edriver;

    public WebDriverWait ewait;

    @FindBy(how = How.XPATH,using = "//input[@id='txt-password']")
    public WebElement password;
    @FindBy(how = How.XPATH,using = "//input[@id='txt-username']")
    public WebElement userName;
    @FindBy(how = How.XPATH,using = "//button[@id='btn-login']")
    public WebElement loginBtn;
    @FindBy(how = How.XPATH,using = "//select[@id='combo_facility']")
    public WebElement Facility;
    @FindBy(how = How.XPATH,using = "//option[@value='Hongkong CURA Healthcare Center']")
    public WebElement HongKong;
    @FindBy(how = How.XPATH,using = "//input[@id='chk_hospotal_readmission']")
    public WebElement CheckboxHospital;
    @FindBy(how = How.XPATH,using = "//input[@value='Medicare']")
    public WebElement CheckboxMedicare;
    @FindBy(how = How.XPATH,using = "//input[@id='txt_visit_date']")
    public WebElement Date;
    @FindBy(how = How.XPATH,using = "//textarea[@id = 'txt_comment']")
    public WebElement Comment;
    @FindBy(how = How.XPATH,using = "//button[@id='btn-book-appointment']")
    public WebElement BookAppointment;
    @FindBy(how = How.XPATH,using = "//i[@class=\"fa fa-bars\"]")
    public WebElement Menu;
    @FindBy(how = How.XPATH,using = "//a[text()='History']")
    public WebElement History;





    public TestClass() {
        edriver = new ChromeDriver();
        PageFactory.initElements(edriver, this);
        ewait = new WebDriverWait(edriver, Duration.ofSeconds(5));
    }

    @Before
    public void setup() {
        edriver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
    }

    @Test()
    public void test() throws Exception {
        waitUntilElementVisible(userName);
        userName.sendKeys("John Doe");
        Thread.sleep(1500);
        password.sendKeys("ThisIsNotAPassword");
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











    }

    public void waitUntilElementVisible(WebElement element) {
        int tryTimes = 0;
        while (tryTimes < 2) {
            try {
                ewait.until(ExpectedConditions.visibilityOf(element));
                break;
            } catch (StaleElementReferenceException se) {
                tryTimes++;
                if (tryTimes == 2)
                    throw se;
            }
        }
    }

    public void waitUntilElementVisible(String path) throws Exception {
        int tryTimes = 0;
        while (tryTimes < 2) {
            try {
                WebElement element = edriver.findElement(By.xpath(path));
                ewait.until(ExpectedConditions.visibilityOf(element));
                break;
            } catch (StaleElementReferenceException se) {
                tryTimes++;
                if (tryTimes == 2)
                    throw se;
            }
        }
    }
}

