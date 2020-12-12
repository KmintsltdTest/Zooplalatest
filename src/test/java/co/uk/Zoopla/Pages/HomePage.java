package co.uk.Zoopla.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage //HomePage inherits BasePage
{
    public HomePage(WebDriver driver) //Constructor to parse driver
    {
        this.driver=driver;
    }

    @FindBy(id="search-input-location")//this finds Webelement (searchField)from the webpage(zoopla to enter location)
    private WebElement searchField; //this refers to the webelement for the searchfield
    public void enterLocation(String Location) //method to key "Location" into the (searchfield) "The required location "
    {
        searchField.clear();//this clears any pre text
        searchField.sendKeys(Location);//this sends the location into the searchField text box.
    }
}
