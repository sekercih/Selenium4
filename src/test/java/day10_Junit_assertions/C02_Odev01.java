package day10_Junit_assertions;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Odev01 {
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

   static WebDriver driver;


    @BeforeClass
  public static   void testSetup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.navigate().to("https://www.amazon.com/");
       WebElement arama= driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
              System.out.println("Driver çalışmaya başladı.");


    }

    @Test
 public  void Nutella(){
        WebElement arama= driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        arama.sendKeys("nutella",Keys.ENTER);
        if (driver.getTitle().contains("google")){
            System.out.println("Test PASSED - Title'da 'nutella' var.");
        }else{
            System.out.println("Test FAILED - Title'da 'nutella' yok.");
        }
    }

    @Test
    public  void Java(){

        WebElement arama= driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        arama.clear();
      arama.sendKeys("Java", Keys.ENTER);
        if (driver.getTitle().contains("java")){
            System.out.println("Test PASSED - Title'da 'java' var.");
        }else{
            System.out.println("Test FAILED - Title'da 'java' yok.");
        }
    }

    @Test
    public  void Ali(){

        WebElement arama= driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        arama.clear();
        arama.sendKeys("ali",Keys.ENTER);

        if (driver.getTitle().contains("ali")){
            System.out.println("Test PASSED - Title'da 'ali' var.");
        }else{
            System.out.println("Test FAILED - Title'da 'ali' yok.");
        }
    }

    @AfterClass
    public static void  testClose(){
      driver.close();
        System.out.println("Driver kapatıldı.");
    }

}