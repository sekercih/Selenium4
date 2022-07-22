package day10_Junit_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_BestBuyAssertion_Tekrar {
    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.bestbuy.com/");


    }
    @Test
    public void UrlTest(){

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
    }
    @Test
    public void TitleTest(){
        String arananKelime="Rest";
        String actualTitle=driver.getTitle();
        Assert.assertFalse(actualTitle.contains(arananKelime));
    }
    @Test
    public void LogoTest(){
        WebElement logo=driver.findElement(By.xpath("(//img[@alt=\"Best Buy Logo\"])[1]"));
        Assert.assertTrue("logo görünmedi",logo.isDisplayed());
    }
    @Test
    public void Fransa(){
        WebElement fransa=driver.findElement(By.xpath("//button[@lang=\"fr\"]"));
        Assert.assertTrue(fransa.isDisplayed());
    }
    @AfterClass
    public static void tearDown(){

        driver.close();
    }

}
