package day04_Webelements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_Locators {
    public static void main(String[] args) throws InterruptedException {
        //*Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //*http://a.testaddressbook.com adresine gidiniz.
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://a.testaddressbook.com/");

        WebElement advands=driver.findElement(By.id("details-button"));
        advands.click();
        WebElement proceed=driver.findElement(By.id("proceed-link"));
       proceed.click();

        //*Sign in butonuna basin
        WebElement signIn=driver.findElement(By.id("sign-in"));
        signIn.click();
        //*email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement email=driver.findElement(By.name("session[email]"));
        WebElement password=driver.findElement(By.id("session_password"));
        WebElement sign=driver.findElement(By.name("commit"));
        //*Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        email.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        sign.click();
        //*Username :testtechproed@gmail.com
        //*Password : Test1234!
        //*Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        String expected="testtechproed@gmail.com";
        String actual=driver.findElement(By.className("navbar-text")).getText();
if (expected.equals(actual)){
    System.out.println("Test Pass");
    System.out.println("actual = " + actual);
}else{
    System.out.println("Tst FAİLED");
    System.out.println("actual = " + actual);
}

        //*“Addresses” ve “Sign Out” textlerinin göruntulendiğini( displayed) doğrulayin(verify).
WebElement adres=driver.findElement(By.linkText("Addresses"));
WebElement out=driver.findElement(By.linkText("Sign out"));

if (adres.isDisplayed()){
    System.out.println("Test PASSS adres");
}else {
    System.out.println("Test FAİLED element görüntülenmedi.");
}
if (out.isDisplayed()){
    System.out.println("Test PASSS out");
}else {
    System.out.println("Test FAİLED element görüntülenmedi.");
}

        //*Sayfada kac tane link oldugunu bulun.
List<WebElement> tagSayisi=driver.findElements(By.tagName("a"));
        System.out.println("tagSayisi = " + tagSayisi.size());

        Thread.sleep(5000);
        //driver.close();
    }
}
