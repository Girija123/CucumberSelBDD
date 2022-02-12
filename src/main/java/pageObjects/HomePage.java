package pageObjects;

import functionLibrary.CommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver browser)
    {
        PageFactory.initElements(browser, this);
    }

    @FindBy(xpath = "")
    public WebElement searchTxtFld;

    @FindBy(xpath = "")
    public WebElement searchIcon;

    @FindBy(xpath = "")
    public WebElement signInLink;

    @FindBy(xpath = "")
    public WebElement basketIcon;

    @FindBy(xpath = "")
    public WebElement favouriteIcon;

    //browser.findElement(By.xpath()).click();

    public void enterSearchTerm(String searchTerm)
    {
        searchTxtFld.sendKeys(searchTerm);
    }

    public void clickSearchIcon()
    {
        searchIcon.click();
    }

    public void clickSignInLnk()
    {
        signInLink.click();
    }

    public void clickBasketIcon()
    {
        basketIcon.click();
    }

    public void clickFavouritesIcon()
    {
        favouriteIcon.click();
    }
}
