package tests.day14_testNgFramework_xmlFiles;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_SoftAssertion {
    @Test(groups = "mini regression1")
    public void nutellaTesti() {

        // amazon a gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

                // 1-soft Assert kulllanmak için obje oluşturmalıyız
                SoftAssert softAssert = new SoftAssert();
                // 2-istediğiniz tüm testleri softassert objesini kullanarak yazın


        // title'ın best içermediğini test edin
        String unexpectedIcerik = "best";
        String actualTitle = Driver.getDriver().getTitle();

        softAssert.assertFalse(actualTitle.contains(unexpectedIcerik),"Title istenmeyen içerik barındırıyor");

        // url'in "https://www.amazon.com/" olduğunu test edin
        String expectedUrl = "https://www.amazon.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        softAssert.assertEquals(actualUrl,expectedUrl, "Url beklenenden farklı");


        // Nutellla aratın
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("NUtella"+ Keys.ENTER);


        // arama sonuçlarının Nutella içerdiğini test edin
        String expectedUrunIcerik = "Nutella";
        String actualSonucYazisi = amazonPage.sonucYaziElementi.getText();
        softAssert.assertTrue(actualSonucYazisi.contains(expectedUrunIcerik), "sonuçlar Nutella içermiyor");

                // 3-Tüm testlerimiz bittiğinde
                // softAssert objesinin not aldığı aldığı hataları raporlayın

        softAssert.assertAll();

        /*
            sortAssert komutu
            yukarıda yapılan tüm testleri raporlar
            ve
            failed olan herhangi bir Assertion varsa
            Assertion Error verip çalışmayı durduur.

            ancak tüm hataları AssertAll satırında verir.
            hataların yerini bulmamız ve düzeltmemiz için
            softassert ile yapılan assertşon larda mutlaka açıklama yazılmalıdır.
         */

        Driver.closeDriver();

    }
}


