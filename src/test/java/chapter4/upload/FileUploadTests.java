package chapter4.upload;

import chapter4.base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\MSI\\IdeaProjects\\seleniumjava_course\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadFiles(), "chromedriver.exe", "Uploaded file incorrect");
    }
}
