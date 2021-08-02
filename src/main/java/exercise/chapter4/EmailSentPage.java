package exercise.chapter4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {
    private WebDriver driver;
    private By statusAlert = By.tagName("h1");

    public EmailSentPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlert(){
        return driver.findElement(statusAlert).getText();
    }
}
