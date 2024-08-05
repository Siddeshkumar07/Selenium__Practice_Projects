import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TypesOfscreenshot {

public static void main(String[] args) throws InterruptedException, IOException {
    WebDriver driver = new ChromeDriver();
    System.setProperty("webdriver.chrome.driver",
     "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64");


     //Giving Url
     driver.get("https://www.saucedemo.com/");
     driver.manage().window().maximize();
     Thread.sleep(1000);

     //Login
     
     driver.findElement(By.id("user-name")).sendKeys("standard_user");
     driver.findElement(By.id("password")).sendKeys("secret_sauce");

     driver.findElement(By.id("login-button")).click();

     //Page Screenshot

     File Page= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
     File Save= new File("C:\\Users\\User\\Desktop\\Java\\Selenium projects\\Screenshots\\home.png");
     FileHandler.copy(Page,Save);
     
        //Home Page
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(1000);

        //Cart Page
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(1000);

        //Section Screenshot

     WebElement Section = driver.findElement(By.className("cart_list"));
     File Save1= Section.getScreenshotAs(OutputType.FILE);
     File Store1= new File("C:\\Users\\User\\Desktop\\Java\\Selenium projects\\Screenshots\\cart.png");
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


        driver.findElement(By.id("continue")).click();
        Thread.sleep(1000);
        

        //Final Page
        driver.findElement(By.id("finish")).click();
        Thread.sleep(1000);
        
           //Element Screenshot

     WebElement element = driver.findElement(By.className("complete-text"));
     File Save2= element.getScreenshotAs(OutputType.FILE);
     File Store2= new File("C:\\Users\\User\\Desktop\\Java\\Selenium projects\\Screenshots\\final.png");
     FileHandler.copy(Save2, Store2);


        //close the tab
     Thread.sleep(3000);
     driver.quit();

  


     

}

}
