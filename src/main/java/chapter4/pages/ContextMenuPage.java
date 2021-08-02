package chapter4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ContextMenuPage {
    private WebDriver driver;
    private By clickField = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void rightClick(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(clickField)).perform();
    }

    public String alertGetText(){
        return driver.switchTo().alert().getText();
    }

    public void alertAccept(){
        driver.switchTo().alert().accept();
    }
}
