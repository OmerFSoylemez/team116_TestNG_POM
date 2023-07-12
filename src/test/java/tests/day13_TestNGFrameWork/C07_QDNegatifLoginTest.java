package tests.day13_TestNGFrameWork;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C07_QDNegatifLoginTest {

    @Test (groups = "smoke")
    public void test01 () {
        // NegativeTest
        // 1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));


        // 2- login linkine basin
        QdPage qdPage = new QdPage();
        qdPage.ilkLoginLinki.click();

        // 3- 3 farkli test method’u olusturun.
        // - gecerli username, gecersiz password
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));


        // - gecersiz username, gecerli password
        //qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        //qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        // - gecersiz username, gecersiz password.
        //qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        //qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));


        // 4- Login butonuna basarak login olun
        qdPage.loginButonu.click();


        // 5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(qdPage.emailKutusu.isDisplayed());

        Driver.closeDriver();



    }
}
