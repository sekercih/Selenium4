package day04_Webelements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Webelement_Get_Methot {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //* a. http://a.testaddressbook.com adresine gidiniz.
        //driver.get("http://a.testaddressbook.com");

        /*
        WebElement advands=driver.findElement(By.id("details-button"));
        advands.click();
        WebElement proceed=driver.findElement(By.id("proceed-link"));
        proceed.click();*/

        /*
        // *b.  signIn linkini locate edelim
        WebElement signin=driver.findElement(By.id("sign-in"));

        System.out.println("signin = " + signin.getText()); //* Buton üzerindeki yazıyı aldık.
        System.out.println("signin.getAriaRole() = " + signin.getAriaRole()); //* butonun özelliğini örneğin lik..
        System.out.println("signin.getAttribute() = " + signin.getAttribute("id"));
        System.out.println("signin.getTagName() = " + signin.getTagName()); //* WebElementimizin Tag ini verir
        System.out.println("signin.getRect().height = " + signin.getRect().height); //* Web Elementimizin buton yüksekliği
        System.out.println("signin.getRect().height = " + signin.getRect().width);//* Webelmentimizin genişliğini verir.
        System.out.println("signin.getCssValue() = " + signin.getCssValue("color")); //* Webwlwmwntimizin yazı rengini verir */

        driver.get("http://edabit.com/");
     WebElement signin=driver.findElement(By.tagName("a"));

        System.out.println("signin = " + signin.getText()); //* Buton üzerindeki yazıyı aldık.
        System.out.println("signin.getAttribute() = " + signin.getAttribute("tagname"));
        System.out.println("signin.getRect().height = " + signin.getRect().height); //* Web Elementimizin buton yüksekliği
        System.out.println("signin.getRect().height = " + signin.getRect().width);//* Webelmentimizin genişliğini verir.
        System.out.println("signin.getCssValue() = " + signin.getCssValue("color")); //* Webwlwmwntimizin yazı rengini verir */

        //!WebElement Is Method’lari
        //? webElement.isEnable( ); Web Element erisilebilir ise true yoksa false doner
        System.out.println("signin.isEnabled() = " + signin.isEnabled());
        //? webElement.isDisplayed( ); Web Element gorunur ise true yoksa false doner
        System.out.println("signin.isDisplayed() = " + signin.isDisplayed());
        //? webElement.isSelected( ); Web Element secili ise true yoksa false doner
        System.out.println("signin.isSelected() = " + signin.isSelected());

    }
}
