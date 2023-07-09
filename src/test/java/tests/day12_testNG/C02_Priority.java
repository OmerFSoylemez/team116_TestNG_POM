package tests.day12_testNG;

import org.testng.annotations.Test;

public class C02_Priority {

    /*
        JUnit de hangi testin önce çalıştığını ÖNGÖREMEYİZ ve KONTROL EDEMEYİZ
        TestNG testleri natural order'a (harf sırasına)göre çalıştırır

        Eger sıralamayı değiştirmek isterseniz
        test methodlarınında priority atayabilirsiniz

        priority defalt olarak 0 değeriniz alır
        ve var olan priority değerlerine göre küçükten büyüğe doğru çalıştırır.
        Eğer aynı olan priority değeri aynı olan methodlar varsa
        o zaman natural order'a bakar.

     */

    @Test(priority = 3)
    public void amazonTest() {
        System.out.println("Amazon");
    }

    @Test
    public void youtubeTest() {
        System.out.println("YouTube");
    }

    @Test(priority = 1)
    public void wiseTest() {
        System.out.println("Wise");
    }
}
