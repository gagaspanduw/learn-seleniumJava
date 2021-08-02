package exercise.chapter5and6.slider;

import exercise.chapter5and6.base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HorizontalSlidetTests extends BaseTests {

    @Test
    public void HorizontalSliderTests(){
        var horizontalSliderTests = homePage.clickHorizontalSlider();
        horizontalSliderTests.clickSlider();
        String value = "4";
        horizontalSliderTests.setSliderValue(value);
        assertEquals(horizontalSliderTests.getResult(), "4", "Incorrect value");
    }
}
