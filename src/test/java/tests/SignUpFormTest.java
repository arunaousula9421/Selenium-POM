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



    SignUpPage signUpPage;
    ReceiptPage receiptPage;


    public SignUpFormTest(){
        super();
    }


    @Test
    public void signUp(){
        signUpPage = new SignUpPage();

        signUpPage.enterName("First", "Last");
        signUpPage.enterAddress("123 Street", "12345");

        receiptPage = signUpPage.submit();
        Assert.assertTrue(receiptPage.isInitialized());
        Assert.assertEquals("Thank you!", receiptPage.confirmationHeader());
    }

}
