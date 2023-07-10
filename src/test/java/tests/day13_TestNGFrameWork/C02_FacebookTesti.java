package tests.day13_TestNGFrameWork;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C02_FacebookTesti {

    @Test
    public void facebookTesti () {

        //  https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");


        //  2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
        //  3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin

        Faker faker= new Faker();
        FacebookPage facebookPage = new FacebookPage();

        facebookPage.emailKutuElementi.sendKeys(faker.internet().emailAddress());
        facebookPage.passwordKutuElementi.sendKeys(faker.internet().password());

        facebookPage.girisYapButonu.click();

        //  4- Basarili giris yapilamadigini test edin

        Assert.assertTrue(facebookPage.basarisizGirisYaziElementi.isDisplayed());

        Driver.closeDriver();



    }
}
