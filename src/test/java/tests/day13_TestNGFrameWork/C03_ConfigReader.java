package tests.day13_TestNGFrameWork;

import org.testng.annotations.Test;
import utilities.ConfigReader;

public class C03_ConfigReader {

    @Test
    public void Test01() {

        System.out.println(ConfigReader.getProperty("amazonUrl"));

        System.out.println(ConfigReader.getProperty("wiseurl"));

        //key yanlış yazılırsa,ConfigReader'daki properties objesi
        // yanlış yazılan key'i bulamaz ve null döner.

        System.out.println(ConfigReader.getProperty("kullaniciAdiAhmet"));

        System.out.println(ConfigReader.getProperty("password"));
    }
}
