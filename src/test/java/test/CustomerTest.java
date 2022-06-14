package test;

import org.testng.annotations.Test;
import pages.CustomerPage;
import pages.LoginPage;
import pages.ManagerPage;

public class CustomerTest extends BaseTest{

    @Test
    public  void testTransaction(){
        logger.info("###### Test Case: Customer Form");
        LoginPage login = new LoginPage(driver);
        login.customerLogin();
        CustomerPage addCustomer = new CustomerPage(driver);
        addCustomer.buttonTransactions();
        addCustomer.clickBackButton();


    }
}
