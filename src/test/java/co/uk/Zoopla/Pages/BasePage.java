package co.uk.Zoopla.Pages;
import co.uk.Zoopla.Common.DriverLib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverLib //extends Driverlib Class , this holds class that can be shared among the project
{
    String URL="https://www.Zoopla.co.uk";
    public Select select; // to enable us use select class methods.
    public String BASE_URL=(URL);
    public void LaunchUrl()
    {
        driver.navigate().to (BASE_URL);
    }
    public void selectElementByVisibleText(WebElement element, String text)
    {
        Select select=new Select(element);
        select.selectByVisibleText(text);//parse the text to select
    }
    public void selectElementByValue(WebElement element, String Value)
    {
        Select select=new Select(element);
        select.selectByValue(Value);//parse the value to select
    }
    public void selectElementByIndex(WebElement element,int Index)
    {
        Select select=new Select(element);
        select.selectByIndex(Index);//parse the Index to select
    }

}
