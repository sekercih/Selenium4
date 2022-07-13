package day03_Driver_Methotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver06_Methotlar_Navigate01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        // * driver.get() ile aynı işlemi yapar
        Thread.sleep(3000);
        driver.navigate().to("https://guidersoft.com/");
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);



        //! BURADA KALDIK.....
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().refresh();

        driver.quit(); // *close() tek sekmeyi kapatır, ! quit() tamammını kapatır.



    }
}
