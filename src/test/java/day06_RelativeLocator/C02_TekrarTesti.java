package day06_RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_TekrarTesti {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //*https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");
        //*Browseri tam sayfa yapin
        driver.manage().window().maximize();
        //*Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //*Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String title=driver.getTitle();
        if (title.contains("Spend less")){
            System.out.println("TEST PASS");
        }else {
            System.out.println("TEST FAİLED");
        }
        //*Gift Cards sekmesine basin
        driver.findElement(By.xpath("//a[text()=\"Gift Cards\"]")).click();
        //*Birthday butonuna basin
driver.findElement(By.xpath("//img[@alt=\"Birthday gift cards\"]")).click();
        //*Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//img[@alt=\"Amazon.com eGift Card\"])[1]")).click();
        //*Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("//button[@value=\"25\"]")).click();

        //*Urun ucretinin 25$ oldugunu test edin
        WebElement test25=driver.findElement(By.xpath("//span[@class=\"a-color-price a-text-bold\"]"));
        String testText=test25.getText();

        System.out.println("testText = " + testText);

        if (testText.equals("25")){
            System.out.println("TEST PASS '25 dolar");
        }else {
            System.out.println("TEST FAİLED");
        }
        //*Sayfayi kapatin

    }
}
