package day10_Junit_assertions;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_BestBuyAssertion {
    //todo
    // https://www.bestbuy.com/ A dresine gidin farkli test method’lari olusturarak asagidaki testleri yapin
    // ○Sayfa URL’inin https://www.bestbuy.com/ com/‘a esit oldugunu test edin
    // ○titleTest => Sayfa başlığının “ Rest” içer me diğini(contains) test edin
    // ○logoTest => BestBuy logosunun görüntülendigini test edin
    // ○Francais LinkTest => Fransizca Linkin görüntüle n diğini test edin
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void bestBuyTest() {
        driver.get("https://www.bestbuy.com/");
        String actualUrl=driver.getCurrentUrl();
       // System.out.println("actualUrl = " + actualUrl);
        String expectedUrl="https://www.bestbuy.com/";
/*
        if (expectedUrl.equals(actualUrl)){
             System.out.println("TEST PASS");
        }else {
            System.out.println("TEST FAİLED");
        }*/
        Assert.assertEquals(expectedUrl,actualUrl);

String arananKelime="Rest";
String actualTitle=driver.getTitle();
Assert.assertFalse(actualTitle.contains(arananKelime));

        WebElement logo=driver.findElement(By.xpath("(//img[@alt=\"Best Buy Logo\"])[1]"));
        Assert.assertTrue("logo görünmedi",logo.isDisplayed());

        WebElement fransa=driver.findElement(By.xpath("//button[@lang=\"fr\"]"));
        Assert.assertTrue(fransa.isDisplayed());

    }
@After
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
      //  driver.close();
}
}

