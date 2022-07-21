package day09_Junit;

import org.junit.Test;

public class Junit01 {
    //todo
    // 1 Java ile en temel framework JUNit ile oluşturulabilir.
    // 2 Developerlar da unit testleri çaliştirmak için kullanır.,
    // 3 Biz testlerimizi yapmak icin JUnit'in ileri surumu olduğundan TestNG framework oluşturup kullanacagiz.
    // 4 Junit maven projesi uzerinde calistigindan https://mvnrepository.com/ sitesinden dependency’leri projemize ekleriz.
    // 5 Test’lerimizi yaparken main method, if-else gibi java kod bloklarini kullanmak yerine Junit annotationlarini ve method’larine kullanabiliriz.
    // @Test @BeforeClass, @AfterClass ,@Before , @After,@Ignore

    @Test
    public void method01(){
         System.out.println("1 . METHOD ÇALIŞTI");
//amazona git


     }
     @Test
     public void method2(){
         System.out.println("2. METHOD ÇALIŞTI");
     }

}
