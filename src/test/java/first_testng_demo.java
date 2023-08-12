
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class first_testng_demo {

    WebDriver driver;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivani Singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        // Start browser in full-screen mode
        options.addArguments("--start-fullscreen");

        // Start browser in incognito mode
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
    }

    @Test
    public void googleSearch() {
        driver.get("https://testpages.herokuapp.com/styled/attributes-test.html");
        WebElement one = driver.findElement(By.xpath("/html/body/div/div[4]/button"));
        one.click();
        WebElement two = driver.findElement(By.xpath("/html/body/div/div[1]/a"));
        two.click();
        WebElement three = driver.findElement(By.xpath("//*[@id=\"fileuploadtest\"]"));
        three.click();
        WebElement four = driver.findElement(By.xpath("//*[@id=\"fileinput\"]"));
        four.sendKeys("C:\\Users\\Shivani Singh\\Documents\\YOUTUBE_2023\\March\\4.jpg");
        WebElement five = driver.findElement(By.id("itsanimage"));
        five.click();
        WebElement six = driver.findElement(By.xpath("/html/body/div/div[3]/form/div[3]/input"));
        six.click();
        WebElement seven = driver.findElement(By.className("explanation"));
        String actualMessage = seven.getText();
        Assert.assertEquals(actualMessage,"You uploaded a file. This is the result.", "Text Not found");
        // e.g., locate elements, perform actions, make assertions, etc.
    }

    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
