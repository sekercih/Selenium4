package day03_Driver_Methotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver04_Methotlar_Manage_Ornek {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //! 7 dk başaldı

       // *1 "https://guidersoft.com/" sayfasına gidelim
        driver.get("https://guidersoft.com/");
      //  * 2 pozition 80,12 olarak ayarlayalım, ve konsola yazdıralım
        driver.manage().window().setPosition(new Point(80,12));
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        //  * 3 sayfa ölçülerini 580,990 olarak uyarlıyalım,ve konsola yazdıralım
        driver.manage().window().setSize(new Dimension(580,990));
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());
        //  * 4 sayfayı kapatalım
        Thread.sleep(4000);
        driver.close();

    }
}
