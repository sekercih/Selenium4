package day09_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Junit04_01 {
    static WebDriver driver;
    static WebElement aramaKutusu;
    static WebElement sonucYazisiElementi;
    @Test
    public void test01(){
        //! 1 amazon sayfasinda nutella icin arama yapip sonuc yazisinin nutella icerdigini test edelim
        aramaKutusu.sendKeys("nutella"+ Keys.ENTER);
        sonucYazisiElementi=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String actualSonucYazisi= sonucYazisiElementi.getText();
        String arananKelime="nutella";
        if (actualSonucYazisi.contains(arananKelime)){
            System.out.println("Nutella testi PASSED");
        }else {
            System.out.println("Nutella testi FAILED");
        }
    }
    @Test
    public void test02(){
        //! 1. amazon sayfasinda java icin arama yapip sonuc yazisinin java icerdigini test edelim
        aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.clear();
        aramaKutusu.sendKeys("java"+ Keys.ENTER);
        sonucYazisiElementi=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String actualSonucYazisi= sonucYazisiElementi.getText();
        String arananKelime="java";
        if (actualSonucYazisi.contains(arananKelime)){
            System.out.println("Java testi PASSED");
        }else {
            System.out.println("Java testi FAILED");
        }
    }
    @Test
    public void test03(){
        //! 2 amazon sayfasinda ali icin arama yapip sonuc yazisinin ali icerdigini test edelim
        aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.clear();
        aramaKutusu.sendKeys("ali"+ Keys.ENTER);
        sonucYazisiElementi=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String actualSonucYazisi= sonucYazisiElementi.getText();
        String arananKelime="ali";
        if (actualSonucYazisi.contains(arananKelime)){
            System.out.println("ali testi PASSED");
        }else {
            System.out.println("ali testi FAILED");
        }
    }

    @BeforeClass
    public static void ayarlariDuzenle(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        aramaKutusu=driver. findElement(By.id("twotabsearchtextbox"));
    }
    @AfterClass
    public static void ortaligiTopla(){
        driver.close();
    }
}