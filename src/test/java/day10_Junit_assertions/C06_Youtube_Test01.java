package day10_Junit_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_Youtube_Test01 {// 1) Bir class oluşturun: YoutubeAssertions
//todo
// 2) https://www.youtube.com adresine gidin
// ○ titleTest   => Sayfa başlığının “YouTube” oldugunu test edin
// imageTest   => YouTube resminin görüntülendiğini (isDisplayed()) test edin
// ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
//      ○ wrongTitleTest  => Sayfa basliginin “youtube” olmadigini dogrulayin

    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.youtube.com/");
        // 2) https://www.youtube.com adresine gidin
    }

    //      ○ titleTest   => Sayfa başlığının “YouTube” oldugunu test edin
    @Test
    public void titleTesti(){
        Assert.assertTrue(driver.getTitle().contains("YouTube"));
    }

    @Test
    public void imageTesti(){
        //      ○ imageTest   => YouTube resminin görüntülendiğini (isDisplayed()) test edin
//Assert.assertTrue(driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])")));
    }

    @Test
    public void searchBoxTesti(){
        //      ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='search']")).isEnabled());
    }
    @Test
    public void wrongTitleTesti(){
        //      ○ wrongTitleTest  => Sayfa basliginin “youtube” olmadigini dogrulayin
        Assert.assertTrue(driver.getTitle().contains("youtube"));
    }

    @After
    public void teardown(){

    }

    //  @AfterClass
    //  public static void teardown(){

}


// 3) Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleri yapin


//      ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
//      ○ wrongTitleTest  => Sayfa basliginin “youtube” olmadigini dogrulayin