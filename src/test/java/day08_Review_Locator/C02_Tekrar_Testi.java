package day08_Review_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Tekrar_Testi {
    //todo
    // 1- https://www.facebook.com adresine gidin
    //  2- cookies cikarsa kabul et butonuna basin
    // 3- e-posta kutusuna rastgele bir mail girin
    // 4- sifre kismina rastgele bir sifre girin
    // 5- giris yap butonuna basin
    // 6- uyari olarak "The email or mobile number you entered isn’t connected to an account.Find your account and log in. “ mesajinin ciktigini test edin
    // 7- sayfayi kapatin
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //* 1- https://www.facebook.com adresine gidin
        driver.get("https://www.facebook.com");

        //* 2- e-posta kutusuna rastgele bir mail girin
        driver.findElement(By.xpath("//input[@*=\"email\"]")).sendKeys("merhabaguidersoft@soft.com");
        //* 3- sifre kismina rastgele bir sifre girin
        driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("12345");
       //* 5- giris yap butonuna basin
        driver.findElement(By.xpath("//button[@name='login']")).click();

        //* 6- uyari olarak "The email or mobile number you entered isn’t connected to an account.Find your account and log in. “ mesajinin ciktigini test edin
        WebElement uyari=driver.findElement(By.className("_9ay7"));
        String expected="The email address you entered isn't connected to an account. ";
        if (uyari.getText().contains(expected)){
            System.out.println( "TEST PASS");
        }else {
            System.out.println("TEST FAİLED");
        }
        System.out.println("uyari.getText() = " + uyari.getText());

        //driver.close();
    }
}
