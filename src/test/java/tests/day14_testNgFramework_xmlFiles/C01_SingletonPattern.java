package tests.day14_testNgFramework_xmlFiles;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_SingletonPattern {

    @Test
    public void test01() {

        /*
            Singleton.pattern : bir class dan obje oluşturulmasını engellemek için kulllanılan bir yöntemdir.
            Page object model de Web Driver olarak Driver Class ındaki Web Dribver methodunun kullanılmasını istiyoruz

            Driver class ının farklı kullanılmasını engellemk için
            POM li tasarlayanlar Singleton pattern kullanmışlardır

            Singleton pattern istenen class dan obje oluşturmasını engellemek için
            parametresiz constructor görünür yapıp
            accsees modifier ı prive yaparak
            istenen class dan obje oluşturulmasını engeller.
         */


        // amazon' a gidin

        //Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));


        //driver objemizi prive yapip direk kullanımı engelledik
        //Driver.driver.get(ConfigReader.getProperty("amazonUrl"));

        /*
        Driver driver = new Driver();
        driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        singleton pattern kullanarak
        bu şekilde erişim durduruldu.
         */

    }
}
