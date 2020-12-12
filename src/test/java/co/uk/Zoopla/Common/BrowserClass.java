package co.uk.Zoopla.Common;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.util.concurrent.TimeUnit;

public class BrowserClass extends DriverLib {
    private WebDriver initChrome()//method for drivers
    {
        WebDriverManager.chromiumdriver().setup();
        return new ChromeDriver();
    }

    private WebDriver initheadlessChrome() //headless means you will not see the browser run
    {
        WebDriverManager.chromiumdriver().setup(); //sets up chromedriver
        ChromeOptions Options = new ChromeOptions(); //creating new instance of chromeOptions
        Options.addArguments("--disable-gpu", "--headless");//addArguments(method of ChromeOptions)
        return new ChromeDriver(Options);
    }

    private WebDriver initFirefox() {
        WebDriverManager.firefoxdriver().setup(); //sets up chromedriver
        return new FirefoxDriver();
    }

    private WebDriver initHeadlessFirefox() {
        WebDriverManager.firefoxdriver().setup(); //sets up Firefoxdriver
        FirefoxOptions Options = new FirefoxOptions(); //creating new instance of chromeOptions
        Options.addArguments("--disable-gpu", "--headless");//addArguments(method of ChromeOptions)
        return new FirefoxDriver(Options);
    }

    private WebDriver initInternetExplore() {
        WebDriverManager.iedriver().setup(); //sets up IEdriver
        return new InternetExplorerDriver();
    }

    public void LaunchBrowser(String browser)//method to access various methods for various browsers created up
    {  //also called in hooksclass
        switch (browser)// switch operational control used here to make selection for diff browsers possible.
        {
            case "Chrome":
                driver = initChrome();
                break;
            case "HeadlessChrome":
                driver = initheadlessChrome();
                break;
            case "Firefox":
                driver = initFirefox();
                break;
            case "HeadlessFirefox":
                driver = initHeadlessFirefox();
                break;
            case "Internet Explore":
            case "ie":
            case "internetExplorer":
                driver = initInternetExplore();
                break;
            default: //means if non of the above is called or any problem this browser should open webpage
                driver = initheadlessChrome();
        }
        driver.manage().window().maximize(); // this maximizes the opened web page
        driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
    }

    public void CloseBrowser()throws InterruptedException // called  in hookclass
    {
        driver.manage().deleteAllCookies(); //deletes all browsers first
        Thread.sleep(5000);
        driver.quit(); //quits browser
    }

}
