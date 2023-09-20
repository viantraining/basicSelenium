package com.basicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicSelenium {
    public static void main(String[] args) throws Exception {
        //this is a test for Chrome Browser
        System.out.println("Hello, World!, I am Vivian");
       // System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\SELENIUM\\drivers");
        WebDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://www.google.com");
        System.out.println("*********Browser Title: GOOGLE*******"+ chromeDriver.getTitle());
        Thread.sleep(1000);
        chromeDriver.quit();

        //this is a test for FireFox Browser
        System.out.println("Hello, World!, I am Vivian");
        //**System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\SELENIUM\\drivers");
        WebDriver firefoxDriver=new FirefoxDriver();
        firefoxDriver.get("https://www.google.com");
        System.out.println("*********Browser Title: FIREFOX*******"+ firefoxDriver.getTitle());
        Thread.sleep(1000);
        firefoxDriver.quit();

        //this is a test for Edge Browser
        System.out.println("Hello, World!, I am Vivian");
        //**System.setProperty("webdriver.chrorme.driver", "C:\\AUTOMATION\\SELENIUM\\drivers");
        WebDriver edgeDriver=new EdgeDriver();
        edgeDriver.get("https://www.google.com");
        System.out.println("*********Browser Title: EDGE*******"+ edgeDriver.getTitle());
        Thread.sleep(1000);
        edgeDriver.quit();

       }
}

