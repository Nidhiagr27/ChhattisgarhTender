package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {

        //opening chrome and then eprocurement page
       ChromeDriver driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
       //driver.get("https://www.google.com/");

       //maximizing browser
        driver.manage().window().maximize();
        // Launching website
        driver.get("https://eproc.cgstate.gov.in/CHEPS/security/getSignInAction.do");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement element=driver.findElement(By.name("Advanced Search"));
        element.click();
    }
}