package day05_XPath_CssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //*https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //*Add Element butonuna basin
        WebElement addElement=driver.findElement(By.xpath("//button[@onclick=\"addElement()\"]"));
        //! 3 kere add elemente bas..
        addElement.click();
        addElement.click();
        addElement.click();
        //*Delete butonu’nun gorunur oldugunu test edin
     WebElement deleteButton=driver.findElement(By.xpath("//button[@class=\"added-manually\"]"));
     if(deleteButton.isDisplayed()){
         System.out.println("Test PASS Delete görünüyor");
     }else{
         System.out.println("Test FAİLED Delete yazisi görünmüyor");
     }
        //*Delete tusuna basin
        deleteButton.click();
        //*“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addYazisiElementi = driver.findElement(By.xpath("//h3"));
        WebElement addYazisiElementi2 = driver.findElement(By.tagName("h3"));
        if (addYazisiElementi.isDisplayed()) {
            System.out.println("add yazisi  gorunuyor testi PASS");
        } else System.out.println("add yazisi gorunuyor testi FAİLDE");
        driver.close();


    }
}
