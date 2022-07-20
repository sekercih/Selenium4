package day08_Review_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Tekrar_Testi {
    public static void main(String[] args) {
        // TODO: 7/20/2022
        //* 1. Sayfaya gidiniz http://automationexercise.com
        //* 2. Site logosunu test ediniz
        //* 3.'Signup / Login' button tıklayınız
        //* 4. email adres ve parola giriniz
        //* 5. Click 'login' yapınız
        //* 6. Delete Account yazısını doğrulayınız
        //* 7. Sayfadan 'Logout yapınız
        //* 8. lOGİN SAYFASINA GİDİLDİĞİNİ KONTROL EDİNİZ.
        //* 9. Close driver

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //* 1. Sayfaya gidiniz http://automationexercise.com
        driver.get("http://automationexercise.com");
        //* 2. Site logosunu test ediniz
        WebElement logo=driver.findElement(By.xpath("(//a[@href=\"/\"])[1]"));
        if (logo.isDisplayed()){
            System.out.println("TEST PASS");
        }else {
            System.out.println("TEST FAİLED");
        }
        //* 3.'Signup / Login' button tıklayınız
        driver.findElement(By.xpath("//i[@class=\"fa fa-lock\"]")).click();
        //* 4. email adres ve parola giriniz, guidersoft@merhaba.com,12345
        driver.findElement(By.xpath("//*[@data-qa=\"login-email\"]")).sendKeys(" guidersoft@merhaba.com");
        driver.findElement(By.xpath("//*[@data-qa=\"login-password\"]")).sendKeys("12345");
        //* 5. Click 'login' yapınız
        driver.findElement(By.xpath("//*[@data-qa=\"login-button\"]")).click();
        //* 6. Delete Account yazısını doğrulayınız
        if (driver.findElement(By.xpath("//*[@class=\"fa fa-trash-o\"]")).getText().equals(" Delete Account")){
            System.out.println("TEST PASS");
        }else{
            System.out.println("TEST FAİLED");
        }
        //* 7. Sayfadan 'Logout yapınız
        driver.findElement(By.xpath("//*[@class=\"fa fa-lock\"]")).click();
        //* 8. lOGİN SAYFASINA GİDİLDİĞİNİ KONTROL EDİNİZ.
        if (driver.getCurrentUrl().equals("https://automationexercise.com/login")){
            System.out.println("TEST PASS");
        }else{
            System.out.println("TEST FAİLED");
        }
        //* 9. Close driver

    }
}
