package day09_Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//todo
// Öncelikle @Before antosion olan setup() methodu, çalışır
// Daha sonra çalıştırmak istediğimiz testimiz çalışır
// En sonda @After anatosion olan duzelt() methodumuz çalışır.


public class Junit02 {





    @Test
    public void test01() {
        System.out.println("1 .TEST01 ÇALIŞTI");
//amazona git

    }

    @Test
    public void test02() {
        System.out.println("2. TEST02 ÇALIŞTI");
    }

    @Before
    public void setup() {
        System.out.println("SİSTEM ÇALIŞMAYA BAŞLADI");
    }
@After
    public void duzelt() {
        System.out.println("SİSTEM ORTALIĞI DÜZELTMEYİ BİTİRDİ");
    }

}
