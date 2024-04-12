package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChromeDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "D:\\JAVA\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationtesting.co.uk");
    }
}
