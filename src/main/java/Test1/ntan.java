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

public class ntan {
    public WebDriver edriver;

    public WebDriverWait ewait;
    @FindBy(how = How.XPATH, using = "//input[@id='txt-username']")
    public WebElement userName;
    @FindBy(how = How.XPATH, using = "//input[@id='txt-password']")
    public WebElement password;
    @FindBy(how = How.XPATH, using = "//button[@id='btn-login']")
    public WebElement login;
    @FindBy(how = How.XPATH, using = "//a[@id='menu-toggle']")
    public WebElement menu;
    @FindBy(how = How.XPATH, using = "//a[text()='Home']")
    public WebElement btnHome;
    @FindBy(how = How.XPATH, using = "//a[@id='menu-toggle']")
    public WebElement menu2;
    @FindBy(how = How.XPATH, using = "//a[text()='History']")
    public WebElement History;
    @FindBy(how = How.XPATH, using = "//a[@id='menu-toggle']")
    public WebElement menu3;
    @FindBy(how = How.XPATH, using = "//a[text()='Profile']")
    public WebElement Profile;
    @FindBy(how = How.XPATH, using = "//a[@id='menu-toggle']")
    public WebElement menu4;
    @FindBy(how = How.XPATH, using = "//a[text()='Logout']")
    public WebElement Logout;
    @FindBy(how = How.XPATH, using = "//a[@class=\"btn btn-default\"]")
    public WebElement BtnLogout;







    public ntan(){
        edriver = new ChromeDriver();
        PageFactory.initElements(edriver, this);
        ewait = new WebDriverWait(edriver, Duration.ofSeconds(5));
    }
    @Before
    public void setup(){
        edriver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
    }

    @Test()
    public void test() throws Exception {
        waitUntilElementVisible(userName);
        Thread.sleep(1000);

        userName.sendKeys("John Doe");
        Thread.sleep(1000);

        password.sendKeys("ThisIsNotAPassword");
        Thread.sleep(1000);

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
