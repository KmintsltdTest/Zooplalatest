package co.uk.Zoopla.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage //HomePage inherits BasePage
{
    public HomePage(WebDriver driver) //Constructor to parse driver
    {

        this.driver=driver;//initialises the driver
        PageFactory.initElements(driver,this);//this enables us to use this "driver"anywhere in the project
    }

    @FindBy(id="search-input-location")//this finds Webelement (searchField)from the webpage(zoopla to enter location)
    private WebElement searchField; //this refers to the webelement for the searchfield
    @FindBy(id="forsale_price_min")//this finds Webelement (minPrice)from the webpage(zoopla to enter location)
    private WebElement minPrice; //this refers to the webelement for the searchfield
    @FindBy(id="forsale_price_max")//this finds Webelement (minPrice)from the webpage(zoopla to enter location)
    private WebElement maxPrice; //this refers to the webelement for the searchfield
    @FindBy(id="property_type")//this finds Webelement (Property)from the webpage(zoopla to enter location)
    private WebElement PropertyType; //this refers to the webelement for the Property
    @FindBy(id="beds_min")//this finds Webelement (Property)from the webpage(zoopla to enter location)
    private WebElement noOfBeds; //this refers to the webelement for the Property
    @FindBy(css=".button.button--primary")//this finds Webelement (Property)from the webpage(zoopla to enter location)
    private WebElement submitButton; //this refers to the webelement for the Property

    public void enterLocation(String Location) //method to key "Location" into the (searchfield) "The required location "
    {
        searchField.clear();//this clears any pre text
        searchField.sendKeys(Location);//this sends the location into the searchField text box.
    }
    public void selectMinimumPrice(String miniPrice) //method to select "minimumPrice" into the (minimumPrice) "The required location "
    {
       selectElementByVisibleText(minPrice,miniPrice);
    }
    public void selectMaximumPrice(String maxiPrice) //method to select "maximumPrice" into the (searchfield) "The required location "
    {
        selectElementByVisibleText(maxPrice,maxiPrice);
    }

    public void selectPropertyType(String property) //method to select "maximumPrice" into the (searchfield) "The required location "
    {
        selectElementByVisibleText(PropertyType,property);
    }
    public void selectNumberOfBeds(String Beds)
    {
        selectElementByVisibleText(noOfBeds,Beds);
    }

    public SearchResultPage clickOnSubmitButton() //method clicks on submitbutton and return searchResultPage "The required location "
    {
        submitButton.click();//
        return new SearchResultPage(HomePage.driver);
    }
}
