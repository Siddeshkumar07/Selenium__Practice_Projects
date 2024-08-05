import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginwithScreenshot {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver",
         "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64");

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //Login Page
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);

        //Home Page
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(1000);

        //Screenshot
        File Save=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File Store= new File("C:\\Users\\User\\Desktop\\Java\\Selenium projects\\Screenshots\\img.png");
        FileHandler.copy(Save, Store);
       

        //Cart Page
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(1000);
        //Screenshot
        File Save1=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File Store1= new File("C:\\Users\\User\\Desktop\\Java\\Selenium projects\\Screenshots\\img1.png");
        FileHandler.copy(Save1, Store1);

        //Checkoutpage
        driver.findElement(By.name("checkout")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("first-name")).sendKeys("Siddesh");
        Thread.sleep(1000);
        driver.findElement(By.id("last-name")).sendKeys("Kumar");
        Thread.sleep(1000);
        driver.findElement(By.id("postal-code")).sendKeys("627805");
        Thread.sleep(1000);

        //Screenshot
        File Save2=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File Store2= new File("C:\\Users\\User\\Desktop\\Java\\Selenium projects\\Screenshots\\img2.png");
        FileHandler.copy(Save2, Store2);

        driver.findElement(By.id("continue")).click();
        Thread.sleep(1000);
        

        //FInal Page
        driver.findElement(By.id("finish")).click();
        Thread.sleep(1000);
        //Screenshot
        File Save3=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File Store3= new File("C:\\Users\\User\\Desktop\\Java\\Selenium projects\\Screenshots\\img3.png");
        FileHandler.copy(Save3, Store3);
        driver.findElement(By.id("back-to-products")).click();

        Thread.sleep(5000);
        driver.close();
    }
}