package day03_Driver_Methotlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver03_Methotlar_Manage {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //?  driver.manage().window().maximize(); =>Browseri tam sayfa maximize eder.
        //?  driver.manage().window().minimize(); => Browseri minimize olarak simge durumuna küçültür.
        //? driver.manage().window().fullscreen();=>Browserimizi fullScreen yapmaya yarar.(F11)
        //? driver.manage().window().getPosition();=>Browserimizin koordinatlarını  String olarak verir.
        //? driver.manage().window().getSize();=> içerisinde bulunduğumuz browserın ölçülerini verir.
        //? driver.manage().window().setPosition(new Point()); =Browserımız ekranda istediğimiz yere getirmemizi sağlar


        driver.get("https://www.amazon.com");

        /*driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.manage().window().minimize();
        Thread.sleep(4000);
        driver.manage().window().fullscreen();*/
        Thread.sleep(4000);
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        Thread.sleep(4000);
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());
        Thread.sleep(4000);
        driver.manage().window().setPosition(new Point(250,450));
        Thread.sleep(4000);
        System.out.println("driver.manage().window().SetPosition() = " + driver.manage().window().getPosition());
        Thread.sleep(4000);
        driver.manage().window().setSize(new Dimension(400,400));
        Thread.sleep(4000);
        System.out.println("driver.manage().armutdow().SetSize() = " + driver.manage().window().getSize());

        Thread.sleep(4000);
        driver.close();
    }
}
