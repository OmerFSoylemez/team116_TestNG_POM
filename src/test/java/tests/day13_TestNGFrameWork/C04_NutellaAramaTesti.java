package tests.day13_TestNGFrameWork;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_NutellaAramaTesti {

    @Test
    public void Test01() {
        // amazon anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // NUtella için arama yapın
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonArananKelime" + Keys.ENTER));

        // sonuçların Nutella içerdiğini test edin

        String expectedIcerik = ConfigReader.getProperty("amazonArananKelime");
        String actualSonuYazisi = amazonPage.sonucYaziElementi.getText();

        Assert.assertTrue(actualSonuYazisi.contains(expectedIcerik));

        // sayfayı kapatın

        Driver.closeDriver();

    }
}
