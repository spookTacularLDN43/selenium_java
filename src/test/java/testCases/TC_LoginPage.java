package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class TC_LoginPage extends BaseClass {

    @Test
    public void loginTest() {
        driver.get(baseURL);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.userLogin(userName, password);
        if (driver.getTitle().equals("GTPL Bank Manager HomePage")) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }
}
