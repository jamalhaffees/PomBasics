package test;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManagerPage;

public class ManagerTest extends BaseTest{

    @Test
    public void testAddCustomer(){
        logger.info("###### Test Case: Customer Form");
        LoginPage login = new LoginPage(driver);
        login.managerLogin();
        login.customerButton();
        textExists("Add Customer");
    }

    @Test
    public void testCustomerInfo(){
        logger.info("###### Test Case: Customer Form");
        LoginPage login = new LoginPage(driver);
        login.managerLogin();
        login.customerButton();
//        ManagerPage addCustomer = new ManagerPage(driver);
//        addCustomer.customerForm();
    }

    @Test
    public  void testAccountInfo(){
        logger.info("###### Test Case: Customer Form");
        LoginPage login = new LoginPage(driver);
        login.managerLogin();
        ManagerPage addCustomer = new ManagerPage(driver);
        addCustomer.customerAccount();
        addCustomer.selectCurrency();


    }
}
