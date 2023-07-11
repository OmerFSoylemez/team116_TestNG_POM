package tests.day14_testNgFramework_xmlFiles;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_TestNGAssertion {

    @Test
    public void nutellaTesti() {

        // amazon a gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //title ın best içermediğini test edin
        String unExpectedIcerik = "best";
        String actualTitle = Driver.getDriver().getTitle();


        Assert.assertFalse(actualTitle.contains(unExpectedIcerik), "Title da istenmeyen içerik var");


        //url in "https://www.amazon.com/" olduğunu test edin
        String expectedUrl = "https://www.amazon.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl, "Url beklenenden farklı");

        // Nutellla aratın
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        // arama sonuçlarının Nutella içerdiğini test edin
        String expectedIcerik = "Nutella";
        String actulaSonucYazisi = amazonPage.sonucYaziElementi.getText();

        Assert.assertTrue(actulaSonucYazisi.contains(expectedIcerik), "arama sonucu Nutella içermiyor");

    }
}
