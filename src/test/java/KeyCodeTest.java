import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class KeyCodeTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

         WebDriver driver = new ChromeDriver();

         driver.get("https://qakeycode.ccbp.tech/");
        WebElement inputField = driver.findElement(By.xpath("//input[@id='userInput']"));
        inputField.sendKeys("hello");
        List<WebElement> keyCodeItem = driver.findElements(By.xpath("//li[@class = 'mt-1 keycode-item']"));
        if(keyCodeItem.size() == 5){
            System.out.println("Found Five Key Codes");
        }
        else{
            System.out.println("Mismatch in Key Code Count");
        }
        inputField.sendKeys("world");
        List<WebElement> keyCodeItem1 = driver.findElements(By.xpath("//li[@class = 'mt-1 keycode-item']"));
        if(keyCodeItem1.size() == 10){
            System.out.println("Found Ten Key Codes");
        }
        else{
            System.out.println("Mismatch in Key Code Count");
        }

    }
}
