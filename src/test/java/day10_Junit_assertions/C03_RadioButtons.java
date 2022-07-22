package day10_Junit_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_RadioButtons {
    //todo
    // //https://www.facebook.com adresine gidin
    // //-“Create an Account” button’una basin
    //  //-“radio buttons” elementlerini locate edin
    //  //Secili degilse cinsiyet butonundan size uygun olani secin
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @Test
    public void testFacebokk() throws InterruptedException {
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
         WebElement male= driver.findElement(By.xpath("//input[@value=\"2\"]"));
         Thread.sleep(3000);

         if (!male.isSelected())
             male.click();
    }
    @After
    public void tearDown(){
        driver.close();
    }
}
