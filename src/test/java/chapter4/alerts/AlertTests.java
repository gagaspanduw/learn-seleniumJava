package chapter4.alerts;

import chapter4.base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerAlert();
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(), "You successfully clicked an alert", "Result text incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerConfirm();
        String text = alertPage.alert_getText();
        alertPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert is incorrect");
    }

    @Test
    public void testSetInputInAlert(){
        var alertpage = homePage.clickJavaScriptAlerts();
        alertpage.triggerPrompt();
        String text = "TAU rocks!";
        alertpage.alert_setInput(text);
        alertpage.alert_clickToAccept();
        assertEquals(alertpage.getResult(), "You entered: " + text, "Result text incorrect");
    }
}
