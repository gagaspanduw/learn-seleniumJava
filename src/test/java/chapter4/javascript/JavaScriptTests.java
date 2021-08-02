package chapter4.javascript;

import chapter4.base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;


public class JavaScriptTests extends BaseTests {

    @Test
    public void  testScrollTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();

    }

    @Test
    public void testScrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }

    @Test
    public void testAddMutipleAttribute(){
        var dropdownPage = homePage.clickDropDown();
        dropdownPage.addMultipleAttribute();

        var optionToSelect = List.of("Option 1", "Option 2");
        optionToSelect.forEach(dropdownPage::selectFromDropDown);

        var selectedOption = dropdownPage.getSelectedOption();
        assertTrue(selectedOption.containsAll(optionToSelect), "All options were not selected");
        assertEquals(selectedOption.size(), optionToSelect.size(), "Number of selected items");
    }
}
