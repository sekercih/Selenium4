package day08_Review_Locator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;
import java.util.List;

public class C03_Tekrar_Testi {
    public static void main(String[] args) {
        //todo
        // 1- https://www.bestbuy.com adresine gidin
        // 2- cookies cikarsa kabul et butonuna basin
        // 3- sayfada kac adet button bulundugunu yazdirin
        // 4- sayfadaki herbir button uzerindeki yazilari yazdirin
        // 5- sayfadaki herbir Bayrak altındaki  yazilari yazdirin
        // 6- sayfadaki Unidet Statesin yerini Realtive locater ile belirleyiniz.

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //* 1- https://www.bestbuy.com adresine gidin
        driver.get("https://www.bestbuy.com");
        //* 2- cookies cikarsa kabul et butonuna basin
        //* 3- sayfada kac adet button bulundugunu yazdirin
        List<WebElement> button= driver.findElements(By.tagName("button"));
        System.out.println("button.size() = " + button.size());
        //* 4- sayfadaki herbir button uzerindeki yazilari yazdirin
        List <WebElement> buttonall=driver.findElements(By.tagName("button"));
        for (WebElement buttonYazi:buttonall) {
            System.out.println("buttonYazi.getText() = " + buttonYazi.getText());

        }
        //* 5- sayfadaki herbir Bayrak altındaki  yazilari yazdirin
        List <WebElement> bayrakYazisi=driver.findElements(By.xpath("(//div[@class=\"country-selection\"])[1]"));
        int count=0;
        for (WebElement bYazi:bayrakYazisi) {
            System.out.println("bYazi.getText() = " + bYazi.getText());
            count++;

        }

        //* 6- sayfadaki Unidet Statesin yerini Realtive locater ile belirleyiniz.
        WebElement canada=driver.findElement(By.xpath("//img[@alt='Canada']"));
        WebElement united=driver.findElement(By.xpath("//img[@alt='United States']"));
        WebElement mexico=driver.findElement(By.xpath("//img[@alt='Mexico']"));
        String unitedStr=united.getAttribute("alt");
        System.out.println("unitedStr = " + unitedStr);

        WebElement unitedStates=driver.
                findElement(RelativeLocator.with(By.tagName("img")).
                        toRightOf(canada).toLeftOf(mexico));
        System.out.println("unitedStates.getAttribute = " +
                unitedStates.getAttribute("alt"));

        if (unitedStr.equals(unitedStates.getAttribute("alt"))){
            System.out.println("TEST PASS");
        }else {
            System.out.println("TEST FAİLED"  );

        }

    }
}
