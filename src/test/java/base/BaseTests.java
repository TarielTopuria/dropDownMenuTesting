package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class BaseTests {
    protected HomePage homePage;
    WebDriver chromeDriver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromeDriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(chromeDriver);
    }

    @After
    public void quitDriver(){
        chromeDriver.quit();
    }
}
