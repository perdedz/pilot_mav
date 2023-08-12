package co.edurekatraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.time.Duration;

public class Assignment2 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivani Singh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.rediff.com");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void testAssignment() {
        WebElement moneyElementClass = driver.findElement(By.cssSelector(LocatorsRepository.MONEY_ELEMENT_CLASS));
        WebElement moneyElementXPath = driver.findElement(By.xpath(LocatorsRepository.MONEY_ELEMENT_XPATH));
        WebElement moneyElementCss = driver.findElement(By.cssSelector(LocatorsRepository.MONEY_ELEMENT_CSS));

        List<WebElement> textBoxes = driver.findElements(By.cssSelector(LocatorsRepository.TEXTBOXES_CSS));
        for (WebElement textBox : textBoxes) {
            System.out.println(textBox.getAttribute("name")); // Get the name of each text box.
        }

        WebElement rediffMailElement = driver.findElement(By.xpath(LocatorsRepository.REDIFFMAIL_ELEMENT_XPATH));
        WebElement shoppingElement = driver.findElement(By.cssSelector(LocatorsRepository.SHOPPING_ELEMENT_CSS));
        WebElement videoElement = driver.findElement(By.cssSelector(LocatorsRepository.VIDEO_ELEMENT_CSS));
        WebElement businessemailElement = driver.findElement(By.cssSelector(LocatorsRepository.BUSINESSEMAIL_ELEMENT_CSS));
        WebElement createanaccountElement = driver.findElement(By.cssSelector(LocatorsRepository.CREATEANACCOUNT_ELEMENT_CSS));

        // Wait until the "Sign in" link is clickable
        WebElement signInLink = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(LocatorsRepository.SIGNIN_LINK_CSS)));
        signInLink.click();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

class LocatorsRepository {
    public static final String MONEY_ELEMENT_CLASS = ".moneyicon.relative";
    public static final String MONEY_ELEMENT_XPATH = "//a[text()='Money']";
    public static final String MONEY_ELEMENT_CSS = "body > div.logobar > div > div.cell.topicons > a.moneyicon.relative";
    public static final String TEXTBOXES_CSS = "input[type='text']";
    public static final String REDIFFMAIL_ELEMENT_XPATH = "/html/body/div[2]/div/div[2]/a[1]";
    public static final String SHOPPING_ELEMENT_CSS = "body > div.logobar > div > div.cell.topicons > a.shopicon.relative";
    public static final String VIDEO_ELEMENT_CSS = "body > div.logobar > div > div.cell.topicons > a.vdicon";
    public static final String BUSINESSEMAIL_ELEMENT_CSS = "body > div.logobar > div > div.cell.topicons > a.bmailicon.relative";
    public static final String CREATEANACCOUNT_ELEMENT_CSS = "#signin_info > a:nth-child(3)";
    public static final String SIGNIN_LINK_CSS = "#signin_info > a.signin";
}

