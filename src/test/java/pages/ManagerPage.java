package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ManagerPage extends BasePage {

    By addCustomerButton = By.xpath("//button[contains(text(),'Add Customer')]");
//
//    By addFirstName = By.className("form-control");
//    By addLastName = By.className("form-control");
//    By addPostCode = By.className("form-control");
//    By clickCustomerButton = By.xpath("//button[text()='Add Customer']");

    By clickAccount = By.xpath("//button[contains(text(),'Open Account')]");
    By customerNameDropdown = By.id("userSelect");

    By pickCurrency = By.id("currency");

    By clickProcess = By.xpath("//button[text()='Process']");

    By clickCustomers = By.xpath("//button[contains(text(),'Customers')]");

    By enterSearch = By.cssSelector("[type = 'text']");

    By buttonDelete = By.xpath("//button[text()='Delete']");


    public ManagerPage(WebDriver driver) {
        this.driver = driver;

    }

    public void customerButton() {
        driver.findElement(addCustomerButton).click();
    }

//    public void customerForm(){
//        driver.findElement(addFirstName).sendKeys("Robert");
//        driver.findElement(addLastName).sendKeys("Williams");
//        driver.findElement(addPostCode).sendKeys("11111");
//        driver.findElement(clickCustomerButton).click();
//    }

    public void customerAccount(){
        driver.findElement(clickAccount).click();
        Select select = new Select(driver.findElement(customerNameDropdown));
        select.selectByVisibleText("Hermoine Granger");

    }

    public void selectCurrency(){
        Select select = new Select(driver.findElement(pickCurrency));
        select.selectByVisibleText("Dollar");
        driver.findElement(clickProcess).click();

    }

    public void chooseCustomers(){
        driver.findElement(clickCustomers).click();
        driver.findElement(enterSearch).sendKeys("Hermoine");
        driver.findElement(buttonDelete).click();

    }
}