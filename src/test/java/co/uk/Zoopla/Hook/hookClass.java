package co.uk.Zoopla.Hook;
import co.uk.Zoopla.Common.BrowserClass;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import org.testng.annotations.Test;

public class hookClass extends BrowserClass //extends browser class
{
    private  String ChromeBrowser="Chrome";
    @Before
    public void setup()
    {
        LaunchBrowser(ChromeBrowser);
    }
    @Test
    public void Test()
    {

    }
    @AfterStep
    public void tearDown() throws InterruptedException
    {
        CloseBrowser(); //closes browser

    }
}
