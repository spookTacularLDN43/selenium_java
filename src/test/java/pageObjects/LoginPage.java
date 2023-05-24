package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "uid")
    @CacheLookup
    WebElement userID;

    @FindBy(name = "password")
    @CacheLookup
    WebElement password;

    @FindBy(name = "btnLogin")
    @CacheLookup
    WebElement btnLogin;

    public void userLogin(String name, String pass) {
        userID.sendKeys(name);
        password.sendKeys(pass);
        btnLogin.click();
    }


}
