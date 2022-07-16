package day05_XPath_CssSelector;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Odev {
    public static void main(String[] args) {
        //*  1.  https://id.heroku.com/login sayfasina gidin
        //  * 2.  Bir mail adersi giriniz
        //*   3.  Bir password giriniz
        //*   4.  Login butonuna tiklayiniz
        // *  5.  "There was a problem with your login." texti gorunur ise
        // *   6.  "kayit yapilamadi" yazdiriniz
        //*   8.  eger yazi gorunur degilse "kayit yapildi" yazdiriniz
        // *  9.  Tum sayfalari kapatiniz
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        //*  1. https://trytestingthis.netlify.app/ sayfasina gidin
        driver.get("https://trytestingthis.netlify.app/");
        //  * 2. Kullanıcı adı "test" giriniz
        WebElement usurName=driver.findElement(By.xpath("//*[@name='uname']"));
        usurName.sendKeys("test");
        //*   3.  Password olarak "test" giriniz
        WebElement passWord=driver.findElement(By.xpath("//*[@id='pwd']"));
        passWord.sendKeys("test");
        //*   4.  Login butonuna tiklayiniz
        driver.findElement(By.xpath("//*[@value='Login']")).click();
        // *  5.  "Login Successful :)" texti gorunur ise Pass yazdırın
        WebElement succes=driver.findElement(By.xpath("//h2"));
        if (succes.isDisplayed()){
            System.out.println("succes göründü Test PASS= " + succes.getText());
        }else{
            System.out.println("Test FAİLED");
        }
        // *   6. Textin içindeki "Click here to go back to the home page" !<"here">! tiklayın
        driver.findElement(By.xpath("(//a)[3]")).click();
        //*   8.  Ana sayfadaki "This is your layout two" görünürlüğünü test edin.
        WebElement twoIs=driver.findElement(By.xpath("//h2[text()='This is your layout two']"));
        if (twoIs.isDisplayed()){
            System.out.println("twoIs görünüyor Test PASS = " + twoIs.getText());
        }else {
            System.out.println("Test FAİLED");
        }

        // *  9.  Tum sayfalari kapatiniz
        driver.close();

    }

}
