import functionLibrary.CommonFunctions;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void beforeTest()
    {
        CommonFunctions.openBrowser();
    }

    @After
    public void afterTest()
    {
        CommonFunctions.closeBrowser();
    }
}
