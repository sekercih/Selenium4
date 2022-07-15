package day04_Webelements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01__Examples {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //*Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.navigate().to("https://www.youtube.com");

        String actualTitle=driver.getTitle();
        String expectedTitle="youtube";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Test PASS");
        }else {
            System.out.println("Test FAİLED");
            System.out.println("actualTitle = " + actualTitle);
        }

        //*Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
       String actualUrl= driver.getCurrentUrl();
        String expectedUrl="youtube";

        if (actualUrl.contains(expectedUrl)){
            System.out.println("Test PASS");
            System.out.println("expectedUrl = " + expectedUrl);
        }else {
            System.out.println("Test FAİLD");
            System.out.println("expectedUrl = " + expectedUrl);
        }

        //*Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");

        //*Youtube sayfasina geri donun
        driver.navigate().back();
        //*Sayfayi yenileyin
        driver.navigate().refresh();
        //*Amazon sayfasina donun
        driver.navigate().forward();
        //*Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
        //*Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.
        if (driver.getTitle().contains("Amazon")){
            System.out.println("Test PASS");
        }else{
            System.out.println("Test FAİLED");
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }

        //*Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru,URL'yi yazdırın
        String actualURLAmazon=driver.getCurrentUrl();
        String expectedUrlAmazon="https://www.amazon.com/";

        if (expectedUrlAmazon.equals(actualURLAmazon)){
            System.out.println("Test PASS");
        }else{
            System.out.println("Test FAİLED");
            System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        }

        //*Sayfayi  kapatin

        Thread.sleep(4000);
        driver.close();
    }
}
