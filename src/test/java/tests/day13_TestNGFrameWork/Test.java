package tests.day13_TestNGFrameWork;

import pages.ZeroPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Test  {

    @org.testng.annotations.Test ()

        public void Test () {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
}
