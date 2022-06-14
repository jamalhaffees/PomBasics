package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.util.Locale;

public class LoginTest extends BaseTest{

    @Test
    public  void testLoginPageTitle(){
        logger.info("###### Test Case: Login Page Title");
        saveScreenshot();
        Assert.assertEquals(driver.getTitle(), "XYZ Bank");
    }

    @Test
    public  void testManagerLogin(){
        logger.info("###### Test Case: Manager Login");
        LoginPage login = new LoginPage(driver);
        login.managerLogin();
        textExists("Add Customer");
    }



    @Test
    public  void testCustomerLogin(){
        logger.info("###### Test Case: Customer Login");
        LoginPage login = new LoginPage(driver);
        login.customerLogin();
        textExists("Welcome");
    }

    @Test
    public void testHomeButton(){
        logger.info("Test Case: Home Button");
        LoginPage login = new LoginPage(driver);
        login.customerLogin();
        login.backHomeButton();
        textExists("Home");
    }

    @Test
    public void testCustomerLogout(){
        logger.info("Test Case: Customer Logout");
        LoginPage login = new LoginPage(driver);
        login.customerLogout();
        textExists("Bye");
    }



}
