package day07_RelativeLocator_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_TekrarTesti01 {
    public static void main(String[] args) {
        //1. “https://www.saucedemo.com” Adresine gidin
        //2. Username kutusuna “standard_user” yazdirin
        //3. Password kutusuna “secret_sauce” yazdirin
        //4. Login tusuna basin
        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        //6. Add to Cart butonuna basin
        //7. Alisveris sepetine tiklayin
        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        //9. Sayfayi kapatin






        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //1. “https://www.saucedemo.com” Adresine gidin
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();

        //2. Username kutusuna “standard_user” yazdirin
        WebElement userBox = driver.findElement(By.cssSelector("input[placeholder='Username']"));
        userBox.sendKeys("standard_user");

        //3. Password kutusuna “secret_sauce” yazdirin
        WebElement passBox = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        passBox.sendKeys("secret_sauce");

        //4. Login tusuna basin
        driver.findElement(By.cssSelector("input[type='Submit']")).click();

        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement firstElementName = driver.findElement(By.cssSelector("div[class='inventory_item_name']"));
        System.out.println(firstElementName.getText());
        WebElement firstElementClick = driver.findElement(By.cssSelector("img[alt='Sauce Labs Backpack']"));
        firstElementClick.click();

        //6. Add to Cart butonuna basin
        driver.findElement(By.xpath("//button[@class = 'btn btn_primary btn_small btn_inventory']")).click();
        //7. Alisveris sepetine tiklayin
        driver.findElement(By.xpath("//a[@class = 'shopping_cart_link']")).click();
        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        WebElement firstItemName = driver.findElement(By.xpath("//div[@class = 'inventory_item_name']"));
        String itemName = firstItemName.getText();
        if(firstElementName.equals(itemName)){
            System.out.println("Item name test PASSED");
        }
        System.out.println("Item name test FAILED");
        //9. Sayfayi kapatin
        driver.close();


    }
}
