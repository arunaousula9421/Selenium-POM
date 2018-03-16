package tests;

import com.selenium.pom.Page.ReceiptPage;
import com.selenium.pom.Page.SignUpPage;
import com.selenium.pom.Utils.BaseSetUp;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by arun on 16/03/2018.
 */
public class SignUpFormTest extends BaseSetUp {

    @Test
    public void signUp(){
        driver.get("http://www.kimschiller.com/page-object-pattern-tutorial/index.html");

        SignUpPage signUpPage = new SignUpPage(driver);

        signUpPage.enterName("First", "Last");
        signUpPage.enterAddress("123 Street", "12345");

        ReceiptPage receiptPage = signUpPage.submit();
        Assert.assertTrue(receiptPage.isInitialized());

        Assert.assertEquals("Thank you!", receiptPage.confirmationHeader());

    }
}
