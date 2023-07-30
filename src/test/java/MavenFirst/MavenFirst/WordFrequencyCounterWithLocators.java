package MavenFirst.MavenFirst;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WordFrequencyCounterWithLocators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://boostmedia.in/"); // Replace with the URL of the webpage you want to analyze        

        String wordToFind = "Boostmedia"; // Replace with the word you want to count

        List<WebElement> d= driver.findElements(By.tagName("a"));
        
        int count = d.size();       
        

        

        driver.quit();
    }    
}
