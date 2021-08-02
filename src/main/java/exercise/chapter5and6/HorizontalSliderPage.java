package exercise.chapter5and6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By slider = By.cssSelector(".sliderContainer > input");
    private By result = By.cssSelector(".sliderContainer > span");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSlider(){
        driver.findElement(slider).click();
    }

    public void setSliderValue(String value){
        while (!getResult().equals(value)){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }
}
