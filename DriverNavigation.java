import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigation {
    
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.chrome.driver",
        "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64");

        //Get URL
    
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        //Login

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);


        //Home Page-Add to cart

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(2000);

        //CLick Cart button

        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(2000);

        //navigate back to Home page

        driver.navigate().back();
        Thread.sleep(2000);

        //Home page again to add another item

        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);



        //Close the browser

        Thread.sleep(2000);
        driver.close();

    }
}
