package com.nttdata.steps;

import com.nttdata.page.CartPage;
import com.nttdata.page.InventoryPage;
import com.nttdata.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartSteps {
    private WebDriver driver;
    //constructor
    public CartSteps(WebDriver driver){
        this.driver = driver;
    }

    //
    public int getQuantityCartItem(){
        List<WebElement> quantityItems = this.driver.findElements(CartPage.quantityCartItem);
        return quantityItems.size();
    }

    public void cart(){
        this.driver.findElement(CartPage.cartButton).click();
    }

}
