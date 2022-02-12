package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver browser) {
        PageFactory.initElements(browser, this);
    }

    @FindBy(xpath = "")
    public WebElement usernameTxtFld;

    @FindBy(xpath="")
    public WebElement passwordTxtFld;

    @FindBy(xpath="")
    public WebElement signInBtn;

    public void enterUsername(String username)
    {
        usernameTxtFld.sendKeys(username);
    }

    public void  enterPassword(String password)
    {
        passwordTxtFld.sendKeys(password);
    }

    public void clickLoginBtn()
    {
        signInBtn.click();
    }


}
