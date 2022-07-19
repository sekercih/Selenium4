package day07_RelativeLocator_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C01_RelativeLocato {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        // once uzerlerinden tarif yapacagimiz web elemntlerini locate etmeliyiz
        WebElement berlin=driver.findElement(By.id("pid7_thumb"));
        WebElement byArea=driver.findElement(By.id("pid8_thumb"));
        WebElement boston=driver.findElement(By.id("pid6_thumb"));
        WebElement nyc=driver.findElement(By.id("pid3_thumb"));
        // 2 ) Berlin’i  3 farkli relative locator ile locate edin
WebElement berlin1=driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(boston).toLeftOf(byArea));
WebElement berlin2=driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(boston).below(nyc));
WebElement berlin3=driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(byArea).below(nyc));
WebElement berlinX=driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(nyc).above(boston));


        // 3 ) Relative locator’larin dogru calistigini test edin
String expectedBerlin=berlin.getAttribute("id");
String actualBerlin1=berlin1.getAttribute("id");
String actualBerlin2=berlin2.getAttribute("id");
String actualBerlin3=berlin3.getAttribute("id");

        System.out.println("expectedBerlin = " + expectedBerlin);
        System.out.println("actualBerlin1 = " + actualBerlin1);
        System.out.println("actualBerlin2 = " + actualBerlin2);
        System.out.println("actualBerlin3 = " + actualBerlin3);
        System.out.println("berlinX.getAttribute() = " + berlinX.getAttribute("id"));

        if (expectedBerlin.equals(actualBerlin1)){
    System.out.println("1. Relative locate TEST PASS");
}else {
    System.out.println("1. Relative locate FAİLED");
}
if (expectedBerlin.equals(actualBerlin2)){
    System.out.println("2. Relative locate TEST PASS");
}else {
    System.out.println("2. Relative locate TEST FAİLED");

}
if (expectedBerlin.equals(actualBerlin3)){
    System.out.println("3. Relative locate TEST PASS");
}else {
    System.out.println("3. Relative locate TEST FAİLED");
}


driver.close();


    }
}


