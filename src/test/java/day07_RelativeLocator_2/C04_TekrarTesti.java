package day07_RelativeLocator_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_TekrarTesti {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //? https://www.google.com/ adresine gidin
        driver.navigate().to("https://www.google.com/");
        //?Sayfa basliginin “Google” ifadesi icerdigini test edin
        if (driver.getTitle().contains("Google")) {
            System.out.println("Başlık Google içeriyor PASS");
        } else {
            System.out.println("Başlık Google içermiyor FAİLED");
        }
        //?Arama cubuguna “Nutella” yazip aratin
        driver.findElement(By.name("q")).sendKeys("Nutella", Keys.ENTER);
        //?Bulunan sonuc sayisini yazdirin
        WebElement sonucYazisi = driver.findElement(By.id("result-stats"));
        String sonucSayi = sonucYazisi.getText();
        System.out.println("sonucSayi = " + sonucSayi);
        String toplamSonuc[] = sonucSayi.split(" ");
        String gercekSayi = toplamSonuc[1];
        System.out.println("gercekSayi = " + gercekSayi);
        String noktasiSayi=gercekSayi.replace(".","");
        int sayi= Integer.parseInt(noktasiSayi);
        System.out.println("sayi = " + sayi);

         //?sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        if (sayi>10000000){
            System.out.println("TEST PASS");
        }else{
            System.out.println("TEST FAİLED");
        }
        //?Sayfayi kapatin
        Thread.sleep(6000);
        driver.close();

    }
}
