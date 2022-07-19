package day07_RelativeLocator_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03Tekrar_Testi01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //http://zero.webappsecurity.com sayfasina gidin
        //Signin buttonuna tiklayin
        //Login alanine “username” yazdirin
        //Password alanine “password” yazdirin
        //Sign in buttonuna tiklayin
        //Pay Bills sayfasina gidin
        //amount kismina yatirmak istediginiz herhangi bir miktari yazin
        //tarih kismina “2022-07-19” yazdirin
        //Pay buttonuna tiklayin
        //“The payment was successfully submitted.” mesajinin ciktigini control edin
        // 1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
        //2. Signin buttonuna tiklayin
        driver.findElement(By.id("signin_button")).click();
        //3. Login alanine  “username” yazdirin
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");
        //4. Password alanine “password” yazdirin
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
        //5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        driver.get("http://zero.webappsecurity.com");
        //6. Önce Online Banking sonra Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
        driver.findElement(By.id("pay_bills_link")).click();
        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        driver.findElement(By.id("sp_amount")).sendKeys("1000");
        //8. tarih kismina “2020-09-10” yazdirin
        driver.findElement(By.id("sp_date")).sendKeys("2022-07-19");
        //9. Pay buttonuna tiklayin
        driver.findElement(By.id("pay_saved_payees")).click();
        //10. “The payment was successfully submitted.” mesajinin ciktigini control edin
        WebElement basariliYazisielementi=driver.findElement(By.id("alert_content"));

        if (basariliYazisielementi.isDisplayed()){
            System.out.println("Test PASSED");
        }else {
            System.out.println("test FAILED");
    }
}}
