package day03_Driver_Methotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver02_Methotlar_Get_Ornek {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //netflix
        driver.get("https://www.netflix.com");
// ! 5 dk veriyorum

//*1 title
        System.out.println("driver.getTitle() = " + driver.getTitle());
//* 2 url
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
//* 3 handle değer
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
//* 4 sayfanın source kodları.
        System.out.println("driver.getPageSource() = " + driver.getPageSource());
//* browser kapatalım.
Thread.sleep(4000);
driver.close();

    }

}
