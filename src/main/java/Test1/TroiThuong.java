package Test1;

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

public class TroiThuong {
    public WebDriverWait ewait;
    public WebDriver edriver;

    @FindBy(how = How.XPATH, using = "//input[@id='txt-username']")
    public WebElement username;
    @FindBy(how = How.XPATH, using = "//input[@id='txt-password']")
    public WebElement password;
    @FindBy(how = How.XPATH, using = "//button[@id='btn-login']")
    public WebElement login;
    @FindBy(how = How.XPATH, using = "//select[@id='combo_facility']")
    public WebElement select;
    @FindBy(how = How.XPATH, using = "//option[@value='Hongkong CURA Healthcare Center']")
    public WebElement tick;
    @FindBy(how = How.XPATH, using = "//input[@id='chk_hospotal_readmission']")
    public WebElement checkbox;
    @FindBy(how = How.XPATH, using = "//input[@id='radio_program_none']")
    public WebElement radiobox;
    @FindBy(how = How.XPATH, using = "//input[@type=\"text\"]")
    public WebElement inputdate;
    @FindBy(how = How.XPATH, using = "//textarea[@class=\"form-control\"]")
    public WebElement inputcmt;
    @FindBy(how = How.XPATH, using = "//button[@type=\"submit\"]")
    public WebElement book;
    @FindBy(how = How.XPATH, using = "//label[@for=\"facility\"]")
    public WebElement print1;
    @FindBy(how = How.XPATH, using = "//label[@for=\"hospital_readmission\"]")
    public WebElement print2;
    @FindBy(how = How.XPATH, using = "//label[@for=\"program\"]")
    public WebElement print3;
    @FindBy(how = How.XPATH, using = "//label[@for=\"visit_date\"]")
    public WebElement print4;
    @FindBy(how = How.XPATH, using = "//label[@for=\"comment\"]")
    public WebElement print5;
    @FindBy(how = How.XPATH, using = "//i[@class=\"fa fa-bars\"]")
    public WebElement btnMenu;
    @FindBy(how = How.XPATH, using = "//a[text()='History']")
    public WebElement btnHistory;
    @FindBy(how = How.XPATH, using = "//div[@class=\"panel-heading\"]")
    public WebElement printlb1;
    @FindBy(how = How.XPATH, using = "//p[@id=\"facility\"]")
    public WebElement printlb2;
    @FindBy(how = How.XPATH, using = "//p[@id=\"hospital_readmission\"]")
    public WebElement printlb3;
    @FindBy(how = How.XPATH, using = "//p[@id=\"program\"]")
    //sai clearfix
    public WebElement printlb4;
    @FindBy(how = How.XPATH, using = "//label[@for=\"comment\"]")
    public WebElement printlb5;
    @FindBy(how = How.XPATH, using = "//p[@id=\"comment\"]")
    public WebElement printlb6;
    @FindBy(how = How.XPATH, using = "//a[text()=\"Profile\"]")
    public WebElement btnProfile;
    @FindBy(how = How.XPATH, using = "//a[@class=\"btn btn-default\"]")
    public WebElement btnLogout;
    public TroiThuong(){
        edriver = new ChromeDriver();
        PageFactory.initElements(edriver,this);
        ewait = new WebDriverWait(edriver, Duration.ofSeconds(5));
    }
    @Before
    public void setUp(){
        edriver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
    }
    @Test
    public void test() throws Exception{
        waitUntilElementVisible( username);
        username.sendKeys("John Doe");
        Thread.sleep(1000);
        password.sendKeys("ThisIsNotAPassword");
        Thread.sleep(1000);
        login.click();
        Thread.sleep(1000);
        select.click();
        Thread.sleep(1000);
        tick.click();
        checkbox.click();
        radiobox.click();
        inputdate.sendKeys("23/06/2023");
        Thread.sleep(1000);
        inputcmt.sendKeys("Thằng cu Nhật Tân với con bé Chiel");
        Thread.sleep(1000);
        book.click();
        System.out.println(print1.getText());
        System.out.println(print2.getText());
        System.out.println(print3.getText());
        System.out.println(print4.getText());
        System.out.println(print5.getText());
        btnMenu.click();
        Thread.sleep(1000);
        btnHistory.click();
        Thread.sleep(1000);
        System.out.println(printlb1.getText());
        System.out.println(print1.getText());
        System.out.println(printlb2.getText());
        System.out.println(print2.getText());
        System.out.println(printlb3.getText());
        System.out.println(print3.getText());
        System.out.println(printlb4.getText());
        System.out.println(printlb5.getText());
        System.out.println(printlb6.getText());
        btnMenu.click();
        Thread.sleep(1000);
        btnProfile.click();
        Thread.sleep(1000);
        btnLogout.click();
//        edriver.quit();
    }

    public void waitUntilElementVisible(WebElement element){
        int tryTimes = 0;
        while (tryTimes < 2){
            try {
                ewait.until(ExpectedConditions.visibilityOf(element));
                break;
            }
            catch (StaleElementReferenceException se){
                tryTimes ++;
                if (tryTimes == 2)
                    throw se;
            }
        }
    }

    public void waitUntilElementVisible(String path) throws Exception{
        int tryTimes = 0;
        while (tryTimes < 2){
            try {
                WebElement element = edriver.findElement(By.xpath(path));
                ewait.until(ExpectedConditions.visibilityOf(element));
                break;
            }
            catch (StaleElementReferenceException se){
                tryTimes ++;
                if (tryTimes == 2)
                    throw se;
            }
        }
    }
}
