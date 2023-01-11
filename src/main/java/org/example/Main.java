package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe"); // path of chromedriver
        //opening chrome and then eprocurement page
       ChromeDriver driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
       //driver.get("https://www.google.com/");

       //maximizing browser
        driver.manage().window().maximize();
        // Launching website
        driver.get("https://eproc.cgstate.gov.in/CHEPS/security/getSignInAction.do");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        List<WebElement> element=driver.findElements(By.className("epsAdvSearchBtn"));
        WebElement requiredElement=element.get(1);
        requiredElement.click();
        WebElement capthaElement=driver.findElement(By.name("rfqSearchViewForm"));
        WebElement capthaCode=capthaElement.findElement(By.tagName("i"));
        String captha= capthaCode.getText();
        WebElement element1=driver.findElement(By.name("inputCaptchaValue"));
        element1.sendKeys(captha);
        WebElement submitCapcha=driver.findElement(By.className("epsSubmit"));
        submitCapcha.click();


    }
}