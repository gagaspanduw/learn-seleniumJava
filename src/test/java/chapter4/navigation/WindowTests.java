package chapter4.navigation;

import chapter4.base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WindowTests extends BaseTests {
    @Test
    public void testWindow(){
        var example2Page = homePage.clickDynamicLoading().clickExample2InNewTab();
        getWindowManager().switchToNewTab();
        example2Page.clickStart();
        assertEquals(example2Page.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
