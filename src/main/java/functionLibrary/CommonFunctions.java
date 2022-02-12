package functionLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonFunctions {

    public static WebDriver browser;
    public static String screenShotFilePath = new File("src/main/resources/screenShots").getAbsolutePath();
    public static String configFilePath = new File("src/main/resources/testData/config.properties").getAbsolutePath();

    public static void openBrowser() {
        WebDriverManager.chromedriver().setup();
        browser = new ChromeDriver();
    }

    public static void closeBrowser() {
        browser.quit();
    }

    public static void waitForTime(int waitTime) {
        browser.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
    }

    public static void waitForElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(browser, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitAndClick(WebElement element) {
        WebDriverWait wait = new WebDriverWait(browser, 10);
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }

    public static void JSClick(WebElement element) {
        JavascriptExecutor jse = ((JavascriptExecutor) browser);
        jse.executeScript("arguments[0].click();", element);

    }

    public static void scrollBy() {
        JavascriptExecutor jse = ((JavascriptExecutor) browser);
        jse.executeScript("window.scrollBy(0. 750)");
    }

    public static void mouseOver(WebElement element) {
        Actions actions = new Actions(browser);
        actions.moveToElement(element);
    }

    public static void type(WebElement element, String textToType) {
        element.sendKeys(textToType);
    }

    public static void click(WebElement element) {
        element.click();
    }

    public static void selectValueInDropdown(WebElement element, String valueToSelect) {
        new Select(element).selectByVisibleText(valueToSelect);
    }

    public static void takeScreenShot(String pageName) throws IOException {
        TakesScreenshot screenshot = ((TakesScreenshot) browser);
        File virtualFile = screenshot.getScreenshotAs(OutputType.FILE);
        File actualFile = new File(screenShotFilePath + pageName);

        FileUtils.copyFile(virtualFile, actualFile);
    }

    public static String readPropertyFile(String key) throws Exception {
        FileInputStream inputStream = new FileInputStream(configFilePath);
        Properties properties = new Properties();
        properties.load(inputStream);
        String value = properties.getProperty(key);

        return value;
    }


}
