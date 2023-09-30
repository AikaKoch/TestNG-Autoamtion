package utilities;

import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;

    public static WebDriver setDriver(String browser) {

        //private static String browserType = Config.getValues("browser");
        // static WebDriver getDriver() {

        if (driver == null) {
            if (browser.equals("chrome")) {
                driver = new ChromeDriver();
            } else if (browser.equals("safari")) {
                driver = new SafariDriver();
            } else if (browser.equals("firefox")) {
                driver = new FirefoxDriver();
            } else {
                driver = new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(12));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
            return driver;
        } else {
            return driver;
        }
    }
}










