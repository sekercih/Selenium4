package day07_RelativeLocator_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_Tekrar {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //*  1. https://trytestingthis.netlify.app/ sayfasina gidin
        driver.get("https://trytestingthis.netlify.app/");
        //*  2. Kullanıcı adı "test" giriniz
        WebElement username = driver.findElement(By.id("uname"));
        username.sendKeys("test");
        //*  3.  Password olarak "test" giriniz
        WebElement ali = driver.findElement(By.id("pwd"));
        ali.sendKeys("test");
        //password.sendKeys("test");
        //*  4.  Login butonuna tiklayiniz
        driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
        //*  5.  "Login Successful :)" texti gorunur ise Pass yazdırın
        WebElement succes = driver.findElement(By.tagName("h4"));
        if (succes.isDisplayed()) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAİLED");
        }
        //*  6. Textin içindeki "Click here to go back to the home page" !<"here">! tiklayın
        driver.findElement(By.xpath("//a[text()=\"here\"]")).click();
        //*  7.  Ana sayfadaki "This is your layout two" görünürlüğünü test edin.
        if (driver.findElement(By.xpath("(//h2)[2]")).isDisplayed()) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAİLED");
        }

        //*  8.  Tum sayfalari kapatiniz
        driver.quit();
    }
}
