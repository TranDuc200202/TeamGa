package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.time.Duration;

public class WebDriverWait {
    public WebDriverWait(ChromeDriver driver, Duration duration) {
    }

    public void until(ExpectedCondition<WebElement> webElementExpectedCondition) {
    }
}
