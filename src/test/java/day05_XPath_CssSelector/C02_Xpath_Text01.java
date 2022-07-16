package day05_XPath_CssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath_Text01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButtonu = driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButtonu.isDisplayed()) {
            System.out.println("delet butonu gorunuyor testi PASS");
        } else System.out.println("delet butonu gorunuyor testi FAİLDE");
        //4- Delete tusuna basin
        deleteButtonu.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addYazisiElementi = driver.findElement(By.xpath("//h3"));
        WebElement addYazisiElementi2 = driver.findElement(By.tagName("h3"));
        if (addYazisiElementi.isDisplayed()) {
            System.out.println("add yazisi  gorunuyor testi PASS");
        } else System.out.println("add yazisi gorunuyor testi FAİLDE");
        driver.close();
    }
}
