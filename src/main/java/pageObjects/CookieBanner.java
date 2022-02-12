package pageObjects;

import functionLibrary.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CookieBanner {

    public CookieBanner(WebDriver browser)
    {
        PageFactory.initElements(browser, this);
    }

    @FindBy(xpath="")
    public WebElement cookieHeading;

    @FindBy(xpath="")
    public WebElement cookieText;

    @FindBy(xpath="")
    public WebElement manageCookiesBtn;

    @FindBy(xpath="//button[@data-test='allow-all']")
    public WebElement acceptCookiesBtn;

    public  void verifyCookieHeading(String expectedCookieHeading)
    {
        Assert.assertEquals(expectedCookieHeading, cookieHeading.getText());
    }

    public void verifyCookieText(String expectedCookieText)
    {
        Assert.assertEquals(expectedCookieText, cookieText.getText());
    }

    public void clickManageCookiesBtn()
    {
        manageCookiesBtn.click();
    }

    public void clickAcceptCookiesBtn()
    {
        CommonFunctions.waitAndClick(acceptCookiesBtn);
    }

}
