package tests.day15_TestNGReports_dataProvider;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C02_RaporluNutellaTesti extends TestBaseRapor {

    @Test
    public void raporluTest () {

        extentTest = extentReports.createTest("Raporlu Nutella Arama" , "Kullanıcı Amazonda Nutella Arayabilmeli");

        //amazon a gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("Kullanıcı amazon anasayfaya gider");

        // Nutella için arama yapın
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        extentTest.info("Kullanıcı Nutella için arama yapar");

        // sonuçların NUtella içerdiğini test edin

        String expectedIcerik = "Nutella";
        String actulaSonucYazisi = amazonPage.sonucYaziElementi.getText();

        Assert.assertTrue(actulaSonucYazisi.contains(expectedIcerik));
        extentTest.pass("Sonuclarin Nutella içerdiğini test eder");

        // sayfayı kapatın
        Driver.quitDriver();


    }
}
