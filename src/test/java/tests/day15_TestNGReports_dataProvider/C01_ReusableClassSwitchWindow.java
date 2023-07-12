package tests.day15_TestNGReports_dataProvider;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_ReusableClassSwitchWindow {

    @Test
    public void switchWindowTesti() {

        // https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");


        // Click Here butonuna basın.
        Driver.getDriver().findElement(By.xpath("/a[text()='Click Here']"));


        // Acilan yeni pencerenin sayfa başlığının (title) "New Window" oldugunu dogrulayin.
        System.out.println(Driver.getDriver().getTitle());


        // sayfalari kapatin
        Driver.quitDriver();
    }
}
