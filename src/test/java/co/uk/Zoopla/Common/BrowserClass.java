package co.uk.Zoopla.Common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserClass extends DriverLib
{
    private WebDriver initChrome()//method for drivers
    {
        WebDriverManager.chromiumdriver().setup();
        return new ChromeDriver();
    }
    private WebDriver initheadlessChrome() //headless means you will not see the browser run
    {
        WebDriverManager.chromiumdriver().setup(); //sets up chromedriver
        ChromeOptions Options=new ChromeOptions(); //creating new instance of chromeOptions
        Options.addArguments("--disable-gpu","--headless");//addArguments(method of ChromeOptions)
        return new ChromeDriver();
    }
    private WebDriver initFirefox()
    {
        WebDriverManager.firefoxdriver().setup(); //sets up chromedriver
        ChromeOptions Options=new ChromeOptions(); //creating new instance of chromeOptions
        Options.addArguments("--disable-gpu","--headless");//addArguments(method of ChromeOptions)
        return new ChromeDriver();

    }
}
