package day09_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Tekrar_Testi {
    public static void main(String[] args) {
        //todo
        // 1. “https://www.saucedemo.com” Adresine gidin
        // 2. Username kutusuna “standard_user” yazdirin+
        // 3. Password kutusuna “secret_sauce” yazdirin
        // 4 . Login tusuna basin
        // 5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        // 6. Add to Cart butonuna basin
        // 7. Alisveris sepetine tiklayin
        // 8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        // 9. Sayfayi kapatin
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //todo
        // 1. “https://www.saucedemo.com” Adresine gidin

        driver.get("https://www.saucedemo.com");
        // 2. Username kutusuna “standard_user” yazdirin+
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        // 3. Password kutusuna “secret_sauce” yazdirin
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        // 4 . Login tusuna basin
        driver.findElement(By.id("login-button")).click();
        // 5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement ilkurun=driver.findElement(By.id("item_4_title_link"));

        System.out.println("ilkurun.getText() = " + ilkurun.getText());
        String urun=ilkurun.getText();
        ilkurun.click();
        // 6. Add to Cart butonuna basin
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        // 7. Alisveris sepetine tiklayin
        driver.findElement(By.id("shopping_cart_container")).click();
        // 8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        WebElement sepetUrun=driver.findElement(By.id("item_4_title_link"));
        String sepetUrunstr=sepetUrun.getText();

        if (urun.equals(sepetUrunstr)){
            System.out.println("TEST PASS");
        }else {
            System.out.println("TEST FAİLED");
        }

        // 9. Sayfayi kapatin
        driver.close();
    }
}
