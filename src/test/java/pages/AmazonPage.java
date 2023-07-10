package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage() {
        // baska package daki classların bu constranter ı kullanabilmeleri için
        // access modifier ını   public yapalım

        // bu page class ından locate kullanacak tum classlar
        // amazon page class ından obje oluşturmalı
        // obje oluşturmak içiçnde mutlaka bu cons. çalışıcak
        // o zaman bu class da webDriver ımızı tanımlama işini
        // bu cons içinde yapabiliriz

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "twotabsearchtexbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//h1[@class='a-size-base s-desktop-toolbar a-text-normal']")
    public WebElement sonucYaziElementi;

}
