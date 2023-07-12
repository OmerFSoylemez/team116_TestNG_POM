package tests.day15_TestNGReports_dataProvider;

import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C04_DataProviderNegatifLoginTesti extends TestBaseRapor {

    @DataProvider
    public static Object[][] kullaniciListesi() {

        String [][] kullaniciIsimSifreleri = {{"Sevda","12345"},{"Murat0","23456"},{"Ilknur","65432"}};

        return kullaniciIsimSifreleri;
    }

    @Test(dataProvider = "kullaniciListesi")
    public void cokluNegatifLoginTesti (String kullanıcıAdi, String password) {
        extentTest = extentReports.createTest("Data Provider","Çoklu negatif login testi");

        // Qualitydemy anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        extentTest.info("Kullanici qualitydemy anasayfaya gider");


        // Lİste olarak verilen kullanıcı adi ve şifreleri ile
        // giriş yapılamadığını test edin
        QdPage qdPage = new QdPage();

        // ilk login linkine tıklayın
        qdPage.loginButonu.click();


        // kullanıcı adi ve şifresini yazip giriş yapmayı deneyin
        qdPage.emailKutusu.sendKeys("kullaniciAdi");
        qdPage.passwordKutusu.sendKeys("password");
        qdPage.loginButonu.click();
        extentTest.info("verilen "+kullanıcıAdi+" ve şifreyi yazıp login butonuna basar");


        // giriş yapılmadığını test edin
        Assert.assertTrue(qdPage.emailKutusu.isDisplayed());
        extentTest.pass("giriş yapılamadığını test eder");

        // sayfayı kapatın
        Driver.closeDriver();
        extentTest.info("Sayfayı kapatır");

    }
}
