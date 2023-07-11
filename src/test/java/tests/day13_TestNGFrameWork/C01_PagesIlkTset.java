package tests.day13_TestNGFrameWork;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_PagesIlkTset {

    @Test
    public void amazonTest() {

        // amazon anasayfaya gidin
        Driver.getDriver().get("https://www.amazon.com");

        // Nutellal için arama yapın
        // Arama kutusuunun locatar'ına ihtiyacımız var
        // Locator larımız artık pages class larda
        // Locator lar static olamdığı için obje oluşturarak kullanabiliriz

        AmazonPage amazonPage = new AmazonPage();

        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);


        // sonuçların Nutella içerdiğini test edin
        String expectedIcerik = "Nutella";
        String actualSonucYazisi = amazonPage.sonucYaziElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

        // Sayfayı kapatın

        ReusableMethods.bekle(5);
        Driver.closeDriver();
    }
}
