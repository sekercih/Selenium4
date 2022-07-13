package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Kullanilan Tool’lar
Java,
Eclipse/IntelliJ,
Selenium,
JUnit/
TestNG,
Cucumber
 Test Yapilan Layer’lar
UI , API , DataBase
         */


        System.setProperty("webdriver.chrome.driver","C:\\Users\\Mehmet\\Desktop\\GuiderSoft Gün Package\\Maven\\src\\driver\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
       Thread.sleep(5000);
        driver.close();

    }
}
