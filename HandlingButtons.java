import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingButtons {
    
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();

        System.setProperty("Webdriver.chrome.driver",
        "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64");


       //Giving Url
     driver.get("https://www.saucedemo.com/");
     driver.manage().window().maximize();
     Thread.sleep(1000);

     //Login
     
     driver.findElement(By.id("user-name")).sendKeys("standard_user");
     driver.findElement(By.id("password")).sendKeys("secret_sauce");

     driver.findElement(By.id("login-button")).click();

     //get the coordinates of button

     WebElement ele = driver.findElement(By.cssSelector(".btn_inventory"));


     Point point= ele.getLocation();
     int x=  point.getX();
     int y=  point.getY();
     System.out.println(x);
     System.out.println(y);

     //get thre color of text

     WebElement btn = driver.findElement(By.cssSelector(".btn_inventory"));
     
     String color = btn.getCssValue("color");
System.out.println(color);



        //Close
        Thread.sleep(2000);
        driver.close();

    }

}
