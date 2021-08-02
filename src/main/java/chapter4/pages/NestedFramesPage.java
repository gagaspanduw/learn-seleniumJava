package chapter4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private By getText = By.xpath("/html/body");

    public NestedFramesPage(WebDriver driver) {
    this.driver = driver;
    }

    public void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    public void switchToLeftFrame(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
    }

    public String getTextLeftFrame(){
        switchToLeftFrame();
        String text = driver.findElement(getText).getText();
        switchToMainArea();
        switchToMainArea();
        return text;
    }

    public String getTextBottomFrame(){
        switchToBottomFrame();
        String text = driver.findElement(getText).getText();
        switchToMainArea();
        return text;
    }

    public void switchToBottomFrame(){
        driver.switchTo().frame(bottomFrame);
    }
}
