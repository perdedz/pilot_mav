import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simple {

    public static void main(String[] args) {

        // Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivani Singh\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google home page
        driver.get("https://www.google.com");

        // Print the title of the page to console
        System.out.println("Page title is: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}

