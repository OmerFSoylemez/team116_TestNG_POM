package tests.day12_testNG;

import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_TestNGIlkTest {

    @Test
    public void test01() {
        /*
            POM'de driver oluşturmak ve gerekli ayarları yapmak için
            TestBase kıullanmak yerine
            ayrı bir driver class ı içerisinde
            bize driver döndürecek bir method oluşturulması tercih edilmiştir.
         */

        Driver.getDriver().get("https://www.amazon.com");

        ReusableMethods.bekle(3);

        Driver.closeDriver();
    }
    @Test
    public void test02() {

        // youtube anasayfaya gidin
        Driver.getDriver().get("https://www.youtube.com");
        ReusableMethods.bekle(3);
        // git hub

        // url'i yazdırın
        System.out.println(Driver.getDriver().getCurrentUrl());
        ReusableMethods.bekle(3);


        //sayfayi kapatin
        Driver.closeDriver();


    }
}
