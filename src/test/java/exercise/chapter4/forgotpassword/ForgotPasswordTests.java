package exercise.chapter4.forgotpassword;

import exercise.chapter4.EmailSentPage;
import exercise.chapter4.ForgotPasswordPage;
import exercise.chapter4.base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void forgotPasswordTest(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmailField("example@example.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickForgotButton();
        assertTrue(emailSentPage.getAlert().contains(
                "Internal Server Error"),
                "Alert is missing !");
    }
}
