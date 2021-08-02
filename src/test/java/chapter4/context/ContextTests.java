package chapter4.context;

import chapter4.base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ContextTests extends BaseTests {

    @Test
    public void contextTests(){
        var contextPage = homePage.clickContextMenu();
        contextPage.rightClick();
        String text = contextPage.alertGetText();
        contextPage.alertAccept();
        assertEquals(text, "You selected a context menu", "Alert incorrect");
    }
}
