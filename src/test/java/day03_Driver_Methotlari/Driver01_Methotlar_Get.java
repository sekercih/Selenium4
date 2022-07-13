package day03_Driver_Methotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver01_Methotlar_Get {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();
        /*
        * driver.get("https://www.youtube.com")=>istediğimiz web sitesine gitmeye yarar.
        * driver.getTitle()=>İçinde olunan sayfanın başlık bilgisini String olarak bize veriyor.
        * driver.getCurrentUrl()=>İçinde bulunduğumuz sayfanın URL ni String olarak bize verir.
        * driver.getPageSource()=>içinde bulundumuz sayfanın kaynak kodlarını bize verir.
        * driver.getWindowHandle()=>İçinde bulunduğumuz sayfanın tc numarasını bize verir
        * driver.getWindowHandles()=>içinde nulunduğumuz handle değerlerini  bize verir.
        * driver.close()=> içinde bulunduğumuz browserı kapatacaktır.
        * driver.quit()=> içinde bulunduğumuz browserların hepsini kapatır.
        *
         */
        driver.get("https://www.paypal.com");
        driver.get("https://www.amazon.com");

        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
       //! System.out.println("driver.getPageSource() = " + driver.getPageSource());
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle()); //CDwindow-E7EACD8D66D4C7C29031DC31256EC370
//                                                                                      CDwindow-EEDF94050C93F0CFE98C89AB1D73630C
        System.out.println("driver.getWindowHandles() = " + driver.getWindowHandles());
        Thread.sleep(4000);  //!Bir bekleme işlemidir örnekteki gibi 4 sn bekler.
        driver.close();
       //* driver.quit();




    }
}
