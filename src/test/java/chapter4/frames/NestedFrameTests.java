package chapter4.frames;

import chapter4.base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NestedFrameTests extends BaseTests {

    @Test
    public void testNestedFrame(){
        var framePage = homePage.clickFrames();
        var nestedFramePage = framePage.clickNestedFrames();
        assertEquals(nestedFramePage.getTextLeftFrame(), "LEFT", "Text incorrect");
        assertEquals(nestedFramePage.getTextBottomFrame(), "BOTTOM", "Text incorrects");
    }
}
