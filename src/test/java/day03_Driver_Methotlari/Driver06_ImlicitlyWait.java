package day03_Driver_Methotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver06_ImlicitlyWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //* // implicitly wait testimiz boyunca soyfo acilmasi ve element bulunmasi konusundo driver'in
        // * bekleyecegi maximum sureyi belirler.
        // *Bu sure icerisinde gorevini bitirir bitirmez, bir sonraki adima gecer
        // *Bu sure icerisinde gorevini bitiremezse o zaman hata verir
        // *Belirlenen maximum sure Thread.sleep'deki gibi mutlak beklene suresi degildir
        //! 13. ve 14. satırları kalıpla beraber yazacağız.

        driver.get("https://www.guidersoft.com");

      //  Thread.sleep(10000);
        driver.close();
    }
}
