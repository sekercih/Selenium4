package day05_XPath_CssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Tekrar_Testi {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


//?amazon web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com");
//?Search(ara) “santoku victorinox”
        WebElement santokuArma = driver.findElement(By.id("twotabsearchtextbox"));
        santokuArma.sendKeys("santoku victorinox", Keys.ENTER);
        //santokuArma.sendKeys("santoku victorinox");
        //santokuArma.submit();

//?Amazon'da göruntulenen ilgili sonuçların sayısını yazdırın
        WebElement result=driver.findElement(By.className("sg-col-inner"));
        System.out.println("result.getText() = " + result.getText());

//?Sonra karşınıza çıkan ilk sonucun resmine tıklayın
       // WebElement ilkUrun=driver.findElement(By.tagName("h2"));
        //ilkUrun.click();
// */html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div[1]/span/a/div
        WebElement ilkurun=driver.findElement(By.xpath("//span[@class=\"a-size-base-plus a-color-base a-text-normal\"]"));
        ilkurun.click();
        driver.navigate().to("https://www.google.com");
        WebElement google=driver.findElement(By.xpath("//*[@name=\"q\"]"));
        google.sendKeys("Alkan Tuncer",Keys.ENTER);
    }
}

