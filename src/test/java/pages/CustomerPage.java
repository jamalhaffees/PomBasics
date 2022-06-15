package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerPage extends BasePage{


    By transactionsButton = By.xpath("//button[contains(text(),'Transactions')]");

    By backButton = By.xpath("//button[text()='Back']");

    By depositButton = By.xpath("//button[contains(text(),'Deposit')]");

    By addAmount = By.cssSelector("[type = 'number']");

    By buttonDeposit = By.xpath("//button[text() = 'Deposit']");

    By withdrawButton = By.xpath("//button[contains(text(),'Withdraw')]");

    By addWAmount = By.cssSelector("[type = 'number']");

    By buttonWithdraw = By.xpath("//button[text() = 'Withdraw']");

    By logoutButton = By.xpath("//button[text()='Logout']");


    public CustomerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void buttonTransactions(){
        driver.findElement(transactionsButton).click();
    }

    public void clickDepositButton(){
        driver.findElement(depositButton).click();
    }

    public void enterAmount(){
        driver.findElement(addAmount).sendKeys("1000");
    }

    public void clickDeposit(){
        driver.findElement(buttonDeposit).click();
    }

    public void clickWithdrawButton(){
        driver.findElement(withdrawButton).click();
    }

    public void enterWithdrawAmount(){
        driver.findElement(addWAmount).sendKeys("500");
    }

    public void clickWithdraw(){
        driver.findElement(buttonWithdraw).click();
    }

    public void clickLogout(){
        driver.findElement(logoutButton).click();
    }

    public void clickBackButton(){
        driver.findElement(backButton).click();
    }

}
