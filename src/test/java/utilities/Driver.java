package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    public static WebDriver driver;
    public static WebDriver getDriver() {

        /*
            Bundan sonra daha önce driver olarak TestBase den alıp kulllandığımız
            WebDriver ın yerine

            Driver class ından getDriver methodunu kullanacğız
            ancak mahşerin dört atlısında kullandığımız

            driver = new ChromeDriver();

            problem oluşturuyor,çünkü her çalıştığında yeniden CromeDriver oluşturuyor.

            Bizim istediğimiz şu:

            ben testimi çalıştırmaya başladığımda
            ilk kez bu method u kullanınca CromeDriver oluştursun
            Sonraki kulllanımlarda oluşturmasın

            bunun için driver == null kontrol edip
            ona göre yeni ChromeDriver ataması yapıyoruz

         */

        WebDriverManager.chromedriver().setup();

        if(driver==null){
            driver=new ChromeDriver();
        }

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;

    }

    public static void closeDriver() {
        if(driver != null){
            driver.close();
            driver = null;
        }


    }
}
