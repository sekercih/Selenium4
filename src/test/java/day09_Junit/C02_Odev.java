package day09_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_Odev {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        //todo
        // 1- https://www.amazon.com/ sayfasina gidelim
        // 2- arama kutusunu locate edelim
        // 3- “iphone ” ile arama yapalim
        // 4 - Bulunan sonuc sayisini yazdiralim
        // 5- Ilk urunu tiklayalim
        // 6- Bir onceki sayfaya donup,sayfadaki tum basliklari  yazdiralim
        // 7 3. sayfaya kadar yazdıralım.
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //* 1- https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com/");
        //* 2- arama kutusunu locate edelim
        WebElement arama = driver.findElement(By.id("twotabsearchtextbox"));
        // 3- “iphone aratalım” ile arama yapalim
        arama.sendKeys("iphone", Keys.ENTER);
        // 4 - Bulunan sonuc sayisini yazdiralim
        WebElement sonuc = driver.findElement(By.xpath("(//div[@class=\"sg-col-inner\"])[1]"));
        System.out.println("sonuc = " + sonuc.getText());
        //* 5- Ilk urunu tiklayalim
        driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]")).click();
        WebElement urun = driver.findElement(By.id("productTitle"));
        System.out.println("urun.getText() = " + urun.getText());
        // 6- Bir onceki sayfaya donup,sayfadaki tum basliklari  yazdiralim
        driver.navigate().back();
        WebElement next = driver.findElement(By.xpath("//*[*=\"Next\"]"));
        basliklar();
        next.click();
        // 7 3. sayfaya kadar yazdıralım.
        basliklar();
        Thread.sleep(10000);
        next.click();
       basliklar();

    }

    public static void basliklar() {
        List<WebElement> baslik = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
        for (WebElement basliklar : baslik) {
            System.out.println("basliklar.getText() = " + basliklar.getText());
        }
    }

}
