package day09_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Junit03 {
    WebDriver driver;

    @Test
    public void test01() {
        //amazona gidilsin,title alınsın,doğrulama yapılsın
        driver.get("https://www.amazon.com");
        String title=driver.getTitle();
        String arananTitle="Amazon";

        if (title.contains(arananTitle)){
            System.out.println("Amazon TESTİ PASS");
        }else {
            System.out.println("Amazon TESTİ FAİLED");
        }

    }

    @Test
    public void test02() {
//google gidilsin,title alınsın ,doğrulama yapılsın
        driver.get("https://www.google.com");
        String googleTitle=driver.getTitle();
        String arananTitle="google";

  if (googleTitle.contains(arananTitle)){
            System.out.println("Google TEST PASS");
        }else{
            System.out.println("Google TEST FAİLED");
        }



    }

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        System.out.println("SİSTEM ÇALIŞMAYA BAŞLADI");
    }


    @After
    public void duzelt() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
        System.out.println("SİSTEM ORTALIĞI DÜZELTMEYİ BİTİRDİ");
    }

}

//todo
// amazona gidilsin
// arama butonuna nutella yazılsın
// title nutelle var mı kontrol edilsin
// amazona gidilsin
// arama butonuna java yazılsın
// title da java var mı kontrol edilsin
// amazona gidilsin
// arama butonuna ali yazılsın
// title da ali var mı kontrol edilsin
