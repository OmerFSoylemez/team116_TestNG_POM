package tests.day12_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C03_DependsOnMethods {

    // amazon anasyafaya gisin
    // 3  farklı test methodu oluşturup bu testleri yapın
    // 1- url in amazon içerdiğini test edin
    // 2- Nutella aratıp sonucun Nutella içerdiğini test edin
    // 3- İlk ürüne click yapıp açılan saykfadaki ürün isminin Nutella içerdiğini test edin

    @Test(priority = 1)
    public void urlTest() {
        Driver.getDriver().get("https://www.amazon.com");

        // 1- url in amazon içerdiğini test edin
        String expectedIcerik = "Amazon";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedIcerik));
    }


    @Test(dependsOnMethods = "urlTest")
    public void nutellaAramaTesti() {
        // 2- Nutella aratıp sonucun Nutella içerdiğini test edin
        WebElement aramaKutusu = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        WebElement aramaKutusuElementi = Driver.getDriver().findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));

        String expectedIcerik = "Nutella";
        String actualSonucYazisi = aramaKutusuElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

    }
    @Test(dependsOnMethods = "nutellaAramaTesti")
    public void urunIsimTesti() {
        // 3- İlk ürüne click yapıp açılan sayfadaki ürün isminin Nutella içerdiğini test edin
        Driver.getDriver()
                .findElement(By.xpath("(//div[@class='a-section a-spacing-base'])[1]"))
                .click();
        WebElement urunIsimElementi = Driver.getDriver().findElement(By.xpath("//span[@id='productTitle']"));
        String expectedIcerik = "Nutella";
        String actualUrunIsmi= urunIsimElementi.getText();
        Assert.assertTrue(actualUrunIsmi.contains(expectedIcerik));
        Driver.closeDriver();

    }



}
