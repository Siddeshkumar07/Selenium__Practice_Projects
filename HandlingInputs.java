import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingInputs {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64");

       //Open URL
       
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);


        //Input in search textbox using Keyboard

        driver.findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);
        Thread.sleep(2000);
        
        //Append a text in search text box
        driver.findElement(By.name("q")).sendKeys(" Webdriver", Keys.ENTER);

        //clear the text

        driver.findElement(By.name("q")).clear();

        //isENabled 
        boolean display = driver.findElement(By.name("q")).isEnabled();
        System.out.println(display);


       // Quit browser

       Thread.sleep(2000);
       driver.quit();






    }
}
