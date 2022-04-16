package dropDown;

import base.BaseTests;
import org.junit.Test;
import pages.DropDownPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DropDownTest extends BaseTests {

    @Test
    public void dropDownTest(){
        DropDownPage dropDownPage = homePage.selectOptionOne();
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOption();
        assertEquals(selectedOptions.size(), 1);
        assertTrue(selectedOptions.contains(option));
    }
}
