package co.uk.Zoopla.stepDefinitions;
import co.uk.Zoopla.Pages.BasePage;
import co.uk.Zoopla.Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ForSaleSearchSteps extends BasePage //this Class inherits the BasePage Class and all its methods
{
    HomePage homePage= PageFactory.initElements(driver,HomePage.class);//instantiating HomepPage(driver,HomePage.Class as inheritance)
    @Given("I navigate to zoopla homepage")
    public void i_navigate_to_zoopla_homepage()
    {
        LaunchUrl();
    }
    @When("I enter a \"<Location>\"in the search textbox")
    public void i_enter_a_location_in_the_search_textbox(String Location)
    {
        homePage.enterLocation(Location);
    }
    @When("I select \"<MinPrice>\"from Min price dropdown")
    public void i_select_min_price_from_min_price_dropdown()
    {
    }
    @When("I select \"<MaxPrice>\"from Max price dropdown")
    public void i_select_max_price_from_max_price_dropdown()
    {
    }
    @When("I select \"<Property>\"from Property type  dropdown")
    public void i_select_property_from_property_type_dropdown()
    {
    }
    @When("I select \"<Bed>\"from Bedrooms dropdown")
    public void i_select_bed_from_bedrooms_dropdown()
    {
    }
    @When("I click on the search button")
    public void i_click_on_the_search_button()
    {
    }
    @Then("a list of {string} in {string} are displayedSc")
    public void a_list_of_in_are_displayed_sc(String string, String string2)
    {
    }
    @Then("application should be closed.")
    public void application_should_be_closed()
    {
    }

}
