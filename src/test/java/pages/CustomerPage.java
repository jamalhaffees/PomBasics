package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerPage extends BasePage{


    By transactionsButton = By.xpath("//button[contains(text(),'Transactions')]");

    By backButton = By.xpath("//button[text()='Back']");


    public CustomerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void buttonTransactions(){
        driver.findElement(transactionsButton).click();
    }

    public void clickBackButton(){
        driver.findElement(backButton).click();
    }

}
