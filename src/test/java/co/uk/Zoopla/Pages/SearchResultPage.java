package co.uk.Zoopla.Pages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import java.util.Random;

import static java.io.Console.*;

public class SearchResultPage extends BasePage
{
    public SearchResultPage(WebDriver driver)
    {
        super();
    }
    public void searchResultPage(WebDriver driver)
    {
        this.driver = driver; //driver had been passed around into this class
        PageFactory.initElements(driver, this);//
    }
    @FindBy(tagName = "hi")//Find using tahName "h1! is the only "h1" in this new page
    private WebElement tittle;
    @FindBy(css=".Listing-result-price.text-price")
    private List<WebElement> results;
    public void isSearchResultDisplayed(String propertyType,String Location)
    {
      String tittleText=tittle.getText();
      Assert.assertTrue(tittleText.contains(propertyType));
      Assert.assertTrue(tittleText.contains(Location));
    }
    public void isResultListDisplayed()
    {
        Assert.assertTrue(results.size()>0);
    }
    public ProductDetailsPage clickOnAnyResultsLink()
    {
        //results.get(5).click();//this pics on 5th image as requested here
        Random random=new Random();//this means to pick any result from the max available result no.
        int result=random.nextInt(results.size()-1);//pick any from displayed results from 0-maximum number because java counts
        //from 0 to make sure we pick on a valid result we say -1 so then it become human way of counting.
        results.get(result).click();// this then clicks on the selected result option.
        return new ProductDetailsPage(driver);
    }
}
