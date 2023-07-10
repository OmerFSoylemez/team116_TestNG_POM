package tests.day13_TestNGFrameWork;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C06_QDLoginTest {

    @Test
    public void test01() {

        //  1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qualitydemyUrl"));

        //  2- login linkine basin

        //  3- Kullanici email'i olarak valid email girin
        //  4- Kullanici sifresi olarak valid sifre girin
        //  5- Login butonuna basarak login olun
        //  6- Basarili olarak giris yapilabildigini test edin
    }
}
