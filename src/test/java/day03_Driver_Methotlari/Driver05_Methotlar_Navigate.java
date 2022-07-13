package day03_Driver_Methotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver05_Methotlar_Navigate {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
//!   driver.navigate().to() ; => driver.get ile aynı işi yapar.



       // driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(4000);
        driver.navigate().to("https://www.netflix.com");
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);

        driver.close();



    }
}
