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
        textExists("Transaction");

    }

    @Test
    public void testDeposit(){
        logger.info("####Test Case: Deposit");
        LoginPage login = new LoginPage(driver);
        login.customerLogin();
        CustomerPage addCustomer = new CustomerPage(driver);
        addCustomer.clickDepositButton();
        addCustomer.enterAmount();
        addCustomer.clickDeposit();
        textExists("Deposit");

    }

    @Test
    public void testWithdraw(){
        logger.info("####Test Case: Withdraw");
        LoginPage login = new LoginPage(driver);
        login.customerLogin();
        CustomerPage addCustomer = new CustomerPage(driver);
        addCustomer.clickWithdrawButton();
        addCustomer.enterWithdrawAmount();
        addCustomer.clickWithdraw();
        addCustomer.clickLogout();
        textExists("Withdraw");

    }
}
