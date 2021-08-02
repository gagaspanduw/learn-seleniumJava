package chapter4.login;

import chapter4.base.BaseTests;
import chapter4.pages.LoginPage;
import chapter4.pages.SecureAreaPage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlerText()
                        .contains("You logged into a secure area!"),
                "Alert text is incorrect");
    }
}
